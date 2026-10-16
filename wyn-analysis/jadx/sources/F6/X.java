package f6;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes3.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final Random f35007a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f35008b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f35009c;

    public X() {
        this(new Random());
    }

    public final X a(int i5) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i5];
        int[] iArr3 = new int[i5];
        int i10 = 0;
        while (true) {
            random = this.f35007a;
            iArr = this.f35008b;
            if (i10 >= i5) {
                break;
            }
            iArr2[i10] = random.nextInt(iArr.length + 1);
            int i11 = i10 + 1;
            int iNextInt = random.nextInt(i11);
            iArr3[i10] = iArr3[iNextInt];
            iArr3[iNextInt] = i10;
            i10 = i11;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i5];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length + i5; i14++) {
            if (i12 >= i5 || i13 != iArr2[i12]) {
                int i15 = i13 + 1;
                int i16 = iArr[i13];
                iArr4[i14] = i16;
                if (i16 >= 0) {
                    iArr4[i14] = i16 + i5;
                }
                i13 = i15;
            } else {
                iArr4[i14] = iArr3[i12];
                i12++;
            }
        }
        return new X(iArr4, new Random(random.nextLong()));
    }

    public X(int[] iArr, Random random) {
        this.f35008b = iArr;
        this.f35007a = random;
        this.f35009c = new int[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            this.f35009c[iArr[i5]] = i5;
        }
    }

    public X(Random random) {
        this(new int[0], random);
    }
}
