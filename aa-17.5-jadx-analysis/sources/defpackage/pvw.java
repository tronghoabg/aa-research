package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class pvw extends psk {
    public pvw(Class cls, pvu pvuVar, psb psbVar, Executor executor) {
        super(cls, pvuVar, psbVar, executor);
    }

    @Override // defpackage.psk
    protected final void a(psm psmVar) {
        pvu pvuVar = (pvu) this.c;
        ((ynz) ((ynz) pvu.a.f()).ai((char) 6912)).u("AuthTokensUpdateEvent received");
        pvuVar.b.execute(new pru(pvuVar, 9));
    }
}
