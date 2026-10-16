package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class afaw implements java.io.Serializable {
    public final java.lang.Object a;

    public /* synthetic */ afaw(java.lang.Object obj) {
        this.a = obj;
    }

    public static final java.lang.Throwable a(java.lang.Object obj) {
        if (obj instanceof defpackage.afav) {
            return ((defpackage.afav) obj).a;
        }
        return null;
    }

    public static final boolean b(java.lang.Object obj) {
        return !(obj instanceof defpackage.afav);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.afaw) && defpackage.afga.f(this.a, ((defpackage.afaw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.a;
        return obj instanceof defpackage.afav ? ((defpackage.afav) obj).toString() : defpackage.a.bl(obj, "Success(", ")");
    }
}
