package com.google.android.apps.auto.components.frx.phonescreen;

import android.app.KeyguardManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import com.google.android.projection.gearhead.R;
import defpackage.dsm;
import defpackage.em;
import defpackage.en;
import defpackage.jmn;
import defpackage.kep;
import defpackage.kyl;
import defpackage.lex;
import defpackage.ley;
import defpackage.lfb;
import defpackage.lfc;
import defpackage.lfd;
import defpackage.lfe;
import defpackage.lvl;
import defpackage.mdm;
import defpackage.mdp;
import defpackage.ype;
import defpackage.yph;
import defpackage.yzy;
import defpackage.yzz;

/* loaded from: classes2.dex */
public class WirelessPreflightActivity extends lex {
    public static final yph n = yph.c("GH.WifiPreflight");
    private static final int y = 128;
    en v;
    Handler w;
    lfb x;
    private lfe z;
    public final mdm s = lvl.E();
    final ley t = new ley();
    public boolean u = true;
    private final IntentFilter A = new IntentFilter("android.intent.action.USER_PRESENT");

    private final void L(mdp mdpVar) {
        em emVar = new em(this);
        emVar.n(mdpVar.h());
        emVar.g(mdpVar.e());
        emVar.d(false);
        emVar.k(mdpVar.g(), new jmn(this, mdpVar, 2));
        emVar.i(mdpVar.f(), new jmn(this, mdpVar, 3));
        ((ype) ((ype) n.f()).ai((char) 3837)).u("Prompting for setting/permission change");
        en enVarB = emVar.b();
        this.v = enVarB;
        enVarB.show();
    }

    private final void M() {
        startActivity(new Intent(this, (Class<?>) TapHeadUnitActivity.class).setAction("frx.phonescreen.LAUNCHED_FROM_PREFLIGHT"));
        overridePendingTransition(0, 0);
        D(yzz.FRX_WIRELESS_PREFLIGHT_ACTIVITY, yzy.ch);
        ((lex) this).r = true;
        E();
    }

    @Override // defpackage.lex
    public final void B() {
        yph yphVar = lfc.a;
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("PREFLIGHT_DONT_SHOW_AGAIN", 0);
        int i = sharedPreferences.getInt("preflight_dismiss", 0) + 1;
        ((ype) lfc.a.l().ai((char) 3857)).w("Setting Preflight Dismiss to: %d", i);
        sharedPreferences.edit().putInt("preflight_dismiss", i).apply();
    }

    public final void F() {
        if (!K()) {
            getWindow().clearFlags(y);
            setTurnScreenOn(false);
            setShowWhenLocked(false);
            G();
            return;
        }
        getWindow().addFlags(y);
        setTurnScreenOn(true);
        setShowWhenLocked(true);
        D(yzz.FRX_WIRELESS_PREFLIGHT_ACTIVITY, yzy.ci);
        if (this.w != null) {
            ((ype) ((ype) n.h()).ai((char) 3854)).u("Dismissal already scheduled");
            return;
        }
        ((ype) n.l().ai((char) 3853)).u("Start 30s dismissal timer");
        Handler handler = new Handler(Looper.getMainLooper());
        this.w = handler;
        handler.postDelayed(new kyl(this, 8), 30000L);
    }

