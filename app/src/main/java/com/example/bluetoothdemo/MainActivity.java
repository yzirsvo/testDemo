package com.example.bluetoothdemo;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testlibrary.TestApi;
import com.ttlock.bl.sdk.api.TTLockClient;
import com.ttlock.bl.sdk.device.TTDevice;

public class MainActivity extends AppCompatActivity {


    private BluetoothManager mBluetoothManager;
    private BluetoothAdapter mBluetoothAdapter;
    private Handler mHandler = new Handler();

    @SuppressLint("MissingPermission")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // TTLockClient.getDefault().prepareBTService(getApplicationContext());


        TestApi.getInstance().add(2, 3, new TestApi.TestCallBack() {
            @Override
            public void addCallBack(int sum) {
                Log.e("AAA", "addCallBack: "+sum );
            }
        });

        return;



//        mBluetoothManager = (BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE);
//        mBluetoothAdapter = mBluetoothManager.getAdapter();
//
//        //判断蓝牙是否打开
//        if (mBluetoothAdapter != null && !mBluetoothAdapter.isEnabled()) {
//           mBluetoothAdapter.enable();
//        }
//
//        mHandler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                mBluetoothAdapter.stopLeScan(scanCallback);
//            }
//        },10000);
//
//        mBluetoothAdapter.startLeScan(scanCallback);
    }


//    private BluetoothAdapter.LeScanCallback scanCallback = new BluetoothAdapter.LeScanCallback() {
//        @Override
//        public void onLeScan(BluetoothDevice device, int rssi, byte[] scanRecord) {
//
//            if(device.getName()!=null){
//                Log.e("AAA", "onLeScan: "+device.getName() );
//            }
//        }
//    };
}