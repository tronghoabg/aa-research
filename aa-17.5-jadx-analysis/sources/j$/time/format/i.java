package j$.time.format;

import j$.time.DateTimeException;
import java.math.BigInteger;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public class i implements e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final j$.time.temporal.n a;
    public final int b;
    public final int c;
    public final e0 d;
    public final int e;

    public i(j$.time.temporal.n nVar, int i, int i2, e0 e0Var) {
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = e0Var;
        this.e = 0;
    }

    public boolean b(v vVar) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == e0.NOT_NEGATIVE;
        }
        return true;
    }

    public int c(v vVar, long j, int i, int i2) {
        return vVar.f(this.a, j, i, i2);
    }

    public i d() {
        if (this.e == -1) {
            return this;
        }
        return new i(this.a, this.b, this.c, this.d, -1);
    }

    public i e(int i) {
        return new i(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.e
    public boolean h(x xVar, StringBuilder sb) {
        j$.time.temporal.n nVar = this.a;
        Long lA = xVar.a(nVar);
        if (lA == null) {
            return false;
        }
        long jA = a(xVar, lA.longValue());
        xVar.b.getClass();
        int i = b0.a;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i2 = this.c;
        if (length > i2) {
            throw new DateTimeException("Field " + String.valueOf(nVar) + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i2);
        }
        int i3 = this.b;
        e0 e0Var = this.d;
        if (jA >= 0) {
            int i4 = b.a[e0Var.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    sb.append('+');
                }
            } else if (i3 < 19 && jA >= f[i3]) {
                sb.append('+');
            }
        } else {
            int i5 = b.a[e0Var.ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                sb.append('-');
            } else if (i5 == 4) {
                throw new DateTimeException("Field " + String.valueOf(nVar) + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i6 = 0; i6 < i3 - string.length(); i6++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    @Override // j$.time.format.e
    public int k(v vVar, CharSequence charSequence, int i) {
        int i2;
        boolean z;
        boolean z2;
        BigInteger bigIntegerAdd;
        boolean z3;
        int i3;
        long j;
        long j2;
        boolean z4;
        boolean z5;
        int i4;
        int length = charSequence.length();
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        int i5 = b0.a;
        int i6 = this.c;
        e0 e0Var = this.d;
        int i7 = this.b;
        int i8 = 0;
        boolean z6 = true;
        if (cCharAt == '+') {
            boolean z7 = vVar.c;
            boolean z8 = i7 == i6;
            int iOrdinal = e0Var.ordinal();
            if (iOrdinal == 0 ? z7 : !(iOrdinal == 1 || iOrdinal == 4 || (!z7 && !z8))) {
                return ~i;
            }
            i2 = i + 1;
            z = false;
            z2 = true;
        } else if (cCharAt == '-') {
            boolean z9 = vVar.c;
            boolean z10 = i7 == i6;
            int iOrdinal2 = e0Var.ordinal();
            if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (z9 || z10)) {
                return ~i;
            }
            i2 = i + 1;
            z2 = false;
            z = true;
        } else {
            if (e0Var == e0.ALWAYS && vVar.c) {
                return ~i;
            }
            i2 = i;
            z = false;
            z2 = false;
        }
        int i9 = (vVar.c || b(vVar)) ? i7 : 1;
        int i10 = i2 + i9;
        if (i10 > length) {
            return ~i2;
        }
        int i11 = 9;
        if (!vVar.c && !b(vVar)) {
            i6 = 9;
        }
        int i12 = this.e;
        int iMax = Math.max(i12, 0) + i6;
        while (true) {
            bigIntegerAdd = null;
            if (i8 >= 2) {
                z3 = z;
                i3 = i2;
                j = 0;
                break;
            }
            int iMin = Math.min(iMax + i2, length);
            i3 = i2;
            j2 = 0;
            while (true) {
                if (i3 >= iMin) {
                    z4 = z6;
                    break;
                }
                int i13 = i3 + 1;
                z4 = z6;
                char cCharAt2 = charSequence.charAt(i3);
                int i14 = b0.a;
                int i15 = cCharAt2 - '0';
                if (i15 < 0 || i15 > i11) {
                    i15 = -1;
                }
                if (i15 >= 0) {
                    if (i13 - i2 > 18) {
                        if (bigIntegerAdd == null) {
                            bigIntegerAdd = BigInteger.valueOf(j2);
                        }
                        z5 = z;
                        i4 = length;
                        bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(i15));
                    } else {
                        z5 = z;
                        i4 = length;
                        j2 = (j2 * 10) + i15;
                    }
                    i3 = i13;
                    z6 = z4;
                    length = i4;
                    z = z5;
                    i11 = 9;
                } else if (i3 < i10) {
                    return ~i2;
                }
            }
            z3 = z;
            int i16 = length;
            if (i12 <= 0 || i8 != 0) {
                break;
            }
            iMax = Math.max(i9, (i3 - i2) - i12);
            i8++;
            z6 = z4;
            length = i16;
            z = z3;
            i11 = 9;
        }
        j = j2;
        BigInteger bigIntegerDivide = bigIntegerAdd;
        if (z3) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(BigInteger.ZERO) && vVar.c) {
                    return ~(i2 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j == 0 && vVar.c) {
                    return ~(i2 - 1);
                }
                j = -j;
            }
        } else if (e0Var == e0.EXCEEDS_PAD && vVar.c) {
            int i17 = i3 - i2;
            if (z2) {
                if (i17 <= i7) {
                    return ~(i2 - 1);
                }
            } else if (i17 > i7) {
                return ~i2;
            }
        }
        if (bigIntegerDivide == null) {
            return c(vVar, j, i2, i3);
        }
        if (bigIntegerDivide.bitLength() > 63) {
            bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
            i3--;
        }
        return c(vVar, bigIntegerDivide.longValue(), i2, i3);
    }

    public String toString() {
        j$.time.temporal.n nVar = this.a;
        e0 e0Var = this.d;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && e0Var == e0.NORMAL) {
            return "Value(" + String.valueOf(nVar) + ")";
        }
        if (i2 == i && e0Var == e0.NOT_NEGATIVE) {
            return "Value(" + String.valueOf(nVar) + "," + i2 + ")";
        }
        return "Value(" + String.valueOf(nVar) + "," + i2 + "," + i + "," + String.valueOf(e0Var) + ")";
    }

    public i(j$.time.temporal.n nVar, int i, int i2, e0 e0Var, int i3) {
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = e0Var;
        this.e = i3;
    }

    public long a(x xVar, long j) {
        return j;
    }
}
