package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ypb {
    public final int a;
    public final java.util.concurrent.TimeUnit b;

    public ypb(int i, java.util.concurrent.TimeUnit timeUnit) {
        this.a = i;
        timeUnit.getClass();
        this.b = timeUnit;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ypb) {
            defpackage.ypb ypbVar = (defpackage.ypb) obj;
            if (this.a == ypbVar.a && this.b == ypbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b.hashCode() ^ (i * 37);
    }

    public final java.lang.String toString() {
        return this.a + " " + this.b.toString();
    }
}
