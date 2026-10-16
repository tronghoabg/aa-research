package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ekz {
    public static final ekz a = new ekz(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    public ekz(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final int a() {
        int iP;
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = this.c[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                iP = eiw.P(i5, ((Long) this.d[i3]).longValue());
            } else if (i6 == 1) {
                int i7 = i5 << 3;
                ((Long) this.d[i3]).longValue();
                boolean z = eiw.e;
                iP = ((352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6) + 8;
            } else if (i6 == 2) {
                iP = eiw.E(i5, (eip) this.d[i3]);
            } else if (i6 == 3) {
                int i8 = i5 << 3;
                boolean z2 = eiw.e;
                int iNumberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(i8) * 9)) >>> 6;
                iP = iNumberOfLeadingZeros + iNumberOfLeadingZeros + ((ekz) this.d[i3]).a();
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException(new ejo());
                }
                int i9 = i5 << 3;
                ((Integer) this.d[i3]).intValue();
                boolean z3 = eiw.e;
                iP = ((352 - (Integer.numberOfLeadingZeros(i9) * 9)) >>> 6) + 4;
            }
            i2 += iP;
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
        if (obj == null || !(obj instanceof ekz)) {
            return false;
        }
        ekz ekzVar = (ekz) obj;
        int i = this.b;
        if (i == ekzVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = ekzVar.c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.d;
                    Object[] objArr2 = ekzVar.d;
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

    public final void f(erb erbVar) throws IOException {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    erbVar.j(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    erbVar.f(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    erbVar.b(i4, (eip) obj);
                } else if (i3 == 3) {
                    eiw eiwVar = (eiw) erbVar.a;
                    eiwVar.x(i4, 3);
                    ((ekz) obj).f(erbVar);
                    eiwVar.x(i4, 4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new ejo());
                    }
                    erbVar.e(i4, ((Integer) obj).intValue());
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

    public ekz() {
        this(0, new int[8], new Object[8], true);
    }
}
