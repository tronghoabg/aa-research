package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mht implements defpackage.mhm {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.Preflight.Req.TOS");

    static final defpackage.oog g() {
        defpackage.mfw mfwVar = ((defpackage.mfx) ((defpackage.mfu) defpackage.mkp.a.i(defpackage.mfu.class)).a()).c;
        mfwVar.getClass();
        return new defpackage.oog(mfwVar.a);
    }

    @Override // defpackage.mhm
    public final int a() {
        return 1;
    }

    @Override // defpackage.mhm
    public final android.support.v4.app.Fragment b() {
        return new defpackage.mgp();
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v16, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.mhm
    public final void c() {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4954)).y("Resolving requirement. isMet=%b", java.lang.Boolean.valueOf(e()));
        defpackage.oog oogVarG = g();
        oogVarG.g("car_tos_main", 1);
        oogVarG.g("car_tos_data", 2);
        oogVarG.g("car_tos_safety", 1);
        if (defpackage.duw.c(defpackage.mkp.a.c, "android.permission.READ_CALENDAR") != 0) {
            ((defpackage.yqj) yqmVar.l().ai((char) 4953)).u("Calendar permission not granted");
        } else {
            ((defpackage.yqj) yqmVar.l().ai((char) 4952)).u("Recording calendar acknowledgement");
            defpackage.mdp.c();
            defpackage.mdp.b();
        }
        if (defpackage.kwu.b().f()) {
            defpackage.kwu kwuVarB = defpackage.kwu.b();
            defpackage.yqm yqmVar2 = defpackage.kwu.a;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 3431)).u("Work profile acknowledged via FRX");
            defpackage.ysr.bj(kwuVarB.f());
            defpackage.mku mkuVarA = defpackage.mpr.f().a();
            if ((!defpackage.acyc.aZ() || mkuVarA.d.contains("key_work_profile_support")) ? mkuVarA.b.contains("key_work_profile_support") : mkuVarA.b.contains("key_work_profile_support")) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 3433)).u("Work profile setting already has value; not updating");
                return;
            }
            ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 3432)).u("Enabling work profile setting due to acknowledgement");
            mkuVarA.a("key_work_profile_support", true);
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.FRX, defpackage.zbe.WORK_PROFILE_FRX_PERMISSION_ACKNOWLEDGEMENT, defpackage.zbd.BF).l());
        }
    }

    @Override // defpackage.mhm
    public final boolean d() {
        return true;
    }

    @Override // defpackage.mhm
    public final boolean e() {
        defpackage.oog oogVarG = g();
        boolean zD = oogVarG.d();
        boolean zB = oogVarG.b();
        boolean z = false;
        if (zD && zB) {
            z = true;
        }
        ((defpackage.yqj) a.l().ai(4950)).R("requirementMet:%b, isTosAccepted:%b, isDataNoticeAccepted:%b", java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(zD), java.lang.Boolean.valueOf(zB));
        return z;
    }

    @Override // defpackage.mhm
    public final boolean f(defpackage.mgt mgtVar, defpackage.wyz wyzVar) {
        ((defpackage.yqj) a.l().ai((char) 4951)).y("maybeHandleEvent: %s", mgtVar.name());
        if (mgtVar != defpackage.mgt.f) {
            return false;
        }
        wyzVar.m(this);
        return true;
    }
}
