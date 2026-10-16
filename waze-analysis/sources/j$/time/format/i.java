package j$.time.format;

import androidx.media3.common.C;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.math.BigInteger;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class i implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final long[] f49947f = {0, 10, 100, 1000, 10000, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1000000, 10000000, 100000000, C.NANOS_PER_SECOND, 10000000000L};

    /* renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.m f49948a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49949b;

    /* renamed from: c, reason: collision with root package name */
    public final int f49950c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f49951d;

    /* renamed from: e, reason: collision with root package name */
    public final int f49952e;

    public i(j$.time.temporal.m mVar, int i2, int i3, c0 c0Var) {
        this.f49948a = mVar;
        this.f49949b = i2;
        this.f49950c = i3;
        this.f49951d = c0Var;
        this.f49952e = 0;
    }

    public long a(w wVar, long j2) {
        return j2;
    }

    public boolean b(u uVar) {
        int i2 = this.f49952e;
        if (i2 != -1) {
            return i2 > 0 && this.f49949b == this.f49950c && this.f49951d == c0.NOT_NEGATIVE;
        }
        return true;
    }

    public int c(u uVar, long j2, int i2, int i3) {
        return uVar.f(this.f49948a, j2, i2, i3);
    }

    public i d() {
        if (this.f49952e == -1) {
            return this;
        }
        return new i(this.f49948a, this.f49949b, this.f49950c, this.f49951d, -1);
    }

    public i e(int i2) {
        return new i(this.f49948a, this.f49949b, this.f49950c, this.f49951d, this.f49952e + i2);
    }

    @Override // j$.time.format.e
    public boolean f(w wVar, StringBuilder sb) {
        j$.time.temporal.m mVar = this.f49948a;
        Long lA = wVar.a(mVar);
        if (lA == null) {
            return false;
        }
        long jA = a(wVar, lA.longValue());
        DecimalStyle decimalStyle = wVar.f50000b.f49901c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i2 = this.f49950c;
        if (length > i2) {
            throw new j$.time.c("Field " + String.valueOf(mVar) + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i2);
        }
        String strA = decimalStyle.a(string);
        int i3 = this.f49949b;
        c0 c0Var = this.f49951d;
        if (jA >= 0) {
            int i4 = b.f49931a[c0Var.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    sb.append('+');
                }
            } else if (i3 < 19 && jA >= f49947f[i3]) {
                sb.append('+');
            }
        } else {
            int i5 = b.f49931a[c0Var.ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                sb.append(decimalStyle.f49917b);
            } else if (i5 == 4) {
                throw new j$.time.c("Field " + String.valueOf(mVar) + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i6 = 0; i6 < i3 - strA.length(); i6++) {
            sb.append(decimalStyle.f49916a);
        }
        sb.append(strA);
        return true;
    }

    @Override // j$.time.format.e
    public int h(u uVar, CharSequence charSequence, int i2) {
        boolean z;
        boolean z2;
        BigInteger bigIntegerAdd;
        boolean z3;
        int i3;
        long j2;
        long j3;
        int i4;
        DateTimeFormatter dateTimeFormatter;
        int i5;
        boolean z4;
        int i6 = i2;
        DateTimeFormatter dateTimeFormatter2 = uVar.f49990a;
        int length = charSequence.length();
        if (i6 == length) {
            return ~i6;
        }
        char cCharAt = charSequence.charAt(i2);
        DecimalStyle decimalStyle = dateTimeFormatter2.f49901c;
        decimalStyle.getClass();
        int i7 = this.f49950c;
        c0 c0Var = this.f49951d;
        int i8 = this.f49949b;
        int i9 = 0;
        boolean z5 = true;
        if (cCharAt == '+') {
            boolean z6 = uVar.f49992c;
            boolean z7 = i8 == i7;
            int iOrdinal = c0Var.ordinal();
            if (iOrdinal == 0 ? z6 : !(iOrdinal == 1 || iOrdinal == 4 || (!z6 && !z7))) {
                return ~i6;
            }
            i6++;
            z = false;
            z2 = true;
        } else if (cCharAt == decimalStyle.f49917b) {
            boolean z8 = uVar.f49992c;
            boolean z9 = i8 == i7;
            int iOrdinal2 = c0Var.ordinal();
            if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (z8 || z9)) {
                return ~i6;
            }
            i6++;
            z2 = false;
            z = true;
        } else {
            if (c0Var == c0.ALWAYS && uVar.f49992c) {
                return ~i6;
            }
            z = false;
            z2 = false;
        }
        int i10 = (uVar.f49992c || b(uVar)) ? i8 : 1;
        int i11 = i6 + i10;
        if (i11 > length) {
            return ~i6;
        }
        if (!uVar.f49992c && !b(uVar)) {
            i7 = 9;
        }
        int i12 = this.f49952e;
        int iMax = Math.max(i12, 0) + i7;
        while (true) {
            bigIntegerAdd = null;
            if (i9 >= 2) {
                z3 = z;
                i3 = i6;
                j2 = 0;
                break;
            }
            int iMin = Math.min(i6 + iMax, length);
            boolean z10 = z5;
            j3 = 0;
            i4 = i6;
            while (true) {
                if (i4 >= iMin) {
                    dateTimeFormatter = dateTimeFormatter2;
                    break;
                }
                int i13 = i4 + 1;
                int iCharAt = charSequence.charAt(i4) - dateTimeFormatter2.f49901c.f49916a;
                dateTimeFormatter = dateTimeFormatter2;
                if (iCharAt < 0 || iCharAt > 9) {
                    iCharAt = -1;
                }
                if (iCharAt >= 0) {
                    if (i13 - i6 > 18) {
                        if (bigIntegerAdd == null) {
                            bigIntegerAdd = BigInteger.valueOf(j3);
                        }
                        i5 = length;
                        z4 = z;
                        bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(iCharAt));
                    } else {
                        i5 = length;
                        z4 = z;
                        j3 = (j3 * 10) + iCharAt;
                    }
                    i4 = i13;
                    dateTimeFormatter2 = dateTimeFormatter;
                    length = i5;
                    z = z4;
                } else if (i4 < i11) {
                    return ~i6;
                }
            }
            int i14 = length;
            z3 = z;
            if (i12 <= 0 || i9 != 0) {
                break;
            }
            int iMax2 = Math.max(i10, (i4 - i6) - i12);
            i9++;
            z5 = z10;
            dateTimeFormatter2 = dateTimeFormatter;
            length = i14;
            z = z3;
            iMax = iMax2;
        }
        i3 = i4;
        j2 = j3;
        BigInteger bigIntegerDivide = bigIntegerAdd;
        if (z3) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(BigInteger.ZERO) && uVar.f49992c) {
                    return ~(i6 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j2 == 0 && uVar.f49992c) {
                    return ~(i6 - 1);
                }
                j2 = -j2;
            }
        } else if (c0Var == c0.EXCEEDS_PAD && uVar.f49992c) {
            int i15 = i3 - i6;
            if (z2) {
                if (i15 <= i8) {
                    return ~(i6 - 1);
                }
            } else if (i15 > i8) {
                return ~i6;
            }
        }
        if (bigIntegerDivide == null) {
            return c(uVar, j2, i6, i3);
        }
        if (bigIntegerDivide.bitLength() > 63) {
            bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
            i3--;
        }
        return c(uVar, bigIntegerDivide.longValue(), i6, i3);
    }

    public String toString() {
        j$.time.temporal.m mVar = this.f49948a;
        c0 c0Var = this.f49951d;
        int i2 = this.f49950c;
        int i3 = this.f49949b;
        if (i3 == 1 && i2 == 19 && c0Var == c0.NORMAL) {
            return j$.desugar.sun.nio.fs.h.a("Value(", String.valueOf(mVar), ")");
        }
        if (i3 == i2 && c0Var == c0.NOT_NEGATIVE) {
            return "Value(" + String.valueOf(mVar) + "," + i3 + ")";
        }
        return "Value(" + String.valueOf(mVar) + "," + i3 + "," + i2 + "," + String.valueOf(c0Var) + ")";
    }

    public i(j$.time.temporal.m mVar, int i2, int i3, c0 c0Var, int i4) {
        this.f49948a = mVar;
        this.f49949b = i2;
        this.f49950c = i3;
        this.f49951d = c0Var;
        this.f49952e = i4;
    }
}
