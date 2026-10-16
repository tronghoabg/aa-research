package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afav implements java.io.Serializable {
    public final java.lang.Throwable a;

    public afav(java.lang.Throwable th) {
        this.a = th;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.afav) && defpackage.afga.f(this.a, ((defpackage.afav) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Failure(" + this.a + ")";
    }
}
