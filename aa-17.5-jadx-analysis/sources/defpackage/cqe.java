package defpackage;

/* loaded from: classes.dex */
public final class cqe {
    public final cst a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final aag g = new aag(16);
    public final cqk f = new cqk();
    public final zo h = new zo(10);

    public cqe(cst cstVar) {
        this.a = cstVar;
    }

    public final void a() {
        if (this.d) {
            this.d = true;
        } else {
            this.f.d.g();
        }
    }

    public final void b() {
        if (this.b) {
            this.c = true;
            return;
        }
        byw bywVar = this.f.d;
        Object[] objArr = bywVar.a;
        int i = bywVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((cqj) objArr[i2]).a();
        }
        a();
    }

    public final void c(cfx cfxVar) {
        if (this.b) {
            this.e = true;
            this.g.p(cfxVar);
            return;
        }
        cqk cqkVar = this.f;
        aag aagVar = cqkVar.e;
        aagVar.k();
        aagVar.p(cqkVar);
        while (aagVar.g()) {
            cqk cqkVar2 = (cqk) aagVar.h(aagVar.b - 1);
            int i = 0;
            while (true) {
                byw bywVar = cqkVar2.d;
                if (i < bywVar.b) {
                    cqj cqjVar = (cqj) bywVar.a[i];
                    if (affa.f(cqjVar.a, cfxVar)) {
                        bywVar.m(cqjVar);
                        cqjVar.a();
                    } else {
                        aagVar.p(cqjVar);
                        i++;
                    }
                }
            }
        }
    }
}
