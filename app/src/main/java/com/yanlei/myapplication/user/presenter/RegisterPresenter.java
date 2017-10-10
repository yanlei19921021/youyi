package com.yanlei.myapplication.user.presenter;

import com.yanlei.myapplication.user.UserManager;

/**
 * Created by Administrator on 2017-10-10.
 */
public class RegisterPresenter {

    private static RegisterView registerView;

    public static void register() {
        UserManager.register();
        registerView.onRegistering();
    }

    public interface RegisterView {
        void onRegistering();
        void onSuccess();
        void onFailure();
    }

}
