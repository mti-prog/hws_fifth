package com.geeks.hws_fifth.presentation.count

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.geeks.hws_fifth.R
import com.geeks.hws_fifth.databinding.ActivityCountBinding
import com.geeks.hws_fifth.presentation.CountViewModel
import java.sql.Date
import java.text.SimpleDateFormat
import java.util.Locale


class CountActivity : AppCompatActivity() {
    private val binding by lazy { ActivityCountBinding.inflate(layoutInflater) }
    private val viewModel: CountViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btnInc.setOnClickListener {
            viewModel.increase()
        }
        binding.btnDec.setOnClickListener {
            viewModel.decrease()
        }
        binding.btnRes.setOnClickListener {
            viewModel.reset()
        }
        viewModel.countData.observe(this){ countData ->
            binding.apply {
                tvCount.text = countData.count.toString()
                tvDate.text = formatMillisToDateTime(countData.createdAt)
                tvType.text = countData.typeOfOperation.value
            }
        }
    }
    fun formatMillisToDateTime(milliseconds: Long): String {
        val date = Date(milliseconds)
        val dateFormat = SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS", Locale.getDefault())
        return dateFormat.format(date)
    }
}