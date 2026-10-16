package com.google.android.apps.auto.components.frx.phonescreen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import defpackage.ebf;
import defpackage.lev;
import defpackage.lex;
import defpackage.lfc;
import defpackage.lfe;
import defpackage.luk;
import defpackage.rrc;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;
import j$.util.Objects;

/* loaded from: classes2.dex */
public class TapHeadUnitActivity extends lex {
    private static final yph s = yph.c("GH.WifiPreflight");
    final lev n = new lev();
    private lfe t;

    private final void F() {
        ((ype) ((ype) s.f()).ai((char) 3824)).u("PreFlight needs work: sending to resolve");
        yph yphVar = WirelessPreflightActivity.n;
        startActivity(new Intent(this, (Class<?>) WirelessPreflightActivity.class), luk.c());
        overridePendingTransition(0, 0);
        ((lex) this).r = true;
        E();
    }

    private final boolean G() {
        if (Build.VERSION.SDK_INT > 29) {
            ((ype) ((ype) s.f()).ai((char) 3822)).u("PreFlight not needed: Android R or higher");
            return false;
        }
        if (this.t.d()) {
            return true;
        }
        ((ype) ((ype) s.f()).ai((char) 3821)).u("PreFlight passed");
        return false;
    }

    @Override // defpackage.lex
    public final void B() {
        yph yphVar = lfc.a;
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("PREFLIGHT_DONT_SHOW_AGAIN", 0);
        int i = sharedPreferences.getInt("tap_hu_dismiss", 0) + 1;
        ((ype) lfc.a.l().ai((char) 3858)).w("Setting TapHeadUnit Dismiss to: %d", i);
        sharedPreferences.edit().putInt("tap_hu_dismiss", i).apply();
    }

    @Override // defpackage.lex, defpackage.ler, defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t = new lfe();
        if (getIntent().getBooleanExtra("com.google.android.apps.auto.components.frx.phonescreen.TapHeadUnitActivity.ABORT_WIFI_START", false)) {
            ebf.j().f(rrc.h(yxy.FRX, yzz.FRX_WIRELESS_PREFLIGHT_ACTIVITY, yzy.cl));
        }
        if (G()) {
            F();
            return;
        }
        yph yphVar = lfc.a;
        if (getApplicationContext().getSharedPreferences("PREFLIGHT_DONT_SHOW_AGAIN", 0).getBoolean("tap_hu_dsa", false) && !Objects.equals(getIntent().getAction(), "frx.phonescreen.LAUNCHED_FROM_PREFLIGHT")) {
            ((ype) ((ype) s.h()).ai((char) 3823)).u("User has selected \"Don't Show Again\" for TapHeadUnitActivity: stopping launch");
            D(yzz.FRX_WIRELESS_TAP_HEAD_UNIT_ACTIVITY, yzy.cq);
            ((lex) this).r = true;
            E();
            return;
        }
        if (a().f("wireless_continue_on_car_screen_dialog") == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("LAUNCHED_FROM_PREFLIGHT", getIntent().getAction());
            lev levVar = this.n;
            levVar.setArguments(bundle2);
            levVar.f(a(), "wireless_continue_on_car_screen_dialog");
        }
        D(yzz.FRX_WIRELESS_TAP_HEAD_UNIT_ACTIVITY, yzy.f);
    }

    @Override // defpackage.bc, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (G()) {
            F();
        }
    }
}
