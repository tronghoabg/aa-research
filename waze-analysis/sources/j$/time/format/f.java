package j$.time.format;

import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class f extends i {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f49944g;

    public f(j$.time.temporal.m mVar, int i2, int i3, boolean z) {
        this(mVar, i2, i3, z, 0);
        Objects.requireNonNull(mVar, "field");
        j$.time.temporal.p pVarRange = mVar.range();
        if (pVarRange.f50072a != pVarRange.f50073b || pVarRange.f50074c != pVarRange.f50075d) {
            j$.time.f.b("Field must have a fixed set of values: ".concat(String.valueOf(mVar)));
            throw null;
        }
        if (i2 < 0 || i2 > 9) {
            j$.time.f.i("Minimum width must be from 0 to 9 inclusive but was ", i2);
            throw null;
        }
        if (i3 < 1 || i3 > 9) {
            j$.time.f.i("Maximum width must be from 1 to 9 inclusive but was ", i3);
            throw null;
        }
        if (i3 >= i2) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    @Override // j$.time.format.i
    public final boolean b(u uVar) {
        return uVar.f49992c && this.f49949b == this.f49950c && !this.f49944g;
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.f49952e == -1) {
            return this;
        }
        return new f(this.f49948a, this.f49949b, this.f49950c, this.f49944g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i2) {
        return new f(this.f49948a, this.f49949b, this.f49950c, this.f49944g, this.f49952e + i2);
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final boolean f(w wVar, StringBuilder sb) {
        j$.time.temporal.m mVar = this.f49948a;
        Long lA = wVar.a(mVar);
        if (lA == null) {
            return false;
        }
        DecimalStyle decimalStyle = wVar.f50000b.f49901c;
        long jLongValue = lA.longValue();
        j$.time.temporal.p pVarRange = mVar.range();
        pVarRange.b(jLongValue, mVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(pVarRange.f50072a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(pVarRange.f50075d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.f49944g;
        int i2 = this.f49949b;
        if (iScale != 0) {
            String strA = decimalStyle.a(bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i2), this.f49950c), roundingMode).toPlainString().substring(2));
            if (z) {
                sb.append(decimalStyle.f49918c);
            }
            sb.append(strA);
            return true;
        }
        if (i2 > 0) {
            if (z) {
                sb.append(decimalStyle.f49918c);
            }
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(decimalStyle.f49916a);
            }
        }
        return true;
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final int h(u uVar, CharSequence charSequence, int i2) {
        boolean z = uVar.f49992c;
        DecimalStyle decimalStyle = uVar.f49990a.f49901c;
        int i3 = (z || b(uVar)) ? this.f49949b : 0;
        int i4 = (uVar.f49992c || b(uVar)) ? this.f49950c : 9;
        int length = charSequence.length();
        if (i2 != length) {
            if (this.f49944g) {
                if (charSequence.charAt(i2) == decimalStyle.f49918c) {
                    i2++;
                } else if (i3 > 0) {
                    return ~i2;
                }
            }
            int i5 = i2;
            int i6 = i3 + i5;
            if (i6 > length) {
                return ~i5;
            }
            int iMin = Math.min(i4 + i5, length);
            int i7 = 0;
            int i8 = i5;
            while (true) {
                if (i8 >= iMin) {
                    break;
                }
                int i9 = i8 + 1;
                int iCharAt = charSequence.charAt(i8) - decimalStyle.f49916a;
                if (iCharAt < 0 || iCharAt > 9) {
                    iCharAt = -1;
                }
                if (iCharAt >= 0) {
                    i7 = (i7 * 10) + iCharAt;
                    i8 = i9;
                } else if (i9 < i6) {
                    return ~i5;
                }
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i7).movePointLeft(i8 - i5);
            j$.time.temporal.p pVarRange = this.f49948a.range();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(pVarRange.f50072a);
            return uVar.f(this.f49948a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(pVarRange.f50075d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i5, i8);
        }
        if (i3 > 0) {
            return ~i2;
        }
        return i2;
    }

    @Override // j$.time.format.i
    public final String toString() {
        String str = this.f49944g ? ",DecimalPoint" : "";
        return "Fraction(" + String.valueOf(this.f49948a) + "," + this.f49949b + "," + this.f49950c + str + ")";
    }

    public f(j$.time.temporal.m mVar, int i2, int i3, boolean z, int i4) {
        super(mVar, i2, i3, c0.NOT_NEGATIVE, i4);
        this.f49944g = z;
    }
}
