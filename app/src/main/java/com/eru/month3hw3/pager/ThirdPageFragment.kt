package com.eru.month3hw3.pager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.eru.month3hw3.OperationAdapter
import com.eru.month3hw3.databinding.FragmentThirdPageBinding

class ThirdPageFragment : Fragment() {

    private lateinit var binding: FragmentThirdPageBinding
    private val viewModel: FragmentViewModel by activityViewModels()
    private var list = arrayListOf<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdPageBinding.inflate(LayoutInflater.from(requireContext()), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.operations.observe(viewLifecycleOwner){
                list.add(it[it.lastIndex])
                val adapter = OperationAdapter(list)
                binding.recycler.adapter = adapter
        }
    }
}