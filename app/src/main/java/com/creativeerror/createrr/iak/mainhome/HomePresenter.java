package com.creativeerror.createrr.iak.mainhome;

import android.content.Context;

import com.creativeerror.createrr.iak.interactor.HomeInterface;
import com.creativeerror.createrr.iak.model.HomeModel;

import java.util.ArrayList;

/**
 * Created by yudha on 5/14/2017.
 */

public class HomePresenter implements HomeInterface {

    private Context mContext;
    private ArrayList<HomeModel> mHomeModels;

    public HomePresenter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void showList(ArrayList<HomeModel> homeModels) {
        mHomeModels = homeModels;

        mHomeModels.add(new HomeModel("Irwan", "Pamulang", "irwancannady@gmail.com", "087871207070"));
        mHomeModels.add(new HomeModel("Patria", "Tangerang", "creativerr@gmail.com", "085774101064"));
        mHomeModels.add(new HomeModel("Yudha", "Depok", "yudhapatria130396@gmail.com", "082234124"));
        mHomeModels.add(new HomeModel("test", "Jakarta", "test@gmail.com", "08787451270"));
        mHomeModels.add(new HomeModel("Isya", "Depok", "fisya@gmail.com", "08214142525"));
        mHomeModels.add(new HomeModel("Isyania", "Depok", "fisyaf@gmail.com", "0821424142525"));
        mHomeModels.add(new HomeModel("IsyaF", "Depok", "fisyan@gmail.com", "08214242525"));

    }
}
