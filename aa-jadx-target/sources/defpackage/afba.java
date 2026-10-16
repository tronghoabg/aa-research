package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class afba implements java.lang.Comparable<defpackage.afba> {
    public final byte a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(defpackage.afba afbaVar) {
        return defpackage.afga.b(this.a & 255, afbaVar.a & 255);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.afba) && this.a == ((defpackage.afba) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.a & 255);
    }
}
