package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class uhp {
    public final int[] a;
    public final int[] b;
    public final float[] c;
    public int[] d;
    public int[] e;
    public float[] f;
    public float[] g;
    public float h;
    public final int[] i;
    public final ukf[] j;

    public uhp(int[] iArr, int[] iArr2, int[] iArr3, float[] fArr) {
        int[] iArrL;
        int length;
        int i;
        int[] iArr4 = iArr3;
        this.a = iArr;
        this.i = iArr2;
        this.j = new ukf[iArr2.length];
        int length2 = iArr4.length;
        if (length2 > 0) {
            int i2 = iArr.length == 0 ? length2 >> 1 : iArr[0];
            aeiy aeiyVar = new aeiy(length2);
            aeiy aeiyVar2 = new aeiy();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                length = iArr4.length;
                i = length - 2;
                if (i3 >= i) {
                    break;
                }
                int i5 = i3 + 2;
                int i6 = iArr4[i3];
                int i7 = iArr4[i3 + 1];
                aeiyVar.c(i6);
                aeiyVar.c(i7);
                if ((i3 / 2) + 1 == i2) {
                    i4++;
                    i2 = i4 < iArr.length ? iArr[i4] : length >> 1;
                } else {
                    int i8 = iArr4[i5];
                    int i9 = iArr4[i3 + 3];
                    int iH = a.H(i8 - i6);
                    int iAbs = Math.abs(iH) / 153391689;
                    if (iAbs > 0) {
                        int i10 = iAbs + 1;
                        for (int i11 = 1; i11 <= iAbs; i11++) {
                            float f = (1.0f / i10) * i11;
                            aeiyVar.c(a.H(((int) (iH * f)) + i6));
                            aeiyVar.c(((int) ((i9 - i7) * f)) + i7);
                            aeiyVar2.c(aeiyVar.b / 2);
                        }
                    }
                }
                iArr4 = iArr3;
                i3 = i5;
            }
            aeiyVar.c(iArr3[i]);
            aeiyVar.c(iArr3[length - 1]);
            for (int i12 = 0; i12 < aeiyVar2.b; i12++) {
                int iIntValue = aeec.Y(aeiyVar2, i12).intValue();
                for (int i13 = 0; i13 < iArr.length; i13++) {
                    int i14 = iArr[i13];
                    if (i14 >= iIntValue) {
                        iArr[i13] = i14 + 1;
                    }
                }
            }
            iArrL = aeiyVar.L(new int[aeiyVar.b]);
        } else {
            iArrL = iArr3;
        }
        this.b = iArrL;
        this.c = fArr;
    }

    public static float a(float[] fArr) {
        tpf tpfVar = new tpf();
        tpf tpfVar2 = new tpf();
        tpf tpfVar3 = new tpf();
        int i = 0;
        float fC = BitmapDescriptorFactory.HUE_RED;
        while (i < fArr.length - 2) {
            tpfVar.b = fArr[i];
            tpfVar.c = fArr[i + 1];
            int i2 = i + 2;
            tpfVar2.b = fArr[i2];
            tpfVar2.c = fArr[i + 3];
            tpf.p(tpfVar2, tpfVar, tpfVar3);
            fC += tpfVar3.c();
            i = i2;
        }
        return fC;
    }
}
