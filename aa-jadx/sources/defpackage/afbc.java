package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@defpackage.afeo
public final class afbc implements java.lang.Comparable<defpackage.afbc> {
    public final int a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(defpackage.afbc afbcVar) {
        return defpackage.afga.b(this.a ^ Integer.MIN_VALUE, afbcVar.a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.afbc) && this.a == ((defpackage.afbc) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(((long) this.a) & 4294967295L);
    }
}
