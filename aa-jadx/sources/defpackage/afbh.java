package defpackage;

/* JADX INFO: loaded from: classes.dex */
@defpackage.afeo
public final class afbh implements java.lang.Comparable<defpackage.afbh> {
    public final short a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(defpackage.afbh afbhVar) {
        return defpackage.afga.b((char) this.a, (char) afbhVar.a);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.afbh) && this.a == ((defpackage.afbh) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf((int) ((char) this.a));
    }
}
