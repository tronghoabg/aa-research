package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class afbe implements java.lang.Comparable<defpackage.afbe> {
    public final long a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(defpackage.afbe afbeVar) {
        return defpackage.afga.c(this.a ^ Long.MIN_VALUE, afbeVar.a ^ Long.MIN_VALUE);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.afbe) && this.a == ((defpackage.afbe) obj).a;
    }

    public final int hashCode() {
        return defpackage.a.f(this.a);
    }

    public final java.lang.String toString() {
        return defpackage.afga.cx(this.a, 10);
    }
}
