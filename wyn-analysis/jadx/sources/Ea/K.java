package ea;

import jf.InterfaceC3108h;

/* loaded from: classes4.dex */
public final class K implements InterfaceC2484H {

    /* renamed from: f, reason: collision with root package name */
    public static final double f34475f = Math.random();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f34476g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final s8.g f34477a;

    /* renamed from: b, reason: collision with root package name */
    public final P9.d f34478b;

    /* renamed from: c, reason: collision with root package name */
    public final ga.j f34479c;

    /* renamed from: d, reason: collision with root package name */
    public final a2.v f34480d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3108h f34481e;

    public K(s8.g gVar, P9.d dVar, ga.j jVar, a2.v vVar, InterfaceC3108h interfaceC3108h) {
        this.f34477a = gVar;
        this.f34478b = dVar;
        this.f34479c = jVar;
        this.f34480d = vVar;
        this.f34481e = interfaceC3108h;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ea.K r5, lf.AbstractC3464c r6) {
        /*
            boolean r0 = r6 instanceof ea.J
            if (r0 == 0) goto L13
            r0 = r6
            ea.J r0 = (ea.J) r0
            int r1 = r0.f34474d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34474d = r1
            goto L18
        L13:
            ea.J r0 = new ea.J
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f34472b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f34474d
            r3 = 1
            java.lang.String r4 = "SessionFirelogPublisher"
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ea.K r5 = r0.f34471a
            Fe.e.U(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            Fe.e.U(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r4, r6)
            r0.f34471a = r5
            r0.f34474d = r3
            ga.j r6 = r5.f34479c
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            ga.j r6 = r5.f34479c
            W9.p r0 = r6.f35810a
            java.lang.Boolean r0 = r0.i()
            if (r0 == 0) goto L57
            boolean r3 = r0.booleanValue()
            goto L63
        L57:
            ga.d r6 = r6.f35811b
            java.lang.Boolean r6 = r6.a()
            if (r6 == 0) goto L63
            boolean r3 = r6.booleanValue()
        L63:
            if (r3 != 0) goto L6d
            java.lang.String r5 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r4, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L6d:
            ga.j r5 = r5.f34479c
            double r5 = r5.a()
            double r0 = ea.K.f34475f
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L7c
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L7c:
            java.lang.String r5 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r4, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.K.a(ea.K, lf.c):java.lang.Object");
    }
}
