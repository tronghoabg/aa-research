package defpackage;

/* loaded from: classes2.dex */
public final class dre extends drj {
    public dre(dqn dqnVar) {
        super(dqnVar);
        dqnVar.o.d();
        dqnVar.p.d();
        this.f = ((dqr) dqnVar).e;
    }

    private final void g(drb drbVar) {
        drb drbVar2 = this.h;
        drbVar2.j.add(drbVar);
        drbVar.k.add(drbVar2);
    }

    @Override // defpackage.drj
    public final void b() {
        dqn dqnVar = this.d;
        dqr dqrVar = (dqr) dqnVar;
        int i = dqrVar.b;
        int i2 = dqrVar.c;
        float f = dqrVar.a;
        if (dqrVar.e == 1) {
            if (i != -1) {
                drb drbVar = this.h;
                drbVar.k.add(dqnVar.ae.o.h);
                this.d.ae.o.h.j.add(drbVar);
                drbVar.e = i;
            } else if (i2 != -1) {
                drb drbVar2 = this.h;
                drbVar2.k.add(dqnVar.ae.o.i);
                this.d.ae.o.i.j.add(drbVar2);
                drbVar2.e = -i2;
            } else {
                drb drbVar3 = this.h;
                drbVar3.b = true;
                drbVar3.k.add(dqnVar.ae.o.i);
                this.d.ae.o.i.j.add(drbVar3);
            }
            g(this.d.o.h);
            g(this.d.o.i);
            return;
        }
        if (i != -1) {
            drb drbVar4 = this.h;
            drbVar4.k.add(dqnVar.ae.p.h);
            this.d.ae.p.h.j.add(drbVar4);
            drbVar4.e = i;
        } else if (i2 != -1) {
            drb drbVar5 = this.h;
            drbVar5.k.add(dqnVar.ae.p.i);
            this.d.ae.p.i.j.add(drbVar5);
            drbVar5.e = -i2;
        } else {
            drb drbVar6 = this.h;
            drbVar6.b = true;
            drbVar6.k.add(dqnVar.ae.p.i);
            this.d.ae.p.i.j.add(drbVar6);
        }
        g(this.d.p.h);
        g(this.d.p.i);
    }

    @Override // defpackage.drj
    public final void c() {
        dqn dqnVar = this.d;
        if (((dqr) dqnVar).e == 1) {
            dqnVar.aj = this.h.f;
        } else {
            dqnVar.ak = this.h.f;
        }
    }

    @Override // defpackage.drj
    public final void d() {
        this.h.b();
    }

    @Override // defpackage.drj
    public final boolean e() {
        return false;
    }

    @Override // defpackage.drj, defpackage.dqz
    public final void f() {
        drb drbVar = this.h;
        if (drbVar.c && !drbVar.i) {
            drbVar.c((int) ((((drb) drbVar.k.get(0)).f * ((dqr) this.d).a) + 0.5f));
        }
    }
}
