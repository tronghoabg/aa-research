package h.o;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.C;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.upstream.CmcdData;
import h.g.b.x;
import h.k.m;
import h.k.n;
import h.n.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes7.dex */
public final class a implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public static final c f48264a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final long f48265b = c.r(4611686018427387903L);

    /* renamed from: c, reason: collision with root package name */
    private static final long f48266c = c.r(-4611686018427387903L);

    /* renamed from: d, reason: collision with root package name */
    private static final long f48267d = 9223372036854759646L;

    /* renamed from: e, reason: collision with root package name */
    private final long f48268e;

    private /* synthetic */ a(long j2) {
        this.f48268e = j2;
    }

    public static final boolean A(long j2, long j3) {
        return j2 == j3;
    }

    public static final boolean B(long j2) {
        return !C(j2);
    }

    public static final boolean C(long j2) {
        return j2 == f48265b || j2 == f48266c;
    }

    public static final boolean D(long j2) {
        return j2 < 0;
    }

    public static final boolean E(long j2) {
        return j2 > 0;
    }

    private static final long F(long j2) {
        return j2 >> 1;
    }

    private static final d G(long j2) {
        return I(j2) ? d.f48270a : d.f48272c;
    }

    private static final boolean H(long j2) {
        return (((int) j2) & 1) == 1;
    }

    private static final boolean I(long j2) {
        return (((int) j2) & 1) == 0;
    }

    private static final long J(long j2, long j3) {
        long jV = c.v(j3);
        long jQ = c.q(j2, jV);
        if (jQ < -4611686018426L || jQ >= 4611686018427L) {
            return c.r(jQ);
        }
        return c.d(c.u(jQ) + (j3 - c.u(jV)));
    }

    private static final void K(StringBuilder sb, int i2, int i3, int i4, String str, boolean z) {
        sb.append(i2);
        if (i3 != 0) {
            sb.append('.');
            String strW = o.w(String.valueOf(i3), i4, '0');
            int i5 = -1;
            int length = strW.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i6 = length - 1;
                    if (strW.charAt(length) != '0') {
                        i5 = length;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z || i7 >= 3) {
                sb.append((CharSequence) strW, 0, ((i5 + 3) / 3) * 3);
                x.e(sb, "append(...)");
            } else {
                sb.append((CharSequence) strW, 0, i7);
                x.e(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final double a(long j2, long j3) {
        d dVar = (d) h.b.a.h(G(j2), G(j3));
        return b(j2, dVar) / b(j3, dVar);
    }

    public static final double b(long j2, d dVar) {
        x.f(dVar, "unit");
        if (j2 == f48265b) {
            return Double.POSITIVE_INFINITY;
        }
        if (j2 == f48266c) {
            return Double.NEGATIVE_INFINITY;
        }
        return h.c.a.h.k(F(j2), G(j2), dVar);
    }

    public static int c(long j2, long j3) {
        long j4 = j2 ^ j3;
        if (j4 < 0 || (((int) j4) & 1) == 0) {
            return x.b(j2, j3);
        }
        int i2 = (((int) j2) & 1) - (((int) j3) & 1);
        return D(j2) ? -i2 : i2;
    }

    public static final int d(long j2) {
        if (C(j2)) {
            return 0;
        }
        return (int) (n(j2) % 60);
    }

    public static final int e(long j2) {
        if (C(j2)) {
            return 0;
        }
        boolean zH = H(j2);
        long jF = F(j2);
        return (int) (zH ? c.u(jF % 1000) : jF % C.NANOS_PER_SECOND);
    }

    public static final int f(long j2) {
        if (C(j2)) {
            return 0;
        }
        return (int) (p(j2) % 60);
    }

    public static final long j(long j2) {
        return D(j2) ? v(j2) : j2;
    }

    public static final long k(long j2) {
        return u(j2, d.f48276g);
    }

    public static final long l(long j2) {
        return u(j2, d.f48275f);
    }

    public static final long m(long j2) {
        return (H(j2) && B(j2)) ? F(j2) : u(j2, d.f48272c);
    }

    public static final long n(long j2) {
        return u(j2, d.f48274e);
    }

    public static final long o(long j2) {
        boolean zI = I(j2);
        long jF = F(j2);
        if (zI) {
            return jF;
        }
        if (jF > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jF < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return c.u(jF);
    }

    public static final long p(long j2) {
        return u(j2, d.f48273d);
    }

    public static final long q(long j2, long j3) {
        return r(j2, v(j3));
    }

    public static final long r(long j2, long j3) {
        if ((((int) j2) & 1) != (((int) j3) & 1)) {
            return H(j2) ? J(F(j2), F(j3)) : J(F(j3), F(j2));
        }
        boolean zI = I(j2);
        long jF = F(j2);
        long jF2 = F(j3);
        if (zI) {
            return c.e(jF + jF2);
        }
        long jQ = c.q(jF, jF2);
        if (jQ != 9223372036854759646L) {
            return (jQ == 4611686018427387903L || jQ == -4611686018427387903L) ? c.r(jQ) : c.s(jQ);
        }
        throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
    }

    public static final long s(long j2, double d2) {
        int iA = h.h.a.a(d2);
        if (iA == d2) {
            return t(j2, iA);
        }
        d dVarG = G(j2);
        return c.h(b(j2, dVarG) * d2, dVarG);
    }

    public static final long t(long j2, int i2) {
        if (C(j2)) {
            if (i2 != 0) {
                return i2 > 0 ? j2 : v(j2);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i2 == 0) {
            return 0L;
        }
        long jF = F(j2);
        long j3 = i2;
        long j4 = jF * j3;
        if (!I(j2)) {
            return j4 / j3 == jF ? c.r(n.m(j4, new m())) : Long.signum(jF) * Integer.signum(i2) > 0 ? f48265b : f48266c;
        }
        if (jF >= -2147483647L && jF < 2147483648L) {
            return c.d(j4);
        }
        if (j4 / j3 == jF) {
            return c.e(j4);
        }
        long jV = c.v(jF);
        long j5 = jV * j3;
        if (j5 / j3 == jV) {
            long jV2 = c.v((jF - c.u(jV)) * j3) + j5;
            if ((jV2 ^ j5) >= 0) {
                return c.r(n.m(jV2, new m()));
            }
        }
        return Long.signum(jF) * Integer.signum(i2) > 0 ? f48265b : f48266c;
    }

    public static final long u(long j2, d dVar) {
        x.f(dVar, "unit");
        if (j2 == f48265b) {
            return Long.MAX_VALUE;
        }
        if (j2 == f48266c) {
            return Long.MIN_VALUE;
        }
        return h.c.a.h.l(F(j2), G(j2), dVar);
    }

    public static final long v(long j2) {
        int i2 = b.f48269a;
        int i3 = ((int) j2) & 1;
        long j3 = -F(j2);
        return j3 + j3 + i3;
    }

    public static final String x(long j2) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        if (D(j2)) {
            sb.append('-');
        }
        sb.append("PT");
        long j3 = j(j2);
        long jL = l(j3);
        int iD = d(j3);
        int iF = f(j3);
        int iE = e(j3);
        boolean z2 = true;
        if (true == C(j2)) {
            jL = 9999999999999L;
        }
        boolean z3 = jL != 0;
        if (iF != 0) {
            z = true;
        } else if (iE != 0) {
            z = true;
            iF = 0;
        } else {
            iE = 0;
            iF = 0;
            z = false;
        }
        if (iD == 0) {
            if (z && z3) {
                iD = 0;
            } else {
                z2 = false;
                iD = 0;
            }
        }
        if (z3) {
            sb.append(jL);
            sb.append('H');
        }
        if (z2) {
            sb.append(iD);
            sb.append('M');
        }
        if (z || (!z3 && !z2)) {
            K(sb, iF, iE, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb.toString();
    }

    public static String y(long j2) {
        boolean z;
        int i2;
        int i3;
        if (j2 == 0) {
            return "0s";
        }
        if (j2 == f48265b) {
            return "Infinity";
        }
        if (j2 == f48266c) {
            return "-Infinity";
        }
        StringBuilder sb = new StringBuilder();
        boolean zD = D(j2);
        if (zD) {
            sb.append('-');
        }
        long j3 = j(j2);
        long jK = k(j3);
        int iL = C(j3) ? 0 : (int) (l(j3) % 24);
        int iD = d(j3);
        int iF = f(j3);
        int iE = e(j3);
        boolean z2 = jK != 0;
        boolean z3 = iL != 0;
        boolean z4 = iD != 0;
        if (iF != 0) {
            z = true;
        } else if (iE != 0) {
            iF = 0;
            z = true;
        } else {
            iE = 0;
            iF = 0;
            z = false;
        }
        if (z2) {
            sb.append(jK);
            sb.append('d');
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (z3 || (z2 && (z4 || z))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iL);
            sb.append('h');
            i2 = i4;
        }
        if (z4 || (z && (z3 || z2))) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iD);
            sb.append('m');
            i2 = i5;
        }
        if (z) {
            int i6 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (iF != 0) {
                i3 = iF;
            } else if (z2 || z3 || z4) {
                i3 = 0;
            } else {
                if (iE >= 1000000) {
                    K(sb, iE / PlaybackException.CUSTOM_ERROR_CODE_BASE, iE % PlaybackException.CUSTOM_ERROR_CODE_BASE, 6, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_TAG_STRING_LITERAL, false);
                } else if (iE >= 1000) {
                    K(sb, iE / 1000, iE % 1000, 3, "us", false);
                } else {
                    sb.append(iE);
                    sb.append("ns");
                }
                i2 = i6;
            }
            K(sb, i3, iE, 9, CmcdData.STREAMING_FORMAT_SS, false);
            i2 = i6;
        }
        if (zD && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final /* synthetic */ a z(long j2) {
        return new a(j2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return c(this.f48268e, ((a) obj).f48268e);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && this.f48268e == ((a) obj).f48268e;
    }

    public final int hashCode() {
        return a.a.b(this.f48268e);
    }

    public final String toString() {
        return y(this.f48268e);
    }

    public final /* synthetic */ long w() {
        return this.f48268e;
    }
}
