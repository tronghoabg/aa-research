package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ugc extends ugl {
    public static final int a = ugg.c;
    private final byte[] i;
    private final byte[] j;

    public ugc(float f, int i, boolean z) {
        super(f, i, z);
        this.i = new byte[64];
        this.j = new byte[64];
        for (int i2 = 0; i2 < 64; i2++) {
            this.i[i2] = -1;
        }
    }

    public final byte[] a(int i) {
        byte[] bArr;
        byte[] bArr2 = new byte[2048];
        int i2 = 0;
        while (true) {
            List list = this.c;
            if (i2 >= list.size() || i2 >= 8) {
                break;
            }
            ujf ujfVarG = ((ukf) list.get(i2)).g(i);
            for (int i3 = 0; i3 < d(ujfVarG) && i3 < 4; i3++) {
                uke ukeVarF = f(ujfVarG, i3);
                int[] iArr = ukeVarF.e;
                if (iArr.length == 0) {
                    bArr = this.i;
                } else {
                    byte[] bArr3 = new byte[64];
                    int i4 = ukeVarF.f;
                    int i5 = ukeVarF.g;
                    while (i4 / i5 > 64) {
                        i5 += i5;
                    }
                    int i6 = 0;
                    for (int i7 = 0; i7 < iArr.length; i7++) {
                        byte[] bArr4 = (i7 & 1) == 0 ? this.i : this.j;
                        int i8 = iArr[i7] / i5;
                        System.arraycopy(bArr4, 0, bArr3, i6, i8);
                        i6 += i8;
                    }
                    if (i6 != 64) {
                        bArr3[i6] = bArr3[0];
                        bArr3[63] = bArr3[i6 - 1];
                    }
                    bArr = bArr3;
                }
                System.arraycopy(bArr, 0, bArr2, ((i2 * 4) + i3) * 64, 64);
            }
            i2++;
        }
        return bArr2;
    }

    public final byte[] b() {
        ugc ugcVar = this;
        int i = a;
        byte[] bArr = new byte[i * 384];
        int i2 = 0;
        while (true) {
            List list = ugcVar.c;
            if (i2 >= list.size() || i2 >= 8) {
                break;
            }
            int i3 = 0;
            while (i3 < 22) {
                ujf ujfVarG = ((ukf) list.get(i2)).g(i3);
                List list2 = ugcVar.d;
                ujf ujfVarG2 = i2 < list2.size() ? ((ukf) list2.get(i2)).g(i3) : ujf.c;
                int i4 = 0;
                while (i4 < ugcVar.d(ujfVarG) && i4 < 4) {
                    uke ukeVarF = ugcVar.f(ujfVarG, i4);
                    int i5 = ukeVarF.b;
                    int i6 = ukeVarF.c;
                    int i7 = ugcVar.f(ujfVarG2, i4).b;
                    int i8 = ((i2 * 4) + i4) * 3;
                    int i9 = ((i8 * i) + i3) * 4;
                    int i10 = (i3 + ((i8 + 1) * i)) * 4;
                    int i11 = (((i8 + 2) * i) + i3) * 4;
                    bArr[i9] = (byte) ((i5 >> 16) & 255);
                    bArr[i9 + 1] = (byte) ((i5 >> 8) & 255);
                    bArr[i9 + 2] = (byte) (i5 & 255);
                    bArr[i9 + 3] = (byte) ((i5 >> 24) & 255);
                    bArr[i10] = (byte) ((i6 >> 16) & 255);
                    bArr[i10 + 1] = (byte) ((i6 >> 8) & 255);
                    bArr[i10 + 2] = (byte) (i6 & 255);
                    bArr[i10 + 3] = (byte) ((i6 >> 24) & 255);
                    bArr[i11] = (byte) ((i7 >> 16) & 255);
                    bArr[i11 + 1] = (byte) ((i7 >> 8) & 255);
                    bArr[i11 + 2] = (byte) (i7 & 255);
                    bArr[i11 + 3] = (byte) ((i7 >> 24) & 255);
                    i4++;
                    ugcVar = this;
                }
                i3++;
                ugcVar = this;
            }
            i2++;
            ugcVar = this;
        }
        return bArr;
    }
}
