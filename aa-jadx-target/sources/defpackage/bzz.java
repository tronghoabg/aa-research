package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bzz extends defpackage.cbd {
    public static final defpackage.bzz a = new defpackage.bzz();

    private bzz() {
        super(0, 2);
    }

    @Override // defpackage.cbd
    protected final void a(defpackage.cbg cbgVar, defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        int i;
        defpackage.cda cdaVar = (defpackage.cda) cbgVar.c(0);
        int iA = bzpVar.a((defpackage.bzh) cbgVar.c(1));
        if (bzpVar.o >= iA) {
            defpackage.bvg.b("Check failed");
        }
        defpackage.ud.a(bzpVar, buqVar, iA);
        int i2 = bzpVar.o;
        int iK = bzpVar.q;
        while (iK >= 0 && !bzpVar.S(iK)) {
            iK = bzpVar.k(iK);
        }
        int i3 = iK + 1;
        int iL = 0;
        while (i3 < i2) {
            if (bzpVar.R(i2, i3)) {
                if (true == bzpVar.S(i3)) {
                    iL = 0;
                }
                i3++;
            } else {
                iL += bzpVar.S(i3) ? 1 : bzpVar.j(i3);
                i3 += bzpVar.i(i3);
            }
        }
        while (true) {
            i = bzpVar.o;
            if (i >= iA) {
                break;
            }
            if (bzpVar.R(iA, i)) {
                int i4 = bzpVar.o;
                if (i4 < bzpVar.p && (bzpVar.b[(bzpVar.g(i4) * 5) + 1] & 1073741824) != 0) {
                    buqVar.d(bzpVar.s(i4));
                    iL = 0;
                }
                bzpVar.J();
            } else {
                iL += bzpVar.l();
            }
        }
        if (i != iA) {
            defpackage.bvg.b("Check failed");
        }
        cdaVar.a = iL;
    }
}
