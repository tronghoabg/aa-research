package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class djf implements defpackage.djg {
    private final int a;
    private final int b;

    public djf(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0 || i2 < 0) {
            defpackage.dki.c(defpackage.a.bz(i2, i, "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively."));
        }
    }

    @Override // defpackage.djg
    public final void a(defpackage.djh djhVar) {
        int i = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = i + 1;
            int i4 = djhVar.a;
            if (i4 <= i3) {
                i = i4;
                break;
            }
            i = defpackage.day.q(djhVar.a((i4 - i3) + (-1)), djhVar.a(djhVar.a - i3)) ? i + 2 : i3;
        }
        int i5 = this.b;
        int iC = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = iC + 1;
            if (djhVar.b + i7 >= djhVar.c()) {
                iC = djhVar.c() - djhVar.b;
                break;
            }
            iC = defpackage.day.q(djhVar.a((djhVar.b + i7) + (-1)), djhVar.a(djhVar.b + i7)) ? iC + 2 : i7;
        }
        int i8 = djhVar.b;
        djhVar.g(i8, iC + i8);
        int i9 = djhVar.a;
        djhVar.g(i9 - i, i9);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.djf)) {
            return false;
        }
        defpackage.djf djfVar = (defpackage.djf) obj;
        return this.a == djfVar.a && this.b == djfVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ")";
    }
}
