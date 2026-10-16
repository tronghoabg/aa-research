package defpackage;

/* loaded from: classes.dex */
public final class dix implements diz {
    private final int a;
    private final int b;

    public dix(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0 || i2 < 0) {
            dka.c(a.bB(i2, i, "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively."));
        }
    }

    @Override // defpackage.diz
    public final void a(dja djaVar) {
        int i = djaVar.b;
        int i2 = this.b;
        int iC = i + i2;
        if (((i ^ iC) & (i2 ^ iC)) < 0) {
            iC = djaVar.c();
        }
        djaVar.g(djaVar.b, Math.min(iC, djaVar.c()));
        int i3 = djaVar.a;
        int i4 = this.a;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        djaVar.g(Math.max(0, i5), djaVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dix)) {
            return false;
        }
        dix dixVar = (dix) obj;
        return this.a == dixVar.a && this.b == dixVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ")";
    }
}
