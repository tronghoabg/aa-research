package j$.util.concurrent;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class q extends k {

    /* renamed from: e, reason: collision with root package name */
    public q f50201e;

    /* renamed from: f, reason: collision with root package name */
    public q f50202f;

    /* renamed from: g, reason: collision with root package name */
    public q f50203g;

    /* renamed from: h, reason: collision with root package name */
    public q f50204h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f50205i;

    public q(int i2, Object obj, Object obj2, k kVar, q qVar) {
        super(i2, obj, obj2, kVar);
        this.f50201e = qVar;
    }

    @Override // j$.util.concurrent.k
    public final k a(int i2, Object obj) {
        return b(i2, obj, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0046 A[PHI: r7
  0x0046: PHI (r7v5 java.lang.Class) = (r7v4 java.lang.Class), (r7v6 java.lang.Class) binds: [B:28:0x003f, B:20:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.concurrent.q b(int r5, java.lang.Object r6, java.lang.Class r7) {
        /*
            r4 = this;
            if (r6 == 0) goto L51
        L2:
            j$.util.concurrent.q r0 = r4.f50202f
            j$.util.concurrent.q r1 = r4.f50203g
            int r2 = r4.f50180a
            if (r2 <= r5) goto Lb
            goto L21
        Lb:
            if (r2 >= r5) goto Le
            goto L1d
        Le:
            java.lang.Object r2 = r4.f50181b
            if (r2 == r6) goto L50
            if (r2 == 0) goto L1b
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L1b
            goto L50
        L1b:
            if (r0 != 0) goto L1f
        L1d:
            r4 = r1
            goto L4d
        L1f:
            if (r1 != 0) goto L23
        L21:
            r4 = r0
            goto L4d
        L23:
            if (r7 != 0) goto L2b
            java.lang.Class r7 = j$.util.concurrent.ConcurrentHashMap.c(r6)
            if (r7 == 0) goto L46
        L2b:
            int r4 = j$.util.concurrent.ConcurrentHashMap.f50144g
            if (r2 == 0) goto L3e
            java.lang.Class r4 = r2.getClass()
            if (r4 == r7) goto L36
            goto L3e
        L36:
            r4 = r6
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r4 = r4.compareTo(r2)
            goto L3f
        L3e:
            r4 = 0
        L3f:
            if (r4 == 0) goto L46
            if (r4 >= 0) goto L44
            goto L21
        L44:
            r0 = r1
            goto L21
        L46:
            j$.util.concurrent.q r4 = r1.b(r5, r6, r7)
            if (r4 == 0) goto L21
            return r4
        L4d:
            if (r4 != 0) goto L2
            goto L51
        L50:
            return r4
        L51:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.b(int, java.lang.Object, java.lang.Class):j$.util.concurrent.q");
    }
}
