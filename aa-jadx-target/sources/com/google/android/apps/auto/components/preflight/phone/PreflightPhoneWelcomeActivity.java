package com.google.android.apps.auto.components.preflight.phone;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class PreflightPhoneWelcomeActivity extends defpackage.lew implements defpackage.mhb {
    public static final defpackage.yqm n = defpackage.yqm.c("GH.PreflightPhoneWelcom");
    public mhk r;
    public java.lang.Runnable s;
    defpackage.mfy t;
    public defpackage.mdp u;
    private tfo v;
    private boolean w;
    public final android.content.IntentFilter o = new android.content.IntentFilter("android.intent.action.USER_PRESENT");
    public final android.os.Handler p = new android.os.Handler();
    public final defpackage.mgw q = new defpackage.mgw();
    private boolean x = false;

    public final boolean B() {
        return a().f("authorization_dialog") == null;
    }

    @Override // defpackage.lew, defpackage.bc, defpackage.od, defpackage.cs, android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        defpackage.yqm yqmVar = n;
        ((defpackage.yqj) yqmVar.l().ai((char) 4920)).u("onCreate");
        if (bundle == null) {
            ((defpackage.yqj) yqmVar.l().ai((char) 4926)).u("restoreInstanceState - no instance state to restore.");
        } else {
            this.x = bundle.getBoolean("KEY_UNLOCK_PROMPT_SHOWN", false);
            this.w = bundle.getBoolean("KEY_LOGGED_INITIAL_HU_FOCUS_STATE", false);
            ((defpackage.yqj) yqmVar.l().ai(4925)).Q("restoreInstanceState\nloggedInitialHUFocusState=%b\nunlockPromptShown=%b", this.w, this.x);
        }
        defpackage.mfz mfzVar = new defpackage.mfz(defpackage.zbe.PREFLIGHT_PHONE_WELCOME);
        this.t = mfzVar;
        mfzVar.b(this);
        this.u = new defpackage.mdp();
        defpackage.mgw mgwVar = this.q;
        mgwVar.c = false;
        android.app.Dialog dialog = mgwVar.e;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        this.s = new defpackage.jpa(this, 13, null);
        defpackage.eqi eqiVar = this.f;
        java.util.EnumSet enumSetNoneOf = java.util.EnumSet.noneOf(defpackage.mgt.class);
        defpackage.yqm yqmVar2 = defpackage.mhc.a;
        eqiVar.c(new defpackage.mha(this, new defpackage.mgz(this, enumSetNoneOf), 0));
        eqiVar.c(new defpackage.oa(this, 8));
        ((defpackage.yqj) yqmVar.l().ai((char) 4917)).u("maybeStartWelcomeOrUnlockActivity");
        if (this.x) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 4927)).u("Not starting unlock activity (already shown).");
        } else if (defpackage.mdp.h()) {
            ((defpackage.yqj) yqmVar.l().ai((char) 4919)).u("Starting unlock activity.");
            if (defpackage.mdp.g()) {
                finish();
                return;
            }
            tfo tfoVar = new tfo(this);
            this.v = tfoVar;
            tfoVar.b();
            if (B()) {
                mgwVar.f(a(), "authorization_dialog");
                return;
            }
            return;
        }
        ((defpackage.yqj) yqmVar.l().ai((char) 4918)).u("Not starting unlock activity.");
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    protected final void onDestroy() {
        tfo tfoVar = this.v;
        if (tfoVar != null) {
            tfoVar.a();
            this.v = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.od, defpackage.cs, android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        ((defpackage.yqj) n.l().ai(4921)).Q("onSaveInstanceState\nloggedInitialHUFocusState=%b\nunlockPromptShown=%b", this.w, this.x);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("KEY_UNLOCK_PROMPT_SHOWN", this.x);
        bundle.putBoolean("KEY_LOGGED_INITIAL_HU_FOCUS_STATE", this.w);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00e2  */
    @Override // defpackage.od, android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        defpackage.yqm yqmVar = n;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4922)).u("User left activity (went home?)");
        if (defpackage.acwj.z()) {
            defpackage.mfy mfyVar = this.t;
            if (mfyVar != null) {
                mfyVar.a(defpackage.zbd.HQ);
            }
            if (!B()) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4924)).u("User left activity while AuthorizationDialog was shown");
                android.content.Context context = defpackage.mkp.a.c;
                android.content.Intent flags = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity.class).setFlags(805306368);
                android.os.Bundle bundleD = defpackage.luq.d();
                android.content.ClipData clipData = wer.a;
                android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, wer.a(flags, 201326592), 201326592, bundleD);
                java.lang.String string = context.getString(2132084836);
                java.lang.String strA = defpackage.mhj.a(defpackage.kiv.a().b());
                java.lang.String string2 = strA.isEmpty() ? context.getString(2132084834) : context.getString(2132084835, strA);
                android.app.PendingIntent pendingIntentC = wer.c(context, 0, new android.content.Intent(context, (java.lang.Class<?>) com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity.RestoreNotificationReceiver.class), 201326592);
                defpackage.maz.c();
                defpackage.dte dteVar = new defpackage.dte(context, "gearhead_tips_and_tricks");
                dteVar.n(2131231121);
                dteVar.i(string);
                dteVar.h(string2);
                dteVar.g = activity;
                dteVar.j(pendingIntentC);
                dteVar.e(16, true);
                dteVar.l();
                defpackage.mfw mfwVar = ((defpackage.mfx) defpackage.luq.b().a()).c;
                int identifier = 899047066;
                if (mfwVar != null) {
                    int i = mfwVar.c;
                    if (i == 1 || i == 3) {
                        identifier = 2;
                    } else if (i == 2) {
                        identifier = context.getResources().getIdentifier("service_notification_id", "id", context.getPackageName());
                        if (android.os.Build.VERSION.SDK_INT >= 30 || identifier == 0) {
                            identifier = 2;
                        }
                    }
                }
                if (defpackage.kgl.i()) {
                    dteVar.f(0, context.getText(2132083121), wer.c(context, 0, com.google.android.apps.auto.components.bugreport.BugreporterReceiver.c("ORIGIN_NOTIFICATION", (java.lang.String) null), 201326592));
                    dteVar.f(0, context.getText(2132083127), wer.c(context, 0, com.google.android.apps.auto.components.bugreport.BugreporterReceiver.d(), 201326592));
                }
                new defpackage.dun(context).b(null, identifier, dteVar.a());
            }
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4923)).u("PreflightPhoneWelcomeActivity dismissed, broadcasting USER_SYSTEM_NAVIGATION_EXIT");
            ((defpackage.mfx) defpackage.luq.b().a()).b.a(defpackage.mgt.e);
        }
    }
}
