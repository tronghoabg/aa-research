package com.carstream.tech.surf;

import android.app.Presentation;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.gms.car.CarActivityHost;
import com.google.android.gms.car.CarNotSupportedException;
import com.google.android.gms.car.input.InputManager;
import defpackage.ad;
import defpackage.qb;
import defpackage.t7;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class b implements CarActivityHost {
    public final Presentation a;
    public final a b;
    public final InputManager c;
    public final Runnable d;
    public boolean e;
    public boolean f;

    public b(Presentation presentation, a aVar, qb qbVar, t7 t7Var) {
        this.a = presentation;
        this.b = aVar;
        this.c = qbVar;
        this.d = t7Var;
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final View findViewById(int i) {
        FrameLayout frameLayout;
        CarDisplay$CarPresentation carDisplay$CarPresentation = this.b.f;
        if (carDisplay$CarPresentation == null || (frameLayout = carDisplay$CarPresentation.content) == null) {
            return null;
        }
        return frameLayout.findViewById(i);
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final void finish() {
        this.f = true;
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final Object getCarActivityService() {
        return null;
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final Object getCarManager(String str) throws CarNotSupportedException {
        throw new CarNotSupportedException(ad.c(str, ": ban CarSurface khong co API cua tang chieu"));
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final InputManager getInputManager() {
        return this.c;
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final Intent getIntent() {
        return new Intent();
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
        return !this.e;
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final boolean isFinishing() {
        return this.f;
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final boolean isStopped() {
        return this.e;
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final void setContentView(int i) {
        FrameLayout frameLayout;
        View viewInflate = this.a.getLayoutInflater().inflate(i, (ViewGroup) null);
        a aVar = this.b;
        CarDisplay$CarPresentation carDisplay$CarPresentation = aVar.f;
        if (carDisplay$CarPresentation == null || (frameLayout = carDisplay$CarPresentation.content) == null) {
            return;
        }
        frameLayout.removeAllViews();
        if (viewInflate != null) {
            frameLayout.addView(viewInflate, new FrameLayout.LayoutParams(-1, -1));
        }
        aVar.d();
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final void startCarProjectionActivity(Intent intent) {
        try {
            intent.addFlags(268435456);
            this.a.getContext().startActivity(intent);
        } catch (Exception e) {
            String.valueOf(e);
        }
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final void setContentView(View view) {
        FrameLayout frameLayout;
        a aVar = this.b;
        CarDisplay$CarPresentation carDisplay$CarPresentation = aVar.f;
        if (carDisplay$CarPresentation == null || (frameLayout = carDisplay$CarPresentation.content) == null) {
            return;
        }
        frameLayout.removeAllViews();
        if (view != null) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
        aVar.d();
    }

    @Override // com.google.android.gms.car.CarActivityHost
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout;
        a aVar = this.b;
        CarDisplay$CarPresentation carDisplay$CarPresentation = aVar.f;
        if (carDisplay$CarPresentation == null || (frameLayout = carDisplay$CarPresentation.content) == null) {
            return;
        }
        frameLayout.removeAllViews();
        if (view != null) {
            frameLayout.addView(view, layoutParams);
        }
        aVar.d();
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

    @Override // com.google.android.gms.car.CarActivityHost
    public final void setIntent(Intent intent) {
    }
}