    public final void G() {
        Handler handler = this.w;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            ((ype) n.l().ai((char) 3836)).u("Removing 30s dismissal timer");
            this.w = null;
        }
    }

    public final void H() {
        boolean zC = this.z.c();
        lfe lfeVar = this.z;
        if (zC) {
            mdp mdpVarA = lfeVar.a();
            mdpVarA.getClass();
            L(mdpVarA);
        } else {
            if (!lfeVar.b()) {
                M();
                return;
            }
            this.u = true;
            lfe lfeVar2 = this.z;
            ((ype) ((ype) lfe.a.f()).ai((char) 3862)).u("Prompting for location permission");
            lfeVar2.b.d(this, "android.permission.ACCESS_FINE_LOCATION");
        }
    }

    public final void I() {
        lfb lfbVar = this.x;
        this.x = null;
        if (lfbVar != null) {
            unregisterReceiver(lfbVar);
            ((ype) n.l().ai((char) 3855)).u("Unregisering unlock receiver");
        }
    }

    public final void J() {
        kep kepVar = new kep(this, 11);
        kep kepVar2 = new kep(this, 12);
        boolean zK = K();
        ley leyVar = this.t;
        if (zK) {
            leyVar.j(R.string.car_setup_unlock_to_proceed_sentence_case);
            leyVar.i(kepVar);
        } else {
            leyVar.j(R.string.preflight_activity_button_text);
            leyVar.i(kepVar2);
        }
    }

    public final boolean K() {
        return ((KeyguardManager) getSystemService("keyguard")).isKeyguardLocked();
    }

    @Override // defpackage.lex, defpackage.ler, defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        yph yphVar = lfc.a;
        if (getApplicationContext().getSharedPreferences("PREFLIGHT_DONT_SHOW_AGAIN", 0).getBoolean("preflight_dsa", false)) {
            ((ype) ((ype) n.h()).ai((char) 3843)).u("User has selected \"Don't Show Again\" for WirelessPreflightActivity: stopping launch");
            D(yzz.FRX_WIRELESS_PREFLIGHT_ACTIVITY, yzy.cq);
            ((lex) this).r = true;
            E();
            return;
        }
        this.z = new lfe();
        if (a().f("permission_dialog") == null) {
            this.t.f(a(), "permission_dialog");
        }
        this.u = getIntent().getBooleanExtra("auto_prompt_on_launch", false);
        ((ype) ((ype) n.f()).ai((char) 3842)).y("autoPrompt=%b", Boolean.valueOf(this.u));
        Ringtone ringtone = RingtoneManager.getRingtone(getApplicationContext(), RingtoneManager.getDefaultUri(2));
        if (ringtone != null) {
            ringtone.play();
        }
        Vibrator vibrator = (Vibrator) getSystemService("vibrator");
        if (vibrator.hasVibrator()) {
            vibrator.vibrate(new long[]{0, 600, 100, 600}, -1, new AudioAttributes.Builder().setUsage(10).build());
        }
        D(yzz.FRX_WIRELESS_PREFLIGHT_ACTIVITY, yzy.f);
    }

    @Override // defpackage.lex, defpackage.ep, defpackage.bc, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.s.b(this);
    }

    @Override // defpackage.ob, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.u = intent.getBooleanExtra("auto_prompt_on_launch", false);
        ((ype) ((ype) n.f()).ai((char) 3846)).y("autoPrompt=%b", Boolean.valueOf(this.u));
    }

    @Override // defpackage.bc, android.app.Activity
    public final void onPause() {
        super.onPause();
        en enVar = this.v;
        if (enVar == null || !enVar.isShowing()) {
            return;
        }
        this.v.dismiss();
    }

    @Override // defpackage.bc, defpackage.ob, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (strArr.length != 1 || !strArr[0].equals("android.permission.ACCESS_FINE_LOCATION")) {
            ((ype) ((ype) n.h()).ai((char) 3848)).u("Location request did not get a response.");
            return;
        }
        lfd lfdVar = !this.z.c.d() ? !dsm.b(this, "android.permission.ACCESS_FINE_LOCATION") ? lfd.c : lfd.b : lfd.a;
        ((ype) ((ype) n.f()).ai((char) 3849)).y("Result of location permission request: %s", lfdVar);
        int iOrdinal = lfdVar.ordinal();
        if (iOrdinal == 0) {
            D(yzz.FRX_WIRELESS_PREFLIGHT_LOCATION_PERMISSION, yzy.ce);
            H();
        } else if (iOrdinal == 1) {
            D(yzz.FRX_WIRELESS_PREFLIGHT_LOCATION_PERMISSION, yzy.cf);
            E();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            D(yzz.FRX_WIRELESS_PREFLIGHT_LOCATION_PERMISSION, yzy.cg);
            L(this.z.c);
            this.u = false;
        }
    }

    @Override // defpackage.bc, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.s.b(this);
        if (!this.z.d()) {
            M();
        } else if (this.u) {
            H();
        }
    }

    @Override // defpackage.lex, defpackage.ep, defpackage.bc, android.app.Activity
    public final void onStart() {
        super.onStart();
        J();
        F();
        ((ype) n.l().ai((char) 3852)).u("Registering unlock receiver");
        this.x = new lfb(this);
        int i = Build.VERSION.SDK_INT;
        lfb lfbVar = this.x;
        if (i >= 33) {
            registerReceiver(lfbVar, this.A, 2);
        } else {
            registerReceiver(lfbVar, this.A);
        }
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    public final void onStop() {
        super.onStop();
        G();
        I();
    }
}
