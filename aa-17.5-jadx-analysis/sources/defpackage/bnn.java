package defpackage;

/* loaded from: classes2.dex */
public final class bnn {
    public static final bnn a = new bnn();

    private bnn() {
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [afdr, java.lang.Object] */
    public final void a(fgp fgpVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1565826668);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != buxVarC.C(fgpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            vy.l(fgpVar.d, (dnk) fgpVar.c, bxc.i(1163527043, true, new bly(fgpVar, i4), buxVarC), buxVarC, 384);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(this, fgpVar, i, 1, null);
        }
    }
}
