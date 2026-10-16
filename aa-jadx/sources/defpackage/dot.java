package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dot {
    public final java.lang.Object a;
    public final int b;
    public final defpackage.dpa c;

    public dot(java.lang.Object obj, int i, defpackage.dpa dpaVar) {
        this.a = obj;
        this.b = i;
        this.c = dpaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dot)) {
            return false;
        }
        defpackage.dot dotVar = (defpackage.dot) obj;
        return defpackage.afga.f(this.a, dotVar.a) && this.b == dotVar.b && defpackage.afga.f(this.c, dotVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "VerticalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ")";
    }
}
