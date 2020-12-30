package com.example.testlibrary;


import com.blankj.utilcode.util.ToastUtils;


public final class TestApi {

    private static volatile TestApi mInstance;

    public static TestApi getInstance() {
        if (mInstance == null) {
            synchronized (TestApi.class) {
                if (mInstance == null) {
                    mInstance = new TestApi();
                    ToastUtils.showLong("我是吐司");
                }
            }
        }
        return mInstance;
    }


    public void add(int a, int b, TestCallBack callBack) {
        int sum = a + b;
        callBack.addCallBack(sum);
    }

    public interface TestCallBack {
        void addCallBack(int sum);
    }


}


