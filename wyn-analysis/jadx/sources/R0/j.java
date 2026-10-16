package R0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class j extends o {
    @Override // R0.d
    public final void a(d dVar) {
        Q0.a aVar = (Q0.a) this.f10081b;
        int i5 = aVar.f9487s0;
        f fVar = this.f10087h;
        Iterator it = fVar.f10068l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((f) it.next()).f10064g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (i5 == 0 || i5 == 2) {
            fVar.d(i11 + aVar.f9489u0);
        } else {
            fVar.d(i10 + aVar.f9489u0);
        }
    }

    @Override // R0.o
    public final void d() {
        Q0.d dVar = this.f10081b;
        if (dVar instanceof Q0.a) {
            f fVar = this.f10087h;
            fVar.f10059b = true;
            Q0.a aVar = (Q0.a) dVar;
            int i5 = aVar.f9487s0;
            boolean z2 = aVar.f9488t0;
            int i10 = 0;
            if (i5 == 0) {
                fVar.f10062e = 4;
                while (i10 < aVar.f9657r0) {
                    Q0.d dVar2 = aVar.f9656q0[i10];
                    if (z2 || dVar2.f9553g0 != 8) {
                        f fVar2 = dVar2.f9546d.f10087h;
                        fVar2.k.add(fVar);
                        fVar.f10068l.add(fVar2);
                    }
                    i10++;
                }
                m(this.f10081b.f9546d.f10087h);
                m(this.f10081b.f9546d.f10088i);
                return;
            }
            if (i5 == 1) {
                fVar.f10062e = 5;
                while (i10 < aVar.f9657r0) {
                    Q0.d dVar3 = aVar.f9656q0[i10];
                    if (z2 || dVar3.f9553g0 != 8) {
                        f fVar3 = dVar3.f9546d.f10088i;
                        fVar3.k.add(fVar);
                        fVar.f10068l.add(fVar3);
                    }
                    i10++;
                }
                m(this.f10081b.f9546d.f10087h);
                m(this.f10081b.f9546d.f10088i);
                return;
            }
            if (i5 == 2) {
                fVar.f10062e = 6;
                while (i10 < aVar.f9657r0) {
                    Q0.d dVar4 = aVar.f9656q0[i10];
                    if (z2 || dVar4.f9553g0 != 8) {
                        f fVar4 = dVar4.f9548e.f10087h;
                        fVar4.k.add(fVar);
                        fVar.f10068l.add(fVar4);
                    }
                    i10++;
                }
                m(this.f10081b.f9548e.f10087h);
                m(this.f10081b.f9548e.f10088i);
                return;
            }
            if (i5 != 3) {
                return;
            }
            fVar.f10062e = 7;
            while (i10 < aVar.f9657r0) {
                Q0.d dVar5 = aVar.f9656q0[i10];
                if (z2 || dVar5.f9553g0 != 8) {
                    f fVar5 = dVar5.f9548e.f10088i;
                    fVar5.k.add(fVar);
                    fVar.f10068l.add(fVar5);
                }
                i10++;
            }
            m(this.f10081b.f9548e.f10087h);
            m(this.f10081b.f9548e.f10088i);
        }
    }

    @Override // R0.o
    public final void e() {
        Q0.d dVar = this.f10081b;
        if (dVar instanceof Q0.a) {
            int i5 = ((Q0.a) dVar).f9487s0;
            f fVar = this.f10087h;
            if (i5 == 0 || i5 == 1) {
                dVar.f9538Y = fVar.f10064g;
            } else {
                dVar.f9539Z = fVar.f10064g;
            }
        }
    }

    @Override // R0.o
    public final void f() {
        this.f10082c = null;
        this.f10087h.c();
    }

    @Override // R0.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f10087h;
        fVar2.k.add(fVar);
        fVar.f10068l.add(fVar2);
    }
}
