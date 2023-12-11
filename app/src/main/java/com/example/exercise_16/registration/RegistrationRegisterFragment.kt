package com.example.exercise_16.registration

import androidx.fragment.app.viewModels
import com.example.exercise_16.BaseFragment
import com.example.exercise_16.databinding.FragmentRegistrationRegisterBinding


class RegistrationRegisterFragment : BaseFragment<FragmentRegistrationRegisterBinding>(FragmentRegistrationRegisterBinding::inflate) {

    private val viewModel: RegistrationViewModel by viewModels()

    override fun setUp() {
    }

    override fun clickListeners() {
        binding.btnRegister.setOnClickListener {
            registerUser()
        }
    }

    private fun registerUser() {
        val email = binding.etEmail.text
        val password = binding.etPassword.text

        viewModel.RegisterUser(email.toString(), password.toString())
    }


}