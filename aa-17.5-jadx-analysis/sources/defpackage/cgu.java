package defpackage;

/* loaded from: classes.dex */
public final class cgu extends cfx implements cyz, cwd, cws {
    public final afec a;
    public cgu b;
    public long c;
    public cgu d;
    private final Object e;

    public cgu(byte[] bArr) {
        this.a = null;
        this.e = cgt.a;
        this.c = 0L;
    }

    public final void b(sm smVar) {
        cgu cguVar = this.b;
        if (cguVar != null) {
            cguVar.b(smVar);
        }
        this.b = null;
    }

    public final void d(sm smVar) {
        cyz cyzVar;
        cgu cguVar;
        cgu cguVar2 = this.b;
        cgu cguVar3 = null;
        if (cguVar2 == null || !xb.d(cguVar2, cdj.l(smVar))) {
            if (this.q.A) {
                affv affvVar = new affv();
                czz.p(this, new gln(affvVar, this, smVar, 1));
                cyzVar = (cyz) affvVar.a;
            } else {
                cyzVar = null;
            }
            cguVar = (cgu) cyzVar;
        } else {
            cguVar = cguVar2;
        }
        if (cguVar != null && cguVar2 == null) {
            cguVar.d(smVar);
        } else if (cguVar == null && cguVar2 != null) {
            cguVar2.b(smVar);
        } else if (!affa.f(cguVar, cguVar2)) {
            if (cguVar != null) {
                cguVar.d(smVar);
                cguVar3 = cguVar;
            }
            if (cguVar2 != null) {
                cguVar2.b(smVar);
            }
            cguVar = cguVar3;
        } else if (cguVar != null) {
            cguVar.d(smVar);
        }
        this.b = cguVar;
    }

    @Override // defpackage.cyz
    public final Object ep() {
        return this.e;
    }

    @Override // defpackage.cxs
    public final void et(long j) {
        this.c = j;
    }

    @Override // defpackage.cfx
    public final void q() {
        this.d = null;
        this.b = null;
    }

    public cgu() {
        this(null);
    }

    @Override // defpackage.cws
    public final /* synthetic */ void f(cst cstVar) {
    }
}
