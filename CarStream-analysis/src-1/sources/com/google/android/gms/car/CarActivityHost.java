package com.google.android.gms.car;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.car.input.InputManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public interface CarActivityHost {

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public interface HostedCarActivity {
        void attach(CarActivityHost carActivityHost);

        void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        void onAccessibilityScanRequested(IBinder iBinder);

        void onConfigurationChanged(Configuration configuration);

        void onCreate(Bundle bundle);

        void onDestroy();

        void onFrameRateChange(int i);

        boolean onKeyDown(int i, KeyEvent keyEvent);

        boolean onKeyLongPress(int i, KeyEvent keyEvent);

        boolean onKeyUp(int i, KeyEvent keyEvent);

        void onLowMemory();

        void onNewIntent(Intent intent);

        void onPause();

        void onPostResume();

        void onPowerStateChange(int i);

        void onRestoreInstanceState(Bundle bundle);

        void onResume();

        Object onRetainNonConfigurationInstance();

        void onSaveInstanceState(Bundle bundle);

        void onStart();

        void onStop();

        void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams);

        void onWindowFocusChanged(boolean z, boolean z2);

        void setContext(Context context);
    }

    void enableWindowTransparency();

    View findViewById(int i);

    void finish();

    Object getCarActivityService();

    Object getCarManager(String str);

    InputManager getInputManager();

    Intent getIntent();

    LayoutInflater getLayoutInflater();

    int getMaxFrameRate();

    Object getNonConfigurationInstance();

    int getPowerState();

    Window getWindow();

    boolean hasWindowFocus();

    boolean isFinishing();

    boolean isStopped();

    void onRestoreInstanceState(Bundle bundle);

    void onSaveInstanceState(Bundle bundle);

    void setContentView(int i);

    void setContentView(View view);

    void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    void setIgnoreConfigChanges(int i);

    void setIntent(Intent intent);

    void startCarProjectionActivity(Intent intent);
}
