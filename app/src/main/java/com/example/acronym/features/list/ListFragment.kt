package com.example.acronym.features.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.acronym.databinding.ListFragmentBinding
import com.example.acronym.util.hideKeyboad
import com.example.nasaneo.features.list.adapter.ListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListFragment : Fragment() {

    private val viewModel: ListViewModel by viewModels()
    private lateinit var binding: ListFragmentBinding
    private lateinit var adapter: ListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ListFragmentBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = ListAdapter(arrayListOf())
        binding.list.adapter = adapter

        viewModel.acronyms.observe(viewLifecycleOwner) {
            adapter.acronyms = it
            adapter.notifyDataSetChanged()
        }
        viewModel.loading.observe(viewLifecycleOwner) {
            binding.loadingBar.visibility = if (it) View.VISIBLE else View.GONE
            activity?.hideKeyboad()
        }
    }
}
