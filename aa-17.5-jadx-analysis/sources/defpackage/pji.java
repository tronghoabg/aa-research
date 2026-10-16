package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class pji extends psk {
    private final int f;

    public pji(int i, Class cls, pjh pjhVar, psb psbVar, Executor executor) {
        super(cls, pjhVar, psbVar, executor);
        this.f = i;
    }

    @Override // defpackage.psk
    protected final void a(psm psmVar) {
        pwn pwnVarB;
        int i = this.f;
        zhc zhcVar = null;
        if (i != 0) {
            if (i != 1) {
                throw null;
            }
            throw null;
        }
        pjh pjhVar = (pjh) this.c;
        pja pjaVar = (pja) psmVar;
        synchronized (pjhVar) {
            pjhVar.b = (piz) pjaVar.b();
            pwnVarB = pjhVar.b();
            if (pwnVarB != null) {
                zhc zhcVar2 = pjhVar.a;
                pjhVar.a = null;
                zhcVar = zhcVar2;
            }
        }
        if (zhcVar != null) {
            zhcVar.o(pwnVarB);
        }
    }
}
