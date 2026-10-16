package com.google.android.apps.auto.carservice.frx.phonescreen;

import android.app.ActivityManager;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.carsetup.CarInfoInternal;
import defpackage.ep;
import defpackage.fyh;
import defpackage.ikz;
import defpackage.jlo;
import defpackage.jmo;
import defpackage.jmp;
import defpackage.jmr;
import defpackage.jmt;
import defpackage.jmu;
import defpackage.nsc;
import defpackage.ols;
import defpackage.rrx;
import defpackage.wmf;
import defpackage.woy;
import defpackage.ycm;
import defpackage.yfq;
import defpackage.ynz;
import defpackage.yob;
import defpackage.yxi;
import defpackage.yze;
import defpackage.yzy;
import defpackage.yzz;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.List;

/* loaded from: classes2.dex */
public class PhonescreenFrxActivity extends ep {
    public static final yob m = yob.c("com/google/android/apps/auto/carservice/frx/phonescreen/PhonescreenFrxActivity");
    public CarInfoInternal q;
    public jlo r;
    private jmp u;
    private final jmt s = new jmt(this);
    final jmo n = new jmo();
    final jmr o = new jmr();
    boolean p = false;
    private boolean t = false;

    private final void E(wmf wmfVar, String str) {
        if (a().f(str) != null) {
            return;
        }
        wmfVar.f(a(), str);
    }

    public final void A(yzz yzzVar, yzy yzyVar) {
        try {
            jmp jmpVar = this.u;
            int i = yzzVar.he;
            int iA = yzyVar.a();
            Parcel parcelGh = jmpVar.gh();
            parcelGh.writeInt(i);
            parcelGh.writeInt(iA);
            jmpVar.gj(3, parcelGh);
        } catch (RemoteException e) {
            ((ynz) ((ynz) ((ynz) m.g()).p(e)).ai(2374)).B("Failed to log telemetry: %s, %s", yzzVar.he, yzyVar.a());
        }
    }

    public final void B(boolean z) {
        ((ynz) ((ynz) m.f()).ai((char) 2380)).y("setCarAuthorized: authorized=%b", Boolean.valueOf(z));
        jlo jloVar = this.r;
        if (z) {
            jloVar.l(this.q);
        } else {
            jloVar.m(this.q);
        }
        CarInfoInternal carInfoInternal = this.q;
        carInfoInternal.o = true;
        carInfoInternal.p = z;
    }

    public final void C() {
        CarInfoInternal carInfoInternal = this.q;
        if (!carInfoInternal.o || !carInfoInternal.p || !carInfoInternal.c) {
            this.p = true;
            E(this.n, "authorizing_car_connection_dialog");
            return;
        }
        ((ynz) ((ynz) m.f()).ai((char) 2372)).u("completeFrx");
        ols.L(this, "com.google.android.gms.car.FRX", rrx.b, null);
        this.t = true;
        try {
            this.u.e(this.q, true);
        } catch (RemoteException e) {
            ((ynz) ((ynz) ((ynz) m.g()).p(e)).ai((char) 2373)).u("Failed to report FRX completion");
        }
        finishAndRemoveTask();
    }

