package R0;

/* loaded from: classes.dex */
public final class i extends o {
    @Override // R0.d
    public final void a(d dVar) {
        f fVar = this.f10087h;
        if (fVar.f10060c && !fVar.f10067j) {
            fVar.d((int) ((((f) fVar.f10068l.get(0)).f10064g * ((Q0.h) this.f10081b).f9651q0) + 0.5f));
        }
    }

    @Override // R0.o
    public final void d() {
        Q0.d dVar = this.f10081b;
        Q0.h hVar = (Q0.h) dVar;
        int i5 = hVar.f9652r0;
        int i10 = hVar.f9653s0;
        int i11 = hVar.f9655u0;
        f fVar = this.f10087h;
        if (i11 == 1) {
            if (i5 != -1) {
                fVar.f10068l.add(dVar.f9533T.f9546d.f10087h);
                this.f10081b.f9533T.f9546d.f10087h.k.add(fVar);
                fVar.f10063f = i5;
            } else if (i10 != -1) {
                fVar.f10068l.add(dVar.f9533T.f9546d.f10088i);
                this.f10081b.f9533T.f9546d.f10088i.k.add(fVar);
                fVar.f10063f = -i10;
            } else {
                fVar.f10059b = true;
                fVar.f10068l.add(dVar.f9533T.f9546d.f10088i);
                this.f10081b.f9533T.f9546d.f10088i.k.add(fVar);
            }
            m(this.f10081b.f9546d.f10087h);
            m(this.f10081b.f9546d.f10088i);
            return;
        }
        if (i5 != -1) {
            fVar.f10068l.add(dVar.f9533T.f9548e.f10087h);
            this.f10081b.f9533T.f9548e.f10087h.k.add(fVar);
            fVar.f10063f = i5;
        } else if (i10 != -1) {
            fVar.f10068l.add(dVar.f9533T.f9548e.f10088i);
            this.f10081b.f9533T.f9548e.f10088i.k.add(fVar);
            fVar.f10063f = -i10;
        } else {
            fVar.f10059b = true;
            fVar.f10068l.add(dVar.f9533T.f9548e.f10088i);
            this.f10081b.f9533T.f9548e.f10088i.k.add(fVar);
        }
        m(this.f10081b.f9548e.f10087h);
        m(this.f10081b.f9548e.f10088i);
    }

    @Override // R0.o
    public final void e() {
        Q0.d dVar = this.f10081b;
        int i5 = ((Q0.h) dVar).f9655u0;
        f fVar = this.f10087h;
        if (i5 == 1) {
            dVar.f9538Y = fVar.f10064g;
        } else {
            dVar.f9539Z = fVar.f10064g;
        }
    }

    @Override // R0.o
    public final void f() {
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
