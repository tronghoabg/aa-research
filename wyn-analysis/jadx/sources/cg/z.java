package cg;

/* loaded from: classes5.dex */
public final class z implements H {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1620i f19939a;

    /* renamed from: b, reason: collision with root package name */
    public final C1618g f19940b;

    /* renamed from: c, reason: collision with root package name */
    public C1611C f19941c;

    /* renamed from: d, reason: collision with root package name */
    public int f19942d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19943e;

    /* renamed from: f, reason: collision with root package name */
    public long f19944f;

    public z(InterfaceC1620i interfaceC1620i) {
        this.f19939a = interfaceC1620i;
        C1618g buffer = interfaceC1620i.getBuffer();
        this.f19940b = buffer;
        C1611C c1611c = buffer.f19901a;
        this.f19941c = c1611c;
        this.f19942d = c1611c != null ? c1611c.f19867b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19943e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f19867b) goto L15;
     */
    @Override // cg.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(cg.C1618g r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.AbstractC3340k.e(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f19943e
            if (r3 != 0) goto L63
            cg.C r3 = r8.f19941c
            cg.g r4 = r8.f19940b
            if (r3 == 0) goto L2b
            cg.C r5 = r4.f19901a
            if (r3 != r5) goto L23
            int r3 = r8.f19942d
            kotlin.jvm.internal.AbstractC3340k.b(r5)
            int r5 = r5.f19867b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f19944f
            r2 = 1
            long r0 = r0 + r2
            cg.i r2 = r8.f19939a
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            cg.C r0 = r8.f19941c
            if (r0 != 0) goto L4c
            cg.C r0 = r4.f19901a
            if (r0 == 0) goto L4c
            r8.f19941c = r0
            int r0 = r0.f19867b
            r8.f19942d = r0
        L4c:
            long r0 = r4.f19902b
            long r2 = r8.f19944f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            cg.g r2 = r8.f19940b
            long r4 = r8.f19944f
            r3 = r9
            r2.h(r3, r4, r6)
            long r9 = r8.f19944f
            long r9 = r9 + r6
            r8.f19944f = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = A7.AbstractC0279p0.k(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.z.read(cg.g, long):long");
    }

    @Override // cg.H
    public final J timeout() {
        return this.f19939a.timeout();
    }
}
