package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class abpw {
    public static final abpw a = new abpw(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    public abpw(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final int a() {
        int iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2;
        int iNumberOfLeadingZeros3;
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = this.c[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.d[i3]).longValue();
                    iNumberOfLeadingZeros3 = ((352 - (Integer.numberOfLeadingZeros(i5 << 3) * 9)) >>> 6) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    abms abmsVar = (abms) this.d[i3];
                    int iNumberOfLeadingZeros4 = Integer.numberOfLeadingZeros(i7) * 9;
                    int iD = abmsVar.d();
                    iNumberOfLeadingZeros3 = ((352 - iNumberOfLeadingZeros4) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(iD) * 9)) >>> 6) + iD;
                } else if (i6 == 3) {
                    int iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros(i5 << 3) * 9;
                    iNumberOfLeadingZeros2 = ((abpw) this.d[i3]).a();
                    int i8 = (352 - iNumberOfLeadingZeros5) >>> 6;
                    iNumberOfLeadingZeros = i8 + i8;
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(new abom());
                    }
                    ((Integer) this.d[i3]).intValue();
                    iNumberOfLeadingZeros3 = ((352 - (Integer.numberOfLeadingZeros(i5 << 3) * 9)) >>> 6) + 4;
                }
                i2 += iNumberOfLeadingZeros3;
            } else {
                int i9 = i5 << 3;
                long jLongValue = ((Long) this.d[i3]).longValue();
                iNumberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(i9) * 9)) >>> 6;
                iNumberOfLeadingZeros2 = (640 - (Long.numberOfLeadingZeros(jLongValue) * 9)) >>> 6;
            }
            iNumberOfLeadingZeros3 = iNumberOfLeadingZeros + iNumberOfLeadingZeros2;
            i2 += iNumberOfLeadingZeros3;
        }
        this.e = i2;
        return i2;
    }

    final void b() {
        if (!this.f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(int i) {
        int[] iArr = this.c;
        if (i > iArr.length) {
            int i2 = this.b;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.c = Arrays.copyOf(iArr, i);
            this.d = Arrays.copyOf(this.d, i);
        }
    }

    public final void d() {
        if (this.f) {
            this.f = false;
        }
    }

    final void e(int i, Object obj) {
        b();
        c(this.b + 1);
        int[] iArr = this.c;
        int i2 = this.b;
        iArr[i2] = i;
        this.d[i2] = obj;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof abpw)) {
            return false;
        }
        abpw abpwVar = (abpw) obj;
        int i = this.b;
        if (i == abpwVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = abpwVar.c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.d;
                    Object[] objArr2 = abpwVar.d;
                    int i3 = this.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final void f(lds ldsVar) throws IOException {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    ldsVar.y(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    ldsVar.u(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    ldsVar.q(i3, (abms) obj);
                } else if (i4 == 3) {
                    abnd abndVar = (abnd) ldsVar.a;
                    abndVar.t(i3, 3);
                    ((abpw) obj).f(ldsVar);
                    abndVar.t(i3, 4);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(new abom());
                    }
                    ldsVar.t(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = i + 527;
        int[] iArr = this.c;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.d;
        int i6 = this.b;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public abpw() {
        this(0, new int[8], new Object[8], true);
    }
}
