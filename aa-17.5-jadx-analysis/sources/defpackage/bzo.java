package defpackage;

/* loaded from: classes.dex */
public final class bzo extends cax {
    public static final bzo a = new bzo();

    private bzo() {
        super(0, 2);
    }

    @Override // defpackage.cax
    protected final void a(cba cbaVar, buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar) {
        bzb bzbVar = (bzb) cbaVar.c(0);
        Object objC = cbaVar.c(1);
        if (objC instanceof bxr) {
            cdaVar.g((bxr) objC);
        }
        if (bzjVar.m != 0) {
            buz.b("Can only append a slot if not current inserting");
        }
        int i = bzjVar.h;
        int i2 = bzjVar.i;
        int iA = bzjVar.a(bzbVar);
        int iC = bzjVar.c(bzjVar.b, bzjVar.g(iA + 1));
        bzjVar.h = iC;
        bzjVar.i = iC;
        bzjVar.C(1, iA);
        if (i >= iC) {
            i++;
            i2++;
        }
        bzjVar.c[iC] = objC;
        bzjVar.h = i;
        bzjVar.i = i2;
    }
}
