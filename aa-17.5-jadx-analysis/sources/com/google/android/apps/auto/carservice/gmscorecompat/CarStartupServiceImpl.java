package com.google.android.apps.auto.carservice.gmscorecompat;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.hardware.usb.UsbAccessory;
import android.os.Looper;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.gms.carsetup.setup.SetupBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.adal;
import defpackage.inl;
import defpackage.jlk;
import defpackage.jlo;
import defpackage.ols;
import defpackage.pgx;
import defpackage.pgy;
import defpackage.qst;
import defpackage.rob;
import defpackage.rxr;
import defpackage.sad;
import defpackage.sbb;
import defpackage.sbg;
import defpackage.sdl;
import defpackage.sgd;
import defpackage.sgf;
import defpackage.shm;
import defpackage.sss;
import defpackage.uqw;
import defpackage.xvy;
import defpackage.xxh;
import defpackage.ypf;
import defpackage.yxi;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class CarStartupServiceImpl extends sbb {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.sbb
    protected final rxr a() {
        return rxr.b(this, xxh.h(new pgx(1)), new pgy(1));
    }

    @Override // defpackage.sbb, android.app.Service
    @ResultIgnorabilityUnspecified
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3 = 2;
        if (intent == null) {
            return 2;
        }
        if ("com.google.android.gms.car_setup.START_USB_PROJECTION".equals(intent.getAction()) && this.f.f()) {
            sbg sbgVar = this.b;
            sbg.a.l().ai(8676).u("onHandoffStarted");
            sbgVar.e = true;
            d(sbgVar.c());
            UsbAccessory usbAccessory = (UsbAccessory) intent.getParcelableExtra("accessory");
            usbAccessory.getClass();
            SetupBinder setupBinder = (SetupBinder) intent.getParcelableExtra("EXTRA_LOCAL_BINDER");
            setupBinder.getClass();
            boolean booleanExtra = intent.getBooleanExtra("show_permission_errors", false);
            xxh xxhVarC = xvy.a;
            BluetoothDevice bluetoothDevice = this.d;
            if (bluetoothDevice != null) {
                xxhVarC = new jlo(this).c(bluetoothDevice.getAddress(), false);
            }
            xxh xxhVar = xxhVarC;
            inl inlVar = new inl(setupBinder, i3);
            ypf ypfVar = sgf.a;
            ols.M(this, yxi.CAR_SETUP_TRY_START_DIRECT_HANDOFF);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            jlk jlkVar = new jlk(atomicBoolean, this, usbAccessory, inlVar, booleanExtra, 3);
            long jA = adal.a.gu().a();
            sss sssVar = new sss(Looper.getMainLooper());
            if (jA > 0) {
                sssVar.postDelayed(jlkVar, jA);
            }
            if (xxhVar.f()) {
                Object objB = xxhVar.b();
                uqw.M(new sdl(this, new rob(objB), new shm(qst.a(this)), new sad(this, new sgd((CarInfoInternal) objB))).e(), atomicBoolean, sssVar, jlkVar, this, usbAccessory, inlVar, booleanExtra, this);
            } else {
                uqw.M(true, atomicBoolean, sssVar, jlkVar, this, usbAccessory, inlVar, booleanExtra, this);
            }
        }
        super.onStartCommand(intent, i, i2);
        return 2;
    }
}
