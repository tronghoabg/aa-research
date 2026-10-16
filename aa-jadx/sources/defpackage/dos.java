package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dos {
    public final java.lang.Object a;
    public final int b;
    public final defpackage.dpa c;

    public dos(java.lang.Object obj, int i, defpackage.dpa dpaVar) {
        this.a = obj;
        this.b = i;
        this.c = dpaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dos)) {
            return false;
        }
        defpackage.dos dosVar = (defpackage.dos) obj;
        return defpackage.afga.f(this.a, dosVar.a) && this.b == dosVar.b && defpackage.afga.f(this.c, dosVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "HorizontalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ")";
    }
}
