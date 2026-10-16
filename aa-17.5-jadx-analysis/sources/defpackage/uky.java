package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class uky {
    public final byte[] c;
    private static final yob d = yob.c("com/google/android/libraries/geo/mapcore/internal/model/ZoomTable");
    public static final uky a = new uky(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22});
    public static final uky b = new uky(new int[0]);

    public uky(int[] iArr) {
        byte[] bArr;
        aefs aefsVar = new aefs(null);
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 0 || i2 > 127) {
                ((ynz) ((ynz) d.g()).ai(9404)).w("Invalid value to initialize the ZoomTable %d", i2);
            } else {
                aefsVar.c((byte) i2);
            }
        }
        int i3 = aefsVar.g;
        if (i3 == 0) {
            bArr = aeew.a;
        } else {
            byte[] bArr2 = new byte[i3];
            aefq aefqVar = new aefq(aefsVar);
            while (i3 != 0 && aefqVar.hasNext()) {
                bArr2[i] = aefqVar.c();
                i3--;
                i++;
            }
            bArr = bArr2;
        }
        this.c = bArr;
        Arrays.sort(bArr);
    }

    public final int a(float f) {
        if (f > 127.0f) {
            return -1;
        }
        int iFloor = (int) Math.floor(f);
        byte[] bArr = this.c;
        int iBinarySearch = Arrays.binarySearch(bArr, (byte) iFloor);
        if (iBinarySearch >= 0) {
            return bArr[iBinarySearch];
        }
        int i = -iBinarySearch;
        if (i - 1 != 0) {
            return bArr[i - 2];
        }
        return -1;
    }
}
