package com.utad.newComponets.components

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.utad.newComponets.databinding.FragmentCoordinatorAndCollapsingToolbarBinding


class CoordinatorAndCollapsingToolbarFragment : Fragment() {

    private lateinit var _binding: FragmentCoordinatorAndCollapsingToolbarBinding
    private val binding: FragmentCoordinatorAndCollapsingToolbarBinding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCoordinatorAndCollapsingToolbarBinding.inflate(inflater, container, false)
        return binding.root
    }

}