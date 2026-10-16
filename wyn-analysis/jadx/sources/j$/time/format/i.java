package j$.time.format;

import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import java.math.BigInteger;
import org.apache.tika.pipes.PipesConfigBase;

/* loaded from: classes2.dex */
class i implements f {

    /* renamed from: f, reason: collision with root package name */
    static final long[] f37576f = {0, 10, 100, 1000, 10000, PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS};

    /* renamed from: a, reason: collision with root package name */
    final Enum f37577a;

    /* renamed from: b, reason: collision with root package name */
    final int f37578b;

    /* renamed from: c, reason: collision with root package name */
    final int f37579c;

    /* renamed from: d, reason: collision with root package name */
    private final z f37580d;

    /* renamed from: e, reason: collision with root package name */
    final int f37581e;

    /* JADX WARN: Multi-variable type inference failed */
    i(j$.time.temporal.q qVar, int i5, int i10, z zVar) {
        this.f37577a = (Enum) qVar;
        this.f37578b = i5;
        this.f37579c = i10;
        this.f37580d = zVar;
        this.f37581e = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected i(j$.time.temporal.q qVar, int i5, int i10, z zVar, int i11) {
        this.f37577a = (Enum) qVar;
        this.f37578b = i5;
        this.f37579c = i10;
        this.f37580d = zVar;
        this.f37581e = i11;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.q, java.lang.Enum] */
    i c() {
        return this.f37581e == -1 ? this : new i(this.f37577a, this.f37578b, this.f37579c, this.f37580d, -1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.temporal.q, java.lang.Enum] */
    i d(int i5) {
        int i10 = this.f37581e + i5;
        return new i(this.f37577a, this.f37578b, this.f37579c, this.f37580d, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.q, java.lang.Enum, java.lang.Object] */
    @Override // j$.time.format.f
    public boolean o(t tVar, StringBuilder sb2) {
        ?? r02 = this.f37577a;
        Long lE = tVar.e(r02);
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        w wVarB = tVar.b();
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i5 = this.f37579c;
        if (length > i5) {
            throw new j$.time.c("Field " + ((Object) r02) + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i5);
        }
        wVarB.getClass();
        int i10 = this.f37578b;
        z zVar = this.f37580d;
        if (jLongValue >= 0) {
            int i11 = c.f37571a[zVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    sb2.append('+');
                }
            } else if (i10 < 19 && jLongValue >= f37576f[i10]) {
                sb2.append('+');
            }
        } else {
            int i12 = c.f37571a[zVar.ordinal()];
            if (i12 == 1 || i12 == 2 || i12 == 3) {
                sb2.append('-');
            } else if (i12 == 4) {
                throw new j$.time.c("Field " + ((Object) r02) + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i13 = 0; i13 < i10 - string.length(); i13++) {
            sb2.append('0');
        }
        sb2.append(string);
        return true;
    }

    boolean b(q qVar) {
        int i5 = this.f37581e;
        if (i5 != -1) {
            return i5 > 0 && this.f37578b == this.f37579c && this.f37580d == z.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [j$.time.temporal.q, java.lang.Enum] */
    @Override // j$.time.format.f
    public int q(q qVar, CharSequence charSequence, int i5) {
        int i10;
        boolean z2;
        boolean z10;
        BigInteger bigIntegerAdd;
        long j8;
        int i11;
        long j10;
        int i12;
        long j11;
        boolean z11;
        int length = charSequence.length();
        if (i5 == length) {
            return ~i5;
        }
        char cCharAt = charSequence.charAt(i5);
        qVar.f().getClass();
        boolean z12 = true;
        int i13 = this.f37579c;
        z zVar = this.f37580d;
        int i14 = this.f37578b;
        int i15 = 0;
        if (cCharAt == '+') {
            boolean zK = qVar.k();
            boolean z13 = i14 == i13;
            int iOrdinal = zVar.ordinal();
            if (iOrdinal == 0 ? zK : !(iOrdinal == 1 || iOrdinal == 4 || (!zK && !z13))) {
                return ~i5;
            }
            i10 = i5 + 1;
            z10 = true;
            z2 = false;
        } else {
            qVar.f().getClass();
            if (cCharAt == '-') {
                boolean zK2 = qVar.k();
                boolean z14 = i14 == i13;
                int iOrdinal2 = zVar.ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (zK2 || z14)) {
                    return ~i5;
                }
                i10 = i5 + 1;
                z2 = true;
                z10 = false;
            } else {
                if (zVar == z.ALWAYS && qVar.k()) {
                    return ~i5;
                }
                i10 = i5;
                z2 = false;
                z10 = false;
            }
        }
        int i16 = (qVar.k() || b(qVar)) ? i14 : 1;
        int i17 = i10 + i16;
        if (i17 > length) {
            return ~i10;
        }
        if (!qVar.k() && !b(qVar)) {
            i13 = 9;
        }
        int i18 = this.f37581e;
        int iMax = Math.max(i18, 0) + i13;
        while (true) {
            bigIntegerAdd = null;
            if (i15 >= 2) {
                j8 = 0;
                i11 = i10;
                j10 = 0;
                break;
            }
            int iMin = Math.min(iMax + i10, length);
            i12 = i10;
            j11 = 0;
            while (true) {
                if (i12 >= iMin) {
                    z11 = z12;
                    j8 = 0;
                    break;
                }
                int i19 = i12 + 1;
                z11 = z12;
                j8 = 0;
                int iA = qVar.f().a(charSequence.charAt(i12));
                if (iA >= 0) {
                    if (i19 - i10 > 18) {
                        if (bigIntegerAdd == null) {
                            bigIntegerAdd = BigInteger.valueOf(j11);
                        }
                        bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(iA));
                    } else {
                        j11 = (j11 * 10) + iA;
                    }
                    i12 = i19;
                    z12 = z11;
                } else if (i12 < i17) {
                    return ~i10;
                }
            }
            if (i18 <= 0 || i15 != 0) {
                break;
            }
            iMax = Math.max(i16, (i12 - i10) - i18);
            i15++;
            z12 = z11;
        }
        i11 = i12;
        j10 = j11;
        BigInteger bigIntegerDivide = bigIntegerAdd;
        if (z2) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(BigInteger.ZERO) && qVar.k()) {
                    return ~(i10 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j10 == j8 && qVar.k()) {
                    return ~(i10 - 1);
                }
                j10 = -j10;
            }
        } else if (zVar == z.EXCEEDS_PAD && qVar.k()) {
            int i20 = i11 - i10;
            if (z10) {
                if (i20 <= i14) {
                    return ~(i10 - 1);
                }
            } else if (i20 > i14) {
                return ~i10;
            }
        }
        ?? r32 = this.f37577a;
        if (bigIntegerDivide != null) {
            if (bigIntegerDivide.bitLength() > 63) {
                bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                i11--;
            }
            return qVar.n(r32, bigIntegerDivide.longValue(), i10, i11);
        }
        return qVar.n(r32, j10, i10, i11);
    }

    public String toString() {
        Enum r02 = this.f37577a;
        int i5 = this.f37579c;
        z zVar = this.f37580d;
        int i10 = this.f37578b;
        if (i10 == 1 && i5 == 19 && zVar == z.NORMAL) {
            return "Value(" + r02 + ")";
        }
        if (i10 == i5 && zVar == z.NOT_NEGATIVE) {
            return "Value(" + r02 + "," + i10 + ")";
        }
        return "Value(" + r02 + "," + i10 + "," + i5 + "," + zVar + ")";
    }
}
