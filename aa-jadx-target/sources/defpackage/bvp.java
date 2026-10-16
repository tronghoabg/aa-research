package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bvp implements defpackage.byx {
    public final defpackage.affc a;

    public bvp(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.byx
    public final java.lang.Object a(defpackage.cdd cddVar) {
        return this.a.invoke(cddVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.bvp) && defpackage.afga.f(this.a, ((defpackage.bvp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ComputedValueHolder(compute=" + this.a + ")";
    }
}
