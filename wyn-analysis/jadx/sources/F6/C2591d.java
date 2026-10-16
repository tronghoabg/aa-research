package f6;

import E5.H0;
import E5.I0;
import E5.J0;
import g6.C2711b;

/* renamed from: f6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2591d extends AbstractC2601n {

    /* renamed from: c, reason: collision with root package name */
    public final long f35043c;

    /* renamed from: d, reason: collision with root package name */
    public final long f35044d;

    /* renamed from: e, reason: collision with root package name */
    public final long f35045e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f35046f;

    public C2591d(J0 j02, long j8, long j10) throws C2592e {
        super(j02);
        boolean z2 = false;
        if (j02.h() != 1) {
            throw new C2592e(0);
        }
        I0 i0M = j02.m(0, new I0(), 0L);
        long jMax = Math.max(0L, j8);
        if (!i0M.k && jMax != 0 && !i0M.f3116g) {
            throw new C2592e(1);
        }
        long jMax2 = j10 == Long.MIN_VALUE ? i0M.f3121m : Math.max(0L, j10);
        long j11 = i0M.f3121m;
        if (j11 != -9223372036854775807L) {
            jMax2 = jMax2 > j11 ? j11 : jMax2;
            if (jMax > jMax2) {
                throw new C2592e(2);
            }
        }
        this.f35043c = jMax;
        this.f35044d = jMax2;
        this.f35045e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (i0M.f3117h && (jMax2 == -9223372036854775807L || (j11 != -9223372036854775807L && jMax2 == j11))) {
            z2 = true;
        }
        this.f35046f = z2;
    }

    @Override // f6.AbstractC2601n, E5.J0
    public final H0 f(int i5, H0 h02, boolean z2) {
        this.f35081b.f(0, h02, z2);
        long j8 = h02.f3043e - this.f35043c;
        long j10 = this.f35045e;
        h02.h(h02.f3039a, h02.f3040b, 0, j10 != -9223372036854775807L ? j10 - j8 : -9223372036854775807L, j8, C2711b.f35767f, false);
        return h02;
    }

    @Override // f6.AbstractC2601n, E5.J0
    public final I0 m(int i5, I0 i02, long j8) {
        this.f35081b.m(0, i02, 0L);
        long j10 = i02.f3124p;
        long j11 = this.f35043c;
        i02.f3124p = j10 + j11;
        i02.f3121m = this.f35045e;
        i02.f3117h = this.f35046f;
        long j12 = i02.f3120l;
        if (j12 != -9223372036854775807L) {
            long jMax = Math.max(j12, j11);
            i02.f3120l = jMax;
            long j13 = this.f35044d;
            if (j13 != -9223372036854775807L) {
                jMax = Math.min(jMax, j13);
            }
            i02.f3120l = jMax - j11;
        }
        long jF = u6.v.F(j11);
        long j14 = i02.f3113d;
        if (j14 != -9223372036854775807L) {
            i02.f3113d = j14 + jF;
        }
        long j15 = i02.f3114e;
        if (j15 != -9223372036854775807L) {
            i02.f3114e = j15 + jF;
        }
        return i02;
    }
}
