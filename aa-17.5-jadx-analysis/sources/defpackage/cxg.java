package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class cxg extends cvv {
    @Override // defpackage.cvv
    public final int a(cyc cycVar, crw crwVar) {
        cxl cxlVarC = cycVar.C();
        cxlVarC.getClass();
        return cxlVarC.eB(crwVar);
    }

    @Override // defpackage.cvv
    protected final long b(cyc cycVar, long j) {
        cxl cxlVarC = cycVar.C();
        cxlVarC.getClass();
        long j2 = cxlVarC.h;
        return a.ai((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
    }

    @Override // defpackage.cvv
    public final Map c(cyc cycVar) {
        cxl cxlVarC = cycVar.C();
        cxlVarC.getClass();
        return cxlVarC.K().f();
    }
}
