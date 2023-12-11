package com.example.exercise_16.registration

import androidx.navigation.fragment.findNavController
import com.example.exercise_16.BaseFragment
import com.example.exercise_16.databinding.FragmentRegistrationWelcomeBinding


class RegistrationWelcomeFragment : BaseFragment<FragmentRegistrationWelcomeBinding>(FragmentRegistrationWelcomeBinding::inflate) {

    override fun setUp() {

    }

    override fun clickListeners() {
        with(binding) {
            btnLogin.setOnClickListener {
                navigateToLoginFragment()
            }
            btnRegister.setOnClickListener {
                navigateToRegisterFragment()
            }
        }
    }

    private fun navigateToLoginFragment() {
        val action = RegistrationWelcomeFragmentDirections.actionRegistrationWelcomeFragmentToRegistrationLoginFragment()
        findNavController().navigate(action)
    }

    private fun navigateToRegisterFragment() {
        val action = RegistrationWelcomeFragmentDirections.actionRegistrationWelcomeFragmentToRegistrationRegisterFragment()
        findNavController().navigate(action)
    }
}