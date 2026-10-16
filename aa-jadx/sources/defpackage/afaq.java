package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afaq implements java.lang.Comparable<defpackage.afaq> {
    public final int a;
    private final int b;
    private final int c;

    public afaq(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.a = (i << 16) + (i2 << 8);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.afaq afaqVar) {
        afaqVar.getClass();
        return this.a - afaqVar.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.afaq afaqVar = obj instanceof defpackage.afaq ? (defpackage.afaq) obj : null;
        return afaqVar != null && this.a == afaqVar.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return this.b + "." + this.c + ".0";
    }
}
