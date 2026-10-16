package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class blz {
    public final long a;
    public final long b;

    public blz(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.blz)) {
            return false;
        }
        defpackage.blz blzVar = (defpackage.blz) obj;
        return this.a == blzVar.a && this.b == blzVar.b;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final java.lang.String toString() {
        long j = this.b;
        return "SelectionColors(selectionHandleColor=" + defpackage.ckd.g(this.a) + ", selectionBackgroundColor=" + defpackage.ckd.g(j) + ")";
    }
}
