package com.scott.login

import androidx.lifecycle.Observer
import com.scott.base.BaseActivity
import com.scott.mymm.BR
import com.scott.mymm.MainActivity
import com.scott.mymm.R
import com.scott.mymm.databinding.ActivityLoginBinding

class LoginActivity : BaseActivity<LoginViewModel, ActivityLoginBinding>() {

    override fun rootViewId(): Int {
        return R.layout.activity_login
    }

    override val initVariableId: Int get() = BR.loginModel


    override fun initView() {
        viewModel.success.observe(
            this,
            Observer { startActivity(MainActivity::class.java)})
    }

    override fun initData() {
    }
}
