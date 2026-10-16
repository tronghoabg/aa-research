package defpackage;

/* loaded from: classes.dex */
public final class diy implements diz {
    private final int a;
    private final int b;

    public diy(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0 || i2 < 0) {
            dka.c(a.bB(i2, i, "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively."));
        }
    }

    @Override // defpackage.diz
    public final void a(dja djaVar) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = djaVar.a;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = dap.s(djaVar.a((i5 - i4) + (-1)), djaVar.a(djaVar.a - i4)) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int i6 = this.b;
        int iC = 0;
        while (true) {
            if (i >= i6) {
                break;
            }
            int i7 = iC + 1;
            if (djaVar.b + i7 >= djaVar.c()) {
                iC = djaVar.c() - djaVar.b;
                break;
            } else {
                iC = dap.s(djaVar.a((djaVar.b + i7) + (-1)), djaVar.a(djaVar.b + i7)) ? iC + 2 : i7;
                i++;
            }
        }
        int i8 = djaVar.b;
        djaVar.g(i8, iC + i8);
        int i9 = djaVar.a;
        djaVar.g(i9 - i3, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diy)) {
            return false;
        }
        diy diyVar = (diy) obj;
        return this.a == diyVar.a && this.b == diyVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ")";
    }
}
