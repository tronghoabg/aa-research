package defpackage;

/* loaded from: classes.dex */
public final class aun {
    public cto a;
    public cto b;
    public final int c = 2;
    private final int d = 0;
    private final int e = 0;

    public final void a(csp cspVar, csp cspVar2, long j) {
        long jD = dlf.d(dle.d(j), dle.b(j), dle.c(j), dle.a(j));
        if (cspVar != null) {
            cspVar.e(cspVar.f(dle.a(jD)));
            this.a = cspVar instanceof cto ? (cto) cspVar : null;
        }
        if (cspVar2 != null) {
            cspVar2.e(cspVar2.f(dle.a(jD)));
            this.b = cspVar2 instanceof cto ? (cto) cspVar2 : null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aun)) {
            return false;
        }
        aun aunVar = (aun) obj;
        int i = aunVar.c;
        int i2 = aunVar.d;
        int i3 = aunVar.e;
        return true;
    }

    public final int hashCode() {
        return 1922;
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=Clip, minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
