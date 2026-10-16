package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dje implements defpackage.djg {
    private final int a;
    private final int b;

    public dje(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0 || i2 < 0) {
            defpackage.dki.c(defpackage.a.bz(i2, i, "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively."));
        }
    }

    @Override // defpackage.djg
    public final void a(defpackage.djh djhVar) {
        int i = djhVar.b;
        int i2 = this.b;
        int iC = i + i2;
        if (((i ^ iC) & (i2 ^ iC)) < 0) {
            iC = djhVar.c();
        }
        djhVar.g(djhVar.b, java.lang.Math.min(iC, djhVar.c()));
        int i3 = djhVar.a;
        int i4 = this.a;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        djhVar.g(java.lang.Math.max(0, i5), djhVar.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dje)) {
            return false;
        }
        defpackage.dje djeVar = (defpackage.dje) obj;
        return this.a == djeVar.a && this.b == djeVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ")";
    }
}
