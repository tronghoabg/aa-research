package defpackage;

/* loaded from: classes.dex */
public final class ddh {
    public final int a;
    public final int b;

    public ddh(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddh)) {
            return false;
        }
        ddh ddhVar = (ddh) obj;
        return this.a == ddhVar.a && this.b == ddhVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "CollectionInfo(rowCount=" + this.a + ", columnCount=" + this.b + ")";
    }
}
