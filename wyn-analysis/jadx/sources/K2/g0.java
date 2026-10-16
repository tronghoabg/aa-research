package k2;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Random f39072a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f39073b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f39074c;

    public g0() {
        this(new Random());
    }

    public final g0 a() {
        return new g0(new Random(this.f39072a.nextLong()));
    }

    public final g0 b(int i5, int i10) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        int i11 = 0;
        while (true) {
            iArr = this.f39073b;
            random = this.f39072a;
            if (i11 >= i10) {
                break;
            }
            iArr2[i11] = random.nextInt(iArr.length + 1);
            int i12 = i11 + 1;
            int iNextInt = random.nextInt(i12);
            iArr3[i11] = iArr3[iNextInt];
            iArr3[iNextInt] = i11 + i5;
            i11 = i12;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i10];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < iArr.length + i10; i15++) {
            if (i13 >= i10 || i14 != iArr2[i13]) {
                int i16 = i14 + 1;
                int i17 = iArr[i14];
                iArr4[i15] = i17;
                if (i17 >= i5) {
                    iArr4[i15] = i17 + i10;
                }
                i14 = i16;
            } else {
                iArr4[i15] = iArr3[i13];
                i13++;
            }
        }
        return new g0(iArr4, new Random(random.nextLong()));
    }

    public final g0 c(int i5, int i10) {
        int i11 = i10 - i5;
        int[] iArr = this.f39073b;
        int[] iArr2 = new int[iArr.length - i11];
        int i12 = 0;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 < i5 || i14 >= i10) {
                int i15 = i13 - i12;
                if (i14 >= i5) {
                    i14 -= i11;
                }
                iArr2[i15] = i14;
            } else {
                i12++;
            }
        }
        return new g0(iArr2, new Random(this.f39072a.nextLong()));
    }

    public g0(int[] iArr, Random random) {
        this.f39073b = iArr;
        this.f39072a = random;
        this.f39074c = new int[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            this.f39074c[iArr[i5]] = i5;
        }
    }

    public g0(Random random) {
        this(new int[0], random);
    }
}
