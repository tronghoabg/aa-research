package f6;

import E5.H0;
import E5.I0;
import E5.J0;
import u6.AbstractC4256a;

/* renamed from: f6.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2607t extends b0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f35099l;

    /* renamed from: m, reason: collision with root package name */
    public final I0 f35100m;

    /* renamed from: n, reason: collision with root package name */
    public final H0 f35101n;

    /* renamed from: o, reason: collision with root package name */
    public C2605r f35102o;

    /* renamed from: p, reason: collision with root package name */
    public C2604q f35103p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f35104q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f35105r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f35106s;

    public C2607t(AbstractC2588a abstractC2588a, boolean z2) {
        super(abstractC2588a);
        this.f35099l = z2 && abstractC2588a.h();
        this.f35100m = new I0();
        this.f35101n = new H0();
        J0 j0F = abstractC2588a.f();
        if (j0F == null) {
            this.f35102o = new C2605r(new C2606s(abstractC2588a.g()), I0.f3107q, C2605r.f35095e);
        } else {
            this.f35102o = new C2605r(j0F, null, null);
            this.f35106s = true;
        }
    }

    public final void A(long j8) {
        C2604q c2604q = this.f35103p;
        int iB = this.f35102o.b(c2604q.f35088a.f35112a);
        if (iB == -1) {
            return;
        }
        C2605r c2605r = this.f35102o;
        H0 h02 = this.f35101n;
        c2605r.f(iB, h02, false);
        long j10 = h02.f3042d;
        if (j10 != -9223372036854775807L && j8 >= j10) {
            j8 = Math.max(0L, j10 - 1);
        }
        c2604q.f35094g = j8;
    }

    @Override // f6.AbstractC2588a
    public final void m(InterfaceC2610w interfaceC2610w) {
        C2604q c2604q = (C2604q) interfaceC2610w;
        if (c2604q.f35092e != null) {
            AbstractC2588a abstractC2588a = c2604q.f35091d;
            abstractC2588a.getClass();
            abstractC2588a.m(c2604q.f35092e);
        }
        if (interfaceC2610w == this.f35103p) {
            this.f35103p = null;
        }
    }

    @Override // f6.AbstractC2596i, f6.AbstractC2588a
    public final void o() {
        this.f35105r = false;
        this.f35104q = false;
        super.o();
    }

    @Override // f6.b0
    public final C2613z w(C2613z c2613z) {
        Object obj = c2613z.f35112a;
        Object obj2 = this.f35102o.f35097d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C2605r.f35095e;
        }
        return c2613z.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // f6.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(E5.J0 r13) {
        /*
            r12 = this;
            boolean r1 = r12.f35105r
            if (r1 == 0) goto L1c
            f6.r r1 = r12.f35102o
            f6.r r2 = new f6.r
            java.lang.Object r3 = r1.f35096c
            java.lang.Object r1 = r1.f35097d
            r2.<init>(r13, r3, r1)
            r12.f35102o = r2
            f6.q r0 = r12.f35103p
            if (r0 == 0) goto Lb9
            long r0 = r0.f35094g
            r12.A(r0)
            goto Lb9
        L1c:
            boolean r1 = r13.p()
            java.lang.Object r6 = f6.C2605r.f35095e
            if (r1 == 0) goto L3f
            boolean r1 = r12.f35106s
            if (r1 == 0) goto L34
            f6.r r1 = r12.f35102o
            f6.r r2 = new f6.r
            java.lang.Object r3 = r1.f35096c
            java.lang.Object r1 = r1.f35097d
            r2.<init>(r13, r3, r1)
            goto L3b
        L34:
            java.lang.Object r1 = E5.I0.f3107q
            f6.r r2 = new f6.r
            r2.<init>(r13, r1, r6)
        L3b:
            r12.f35102o = r2
            goto Lb9
        L3f:
            r1 = 0
            E5.I0 r2 = r12.f35100m
            r13.n(r1, r2)
            long r3 = r2.f3120l
            java.lang.Object r7 = r2.f3110a
            f6.q r5 = r12.f35103p
            if (r5 == 0) goto L6c
            f6.r r8 = r12.f35102o
            f6.z r9 = r5.f35088a
            java.lang.Object r9 = r9.f35112a
            E5.H0 r10 = r12.f35101n
            r8.g(r9, r10)
            long r8 = r10.f3043e
            long r10 = r5.f35089b
            long r8 = r8 + r10
            f6.r r5 = r12.f35102o
            r10 = 0
            r5.m(r1, r2, r10)
            long r1 = r2.f3120l
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 == 0) goto L6c
            r4 = r8
            goto L6d
        L6c:
            r4 = r3
        L6d:
            r3 = 0
            E5.I0 r1 = r12.f35100m
            E5.H0 r2 = r12.f35101n
            r0 = r13
            android.util.Pair r1 = r0.i(r1, r2, r3, r4)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r12.f35106s
            if (r1 == 0) goto L91
            f6.r r1 = r12.f35102o
            f6.r r2 = new f6.r
            java.lang.Object r5 = r1.f35096c
            java.lang.Object r1 = r1.f35097d
            r2.<init>(r13, r5, r1)
            goto L97
        L91:
            f6.r r1 = new f6.r
            r1.<init>(r13, r7, r2)
            r2 = r1
        L97:
            r12.f35102o = r2
            f6.q r0 = r12.f35103p
            if (r0 == 0) goto Lb9
            r12.A(r3)
            f6.z r0 = r0.f35088a
            f6.r r1 = r12.f35102o
            java.lang.Object r1 = r1.f35097d
            java.lang.Object r2 = r0.f35112a
            if (r1 == 0) goto Lb4
            boolean r1 = r2.equals(r6)
            if (r1 == 0) goto Lb4
            f6.r r1 = r12.f35102o
            java.lang.Object r2 = r1.f35097d
        Lb4:
            f6.z r0 = r0.b(r2)
            goto Lba
        Lb9:
            r0 = 0
        Lba:
            r1 = 1
            r12.f35106s = r1
            r12.f35105r = r1
            f6.r r1 = r12.f35102o
            r12.l(r1)
            if (r0 == 0) goto Lce
            f6.q r1 = r12.f35103p
            r1.getClass()
            r1.g(r0)
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.C2607t.x(E5.J0):void");
    }

    @Override // f6.b0
    public final void y() {
        if (this.f35099l) {
            return;
        }
        this.f35104q = true;
        v(null, this.k);
    }

    @Override // f6.AbstractC2588a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final C2604q a(C2613z c2613z, o2.e eVar, long j8) {
        C2604q c2604q = new C2604q(c2613z, eVar, j8);
        AbstractC4256a.i(c2604q.f35091d == null);
        AbstractC2588a abstractC2588a = this.k;
        c2604q.f35091d = abstractC2588a;
        if (!this.f35105r) {
            this.f35103p = c2604q;
            if (!this.f35104q) {
                this.f35104q = true;
                v(null, abstractC2588a);
            }
            return c2604q;
        }
        Object obj = this.f35102o.f35097d;
        Object obj2 = c2613z.f35112a;
        if (obj != null && obj2.equals(C2605r.f35095e)) {
            obj2 = this.f35102o.f35097d;
        }
        c2604q.g(c2613z.b(obj2));
        return c2604q;
    }

    @Override // f6.AbstractC2596i, f6.AbstractC2588a
    public final void i() {
    }
}
