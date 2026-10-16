package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.afeo
public final class aitq implements java.lang.Comparable {
    public static final long a = defpackage.agac.b(4611686018427387903L);
    public static final long b = defpackage.agac.b(-4611686018427387903L);
    public final long c;

    public /* synthetic */ aitq(long j) {
        this.c = j;
    }

    public static final double a(long j, long j2) {
        defpackage.aits aitsVar = (defpackage.aits) defpackage.afga.y(k(j), k(j2));
        return b(j, aitsVar) / b(j2, aitsVar);
    }

    public static final double b(long j, defpackage.aits aitsVar) {
        if (j == a) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == b) {
            return Double.NEGATIVE_INFINITY;
        }
        return defpackage.ahob.a(j >> 1, k(j), aitsVar);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return defpackage.afga.c(j, j2);
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
        return ((((int) j) & 1) != 1 || l(j)) ? h(j, defpackage.aits.MILLISECONDS) : j >> 1;
    }

    public static final long f(long j) {
        return h(j, defpackage.aits.SECONDS);
    }

    public static final long g(long j, long j2) {
        int i = ((int) j) & 1;
        int i2 = ((int) j2) & 1;
        long j3 = j2 >> 1;
        long j4 = j >> 1;
        if (i != i2) {
            return i == 1 ? o(j4, j3) : o(j3, j4);
        }
        if (i == 0) {
            return defpackage.agac.d(j4 + j3);
        }
        long jA = defpackage.agac.a(j4, j3);
        if (jA == 9223372036854759646L) {
            throw new java.lang.IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (jA != 4611686018427387903L) {
            if (jA != -4611686018427387903L) {
                return defpackage.agac.c(jA);
            }
            jA = -4611686018427387903L;
        }
        int i3 = defpackage.aitr.a;
        return jA + jA + 1;
    }

    public static final long h(long j, defpackage.aits aitsVar) {
        if (j == a) {
            return Long.MAX_VALUE;
        }
        if (j == b) {
            return Long.MIN_VALUE;
        }
        return aitsVar.h.convert(j >> 1, k(j).h);
    }

    public static final long i(long j) {
        int i = defpackage.aitr.a;
        int i2 = ((int) j) & 1;
        long j2 = -(j >> 1);
        return j2 + j2 + ((long) i2);
    }

    public static java.lang.String j(long j) {
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean zM = m(j);
        if (zM) {
            sb.append('-');
        }
        if (m(j)) {
            j = i(j);
        }
        long jH = h(j, defpackage.aits.DAYS);
        int i2 = 0;
        int iH = l(j) ? 0 : (int) (h(j, defpackage.aits.HOURS) % 24);
        int iH2 = l(j) ? 0 : (int) (h(j, defpackage.aits.MINUTES) % 60);
        int iF = l(j) ? 0 : (int) (f(j) % 60);
        int iD = d(j);
        boolean z2 = jH != 0;
        boolean z3 = iH != 0;
        boolean z4 = iH2 != 0;
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
            sb.append(jH);
            sb.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z3 || (z2 && (z4 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iH);
            sb.append('h');
            i = i3;
        }
        if (z4 || (z && (z3 || z2))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iH2);
            sb.append('m');
            i = i4;
        }
        if (z) {
            int i5 = i + 1;
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
                i = i5;
            } else {
                i2 = iF;
            }
            n(sb, i2, iD, 9, "s");
            i = i5;
        }
        if (zM && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final defpackage.aits k(long j) {
        return (((int) j) & 1) == 0 ? defpackage.aits.NANOSECONDS : defpackage.aits.MILLISECONDS;
    }

    public static final boolean l(long j) {
        return j == a || j == b;
    }

    public static final boolean m(long j) {
        return j < 0;
    }

    public static final void n(java.lang.StringBuilder sb, int i, int i2, int i3, java.lang.String str) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            java.lang.String strG = defpackage.afzh.G(java.lang.String.valueOf(i2), i3);
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
                sb.append((java.lang.CharSequence) strG, 0, i6);
            } else {
                sb.append((java.lang.CharSequence) strG, 0, ((i4 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    private static final long o(long j, long j2) {
        long j3 = j2 / 1000000;
        long jA = defpackage.agac.a(j, j3);
        if (jA < -4611686018426L || jA >= 4611686018427L) {
            return defpackage.agac.b(jA);
        }
        int i = defpackage.aitr.a;
        long j4 = (jA * 1000000) + (j2 - (j3 * 1000000));
        return j4 + j4;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return c(this.c, ((defpackage.aitq) obj).c);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aitq) && this.c == ((defpackage.aitq) obj).c;
    }

    public final int hashCode() {
        return defpackage.a.f(this.c);
    }

    public final java.lang.String toString() {
        return j(this.c);
    }
}
