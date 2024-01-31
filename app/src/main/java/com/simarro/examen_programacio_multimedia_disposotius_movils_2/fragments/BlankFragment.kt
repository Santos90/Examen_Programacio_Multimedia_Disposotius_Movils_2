package com.simarro.examen_programacio_multimedia_disposotius_movils_2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.simarro.examen_programacio_multimedia_disposotius_movils_2.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

	private lateinit var binding : FragmentBlankBinding

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {

		binding = FragmentBlankBinding.inflate(inflater)


		return binding.root
	}


}