package com.google.android.gms.carsetup;

import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.gms.carsetup.frx.SetupFsm;
import com.google.android.gms.carsetup.fsm.impl.ActivityResult;
import com.google.android.gms.carsetup.fsm.impl.FsmController;
import com.google.android.projection.gearhead.R;
import defpackage.a;
import defpackage.aat;
import defpackage.abnp;
import defpackage.acvb;
import defpackage.ebe;
import defpackage.ebm;
import defpackage.ep;
import defpackage.ols;
import defpackage.onq;
import defpackage.rhx;
import defpackage.scr;
import defpackage.sdc;
import defpackage.sdd;
import defpackage.sde;
import defpackage.sdh;
import defpackage.sdn;
import defpackage.sdp;
import defpackage.sdq;
import defpackage.sdr;
import defpackage.sdt;
import defpackage.sdu;
import defpackage.seh;
import defpackage.w;
import defpackage.xci;
import defpackage.yop;
import defpackage.ypf;
import defpackage.yzy;
import defpackage.yzz;
import defpackage.zab;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class SetupActivityImpl extends ep implements seh {
    public static final /* synthetic */ int n = 0;
    private static final ypf o = ols.R("CAR.SETUP");
    private static final aat p;
    public boolean m;
    private FsmController q;
    private Fragment r;
    private volatile Fragment s;
    private ActivityResult t;
    private boolean u;

    static {
        aat aatVar = new aat(0);
        p = aatVar;
        aatVar.put(sdr.class, yzz.FRX_INSTALL_APPS);
        aatVar.put(sdc.class, yzz.FRX_AUTHORIZE_CAR);
        aatVar.put(sdd.class, yzz.FRX_CAR_MOVING);
        aatVar.put(sdh.class, yzz.FRX_ERROR_FRAGMENT);
        aatVar.put(sde.class, yzz.FRX_DOWNLOAD_RETRY);
        aatVar.put(sdt.class, yzz.FRX_INTRO_FRAGMENT);
        aatVar.put(sdp.class, yzz.FRX_INCOMPATIBLE);
        aatVar.put(sdq.class, yzz.FRX_INCOMPATIBLE_NO_VANAGON);
        aatVar.put(sdn.class, yzz.FRX_INCOMPATIBLE_ALERT);
        aatVar.put(sdu.class, yzz.FRX_LOCK_SCREEN);
    }

    @Override // defpackage.seh
    public final Fragment A() {
        return this.r;
    }

    @Override // defpackage.seh
    public final FsmController B() {
        return this.q;
    }

    @Override // defpackage.seh
    public final Class C() {
        return SetupFsm.EntryState.class;
    }

    @Override // defpackage.seh
    public final List D() {
        return Collections.singletonList(new xci(this, 1));
    }

    @Override // defpackage.seh
    public final void E(FsmController fsmController) {
        this.q = fsmController;
    }

    @Override // defpackage.seh
    public final void F() {
        getWindow().clearFlags(2621568);
    }

    public final void G(yzz yzzVar, yzy yzyVar) {
        FsmController fsmController = this.q;
        abnp abnpVarN = zab.a.n();
        abnpVarN.t();
        zab zabVar = (zab) abnpVarN.b;
        zabVar.b |= 1;
        zabVar.d = yzzVar.he;
        int iA = yzyVar.a();
        abnpVarN.t();
        zab zabVar2 = (zab) abnpVarN.b;
        zabVar2.b |= 2;
        zabVar2.e = iA;
        fsmController.g((zab) abnpVarN.q());
    }

    @Override // defpackage.seh
    public final void H(Class cls, yzy yzyVar) {
        yzz yzzVar = (yzz) p.get(cls);
        if (yzzVar != null) {
            G(yzzVar, yzyVar);
        } else {
            o.h().ai(8736).y("Attempting to log unknown FRX screen for class: %s", cls.getName());
        }
    }

    @Override // defpackage.seh
    public final void I(Class cls) {
        yzz yzzVar = (yzz) p.get(cls);
        if (yzzVar != null) {
            G(yzzVar, yzy.f);
        } else {
            o.h().ai(8737).y("Attempting to log unknown FRX screen for class: %s", cls.getName());
        }
    }

    @Override // defpackage.seh
    public final void J(Intent intent) {
        startActivityForResult(intent, 1);
    }

    @Override // defpackage.seh
    public final void K(Class cls, Bundle bundle, boolean z) {
        Fragment fragment;
        if (z || (fragment = this.r) == null || !cls.equals(fragment.getClass())) {
            if (!cls.equals(sdt.class) && !cls.equals(sdu.class)) {
                F();
            }
            try {
                Fragment fragment2 = (Fragment) cls.getConstructor(null).newInstance(null);
                fragment2.setArguments(bundle);
                if (this.u && !(fragment2 instanceof sdt)) {
                    o.l().ai(8743).u("Paused, deferring fragment switch");
                    this.s = fragment2;
                    return;
                }
                Fragment fragment3 = this.r;
                boolean z2 = (fragment3 == null || cls.equals(fragment3.getClass())) ? false : true;
                boolean z3 = !((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                this.r = fragment2;
                w wVar = new w(a());
                if (z2 & z3) {
                    if (this.m) {
                        wVar.r(R.anim.car_frx_slide_in_left, R.anim.car_frx_slide_out_right, 0, 0);
                    } else {
                        wVar.r(R.anim.car_frx_slide_in_right, R.anim.car_frx_slide_out_left, 0, 0);
                    }
                }
                wVar.q(R.id.fragment_container, this.r, "fragment_main");
                wVar.i(true, true);
                this.m = false;
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // defpackage.bc
    protected final void gz() {
        super.gz();
        this.u = false;
        if (this.s != null) {
            this.r = this.s;
            this.s = null;
            w wVar = new w(a());
            wVar.q(R.id.fragment_container, this.r, "fragment_main");
            wVar.i(false, true);
        }
        ActivityResult activityResult = this.t;
        if (activityResult != null) {
            this.q.f("EVENT_ACTIVITY_RESULT", activityResult);
            this.t = null;
        }
    }

    @Override // defpackage.bc, defpackage.ob, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (this.t != null) {
                yop yopVarAi = o.f().ai(8739);
                ActivityResult activityResult = this.t;
                yopVarAi.D("Got an activity result when mPendingFsmActivityResult is not null. losing result with resultCode=%d data=%s", activityResult.a, activityResult.b);
            }
            if (this.u) {
                this.t = new ActivityResult(i2, intent);
            } else {
                this.q.f("EVENT_ACTIVITY_RESULT", new ActivityResult(i2, intent));
            }
        }
    }

    @Override // defpackage.ob, android.app.Activity
    public final void onBackPressed() {
        this.q.f("EVENT_BACKBUTTON_PRESSED", null);
    }

    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.CarFrxTheme_Cakewalk_Phone);
        rhx rhxVar = rhx.c;
        if (acvb.g() && acvb.b().b.contains(Build.MANUFACTURER.toLowerCase(Locale.ROOT))) {
            getTheme().applyStyle(R.style.ThemeOverlay_CarFrx_DeviceFontFamily, true);
        }
        getWindow().addFlags(2621568);
        setRequestedOrientation(1);
        setContentView(R.layout.car_frx_activity);
        if (a.P()) {
            View viewFindViewById = findViewById(R.id.fragment_container);
            onq onqVar = new onq(2);
            int[] iArr = ebm.a;
            ebe.e(viewFindViewById, onqVar);
        }
        this.r = a().f("fragment_main");
        if (bundle == null) {
            w wVar = new w(a());
            wVar.e(0, new scr(), "fragment_fsm_controller", 1);
            wVar.i(false, true);
        }
    }

    @Override // defpackage.bc, android.app.Activity
    protected final void onPause() {
        this.u = true;
        super.onPause();
    }
}
