package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class uic {
    public final int[] a = new int[29];
    private final int b;

    public uic(ukf ukfVar, boolean z) {
        int i = 16;
        if (z) {
            for (int i2 = 0; i2 <= 22; i2++) {
                ujf ujfVarG = ukfVar.g(i2);
                int[] iArr = this.a;
                iArr[i2] = ujfVarG.j;
                int i3 = (i2 / 4) + 23;
                iArr[i3] = ((true != ujfVarG.d ? 255 : 0) << i) | iArr[i3];
                i -= 8;
                if (i < 0) {
                    i = 24;
                }
            }
        } else {
            for (int i4 = 0; i4 <= 22; i4++) {
                ujf ujfVarG2 = ukfVar.g(i4);
                uke[] ukeVarArr = ujfVarG2.n;
                int length = ukeVarArr.length;
                int[] iArr2 = this.a;
                if (length > 0) {
                    iArr2[i4] = ukeVarArr[0].b;
                } else {
                    iArr2[i4] = 0;
                }
                int[] iArr3 = this.a;
                int i5 = (i4 / 4) + 23;
                iArr3[i5] = ((true != ujfVarG2.e ? 255 : 0) << i) | iArr3[i5];
                i -= 8;
                if (i < 0) {
                    i = 24;
                }
            }
        }
        this.b = Arrays.hashCode(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uic) {
            return Arrays.equals(this.a, ((uic) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
