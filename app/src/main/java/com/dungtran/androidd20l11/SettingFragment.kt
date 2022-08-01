package com.dungtran.androidd20l11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dungtran.androidd20l11.databinding.SettingFragmentBinding

class SettingFragment : Fragment() {

    private lateinit var binding: SettingFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SettingFragmentBinding.inflate(inflater,container,false)

        return binding.root
    }
}