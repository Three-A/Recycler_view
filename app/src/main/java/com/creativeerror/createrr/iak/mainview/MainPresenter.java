package com.creativeerror.createrr.iak.mainview;

import android.text.TextUtils;

import com.creativeerror.createrr.iak.interactor.InterfaceMain;
import com.creativeerror.createrr.iak.interactor.InterfacePresenter;

/**
 * Created by yudha on 5/13/2017.
 */

public class MainPresenter implements InterfacePresenter {
    private InterfaceMain mInterfaceMain;

    public MainPresenter(InterfaceMain mInterfaceMain) {
        this.mInterfaceMain = mInterfaceMain;
    }
    @Override
    public void login(String username, String password) {
        if(TextUtils.isEmpty(username) || TextUtils.isEmpty(password)){
            mInterfaceMain.loginError();
        }else {
            if(username.equals("yudha") && password.equals("patria")){
                mInterfaceMain.loginSuccess();
            }else{
                mInterfaceMain.loginError();
            }
        }
    }
}
