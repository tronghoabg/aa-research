package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class cqf extends cfx implements cyz, cys, cwc {
    public cwj a;
    public final boolean b = false;
    public boolean c;
    private cqr d;

    public cqf(cqr cqrVar, cwj cwjVar) {
        this.a = cwjVar;
        this.d = cqrVar;
    }

    private final void i() {
        cqr cqrVar;
        affv affvVar = new affv();
        czz.n(this, new cmj(2));
        cqf cqfVar = (cqf) affvVar.a;
        if (cqfVar == null || (cqrVar = cqfVar.d) == null) {
            cqrVar = this.d;
        }
        d(cqrVar);
    }

    private final void j() {
        affq affqVar = new affq();
        affqVar.a = true;
        czz.p(this, new chk(affqVar, 7));
        if (affqVar.a) {
            i();
        }
    }

    private final void k() {
        if (this.c) {
            this.c = false;
            if (this.A) {
                affv affvVar = new affv();
                czz.n(this, new chk(affvVar, 6));
                cqf cqfVar = (cqf) affvVar.a;
                if (cqfVar != null) {
                    cqfVar.i();
                } else {
                    d(null);
                }
            }
        }
    }

    @Override // defpackage.cys
    public final /* synthetic */ boolean C() {
        return false;
    }

    public abstract void d(cqr cqrVar);

    @Override // defpackage.cys
    public final long eq() {
        return this.a != null ? cwj.a(bzi.t(this)) : ty.c(0, 0, 0, 0);
    }

    public final void f(cqr cqrVar) {
        if (affa.f(this.d, cqrVar)) {
            return;
        }
        this.d = cqrVar;
        if (this.c) {
            j();
        }
    }

    public abstract boolean g(int i);

    protected final czp h() {
        return (czp) bzi.x(this, dbc.q);
    }

    @Override // defpackage.cys
    public final void o() {
        k();
    }

    @Override // defpackage.cfx
    /* renamed from: p */
    public final /* synthetic */ void t() {
        o();
    }

    @Override // defpackage.cfx
    public final void q() {
        k();
    }

    @Override // defpackage.cys
    public final void s(cql cqlVar, cqm cqmVar, long j) {
        if (cqmVar == cqm.b) {
            List list = cqlVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (g(((cqu) list.get(i)).i)) {
                    int i2 = cqlVar.e;
                    if (a.Y(i2, 4)) {
                        this.c = true;
                        j();
                        return;
                    } else {
                        if (a.Y(i2, 5)) {
                            k();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.cys
    public final /* synthetic */ void t() {
        o();
    }

    @Override // defpackage.cys
    public final /* synthetic */ void E() {
    }
}
