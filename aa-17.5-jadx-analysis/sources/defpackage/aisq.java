package defpackage;

import java.util.concurrent.TimeUnit;

@afdo
/* loaded from: classes2.dex */
public final class aisq implements Comparable {
    public static final long a = afzc.b(4611686018427387903L);
    public static final long b = afzc.b(-4611686018427387903L);
    public final long c;

    public /* synthetic */ aisq(long j) {
        this.c = j;
    }

    public static final double a(long j, long j2) {
        aiss aissVar = (aiss) affa.y(o(j), o(j2));
        return b(j, aissVar) / b(j2, aissVar);
    }

    public static final double b(long j, aiss aissVar) {
        if (j == a) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == b) {
            return Double.NEGATIVE_INFINITY;
        }
        TimeUnit timeUnit = o(j).h;
        long jConvert = aissVar.h.convert(1L, timeUnit);
        double d = j >> 1;
        return jConvert > 0 ? d * jConvert : d / timeUnit.convert(1L, r9);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return affa.c(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m(j) ? -i : i;
    }

    public static final int d(long j) {
        if (l(j)) {
            return 0;
        }
        long j2 = j >> 1;
        return (int) ((((int) j) & 1) == 1 ? (j2 % 1000) * 1000000 : j2 % 1000000000);
    }

    public static final long e(long j) {
        return ((((int) j) & 1) != 1 || l(j)) ? i(j, aiss.c) : j >> 1;
    }

    public static final long f(long j) {
        return i(j, aiss.d);
    }

    public static final long g(long j, long j2) {
        return h(j, j(j2));
    }

    public static final long h(long j, long j2) {
        int i = ((int) j) & 1;
        int i2 = ((int) j2) & 1;
        long j3 = j2 >> 1;
        long j4 = j >> 1;
        if (i != i2) {
            return i == 1 ? p(j4, j3) : p(j3, j4);
        }
        if (i == 0) {
            long j5 = j4 + j3;
            if (j5 >= -4611686018426999999L && j5 < 4611686018427000000L) {
                int i3 = aisr.a;
                return j5 + j5;
            }
            long j6 = j5 / 1000000;
            long j7 = j6 + j6 + 1;
            int i4 = aisr.a;
            return j7;
        }
        long jA = afzc.a(j4, j3);
        if (jA == 9223372036854759646L) {
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (jA != 4611686018427387903L) {
            if (jA != -4611686018427387903L) {
                if (jA < -4611686018426L || jA >= 4611686018427L) {
                    long j8 = afpt.j(jA, -4611686018427387903L, 4611686018427387903L);
                    int i5 = aisr.a;
                    return j8 + j8 + 1;
                }
                int i6 = aisr.a;
                long j9 = jA * 1000000;
                return j9 + j9;
            }
            jA = -4611686018427387903L;
        }
        long j10 = jA + jA + 1;
        int i7 = aisr.a;
        return j10;
    }

    public static final long i(long j, aiss aissVar) {
        if (j == a) {
            return Long.MAX_VALUE;
        }
        if (j == b) {
            return Long.MIN_VALUE;
        }
        return aissVar.h.convert(j >> 1, o(j).h);
    }

    public static final long j(long j) {
        int i = aisr.a;
        int i2 = ((int) j) & 1;
        long j2 = -(j >> 1);
        return j2 + j2 + i2;
    }

    public static String k(long j) {
        boolean z;
        int i;
        if (j == 0) {
            return "0s";
        }
        if (j == a) {
            return "Infinity";
        }
        if (j == b) {
            return "-Infinity";
        }
        StringBuilder sb = new StringBuilder();
        boolean zM = m(j);
        if (zM) {
            sb.append('-');
        }
        if (m(j)) {
            j = j(j);
        }
        long jI = i(j, aiss.g);
        int i2 = 0;
        int i3 = l(j) ? 0 : (int) (i(j, aiss.f) % 24);
        int i4 = l(j) ? 0 : (int) (i(j, aiss.e) % 60);
        int iF = l(j) ? 0 : (int) (f(j) % 60);
        int iD = d(j);
        boolean z2 = jI != 0;
        boolean z3 = i3 != 0;
        boolean z4 = i4 != 0;
        if (iF != 0) {
            z = true;
        } else if (iD != 0) {
            z = true;
            iF = 0;
        } else {
            iD = 0;
            iF = 0;
            z = false;
        }
        if (z2) {
            sb.append(jI);
            sb.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z3 || (z2 && (z4 || z))) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(i3);
            sb.append('h');
            i = i5;
        }
        if (z4 || (z && (z3 || z2))) {
            int i6 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(i4);
            sb.append('m');
            i = i6;
        }
        if (z) {
            int i7 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iF == 0) {
                if (!z2 && !z3 && !z4) {
                    if (iD >= 1000000) {
                        n(sb, iD / 1000000, iD % 1000000, 6, "ms");
                    } else if (iD >= 1000) {
                        n(sb, iD / 1000, iD % 1000, 3, "us");
                    } else {
                        sb.append(iD);
                        sb.append("ns");
                    }
                }
                i = i7;
            } else {
                i2 = iF;
            }
            n(sb, i2, iD, 9, "s");
            i = i7;
        }
        if (zM && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final boolean l(long j) {
        return j == a || j == b;
    }

    public static final boolean m(long j) {
        return j < 0;
    }

    public static final void n(StringBuilder sb, int i, int i2, int i3, String str) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strG = afyh.G(String.valueOf(i2), i3);
            int i4 = -1;
            int length = strG.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strG.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (i6 < 3) {
                sb.append((CharSequence) strG, 0, i6);
            } else {
                sb.append((CharSequence) strG, 0, ((i4 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    private static final aiss o(long j) {
        return (((int) j) & 1) == 0 ? aiss.a : aiss.c;
    }

    private static final long p(long j, long j2) {
        long j3 = j2 / 1000000;
        long jA = afzc.a(j, j3);
        if (jA < -4611686018426L || jA >= 4611686018427L) {
            return afzc.b(jA);
        }
        int i = aisr.a;
        long j4 = (jA * 1000000) + (j2 - (j3 * 1000000));
        return j4 + j4;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return c(this.c, ((aisq) obj).c);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aisq) && this.c == ((aisq) obj).c;
    }

    public final int hashCode() {
        return a.g(this.c);
    }

    public final String toString() {
        return k(this.c);
    }
}
