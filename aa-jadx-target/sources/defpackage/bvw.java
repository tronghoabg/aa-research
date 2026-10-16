package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bvw implements defpackage.byx {
    public final defpackage.bwx a;

    public bvw(defpackage.bwx bwxVar) {
        this.a = bwxVar;
    }

    @Override // defpackage.byx
    public final java.lang.Object a(defpackage.cdd cddVar) {
        return this.a.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.bvw) && defpackage.afga.f(this.a, ((defpackage.bvw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "DynamicValueHolder(state=" + this.a + ")";
    }
}
