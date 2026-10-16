package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dge implements defpackage.dex {
    public final java.lang.String a;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.dge) && defpackage.afga.f(this.a, ((defpackage.dge) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.a + ")";
    }
}
