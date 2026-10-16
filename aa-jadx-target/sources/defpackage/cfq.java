package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cfq {
    public final int a;
    public final java.lang.Integer b;

    public cfq(int i, java.lang.Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cfq)) {
            return false;
        }
        defpackage.cfq cfqVar = (defpackage.cfq) obj;
        return this.a == cfqVar.a && defpackage.afga.f(this.b, cfqVar.b);
    }

    public final int hashCode() {
        java.lang.Integer num = this.b;
        return (this.a * 31) + (num == null ? 0 : num.hashCode());
    }

    public final java.lang.String toString() {
        return "ObjectLocation(group=" + this.a + ", dataOffset=" + this.b + ")";
    }
}
