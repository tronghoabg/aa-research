package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mhq implements defpackage.mhm {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.Preflight.Req.Lock");

    private static void g(defpackage.zbd zbdVar) {
        ((defpackage.oim) defpackage.mkp.a.i(defpackage.oim.class)).F(defpackage.rrw.h(defpackage.yzd.FRX, defpackage.zbe.PREFLIGHT_FRX_LOCK_REQUIREMENT, zbdVar).l());
    }

    @Override // defpackage.mhm
    public final int a() {
        return 5;
    }

    @Override // defpackage.mhm
    public final android.support.v4.app.Fragment b() {
        return new defpackage.mgp();
    }

    @Override // defpackage.mhm
    public final void c() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4942)).y("Resolving requirement. isMet=%b", java.lang.Boolean.valueOf(e()));
    }

    @Override // defpackage.mhm
    public final boolean d() {
        return true;
    }

    @Override // defpackage.mhm
    public final boolean e() {
        defpackage.mfw mfwVar = ((defpackage.mfx) ((defpackage.mfu) defpackage.mkp.a.i(defpackage.mfu.class)).a()).c;
        mfwVar.getClass();
        if (mfwVar.b) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4940)).u("Unlock already required during FRX");
            g(defpackage.zbd.uq);
            return true;
        }
        if (!mfwVar.k.e()) {
            g(defpackage.zbd.ur);
            return true;
        }
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) defpackage.mkp.a.c.getSystemService("keyguard");
        keyguardManager.getClass();
        boolean zIsKeyguardLocked = keyguardManager.isKeyguardLocked();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4939)).y("isLocked:%b", java.lang.Boolean.valueOf(zIsKeyguardLocked));
        if (zIsKeyguardLocked) {
            return false;
        }
        g(defpackage.zbd.up);
        return true;
    }

    @Override // defpackage.mhm
    public final boolean f(defpackage.mgt mgtVar, defpackage.wyz wyzVar) {
        ((defpackage.yqj) a.l().ai((char) 4941)).y("maybeHandleEvent: %s", mgtVar.name());
        if (mgtVar != defpackage.mgt.h) {
            return false;
        }
        wyzVar.m(this);
        return true;
    }
}
