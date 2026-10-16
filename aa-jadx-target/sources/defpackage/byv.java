package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class byv implements defpackage.byx {
    public final java.lang.Object a;

    public byv(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // defpackage.byx
    public final java.lang.Object a(defpackage.cdd cddVar) {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.byv) && defpackage.afga.f(this.a, ((defpackage.byv) obj).a);
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final java.lang.String toString() {
        return "StaticValueHolder(value=" + this.a + ")";
    }
}
