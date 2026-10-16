package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bkn {
    public final int a;
    public final long b = 1;
    private final int c;

    public bkn(int i, int i2) {
        this.c = i;
        this.a = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bkn)) {
            return false;
        }
        defpackage.bkn bknVar = (defpackage.bkn) obj;
        if (this.c != bknVar.c || this.a != bknVar.a) {
            return false;
        }
        long j = bknVar.b;
        return true;
    }

    public final int hashCode() {
        return (((this.c * 31) + this.a) * 31) + 1;
    }

    public final java.lang.String toString() {
        return "AnchorInfo(direction=" + ((java.lang.Object) defpackage.dln.x(this.c)) + ", offset=" + this.a + ", selectableId=1)";
    }
}
