package com.dsu.myapplication.ui.favourites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dsu.myapplication.databinding.FragmentFavouritesBinding
import com.dsu.myapplication.ui.dashboard.RecordsAdapter

class FavouriteFragment : Fragment() {

    private var _binding: FragmentFavouritesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val favouriteViewModel =
            ViewModelProvider(this).get(FavouriteViewModel::class.java)

        _binding = FragmentFavouritesBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.rvFavRecords.layoutManager = LinearLayoutManager(context)
        favouriteViewModel.getAllFavRecords().observe(viewLifecycleOwner){
            val recAdapter = FavouriteAdapter(requireContext(),it)
            binding.rvFavRecords.adapter = recAdapter
        }

//        val textView: TextView = binding.textFavourites
//        favouriteViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}