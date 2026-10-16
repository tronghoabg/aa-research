package defpackage;

/* loaded from: classes.dex */
public final class car extends cax {
    public static final car a = new car();

    private car() {
        super(1, 2);
    }

    @Override // defpackage.cax
    protected final void a(cba cbaVar, buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar) {
        Object objC = cbaVar.c(0);
        bzb bzbVar = (bzb) cbaVar.c(1);
        boolean z = objC instanceof bxr;
        int iA = cbaVar.a(0);
        if (z) {
            cdaVar.g((bxr) objC);
        }
        Object objT = bzjVar.t(bzjVar.a(bzbVar), iA, objC);
        if (objT instanceof bxr) {
            cdaVar.e((bxr) objT);
        } else if (objT instanceof bxf) {
            ((bxf) objT).b();
        }
    }
}
