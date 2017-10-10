package com.yanlei.myapplication.user.activity;

import android.app.Activity;
import android.os.Bundle;

import com.yanlei.myapplication.user.presenter.RegisterPresenter;

/**
 * Created by Administrator on 2017-10-10.
 */
public class RegisterActivity extends Activity implements RegisterPresenter.RegisterView{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RegisterPresenter.register();
    }

    @Override
    public void onRegistering() {

    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailure() {

    }
}
