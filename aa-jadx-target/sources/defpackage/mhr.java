package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mhr implements defpackage.mhm {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.Preflight.Req.NLS");

    @Override // defpackage.mhm
    public final int a() {
        return 3;
    }

    @Override // defpackage.mhm
    public final android.support.v4.app.Fragment b() {
        return new mgg();
    }

    @Override // defpackage.mhm
    public final void c() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4944)).y("Resolving requirement. isMet=%b", java.lang.Boolean.valueOf(e()));
    }

    @Override // defpackage.mhm
    public final boolean d() {
        return true;
    }

    @Override // defpackage.mhm
    public final boolean e() {
        return defpackage.lvs.C().a().d();
    }

    @Override // defpackage.mhm
    public final boolean f(defpackage.mgt mgtVar, defpackage.wyz wyzVar) {
        ((defpackage.yqj) a.l().ai((char) 4943)).y("maybeHandleEvent: %s", mgtVar.name());
        if (mgtVar != defpackage.mgt.i) {
            return false;
        }
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.FRX, defpackage.zbe.PREFLIGHT_NOTIFICATION_LISTENER, defpackage.zbd.ce).l());
        wyzVar.m(this);
        return true;
    }
}
