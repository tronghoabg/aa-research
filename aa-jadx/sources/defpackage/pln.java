package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pln {
    public final long a;
    public final int b;
    private final int c;

    public pln(int i, int i2, long j) {
        this.b = i;
        this.c = i2;
        this.a = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.pln)) {
            return false;
        }
        defpackage.pln plnVar = (defpackage.pln) obj;
        return this.c == plnVar.c && this.a == plnVar.a && this.b == plnVar.b;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.c), java.lang.Long.valueOf(this.a), java.lang.Integer.valueOf(this.b));
    }
}
