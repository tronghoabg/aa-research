package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class drf extends drj {
    private final void g(drb drbVar) {
        drb drbVar2 = this.h;
        drbVar2.j.add(drbVar);
        drbVar.k.add(drbVar2);
    }

    @Override // defpackage.drj
    public final void b() {
        dqn dqnVar = this.d;
        if (dqnVar instanceof dqk) {
            drb drbVar = this.h;
            drbVar.b = true;
            dqk dqkVar = (dqk) dqnVar;
            int i = dqkVar.a;
            boolean z = dqkVar.b;
            int i2 = 0;
            if (i == 0) {
                drbVar.l = 4;
                while (i2 < dqkVar.aM) {
                    dqn dqnVar2 = dqkVar.aL[i2];
                    if (z || dqnVar2.ar != 8) {
                        drb drbVar2 = dqnVar2.o.h;
                        drbVar2.j.add(drbVar);
                        drbVar.k.add(drbVar2);
                    }
                    i2++;
                }
                g(this.d.o.h);
                g(this.d.o.i);
                return;
            }
            if (i == 1) {
                drbVar.l = 5;
                while (i2 < dqkVar.aM) {
                    dqn dqnVar3 = dqkVar.aL[i2];
                    if (z || dqnVar3.ar != 8) {
                        drb drbVar3 = dqnVar3.o.i;
                        drbVar3.j.add(drbVar);
                        drbVar.k.add(drbVar3);
                    }
                    i2++;
                }
                g(this.d.o.h);
                g(this.d.o.i);
                return;
            }
            if (i == 2) {
                drbVar.l = 6;
                while (i2 < dqkVar.aM) {
                    dqn dqnVar4 = dqkVar.aL[i2];
                    if (z || dqnVar4.ar != 8) {
                        drb drbVar4 = dqnVar4.p.h;
                        drbVar4.j.add(drbVar);
                        drbVar.k.add(drbVar4);
                    }
                    i2++;
                }
                g(this.d.p.h);
                g(this.d.p.i);
                return;
            }
            if (i != 3) {
                return;
            }
            drbVar.l = 7;
            while (i2 < dqkVar.aM) {
                dqn dqnVar5 = dqkVar.aL[i2];
                if (z || dqnVar5.ar != 8) {
                    drb drbVar5 = dqnVar5.p.i;
                    drbVar5.j.add(drbVar);
                    drbVar.k.add(drbVar5);
                }
                i2++;
            }
            g(this.d.p.h);
            g(this.d.p.i);
        }
    }

    @Override // defpackage.drj
    public final void c() {
        dqn dqnVar = this.d;
        if (dqnVar instanceof dqk) {
            int i = ((dqk) dqnVar).a;
            if (i == 0 || i == 1) {
                dqnVar.aj = this.h.f;
            } else {
                dqnVar.ak = this.h.f;
            }
        }
    }

    @Override // defpackage.drj
    public final void d() {
        this.l = null;
        this.h.b();
    }

    @Override // defpackage.drj
    public final boolean e() {
        return false;
    }

    @Override // defpackage.drj, defpackage.dqz
    public final void f() {
        dqk dqkVar = (dqk) this.d;
        int i = dqkVar.a;
        drb drbVar = this.h;
        Iterator it = drbVar.k.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((drb) it.next()).f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            drbVar.c(i3 + dqkVar.c);
        } else {
            drbVar.c(i2 + dqkVar.c);
        }
    }
}
