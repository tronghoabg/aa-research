package defpackage;

/* loaded from: classes.dex */
public final class caq extends cax {
    public static final caq a = new caq();

    private caq() {
        super(1, 0);
    }

    @Override // defpackage.cax
    protected final void a(cba cbaVar, buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar) {
        int iA = cbaVar.a(0);
        int i = bzjVar.q;
        int iN = bzjVar.n(i);
        int iC = bzjVar.c(bzjVar.b, bzjVar.g(i + 1));
        for (int iMax = Math.max(iN, iC - iA); iMax < iC; iMax++) {
            Object obj = bzjVar.c[bzjVar.d(iMax)];
            if (obj instanceof bxr) {
                cdaVar.e((bxr) obj);
            } else if (obj instanceof bxf) {
                ((bxf) obj).b();
            }
        }
        if (iA <= 0) {
            buz.b("Check failed");
        }
        int i2 = bzjVar.q;
        int iM = bzjVar.m(bzjVar.b, bzjVar.g(i2));
        int iC2 = bzjVar.c(bzjVar.b, bzjVar.g(i2 + 1)) - iA;
        if (iC2 < iM) {
            buz.b("Check failed");
        }
        bzjVar.H(iC2, iA, i2);
        int i3 = bzjVar.h;
        if (i3 >= iM) {
            bzjVar.h = i3 - iA;
        }
    }
}
