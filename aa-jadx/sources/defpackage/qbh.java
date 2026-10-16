package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qbh {
    private final int a;
    private final long b;

    public qbh(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.qbh) {
            defpackage.qbh qbhVar = (defpackage.qbh) obj;
            if (this.a == qbhVar.a && this.b == qbhVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final java.lang.String toString() {
        return "http://go/veat/" + this.a + " @ " + java.text.SimpleDateFormat.getDateTimeInstance().format(new java.util.Date(this.b));
    }

    public qbh() {
        throw null;
    }
}
