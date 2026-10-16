package k2;

import N1.C0753b;
import N1.C0769s;
import N1.C0770t;
import N1.C0771u;
import N1.C0773w;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;

/* loaded from: classes.dex */
public final class k0 extends N1.N {

    /* renamed from: n, reason: collision with root package name */
    public static final Object f39103n = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f39104b;

    /* renamed from: c, reason: collision with root package name */
    public final long f39105c;

    /* renamed from: d, reason: collision with root package name */
    public final long f39106d;

    /* renamed from: e, reason: collision with root package name */
    public final long f39107e;

    /* renamed from: f, reason: collision with root package name */
    public final long f39108f;

    /* renamed from: g, reason: collision with root package name */
    public final long f39109g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f39110h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f39111i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f39112j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public final C0773w f39113l;

    /* renamed from: m, reason: collision with root package name */
    public final C0769s f39114m;

    static {
        J5.n nVar = new J5.n(3);
        C3407I c3407i = AbstractC3409K.f40056b;
        l8.e0 e0Var = l8.e0.f40101e;
        List list = Collections.EMPTY_LIST;
        l8.e0 e0Var2 = l8.e0.f40101e;
        E5.Y y10 = new E5.Y();
        C0771u c0771u = C0771u.f8270a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C0770t(uri, null, null, list, e0Var2, null, -9223372036854775807L);
        }
        nVar.a();
        y10.b();
        N1.z zVar = N1.z.f8304B;
    }

    public k0(long j8, boolean z2, boolean z10, C0773w c0773w) {
        this(j8, j8, 0L, 0L, z2, false, z10, null, c0773w);
    }

    @Override // N1.N
    public final int b(Object obj) {
        return f39103n.equals(obj) ? 0 : -1;
    }

    @Override // N1.N
    public final N1.L f(int i5, N1.L l10, boolean z2) {
        Q1.k.e(i5, 1);
        Object obj = z2 ? f39103n : null;
        long j8 = -this.f39108f;
        l10.getClass();
        l10.h(null, obj, 0, this.f39106d, j8, C0753b.f8135c, false);
        return l10;
    }

    @Override // N1.N
    public final int h() {
        return 1;
    }

    @Override // N1.N
    public final Object l(int i5) {
        Q1.k.e(i5, 1);
        return f39103n;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[PHI: r1
  0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v5 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // N1.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final N1.M m(int r23, N1.M r24, long r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = 1
            r2 = r23
            Q1.k.e(r2, r1)
            long r1 = r0.f39109g
            boolean r13 = r0.f39111i
            if (r13 == 0) goto L2c
            boolean r3 = r0.f39112j
            if (r3 != 0) goto L2c
            r3 = 0
            int r3 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r3 = r0.f39107e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L25
        L23:
            r15 = r5
            goto L2d
        L25:
            long r1 = r1 + r25
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
            goto L23
        L2c:
            r15 = r1
        L2d:
            java.lang.Object r1 = N1.M.f8055q
            N1.s r14 = r0.f39114m
            long r1 = r0.f39107e
            N1.w r4 = r0.f39113l
            java.lang.Object r5 = r0.k
            long r6 = r0.f39104b
            long r8 = r0.f39105c
            boolean r12 = r0.f39110h
            r19 = 0
            long r10 = r0.f39108f
            r3 = r24
            r17 = r1
            r20 = r10
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.b(r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.k0.m(int, N1.M, long):N1.M");
    }

    @Override // N1.N
    public final int o() {
        return 1;
    }

    public k0(long j8, long j10, long j11, long j12, boolean z2, boolean z10, boolean z11, Object obj, C0773w c0773w) {
        this(-9223372036854775807L, -9223372036854775807L, j8, j10, j11, j12, z2, z10, false, obj, c0773w, z11 ? c0773w.f8273c : null);
    }

    public k0(long j8, long j10, long j11, long j12, long j13, long j14, boolean z2, boolean z10, boolean z11, Object obj, C0773w c0773w, C0769s c0769s) {
        this.f39104b = j8;
        this.f39105c = j10;
        this.f39106d = j11;
        this.f39107e = j12;
        this.f39108f = j13;
        this.f39109g = j14;
        this.f39110h = z2;
        this.f39111i = z10;
        this.f39112j = z11;
        this.k = obj;
        c0773w.getClass();
        this.f39113l = c0773w;
        this.f39114m = c0769s;
    }
}
