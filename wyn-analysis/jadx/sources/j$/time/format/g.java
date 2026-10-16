package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class g extends i {

    /* renamed from: g, reason: collision with root package name */
    private final boolean f37575g;

    g(j$.time.temporal.q qVar, int i5, int i10, boolean z2, int i11) {
        super(qVar, i5, i10, z.NOT_NEGATIVE, i11);
        this.f37575g = z2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.q, java.lang.Enum] */
    @Override // j$.time.format.i
    final i c() {
        if (this.f37581e == -1) {
            return this;
        }
        return new g(this.f37577a, this.f37578b, this.f37579c, this.f37575g, -1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.temporal.q, java.lang.Enum] */
    @Override // j$.time.format.i
    final i d(int i5) {
        return new g(this.f37577a, this.f37578b, this.f37579c, this.f37575g, this.f37581e + i5);
    }

    @Override // j$.time.format.i
    final boolean b(q qVar) {
        return qVar.k() && this.f37578b == this.f37579c && !this.f37575g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.q, java.lang.Enum] */
    @Override // j$.time.format.i, j$.time.format.f
    public final boolean o(t tVar, StringBuilder sb2) {
        ?? r02 = this.f37577a;
        Long lE = tVar.e(r02);
        if (lE == null) {
            return false;
        }
        w wVarB = tVar.b();
        long jLongValue = lE.longValue();
        j$.time.temporal.t tVarO = r02.o();
        tVarO.b(jLongValue, r02);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(tVarO.e());
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(tVarO.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z2 = this.f37575g;
        int i5 = this.f37578b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i5), this.f37579c), roundingMode).toPlainString().substring(2);
            wVarB.getClass();
            if (z2) {
                sb2.append('.');
            }
            sb2.append(strSubstring);
            return true;
        }
        if (i5 <= 0) {
            return true;
        }
        if (z2) {
            wVarB.getClass();
            sb2.append('.');
        }
        for (int i10 = 0; i10 < i5; i10++) {
            wVarB.getClass();
            sb2.append('0');
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [j$.time.temporal.q, java.lang.Enum] */
    @Override // j$.time.format.i, j$.time.format.f
    public final int q(q qVar, CharSequence charSequence, int i5) {
        int i10 = (qVar.k() || b(qVar)) ? this.f37578b : 0;
        int i11 = (qVar.k() || b(qVar)) ? this.f37579c : 9;
        int length = charSequence.length();
        if (i5 != length) {
            if (this.f37575g) {
                char cCharAt = charSequence.charAt(i5);
                qVar.f().getClass();
                if (cCharAt == '.') {
                    i5++;
                } else if (i10 > 0) {
                    return ~i5;
                }
            }
            int i12 = i5;
            int i13 = i10 + i12;
            if (i13 > length) {
                return ~i12;
            }
            int iMin = Math.min(i11 + i12, length);
            int i14 = 0;
            int i15 = i12;
            while (true) {
                if (i15 >= iMin) {
                    break;
                }
                int i16 = i15 + 1;
                int iA = qVar.f().a(charSequence.charAt(i15));
                if (iA >= 0) {
                    i14 = (i14 * 10) + iA;
                    i15 = i16;
                } else if (i16 < i13) {
                    return ~i12;
                }
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i14).movePointLeft(i15 - i12);
            ?? r52 = this.f37577a;
            j$.time.temporal.t tVarO = r52.o();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(tVarO.e());
            return qVar.n(r52, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(tVarO.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i12, i15);
        }
        if (i10 > 0) {
            return ~i5;
        }
        return i5;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.f37577a + "," + this.f37578b + "," + this.f37579c + (this.f37575g ? ",DecimalPoint" : "") + ")";
    }
}
