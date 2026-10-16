package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bol {
    public final defpackage.bnk a;
    public final defpackage.bse b;
    public final defpackage.bpz c;
    public final defpackage.bow d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ bol(byte[] bArr) {
        int i = defpackage.bnl.a;
        long j = defpackage.buh.z;
        this(new defpackage.bnk(j, defpackage.buh.j, defpackage.buh.A, defpackage.buh.k, defpackage.buh.e, defpackage.buh.E, defpackage.buh.n, defpackage.buh.F, defpackage.buh.o, defpackage.buh.R, defpackage.buh.t, defpackage.buh.S, defpackage.buh.u, defpackage.buh.a, defpackage.buh.g, defpackage.buh.I, defpackage.buh.r, defpackage.buh.Q, defpackage.buh.s, j, defpackage.buh.f, defpackage.buh.d, defpackage.buh.b, defpackage.buh.h, defpackage.buh.c, defpackage.buh.i, defpackage.buh.x, defpackage.buh.y, defpackage.buh.D, defpackage.buh.J, defpackage.buh.P, defpackage.buh.K, defpackage.buh.L, defpackage.buh.M, defpackage.buh.N, defpackage.buh.O, defpackage.buh.B, defpackage.buh.C, defpackage.buh.l, defpackage.buh.m, defpackage.buh.G, defpackage.buh.H, defpackage.buh.p, defpackage.buh.q, defpackage.buh.T, defpackage.buh.U, defpackage.buh.v, defpackage.buh.w), new defpackage.bse(null), new defpackage.bpz(null), defpackage.bow.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.bol bolVar = (defpackage.bol) obj;
        return defpackage.afga.f(this.a, bolVar.a) && defpackage.afga.f(this.b, bolVar.b) && defpackage.afga.f(this.c, bolVar.c) && defpackage.afga.f(this.d, bolVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "Values(colorScheme=" + this.a + ", typography=" + this.b + ", shapes=" + this.c + ", motionScheme=" + this.d + ")";
    }

    public bol(defpackage.bnk bnkVar, defpackage.bse bseVar, defpackage.bpz bpzVar, defpackage.bow bowVar) {
        this.a = bnkVar;
        this.b = bseVar;
        this.c = bpzVar;
        this.d = bowVar;
    }

    public bol() {
        this(null);
    }
}
