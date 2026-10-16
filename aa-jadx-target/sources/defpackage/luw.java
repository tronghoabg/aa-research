package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class luw {
    private static final defpackage.yqm b = defpackage.yqm.c("GH.MsgQueryBase");
    protected defpackage.ygm a;

    public abstract defpackage.ygm a(defpackage.qsh qshVar, defpackage.nze nzeVar);

    public final defpackage.ygm b(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        if (defpackage.acyc.V() && !jrl.b(defpackage.mkp.a.c)) {
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 4279)).u("GSA is unavailable, returning empty list of messaging apps");
            int i = defpackage.ygw.d;
            return defpackage.ymx.a;
        }
        if ((!defpackage.acul.m() && !defpackage.acul.n()) || defpackage.mpr.f().a().j()) {
            return a(qshVar, nzeVar);
        }
        ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 4278)).u("Messaging notification data sharing disabled, returning empty list of messaging apps");
        int i2 = defpackage.ygw.d;
        return defpackage.ymx.a;
    }

    public final void c() {
        this.a = null;
    }
}
