package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class dhs {
    public final java.lang.Object a;

    public /* synthetic */ dhs(java.lang.Object obj) {
        this.a = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dhs) && defpackage.afga.f(this.a, ((defpackage.dhs) obj).a);
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final java.lang.String toString() {
        return "AsyncTypefaceResult(result=" + this.a + ")";
    }
}
