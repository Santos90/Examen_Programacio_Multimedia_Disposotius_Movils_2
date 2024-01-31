package com.simarro.examen_programacio_multimedia_disposotius_movils_2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import com.simarro.examen_programacio_multimedia_disposotius_movils_2.R
import com.simarro.examen_programacio_multimedia_disposotius_movils_2.databinding.ActivityMainBinding
import com.simarro.examen_programacio_multimedia_disposotius_movils_2.fragments.BlankFragment
import com.simarro.examen_programacio_multimedia_disposotius_movils_2.fragments.RedFragment

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
	private lateinit var binding : ActivityMainBinding

	private lateinit var drawerLayout: DrawerLayout

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)

		//  ***********  TOOLBAR **************
		val toolBar: androidx.appcompat.widget.Toolbar = binding.appbar.root
		setSupportActionBar(toolBar)
		supportActionBar?.setDisplayShowTitleEnabled(false) // Esto oculta el título de la app en la Toolbar
		//supportActionBar?.subtitle = "Subtitulo"


		// *** BOTTOM NAVIGATION ****

//Inicializamos con el HomeFragment
		replaceFragment(RedFragment())

		binding.bottomNavigation.setOnItemSelectedListener {

			it.isChecked = true
			when (it.itemId) {
				R.id.navigation_home -> {

					replaceFragment(RedFragment())
				}
				R.id.navigation_dashboard -> {

					replaceFragment(RedFragment())
				}
				R.id.navigation_notifications -> {

					replaceFragment(BlankFragment())
				}
			}
			false

		}


		//  ***********  NAVIGATION DRAWER ************** //

		drawerLayout = binding.drawerLayout

		val navigationView = findViewById<NavigationView>(R.id.nav_view)
		navigationView.setNavigationItemSelectedListener(this)

		val toggle = ActionBarDrawerToggle(this, drawerLayout, toolBar,
			R.string.open_nav,
			R.string.close_nav
		)
		drawerLayout.addDrawerListener(toggle)
		toggle.syncState()

		if (savedInstanceState == null) {
			replaceFragment(BlankFragment())
			navigationView.setCheckedItem(R.id.nav_home)
		}
	}

	//  ***********  NAVIGATION DRAWER ************** //

	override fun onNavigationItemSelected(item: MenuItem): Boolean {
		when (item.itemId) {
			R.id.nav_home -> replaceFragment(BlankFragment())
			R.id.nav_settings -> replaceFragment(BlankFragment())
			R.id.nav_share -> replaceFragment(RedFragment())
			R.id.nav_about -> replaceFragment(BlankFragment())
			R.id.nav_logout -> finish()
		}
		drawerLayout.closeDrawer(GravityCompat.START)
		return true
	}

// *******************  MENU APPBAR *********************************

	override fun onCreateOptionsMenu(menu: Menu?): Boolean {
		menuInflater.inflate(R.menu.toolbar_menu, menu)
		return true
	}

	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		return when(item.itemId){
			R.id.action_settings ->{
				showToast("Opción settings seleccionada")
				true
			}
			R.id.action_buscar ->{
				showToast("Opción search seleccionada")
				true
			}
			R.id.action_nuevo ->{
				showToast("Opción add seleccionada")
				true
			}
			else -> super.onOptionsItemSelected(item)
		}
	}

	private fun replaceFragment(fragment: Fragment) {
		supportFragmentManager.beginTransaction()
			.replace(R.id.container, fragment)
			.commit()
	}

	private fun showToast(message: String) {
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
	}





}

