package defpackage;

/* loaded from: classes.dex */
public abstract class luq {
    private static final yph b = yph.c("GH.MsgQueryBase");
    protected yfg a;

    public abstract yfg a(qrn qrnVar, nyj nyjVar);

    public final yfg b(qrn qrnVar, nyj nyjVar) {
        if (acxa.U() && !jrk.b(mki.a.c)) {
            ((ype) ((ype) b.f()).ai((char) 4276)).u("GSA is unavailable, returning empty list of messaging apps");
            int i = yfq.d;
            return yls.a;
        }
        if ((!actj.m() && !actj.n()) || mpl.f().a().j()) {
            return a(qrnVar, nyjVar);
        }
        ((ype) ((ype) b.f()).ai((char) 4275)).u("Messaging notification data sharing disabled, returning empty list of messaging apps");
        int i2 = yfq.d;
        return yls.a;
    }

    public final void c() {
        this.a = null;
    }
}
