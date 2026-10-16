package com.google.android.apps.auto.components.preflight.phone;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import defpackage.eqc;
import defpackage.jgw;
import defpackage.ler;
import defpackage.mdd;
import defpackage.mdh;
import defpackage.mfq;
import defpackage.mfr;
import defpackage.mgl;
import defpackage.mgo;
import defpackage.mgs;
import defpackage.mgt;
import defpackage.mgu;
import defpackage.mgv;
import defpackage.mhd;
import defpackage.ny;
import defpackage.tes;
import defpackage.vky;
import defpackage.ype;
import defpackage.yph;
import defpackage.yzz;
import java.util.EnumSet;

/* loaded from: classes.dex */
public class PreflightPhoneWelcomeActivity extends ler implements mgu {
    public static final yph n = yph.c("GH.PreflightPhoneWelcom");
    public mhd r;
    public Runnable s;
    mfq t;
    public mdh u;
    private tes v;
    private boolean w;
    public final IntentFilter o = new IntentFilter("android.intent.action.USER_PRESENT");
    public final Handler p = new Handler();
    public final mgo q = new mgo();
    private boolean x = false;

    /* loaded from: classes2.dex */
    public static class RestoreNotificationReceiver extends mdd {
        @Override // defpackage.mdd
        protected final vky a() {
            return new vky("RestoreNotificationReceiver");
        }

        @Override // defpackage.mdd
        public final void b(Context context, Intent intent) {
            context.sendBroadcast(new Intent("com.google.android.apps.auto.components.preflight.phone.RESTORE_PHONE_NOTIFICATION").setPackage(context.getPackageName()));
        }
    }

    public final boolean B() {
        return a().f("authorization_dialog") == null;
    }

    @Override // defpackage.ler, defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        yph yphVar = n;
        ((ype) yphVar.l().ai((char) 4917)).u("onCreate");
        if (bundle == null) {
            ((ype) yphVar.l().ai((char) 4923)).u("restoreInstanceState - no instance state to restore.");
        } else {
            this.x = bundle.getBoolean("KEY_UNLOCK_PROMPT_SHOWN", false);
            this.w = bundle.getBoolean("KEY_LOGGED_INITIAL_HU_FOCUS_STATE", false);
            ((ype) yphVar.l().ai(4922)).Q("restoreInstanceState\nloggedInitialHUFocusState=%b\nunlockPromptShown=%b", this.w, this.x);
        }
        mfr mfrVar = new mfr(yzz.PREFLIGHT_PHONE_WELCOME);
        this.t = mfrVar;
        mfrVar.b(this);
        this.u = new mdh();
        mgo mgoVar = this.q;
        mgoVar.c = false;
        Dialog dialog = mgoVar.e;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        this.s = new jgw(this, 19);
        eqc eqcVar = this.f;
        EnumSet enumSetNoneOf = EnumSet.noneOf(mgl.class);
        yph yphVar2 = mgv.a;
        eqcVar.c(new mgt(this, new mgs(this, enumSetNoneOf), 0));
        eqcVar.c(new ny(this, 7));
        ((ype) yphVar.l().ai((char) 4914)).u("maybeStartWelcomeOrUnlockActivity");
        if (this.x) {
            ((ype) ((ype) yphVar.h()).ai((char) 4924)).u("Not starting unlock activity (already shown).");
        } else if (mdh.h()) {
            ((ype) yphVar.l().ai((char) 4916)).u("Starting unlock activity.");
            if (mdh.g()) {
                finish();
                return;
            }
            tes tesVar = new tes(this);
            this.v = tesVar;
            tesVar.b();
            if (B()) {
                mgoVar.f(a(), "authorization_dialog");
                return;
            }
            return;
        }
        ((ype) yphVar.l().ai((char) 4915)).u("Not starting unlock activity.");
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    protected final void onDestroy() {
        tes tesVar = this.v;
        if (tesVar != null) {
            tesVar.a();
            this.v = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        ((ype) n.l().ai(4918)).Q("onSaveInstanceState\nloggedInitialHUFocusState=%b\nunlockPromptShown=%b", this.w, this.x);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("KEY_UNLOCK_PROMPT_SHOWN", this.x);
        bundle.putBoolean("KEY_LOGGED_INITIAL_HU_FOCUS_STATE", this.w);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    @Override // defpackage.ob, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onUserLeaveHint() {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity.onUserLeaveHint():void");
    }
}
