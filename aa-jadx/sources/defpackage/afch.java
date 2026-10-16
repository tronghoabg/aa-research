package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afch<T> {
    public final int a;
    public final java.lang.Object b;

    public afch(int i, java.lang.Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.afch)) {
            return false;
        }
        defpackage.afch afchVar = (defpackage.afch) obj;
        return this.a == afchVar.a && defpackage.afga.f(this.b, afchVar.b);
    }

    public final int hashCode() {
        java.lang.Object obj = this.b;
        return (this.a * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final java.lang.String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ")";
    }
}
