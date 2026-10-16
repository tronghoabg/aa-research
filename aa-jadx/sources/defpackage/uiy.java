package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uiy {
    public final int[] a = new int[29];
    private final int b;

    public uiy(defpackage.ula ulaVar, boolean z) {
        int i = 16;
        if (z) {
            for (int i2 = 0; i2 <= 22; i2++) {
                defpackage.uka ukaVarG = ulaVar.g(i2);
                int[] iArr = this.a;
                iArr[i2] = ukaVarG.j;
                int i3 = (i2 / 4) + 23;
                iArr[i3] = ((true != ukaVarG.d ? 255 : 0) << i) | iArr[i3];
                i -= 8;
                if (i < 0) {
                    i = 24;
                }
            }
        } else {
            for (int i4 = 0; i4 <= 22; i4++) {
                defpackage.uka ukaVarG2 = ulaVar.g(i4);
                defpackage.ukz[] ukzVarArr = ukaVarG2.n;
                int length = ukzVarArr.length;
                int[] iArr2 = this.a;
                if (length > 0) {
                    iArr2[i4] = ukzVarArr[0].b;
                } else {
                    iArr2[i4] = 0;
                }
                int[] iArr3 = this.a;
                int i5 = (i4 / 4) + 23;
                iArr3[i5] = ((true != ukaVarG2.e ? 255 : 0) << i) | iArr3[i5];
                i -= 8;
                if (i < 0) {
                    i = 24;
                }
            }
        }
        this.b = java.util.Arrays.hashCode(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.uiy) {
            return java.util.Arrays.equals(this.a, ((defpackage.uiy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
