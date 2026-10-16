package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tqy {
    public final int a;
    public final int b;

    public tqy(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.tqy tqyVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof defpackage.tqy) && (tqyVar = (defpackage.tqy) obj) != null) {
            if (tqyVar.a == this.a && tqyVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), 0);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("GeometryOrder[plane=%s grade=%s withinGrade=%s]", java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), 0);
    }
}
