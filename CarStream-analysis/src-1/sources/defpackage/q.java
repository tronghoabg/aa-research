package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.carstream.tech.box.BoxActivity;
import com.google.android.gms.car.CarActivityHost;
import com.google.android.gms.car.CarNotSupportedException;
import com.google.android.gms.car.input.InputManager;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class q implements CarActivityHost {
    public final BoxActivity a;
    public final z b;
    public boolean c;

    public q(BoxActivity boxActivity) {
        this.a = boxActivity;
        z zVar = new z();
        zVar.a = boxActivity;
        this.b = zVar;
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final View findViewById(int i) {
        return this.a.findViewById(i);
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final void finish() {
        this.a.finish();
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final Object getCarActivityService() {
        return null;
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final Object getCarManager(String str) throws CarNotSupportedException {
        throw new CarNotSupportedException(ad.c(str, ": ban toan man hinh khong co API cua tang chieu"));
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final InputManager getInputManager() {
        return this.b;
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final Intent getIntent() {
        return this.a.getIntent();
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final LayoutInflater getLayoutInflater() {
        return this.a.getLayoutInflater();
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final int getMaxFrameRate() {
        return 60;
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final Object getNonConfigurationInstance() {
        return null;
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final int getPowerState() {
        return 0;
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final Window getWindow() {
        return this.a.getWindow();
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final boolean hasWindowFocus() {
        return this.a.hasWindowFocus();
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final boolean isFinishing() {
        return this.a.isFinishing();
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final boolean isStopped() {
        return this.c;
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final void setContentView(int i) {
        this.a.setContentView(i);
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final void setIntent(Intent intent) {
        this.a.setIntent(intent);
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final void startCarProjectionActivity(Intent intent) {
        this.a.startActivity(intent);
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final void setContentView(View view) {
        this.a.setContentView(view);
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.a.setContentView(view, layoutParams);
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final void enableWindowTransparency() {
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final void onRestoreInstanceState(Bundle bundle) {
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final void onSaveInstanceState(Bundle bundle) {
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final void setIgnoreConfigChanges(int i) {
    }
}
