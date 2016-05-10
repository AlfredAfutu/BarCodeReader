package com.example.cted.barcodereader;

import android.app.Activity;
import android.os.Bundle;

import com.example.cted.barcodereader.controller.api.SendQrCodeToServer;
import com.magnet.android.mms.async.Call;
import com.magnet.android.mms.async.StateChangedListener;
import com.magnet.android.mms.utils.logger.Log;

/**
 * Created by cted on 4/20/15.
 */
public class MainActivity extends Activity {

    private String TAG = getClass().getSimpleName();
    private String userId, qrCode, barcodereaderApi;
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SendQrCodeToServer sendQrCodeToServer = new SendQrCodeToServer() {
            @Override
            public Call<Void> qrCodeSend(String userId, String qrCode, String barcodereaderApi, StateChangedListener listener) {
                   return null;
            }
        };

        sendQrCodeToServer.qrCodeSend(userId, qrCode, barcodereaderApi, new StateChangedListener() {
            @Override
            public void onExecuting(Call<?> call, ProgressData progressData) {
                Log.i(TAG, "Qr Code Sending to server");
            }

            @Override
            public void onSuccess(Call<?> call) throws Throwable {
                assert call.isDone();

            }

            @Override
            public void onError(Call<?> call, Throwable throwable) {
                call.resend();
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
