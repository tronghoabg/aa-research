package defpackage;

/* loaded from: classes.dex */
public final class bzt extends cax {
    public static final bzt a = new bzt();

    private bzt() {
        super(0, 2);
    }

    @Override // defpackage.cax
    protected final void a(cba cbaVar, buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar) {
        int i;
        ccu ccuVar = (ccu) cbaVar.c(0);
        int iA = bzjVar.a((bzb) cbaVar.c(1));
        if (bzjVar.o >= iA) {
            buz.b("Check failed");
        }
        ty.a(bzjVar, bujVar, iA);
        int i2 = bzjVar.o;
        int iK = bzjVar.q;
        while (iK >= 0 && !bzjVar.S(iK)) {
            iK = bzjVar.k(iK);
        }
        int i3 = iK + 1;
        int iL = 0;
        while (i3 < i2) {
            if (bzjVar.R(i2, i3)) {
                if (true == bzjVar.S(i3)) {
                    iL = 0;
                }
                i3++;
            } else {
                iL += bzjVar.S(i3) ? 1 : bzjVar.j(i3);
                i3 += bzjVar.i(i3);
            }
        }
        while (true) {
            i = bzjVar.o;
            if (i >= iA) {
                break;
            }
            if (bzjVar.R(iA, i)) {
                int i4 = bzjVar.o;
                if (i4 < bzjVar.p && (bzjVar.b[(bzjVar.g(i4) * 5) + 1] & 1073741824) != 0) {
                    bujVar.d(bzjVar.s(i4));
                    iL = 0;
                }
                bzjVar.J();
            } else {
                iL += bzjVar.l();
            }
        }
        if (i != iA) {
            buz.b("Check failed");
        }
        ccuVar.a = iL;
    }
}
