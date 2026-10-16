package defpackage;

/* loaded from: classes.dex */
public final class cau extends cax {
    public static final cau a = new cau();

    private cau() {
        super(1, 1);
    }

    @Override // defpackage.cax
    protected final void a(cba cbaVar, buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar) {
        Object objC = cbaVar.c(0);
        boolean z = objC instanceof bxr;
        int iA = cbaVar.a(0);
        if (z) {
            cdaVar.g((bxr) objC);
        }
        Object objT = bzjVar.t(bzjVar.o, iA, objC);
        if (objT instanceof bxr) {
            cdaVar.e((bxr) objT);
        } else if (objT instanceof bxf) {
            ((bxf) objT).b();
        }
    }
}
