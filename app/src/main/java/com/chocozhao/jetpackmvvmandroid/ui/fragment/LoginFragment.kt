package com.chocozhao.jetpackmvvmandroid.ui.fragment

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.chocozhao.jetpackmvvmandroid.R
import com.chocozhao.jetpackmvvmandroid.app.base.BaseFragment
import com.chocozhao.jetpackmvvmandroid.databinding.FragmentLoginBinding
import com.chocozhao.jetpackmvvmandroid.viewmodel.request.RequestLoginRegisterViewModel
import com.chocozhao.jetpackmvvmandroid.viewmodel.state.LoginRegisterViewModel

/**
 * author: chocozhao
 * created on: 2020/9/25 17:22
 * description:
 */
class LoginFragment : BaseFragment<LoginRegisterViewModel, FragmentLoginBinding>() {

    private val requestLoginRegisterViewModel: RequestLoginRegisterViewModel by viewModels()
    override fun layoutId() = R.layout.fragment_login

    override fun initView(savedInstanceState: Bundle?) {
        TODO("Not yet implemented")
    }

}