package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class caw extends defpackage.cbd {
    public static final defpackage.caw a = new defpackage.caw();

    private caw() {
        super(1, 0);
    }

    @Override // defpackage.cbd
    protected final void a(defpackage.cbg cbgVar, defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        int iA = cbgVar.a(0);
        int i = bzpVar.q;
        int iN = bzpVar.n(i);
        int iC = bzpVar.c(bzpVar.b, bzpVar.g(i + 1));
        for (int iMax = java.lang.Math.max(iN, iC - iA); iMax < iC; iMax++) {
            java.lang.Object obj = bzpVar.c[bzpVar.d(iMax)];
            if (obj instanceof defpackage.bxx) {
                cdgVar.e((defpackage.bxx) obj);
            } else if (obj instanceof defpackage.bxl) {
                ((defpackage.bxl) obj).b();
            }
        }
        if (iA <= 0) {
            defpackage.bvg.b("Check failed");
        }
        int i2 = bzpVar.q;
        int iM = bzpVar.m(bzpVar.b, bzpVar.g(i2));
        int iC2 = bzpVar.c(bzpVar.b, bzpVar.g(i2 + 1)) - iA;
        if (iC2 < iM) {
            defpackage.bvg.b("Check failed");
        }
        bzpVar.H(iC2, iA, i2);
        int i3 = bzpVar.h;
        if (i3 >= iM) {
            bzpVar.h = i3 - iA;
        }
    }
}
