package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mhs implements defpackage.mhm {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.Preflight.Req.PLock");

    private static void g(defpackage.zbd zbdVar) {
        ((defpackage.oim) defpackage.mkp.a.i(defpackage.oim.class)).F(defpackage.rrw.h(defpackage.yzd.FRX, defpackage.zbe.PREFLIGHT, zbdVar).l());
    }

    @Override // defpackage.mhm
    public final int a() {
        return 2;
    }

    @Override // defpackage.mhm
    public final android.support.v4.app.Fragment b() {
        return new mgs();
    }

    @Override // defpackage.mhm
    public final void c() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4949)).y("Resolving requirement. isMet=%b", java.lang.Boolean.valueOf(e()));
    }

    @Override // defpackage.mhm
    public final boolean d() {
        return false;
    }

    @Override // defpackage.mhm
    public final boolean e() {
        defpackage.mfw mfwVar = ((defpackage.mfx) ((defpackage.mfu) defpackage.mkp.a.i(defpackage.mfu.class)).a()).c;
        mfwVar.getClass();
        if (mfwVar.b) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4947)).u("Unlock already required during FRX");
            g(defpackage.zbd.uq);
            return true;
        }
        if (defpackage.mkv.a()) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4946)).u("connectionAllowedWhileLocked is enabled");
            g(defpackage.zbd.uo);
            return true;
        }
        if (mfwVar.k.e()) {
            g(defpackage.zbd.ur);
            return true;
        }
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) defpackage.mkp.a.c.getSystemService("keyguard");
        keyguardManager.getClass();
        boolean zIsKeyguardLocked = keyguardManager.isKeyguardLocked();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4945)).y("isLocked:%b", java.lang.Boolean.valueOf(zIsKeyguardLocked));
        if (zIsKeyguardLocked) {
            return false;
        }
        g(defpackage.zbd.up);
        return true;
    }

    @Override // defpackage.mhm
    public final boolean f(defpackage.mgt mgtVar, defpackage.wyz wyzVar) {
        ((defpackage.yqj) a.l().ai((char) 4948)).y("maybeHandleEvent: %s", mgtVar.name());
        if (mgtVar != defpackage.mgt.h) {
            return false;
        }
        wyzVar.m(this);
        return true;
    }
}
