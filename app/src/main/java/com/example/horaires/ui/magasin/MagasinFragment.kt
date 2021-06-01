package com.example.horaires.ui.magasin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplicationtest.databinding.FragmentMagasinBinding

class MagasinFragment : Fragment() {

    private lateinit var galleryViewModel: MagasinViewModel
    private var _binding: FragmentMagasinBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
                ViewModelProvider(this).get(MagasinViewModel::class.java)

        _binding = FragmentMagasinBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMagasin
        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}