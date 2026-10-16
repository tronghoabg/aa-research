package defpackage;

/* loaded from: classes2.dex */
final class gol {
    public final gov a;
    public final int b;
    public final gzc c;

    public gol(gov govVar, int i, gzc gzcVar) {
        govVar.getClass();
        gzcVar.getClass();
        this.a = govVar;
        this.b = i;
        this.c = gzcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gol)) {
            return false;
        }
        gol golVar = (gol) obj;
        return affa.f(this.a, golVar.a) && this.b == golVar.b && this.c == golVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "State(model=" + this.a + ", selectedIndex=" + this.b + ", screenState=" + this.c + ")";
    }
}
