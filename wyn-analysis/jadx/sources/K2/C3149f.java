package k2;

import N1.C0753b;

/* renamed from: k2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3149f extends AbstractC3166x {

    /* renamed from: c, reason: collision with root package name */
    public final long f39068c;

    /* renamed from: d, reason: collision with root package name */
    public final long f39069d;

    /* renamed from: e, reason: collision with root package name */
    public final long f39070e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f39071f;

    public C3149f(N1.N n10, long j8, long j10) throws C3150g {
        super(n10);
        boolean z2 = false;
        if (n10.h() != 1) {
            throw new C3150g(0);
        }
        N1.M m10 = n10.m(0, new N1.M(), 0L);
        long jMax = Math.max(0L, j8);
        if (!m10.k && jMax != 0 && !m10.f8064h) {
            throw new C3150g(1);
        }
        long jMax2 = j10 == Long.MIN_VALUE ? m10.f8068m : Math.max(0L, j10);
        long j11 = m10.f8068m;
        if (j11 != -9223372036854775807L) {
            long j12 = jMax2 > j11 ? j11 : jMax2;
            if (jMax > j12) {
                throw new C3150g(2, jMax, j12);
            }
            jMax2 = j12;
        }
        this.f39068c = jMax;
        this.f39069d = jMax2;
        this.f39070e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (m10.f8065i && (jMax2 == -9223372036854775807L || (j11 != -9223372036854775807L && jMax2 == j11))) {
            z2 = true;
        }
        this.f39071f = z2;
    }

    @Override // k2.AbstractC3166x, N1.N
    public final N1.L f(int i5, N1.L l10, boolean z2) {
        this.f39170b.f(0, l10, z2);
        long j8 = l10.f8052e - this.f39068c;
        long j10 = this.f39070e;
        l10.h(l10.f8048a, l10.f8049b, 0, j10 != -9223372036854775807L ? j10 - j8 : -9223372036854775807L, j8, C0753b.f8135c, false);
        return l10;
    }

    @Override // k2.AbstractC3166x, N1.N
    public final N1.M m(int i5, N1.M m10, long j8) {
        this.f39170b.m(0, m10, 0L);
        long j10 = m10.f8071p;
        long j11 = this.f39068c;
        m10.f8071p = j10 + j11;
        m10.f8068m = this.f39070e;
        m10.f8065i = this.f39071f;
        long j12 = m10.f8067l;
        if (j12 != -9223372036854775807L) {
            long jMax = Math.max(j12, j11);
            m10.f8067l = jMax;
            long j13 = this.f39069d;
            if (j13 != -9223372036854775807L) {
                jMax = Math.min(jMax, j13);
            }
            m10.f8067l = jMax - j11;
        }
        long jW = Q1.x.W(j11);
        long j14 = m10.f8061e;
        if (j14 != -9223372036854775807L) {
            m10.f8061e = j14 + jW;
        }
        long j15 = m10.f8062f;
        if (j15 != -9223372036854775807L) {
            m10.f8062f = j15 + jW;
        }
        return m10;
    }
}
