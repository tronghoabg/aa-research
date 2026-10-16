package k;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ac implements am {

    /* renamed from: a, reason: collision with root package name */
    private final j f50790a;

    /* renamed from: b, reason: collision with root package name */
    private final h f50791b;

    /* renamed from: c, reason: collision with root package name */
    private ai f50792c;

    /* renamed from: d, reason: collision with root package name */
    private int f50793d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f50794e;

    /* renamed from: f, reason: collision with root package name */
    private long f50795f;

    public ac(j jVar) {
        h.g.b.x.f(jVar, "upstream");
        this.f50790a = jVar;
        h hVarB = jVar.B();
        this.f50791b = hVarB;
        ai aiVar = hVarB.f50841a;
        this.f50792c = aiVar;
        this.f50793d = aiVar != null ? aiVar.f50807b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r4.f50807b) goto L15;
     */
    @Override // k.am
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(k.h r8, long r9) {
        /*
            r7 = this;
            java.lang.String r0 = "sink"
            h.g.b.x.f(r8, r0)
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L6f
            boolean r3 = r7.f50794e
            if (r3 != 0) goto L67
            k.ai r3 = r7.f50792c
            if (r3 == 0) goto L2b
            k.h r4 = r7.f50791b
            k.ai r4 = r4.f50841a
            if (r3 != r4) goto L23
            int r3 = r7.f50793d
            h.g.b.x.c(r4)
            int r4 = r4.f50807b
            if (r3 != r4) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            r7.<init>(r8)
            throw r7
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            k.j r0 = r7.f50790a
            long r1 = r7.f50795f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.S(r1)
            if (r0 != 0) goto L3e
            r7 = -1
            return r7
        L3e:
            k.ai r0 = r7.f50792c
            if (r0 != 0) goto L4e
            k.h r0 = r7.f50791b
            k.ai r0 = r0.f50841a
            if (r0 == 0) goto L4e
            r7.f50792c = r0
            int r0 = r0.f50807b
            r7.f50793d = r0
        L4e:
            k.h r1 = r7.f50791b
            long r2 = r1.q()
            long r4 = r7.f50795f
            long r2 = r2 - r4
            long r5 = java.lang.Math.min(r9, r2)
            long r3 = r7.f50795f
            r2 = r8
            r1.V(r2, r3, r5)
            long r8 = r7.f50795f
            long r8 = r8 + r5
            r7.f50795f = r8
            return r5
        L67:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "closed"
            r7.<init>(r8)
            throw r7
        L6f:
            java.lang.String r7 = "byteCount < 0: "
            java.lang.String r7 = k.o.b(r9, r7)
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k.ac.a(k.h, long):long");
    }

    @Override // k.am, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f50794e = true;
    }

    @Override // k.am
    public final ao h() {
        return this.f50790a.h();
    }
}
