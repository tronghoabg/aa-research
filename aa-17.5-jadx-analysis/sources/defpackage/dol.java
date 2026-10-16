package defpackage;

/* loaded from: classes2.dex */
public final class dol {
    public final Object a;
    public final int b;
    public final dos c;

    public dol(Object obj, int i, dos dosVar) {
        this.a = obj;
        this.b = i;
        this.c = dosVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dol)) {
            return false;
        }
        dol dolVar = (dol) obj;
        return affa.f(this.a, dolVar.a) && this.b == dolVar.b && affa.f(this.c, dolVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "VerticalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ")";
    }
}
