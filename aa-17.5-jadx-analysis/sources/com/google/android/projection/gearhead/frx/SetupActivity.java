package com.google.android.projection.gearhead.frx;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.WindowManager;
import com.google.android.gms.carsetup.fsm.impl.ActivityResult;
import com.google.android.gms.carsetup.fsm.impl.FsmController;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.frx.SetupFsm;
import defpackage.bc;
import defpackage.ebf;
import defpackage.lfm;
import defpackage.ols;
import defpackage.roc;
import defpackage.seh;
import defpackage.sei;
import defpackage.w;
import defpackage.woy;
import defpackage.xbt;
import defpackage.xbu;
import defpackage.xbv;
import defpackage.xbw;
import defpackage.xbx;
import defpackage.xca;
import defpackage.xce;
import defpackage.xch;
import defpackage.xci;
import defpackage.xco;
import defpackage.xcp;
import defpackage.xcq;
import defpackage.xcr;
import defpackage.yfu;
import defpackage.yfy;
import defpackage.ype;
import defpackage.yph;
import defpackage.yzy;
import defpackage.yzz;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class SetupActivity extends bc implements seh {
    private static final yph n = yph.c("GH.SetupActivity");
    private static final yfy o;
    public boolean m;
    private FsmController p;
    private Fragment q;
    private volatile Fragment r;
    private ActivityResult s;
    private boolean t;

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e(xbt.class, yzz.FRX_APPS_PERMISSIONS);
        yfuVar.e(xce.class, yzz.FRX_PREINSTALLED_APPS_PERMISSIONS);
        yfuVar.e(xbv.class, yzz.FRX_CAR_DOCK_PROMPT);
        yfuVar.e(xbw.class, yzz.FRX_CAR_MOVING);
        yfuVar.e(xbx.class, yzz.FRX_ERROR_FRAGMENT);
        yfuVar.e(xca.class, yzz.FRX_INSTALL_APPS);
        yfuVar.e(xch.class, yzz.FRX_SENSITIVE_PERMISSIONS);
        yfuVar.e(xcp.class, yzz.FRX_TERMS_OF_SERVICE);
        yfuVar.e(xbu.class, yzz.FRX_TERMS_OF_SERVICE);
        yfuVar.e(xcq.class, yzz.FRX_UNPLUG_REPLUG);
        yfuVar.e(xcr.class, yzz.FRX_VN_INTRO);
        o = yfuVar.d(true);
    }

    private static final Object o(Class cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.seh
    public final Fragment A() {
        return this.q;
    }

    @Override // defpackage.seh
    public final FsmController B() {
        return this.p;
    }

    @Override // defpackage.seh
    public final Class C() {
        return SetupFsm.FrxStartState.class;
    }

    @Override // defpackage.seh
    public final List D() {
        return Collections.singletonList(new xci(this, 0));
    }

    @Override // defpackage.seh
    public final void E(FsmController fsmController) {
        this.p = fsmController;
    }

    @Override // defpackage.seh
    public final void F() {
        getWindow().clearFlags(2621568);
    }

    @Override // defpackage.seh
    public final void H(Class cls, yzy yzyVar) {
        yzz yzzVar = (yzz) o.get(cls);
        woy.N(yzzVar != null);
        ebf.j().o(yzzVar, yzyVar);
    }

    @Override // defpackage.seh
    public final void I(Class cls) {
        yzz yzzVar = (yzz) o.get(cls);
        woy.N(yzzVar != null);
        ebf.j().o(yzzVar, yzy.f);
    }

    @Override // defpackage.seh
    public final void J(Intent intent) {
        startActivityForResult(intent, 1);
    }

    @Override // defpackage.seh
    public final void K(Class cls, Bundle bundle, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        Fragment fragment;
        if (z || (fragment = this.q) == null || !cls.equals(fragment.getClass())) {
            sei seiVar = (sei) o(cls);
            seiVar.setArguments(bundle);
            Fragment fragment2 = this.q;
            if (fragment2 == null) {
                i = R.anim.frx_fade_in;
                i2 = 0;
            } else if (cls.equals(fragment2.getClass())) {
                i = 0;
                i2 = 0;
            } else {
                if (this.m) {
                    this.m = false;
                    i3 = R.anim.car_frx_slide_out_right;
                    i4 = R.anim.car_frx_slide_in_left;
                } else {
                    i3 = R.anim.car_frx_slide_out_left;
                    i4 = R.anim.car_frx_slide_in_right;
                }
                int i5 = i4;
                i2 = i3;
                i = i5;
            }
            if (this.t) {
                ((ype) n.l().ai((char) 10058)).u("Paused, deferring fragment switch");
                this.r = seiVar;
                return;
            }
            this.q = seiVar;
            w wVar = new w(a());
            wVar.r(i, i2, 0, 0);
            wVar.q(R.id.fragment_container, this.q, "fragment_main");
            wVar.i(false, true);
        }
    }

    @Override // defpackage.bc, defpackage.ob, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            if (i != 1001 || i2 == -1) {
                return;
            }
            finish();
            return;
        }
        if (this.s != null) {
            ype ypeVar = (ype) ((ype) n.f()).ai(10054);
            ActivityResult activityResult = this.s;
            ypeVar.D("Got an activity result when pendingFsmActivityResult is not null. losing result resultCode=%d data=%s", activityResult.a, activityResult.b);
        }
        if (this.t) {
            this.s = new ActivityResult(i2, intent);
        } else {
            this.p.f("EVENT_ACTIVITY_RESULT", new ActivityResult(i2, intent));
        }
    }

    @Override // defpackage.ob, android.app.Activity
    public final void onBackPressed() {
        this.p.f("EVENT_BACKBUTTON_PRESSED", null);
    }

    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (roc.br(getIntent()) && lfm.c().g()) {
            setTheme(R.style.CarFrxTheme_New_Preinstalled);
        } else {
            Intent intent = getIntent();
            if (intent == null || !intent.getBooleanExtra("com.google.android.gearhead.CAKEWALK_STYLE", false)) {
                setTheme(R.style.CarFrxTheme_New);
            } else {
                setTheme(R.style.CarFrxTheme_Cakewalk_Phone);
            }
        }
        setContentView(R.layout.car_setup_activity);
        ols.c(getWindow(), null);
        if (Build.VERSION.SDK_INT >= 29) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 2;
            getWindow().setAttributes(attributes);
        }
        this.q = a().f("fragment_main");
        if (bundle == null) {
            w wVar = new w(a());
            wVar.e(0, new xco(), "fragment_fsm_controller", 1);
            wVar.i(false, true);
        }
    }

    @Override // defpackage.bc, android.app.Activity
    protected final void onPause() {
        this.t = true;
        super.onPause();
    }

    @Override // defpackage.bc, defpackage.ob, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 46) {
            return;
        }
        for (int i2 : iArr) {
            if (i2 != 0) {
                this.p.f("EVENT_PERMISSION_DENIED", null);
                return;
            }
        }
        this.p.f("EVENT_ALL_PERMISSIONS_GRANTED", null);
    }

    @Override // defpackage.bc, android.app.Activity
    protected final void onResume() {
        onStateNotSaved();
        super.onResume();
        this.t = false;
        if (this.r != null) {
            this.q = this.r;
            this.r = null;
            w wVar = new w(a());
            wVar.q(R.id.fragment_container, this.q, "fragment_main");
            wVar.i(false, true);
        }
        ActivityResult activityResult = this.s;
        if (activityResult != null) {
            this.p.f("EVENT_ACTIVITY_RESULT", activityResult);
            this.s = null;
        }
    }
}
