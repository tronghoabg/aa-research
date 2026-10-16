package com.google.android.apps.auto.carservice.car.activity.virtualdevice;

import android.app.Activity;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.FrameLayout;
import defpackage.ipo;
import defpackage.jfg;
import defpackage.ype;
import defpackage.yph;
import defpackage.yzy;
import defpackage.yzz;

/* loaded from: classes2.dex */
public class CarVirtualDeviceActivity extends Activity {
    private static final yph a = yph.c("CAR.VDA");
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private ipo f;

    private final void a(yzy yzyVar) {
        jfg jfgVar;
        ipo ipoVar = this.f;
        if (ipoVar == null || (jfgVar = ipoVar.a) == null) {
            return;
        }
        jfgVar.e(yzz.CAR_SERVICE, yzyVar);
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("extra_car_analytics_binder_bundle");
        if (bundleExtra != null) {
            IBinder binder = bundleExtra.getBinder("extra_car_analytics_binder");
            if (binder instanceof ipo) {
                this.f = (ipo) binder;
            }
        }
        if (this.f == null) {
            ((ype) ((ype) a.h()).ai((char) 996)).u("Missing analytics dependency, finishing");
            finish();
        } else {
            getWindow().addFlags(528);
            setContentView(new FrameLayout(this));
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        a(yzy.MU);
        ipo ipoVar = this.f;
        if (ipoVar != null) {
            ipoVar.a = null;
            this.f = null;
        }
    }

    @Override // android.app.Activity
    protected final void onPause() {
        super.onPause();
        if (!this.d) {
            a(yzy.MT);
            this.d = true;
        } else {
            if (this.e) {
                return;
            }
            a(yzy.MW);
            this.e = true;
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        if (!this.b) {
            a(yzy.MS);
            this.b = true;
        } else {
            if (this.c) {
                return;
            }
            a(yzy.MV);
            this.c = true;
        }
    }
}
