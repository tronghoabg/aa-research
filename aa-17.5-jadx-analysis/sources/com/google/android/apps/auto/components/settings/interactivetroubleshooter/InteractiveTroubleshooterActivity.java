package com.google.android.apps.auto.components.settings.interactivetroubleshooter;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.usb.UsbManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.projection.gearhead.R;
import defpackage.dup;
import defpackage.ep;
import defpackage.mlr;
import defpackage.mlx;
import defpackage.ohe;
import defpackage.ols;
import defpackage.rza;
import defpackage.uk;
import defpackage.wnd;
import defpackage.wne;
import defpackage.yxi;

/* loaded from: classes2.dex */
public final class InteractiveTroubleshooterActivity extends ep {
    private mlx m;

    public InteractiveTroubleshooterActivity() {
        super(null);
    }

    @Override // defpackage.ob, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_Gearhead_Material3);
        uk ukVar = new uk((short[]) null);
        ukVar.a = R.style.ThemeOverlay_Gearhead_M3_Settings;
        wnd.a(this, new wne(ukVar));
        this.m = new mlx(this);
        a().q = new mlr(this.m, new ohe(this));
        super.onCreate(bundle);
        ols.M(this, yxi.INTERACTIVE_TROUBLESHOOTER_STARTED_FROM_SETTINGS);
        mlx mlxVar = this.m;
        mlxVar.b = true;
        IntentFilter intentFilter = new IntentFilter("android.hardware.usb.action.USB_STATE");
        intentFilter.addAction("com.google.android.gms.car.PROJECTION_STARTED");
        intentFilter.addAction("com.google.android.gms.car.PROJECTION_ENDED");
        intentFilter.addAction("com.google.android.gms.car.FIRST_ACTIVITY");
        if (Build.VERSION.SDK_INT >= 33) {
            dup.e(mlxVar.d, mlxVar.c, intentFilter, null, 2);
        } else {
            mlxVar.d.registerReceiver(mlxVar.c, intentFilter);
        }
        Context context = mlxVar.d;
        UsbManager usbManager = (UsbManager) context.getSystemService("usb");
        usbManager.getClass();
        mlxVar.a = rza.f(context, usbManager);
        mlxVar.d();
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        mlx mlxVar = this.m;
        mlxVar.b = false;
        mlxVar.d.unregisterReceiver(mlxVar.c);
    }
}
