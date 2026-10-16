package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ddp {
    public final int a;
    public final int b;

    public ddp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ddp)) {
            return false;
        }
        defpackage.ddp ddpVar = (defpackage.ddp) obj;
        return this.a == ddpVar.a && this.b == ddpVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "CollectionInfo(rowCount=" + this.a + ", columnCount=" + this.b + ")";
    }
}
