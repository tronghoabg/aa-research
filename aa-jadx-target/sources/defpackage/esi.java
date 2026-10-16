package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class esi {
    public final java.util.Map b = new java.util.LinkedHashMap();

    public abstract java.lang.Object a(defpackage.esh eshVar);

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.esi) && defpackage.afga.f(this.b, ((defpackage.esi) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CreationExtras(extras=" + this.b + ")";
    }
}
