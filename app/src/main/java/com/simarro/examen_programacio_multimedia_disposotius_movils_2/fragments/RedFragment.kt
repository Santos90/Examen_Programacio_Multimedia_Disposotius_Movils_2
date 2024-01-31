package com.simarro.examen_programacio_multimedia_disposotius_movils_2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.simarro.examen_programacio_multimedia_disposotius_movils_2.R


class RedFragment : Fragment() {


	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_red, container, false)
	}

	companion object {

		fun newInstance() = RedFragment()

	}
}