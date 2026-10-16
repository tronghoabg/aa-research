package t0;

/* renamed from: t0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4047L extends X0.E {
    @Override // X0.E
    public final void g() {
        this.f15787a = true;
        p0.o oVar = (p0.o) ((Z.j) this.f15789c);
        oVar.s().f43163a = (y) this.f15788b;
        oVar.s().f43164b = true;
    }

    @Override // X0.E
    public final void h() {
        this.f15787a = false;
        ((p0.o) ((Z.j) this.f15789c)).s().f43164b = false;
    }

    public final boolean j() {
        p0.n nVarS = ((p0.o) ((Z.j) this.f15789c)).s();
        nVarS.getClass();
        if (nVarS instanceof p0.q) {
            return true;
        }
        C4047L c4047l = (C4047L) ((X0.E) this.f15790d);
        return c4047l != null ? c4047l.j() : false;
    }
}
