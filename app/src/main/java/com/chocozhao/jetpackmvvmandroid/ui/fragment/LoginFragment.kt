package com.chocozhao.jetpackmvvmandroid.ui.fragment

import androidx.fragment.app.viewModels
import com.chocozhao.jetpackmvvmandroid.app.base.BaseFragment
import com.chocozhao.jetpackmvvmandroid.viewmodel.state.LoginRegisterViewModel

/**
 * author: chocozhao
 * created on: 2020/9/25 17:22
 * description:
 */
class LoginFragment : BaseFragment<LoginRegisterViewModel,FragmentLoginBinding>(){

    private val requestLoginRegisterViewModel: RequestLoginRegisterViewModel by viewModels()

}