package Cf;

import A7.AbstractC0279p0;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class a implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final h f2200b = new h(1);

    /* renamed from: c, reason: collision with root package name */
    public static final long f2201c = Fe.b.r(4611686018427387903L);

    /* renamed from: d, reason: collision with root package name */
    public static final long f2202d = Fe.b.r(-4611686018427387903L);

    /* renamed from: e, reason: collision with root package name */
    public static final long f2203e = 9223372036854759646L;

    /* renamed from: a, reason: collision with root package name */
    public final long f2204a;

    public /* synthetic */ a(long j8) {
        this.f2204a = j8;
    }

    public static final long a(long j8, long j10) {
        long j11 = 1000000;
        long j12 = j10 / j11;
        long jC = Fe.b.c(j8, j12);
        if (-4611686018426L > jC || jC >= 4611686018427L) {
            return Fe.b.r(jC);
        }
        return Fe.b.t((jC * j11) + (j10 - (j12 * j11)));
    }

    public static final void b(StringBuilder sb2, int i5, int i10, int i11, String str, boolean z2) {
        CharSequence charSequenceSubSequence;
        sb2.append(i5);
        if (i10 != 0) {
            sb2.append('.');
            String strValueOf = String.valueOf(i10);
            AbstractC3340k.e(strValueOf, "<this>");
            if (i11 < 0) {
                throw new IllegalArgumentException(AbstractC0279p0.i(i11, "Desired length ", " is less than zero."));
            }
            if (i11 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb3 = new StringBuilder(i11);
                int length = i11 - strValueOf.length();
                int i12 = 1;
                if (1 <= length) {
                    while (true) {
                        sb3.append('0');
                        if (i12 == length) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                sb3.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb3;
            }
            String string = charSequenceSubSequence.toString();
            int i13 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i14 = length2 - 1;
                    if (string.charAt(length2) != '0') {
                        i13 = length2;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length2 = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z2 || i15 >= 3) {
                sb2.append((CharSequence) string, 0, ((i13 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) string, 0, i15);
            }
        }
        sb2.append(str);
    }

    public static int c(long j8, long j10) {
        long j11 = j8 ^ j10;
        if (j11 >= 0 && (((int) j11) & 1) != 0) {
            int i5 = (((int) j8) & 1) - (((int) j10) & 1);
            return j8 < 0 ? -i5 : i5;
        }
        if (j8 < j10) {
            return -1;
        }
        return j8 == j10 ? 0 : 1;
    }

    public static final long d(long j8) {
        return ((((int) j8) & 1) != 1 || f(j8)) ? i(j8, c.f2207c) : j8 >> 1;
    }

    public static final int e(long j8) {
        if (f(j8)) {
            return 0;
        }
        return (((int) j8) & 1) == 1 ? (int) (((j8 >> 1) % 1000) * 1000000) : (int) ((j8 >> 1) % Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
    }

    public static final boolean f(long j8) {
        return j8 == f2201c || j8 == f2202d;
    }

    public static final long g(long j8, long j10) {
        int i5 = ((int) j8) & 1;
        if (i5 != (((int) j10) & 1)) {
            return i5 == 1 ? a(j8 >> 1, j10 >> 1) : a(j10 >> 1, j8 >> 1);
        }
        if (i5 == 0) {
            long j11 = (j8 >> 1) + (j10 >> 1);
            return (-4611686018426999999L > j11 || j11 >= 4611686018427000000L) ? Fe.b.r(j11 / 1000000) : Fe.b.t(j11);
        }
        long jC = Fe.b.c(j8 >> 1, j10 >> 1);
        if (jC != 9223372036854759646L) {
            return (jC == 4611686018427387903L || jC == -4611686018427387903L) ? Fe.b.r(jC) : Fe.b.s(jC);
        }
        throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
    }

    public static final double h(long j8, c unit) {
        AbstractC3340k.e(unit, "unit");
        if (j8 == f2201c) {
            return Double.POSITIVE_INFINITY;
        }
        if (j8 == f2202d) {
            return Double.NEGATIVE_INFINITY;
        }
        return Fe.c.n(j8 >> 1, (((int) j8) & 1) == 0 ? c.f2206b : c.f2207c, unit);
    }

    public static final long i(long j8, c unit) {
        AbstractC3340k.e(unit, "unit");
        if (j8 == f2201c) {
            return Long.MAX_VALUE;
        }
        if (j8 == f2202d) {
            return Long.MIN_VALUE;
        }
        return Fe.c.o(j8 >> 1, (((int) j8) & 1) == 0 ? c.f2206b : c.f2207c, unit);
    }

    public static String j(long j8) {
        long j10;
        int i5;
        if (j8 == 0) {
            return "0s";
        }
        if (j8 == f2201c) {
            return "Infinity";
        }
        if (j8 == f2202d) {
            return "-Infinity";
        }
        int i10 = 0;
        boolean z2 = j8 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z2) {
            sb2.append('-');
        }
        long jK = j8 < 0 ? k(j8) : j8;
        long jI = i(jK, c.f2211g);
        int i11 = f(jK) ? 0 : (int) (i(jK, c.f2210f) % 24);
        if (f(jK)) {
            j10 = 0;
            i5 = 0;
        } else {
            j10 = 0;
            i5 = (int) (i(jK, c.f2209e) % 60);
        }
        int i12 = f(jK) ? 0 : (int) (i(jK, c.f2208d) % 60);
        int iE = e(jK);
        boolean z10 = jI != j10;
        boolean z11 = i11 != 0;
        boolean z12 = i5 != 0;
        boolean z13 = (i12 == 0 && iE == 0) ? false : true;
        if (z10) {
            sb2.append(jI);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(i11);
            sb2.append('h');
            i10 = i13;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i14 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(i5);
            sb2.append('m');
            i10 = i14;
        }
        if (z13) {
            int i15 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (i12 != 0 || z10 || z11 || z12) {
                b(sb2, i12, iE, 9, "s", false);
            } else if (iE >= 1000000) {
                b(sb2, iE / 1000000, iE % 1000000, 6, "ms", false);
            } else if (iE >= 1000) {
                b(sb2, iE / 1000, iE % 1000, 3, "us", false);
            } else {
                sb2.append(iE);
                sb2.append("ns");
            }
            i10 = i15;
        }
        if (z2 && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final long k(long j8) {
        long j10 = ((-(j8 >> 1)) << 1) + (((int) j8) & 1);
        int i5 = b.f2205a;
        return j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f2204a, ((a) obj).f2204a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f2204a == ((a) obj).f2204a;
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f2204a;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        return j(this.f2204a);
    }
}