    public final void D() {
        ((ynz) ((ynz) m.f()).ai((char) 2381)).u("terminateFrx");
        ols.L(this, "com.google.android.gms.car.FRX", rrx.c, null);
        this.t = true;
        try {
            this.u.e(this.q, false);
        } catch (RemoteException e) {
            ((ynz) ((ynz) ((ynz) m.g()).p(e)).ai((char) 2382)).u("Failed to report FRX termination");
        }
        finishAndRemoveTask();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        yob yobVar = m;
        ((ynz) ((ynz) yobVar.f()).ai((char) 2375)).u("onCreate");
        String str = null;
        ols.L(this, "com.google.android.gms.car.FRX", rrx.a, null);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            ((ynz) ((ynz) yobVar.g()).ai((char) 2384)).u("FRX flow requires arguments passed via extras.");
            ((ynz) ((ynz) yobVar.f()).ai((char) 2371)).u("cancelFrxStartup");
            ols.L(this, "com.google.android.gms.car.FRX", rrx.c, null);
            this.t = true;
            ols.M(this, yxi.FRX_FAILED_INTENT_EXTRAS_DROPPED);
            startActivity(fyh.h(1, yze.FRX_ERROR, null));
            finishAndRemoveTask();
            return;
        }
        CarInfoInternal carInfoInternal = (CarInfoInternal) extras.getParcelable("com.google.android.apps.auto.carservice.frx.phonescreen.EXTRA_CAR_INFO_INTERNAL");
        carInfoInternal.getClass();
        this.q = carInfoInternal;
        String string = extras.getString("com.google.android.apps.auto.carservice.frx.phonescreen.EXTRA_PROCESS_NAME");
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        if (activityManager == null) {
            ((ynz) ((ynz) jmu.a.h()).ai((char) 2390)).u("Failed to find process name (activityManager missing)");
        } else {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                ((ynz) ((ynz) jmu.a.h()).ai((char) 2389)).u("Failed to find process name (runningAppProcessInfos missing)");
            } else {
                Stream streamFilter = Collection.EL.stream(runningAppProcesses).filter(new nsc(iMyPid, 1));
                int i = yfq.d;
                yfq yfqVar = (yfq) streamFilter.collect(ycm.a);
                if (yfqVar.isEmpty()) {
                    ((ynz) ((ynz) jmu.a.h()).ai((char) 2388)).u("Failed to find process name (no process with matching pid)");
                } else if (yfqVar.size() > 1) {
                    ((ynz) ((ynz) jmu.a.h()).ai((char) 2387)).u("Failed to find process name (multiple processes with matching pid)");
                } else {
                    str = ((ActivityManager.RunningAppProcessInfo) yfqVar.get(0)).processName;
                }
            }
        }
        if (string == null || str == null) {
            ((ynz) ((ynz) jmu.a.g()).ai(2385)).M("Missing process name:\nlaunchProcessName=%s\nactivityProcessName=%s", string, str);
        } else {
            woy.af(string.equals(str), "Process name mismatch.\nActivity was launched from %s\nbut Activity is running in %s", string, str);
            ((ynz) ((ynz) jmu.a.e()).ai(2386)).M("Activity was launched from %s\nActivity is running in %s", string, str);
        }
        IBinder binder = extras.getBinder("com.google.android.apps.auto.carservice.frx.phonescreen.EXTRA_ONCOMPLETE_CALLBACK_WRAPPER");
        binder.getClass();
        IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("com.google.android.apps.auto.carservice.frx.phonescreen.ICarServiceCallbacks");
        this.u = iInterfaceQueryLocalInterface instanceof jmp ? (jmp) iInterfaceQueryLocalInterface : new jmp(binder);
        ((ynz) ((ynz) yobVar.f()).ai((char) 2383)).u("Extras unpacked successfully");
        if (bundle != null) {
            this.p = bundle.getBoolean("INTRO_DIALOG_FINISHED", false);
        }
        ikz ikzVarA = ikz.a(this);
        yzz yzzVar = yzz.FRX_PHONESCREEN;
        if (!ikzVarA.k("frx_activation_logged", false)) {
            A(yzzVar, yzy.bX);
            ikzVarA.e("frx_activation_logged", true);
        }
        this.r = new jlo(this);
        if (this.p) {
            E(this.n, "authorizing_car_connection_dialog");
        } else {
            E(this.o, "intro_dialog");
        }
        IntentFilter intentFilter = new IntentFilter("android.hardware.usb.action.USB_STATE");
        int i2 = Build.VERSION.SDK_INT;
        jmt jmtVar = this.s;
        if (i2 >= 33) {
            registerReceiver(jmtVar, intentFilter, 2);
        } else {
            registerReceiver(jmtVar, intentFilter);
        }
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        yob yobVar = m;
        ((ynz) ((ynz) yobVar.f()).ai((char) 2376)).u("onDestroy");
        try {
            unregisterReceiver(this.s);
            ((ynz) ((ynz) yobVar.f()).ai(2377)).u("Unregistered USB receiver");
        } catch (IllegalArgumentException e) {
            ((ynz) ((ynz) ((ynz) m.h()).p(e)).ai((char) 2378)).u("Unable to unregister USB_STATE receiver.");
        }
        if (this.t) {
            return;
        }
        ols.L(this, "com.google.android.gms.car.FRX", rrx.c, null);
    }

    @Override // defpackage.ob, defpackage.cs, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("INTRO_DIALOG_FINISHED", this.p);
    }
}
