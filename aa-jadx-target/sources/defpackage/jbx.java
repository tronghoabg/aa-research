package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jbx extends defpackage.edd implements java.lang.Comparable {
    public final int a;
    public final int b;

    public jbx(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.jbx jbxVar) {
        return defpackage.yek.b.c(this.a, jbxVar.a).c(this.b, jbxVar.b).a();
    }

    public final /* synthetic */ boolean C(java.lang.Object obj) {
        if (!(obj instanceof defpackage.jbx)) {
            return false;
        }
        defpackage.jbx jbxVar = (defpackage.jbx) obj;
        return this.a == jbxVar.a && this.b == jbxVar.b;
    }

    public final boolean D(defpackage.jbx jbxVar) {
        return compareTo(jbxVar) >= 0;
    }

    public final boolean E(int i, int i2) {
        return D(new defpackage.jbx(i, i2));
    }

    public final boolean equals(java.lang.Object obj) {
        return C(obj);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return defpackage.a.T(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b)}, defpackage.jbx.class);
    }
}
