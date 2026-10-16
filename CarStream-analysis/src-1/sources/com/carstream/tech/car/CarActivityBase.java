package com.carstream.tech.car;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.car.CarActivityHost;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class CarActivityBase extends ContextWrapper implements CarActivityHost.HostedCarActivity {
    private CarActivityHost host;

    public CarActivityBase() {
        super(null);
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void attach(CarActivityHost carActivityHost) {
        this.host = carActivityHost;
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println(getClass().getName());
    }

    public final LayoutInflater getInflater() {
        return this.host.getLayoutInflater();
    }

    public final CarActivityHost host() {
        return this.host;
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public Object onRetainNonConfigurationInstance() {
        return null;
    }

    public final void setContentView(View view) {
        this.host.setContentView(view);
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void setContext(Context context) {
        attachBaseContext(context);
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onDestroy() {
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onLowMemory() {
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onPause() {
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onPostResume() {
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onResume() {
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onStart() {
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onStop() {
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onAccessibilityScanRequested(IBinder iBinder) {
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onCreate(Bundle bundle) {
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onFrameRateChange(int i) {
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onNewIntent(Intent intent) {
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onPowerStateChange(int i) {
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onRestoreInstanceState(Bundle bundle) {
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
    }

    @Override // com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onWindowFocusChanged(boolean z, boolean z2) {
    }
}
