package com.eru.month3hw3.pager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.eru.month3hw3.databinding.FragmentFirstPageBinding

class FirstPageFragment : Fragment() {

    private lateinit var binding: FragmentFirstPageBinding
    private val viewModel: FragmentViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstPageBinding.inflate(LayoutInflater.from(requireContext()), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnPlus.setOnClickListener {
            viewModel.onIncrementClick()
        }

        binding.btnMinus.setOnClickListener {
            viewModel.onDecrementClick()
        }
    }
}