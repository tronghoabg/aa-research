package defpackage;

/* loaded from: classes.dex */
public final class bzp extends cax {
    public static final bzp a = new bzp();

    private bzp() {
        super(0, 2);
    }

    @Override // defpackage.cax
    protected final void a(cba cbaVar, buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar) {
        ccu ccuVar = (ccu) cbaVar.c(1);
        int i = ccuVar != null ? ccuVar.a : 0;
        kgx kgxVar = (kgx) cbaVar.c(0);
        if (i > 0) {
            bujVar = new bwu(bujVar, i);
        }
        kgxVar.p(bujVar, bzjVar, cdaVar, cayVar != null ? new caz(cayVar, bzjVar) : null);
    }
}
