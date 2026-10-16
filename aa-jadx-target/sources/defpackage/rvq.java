package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rvq extends defpackage.edd implements java.lang.Comparable {
    public final int a;
    public final int b;

    public rvq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.rvq rvqVar) {
        return defpackage.yek.b.c(this.a, rvqVar.a).c(this.b, rvqVar.b).a();
    }

    public final boolean C(defpackage.rvq rvqVar) {
        return compareTo(rvqVar) >= 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.rvq) {
            defpackage.rvq rvqVar = (defpackage.rvq) obj;
            if (this.a == rvqVar.a && this.b == rvqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return defpackage.a.T(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b)}, defpackage.rvq.class);
    }
}
