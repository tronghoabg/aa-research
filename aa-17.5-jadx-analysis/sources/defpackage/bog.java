package defpackage;

/* loaded from: classes.dex */
public final class bog {
    public final bng a;
    public final bry b;
    public final bpu c;
    public final bor d;

    public /* synthetic */ bog(byte[] bArr) {
        long j = bua.z;
        bng bngVar = new bng(j, bua.j, bua.A, bua.k, bua.e, bua.E, bua.n, bua.F, bua.o, bua.R, bua.t, bua.S, bua.u, bua.a, bua.g, bua.I, bua.r, bua.Q, bua.s, j, bua.f, bua.d, bua.b, bua.h, bua.c, bua.i, bua.x, bua.y, bua.D, bua.J, bua.P, bua.K, bua.L, bua.M, bua.N, bua.O, bua.B, bua.C, bua.l, bua.m, bua.G, bua.H, bua.p, bua.q, bua.T, bua.U, bua.v, bua.w);
        bry bryVar = new bry(null);
        bcm bcmVar = bpt.a;
        this(bngVar, bryVar, new bpu(bpt.a, bpt.b, bpt.c, bpt.d, bpt.f), bor.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bog bogVar = (bog) obj;
        return affa.f(this.a, bogVar.a) && affa.f(this.b, bogVar.b) && affa.f(this.c, bogVar.c) && affa.f(this.d, bogVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Values(colorScheme=" + this.a + ", typography=" + this.b + ", shapes=" + this.c + ", motionScheme=" + this.d + ")";
    }

    public bog(bng bngVar, bry bryVar, bpu bpuVar, bor borVar) {
        this.a = bngVar;
        this.b = bryVar;
        this.c = bpuVar;
        this.d = borVar;
    }

    public bog() {
        this(null);
    }
}
