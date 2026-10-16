package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class caj extends cax {
    public static final caj a = new caj();

    private caj() {
        super(0, 1);
    }

    @Override // defpackage.cax
    protected final void a(cba cbaVar, buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar) {
        bxf bxfVar = (bxf) cbaVar.c(0);
        Set set = cdaVar.a;
        if (set == null) {
            return;
        }
        ccv ccvVar = new ccv(set);
        aan aanVar = cdaVar.j;
        if (aanVar == null) {
            long[] jArr = aao.a;
            aanVar = new aan(6);
            cdaVar.j = aanVar;
        }
        aanVar.m(bxfVar, ccvVar);
        cdaVar.c.n(new bwa(ccvVar, -1));
    }
}
