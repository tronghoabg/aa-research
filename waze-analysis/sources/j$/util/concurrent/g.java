package j$.util.concurrent;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class g extends k {

    /* renamed from: e, reason: collision with root package name */
    public final k[] f50173e;

    public g(k[] kVarArr) {
        super(-1, null, null);
        this.f50173e = kVarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        return r2;
     */
    @Override // j$.util.concurrent.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.concurrent.k a(int r3, java.lang.Object r4) {
        /*
            r2 = this;
            j$.util.concurrent.k[] r2 = r2.f50173e
        L2:
            int r0 = r2.length
            if (r0 == 0) goto L34
            int r0 = r0 + (-1)
            r0 = r0 & r3
            j$.util.concurrent.k r2 = j$.util.concurrent.ConcurrentHashMap.k(r2, r0)
            if (r2 != 0) goto Lf
            goto L34
        Lf:
            int r0 = r2.f50180a
            if (r0 != r3) goto L20
            java.lang.Object r1 = r2.f50181b
            if (r1 == r4) goto L1f
            if (r1 == 0) goto L20
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L20
        L1f:
            return r2
        L20:
            if (r0 >= 0) goto L30
            boolean r0 = r2 instanceof j$.util.concurrent.g
            if (r0 == 0) goto L2b
            j$.util.concurrent.g r2 = (j$.util.concurrent.g) r2
            j$.util.concurrent.k[] r2 = r2.f50173e
            goto L2
        L2b:
            j$.util.concurrent.k r2 = r2.a(r3, r4)
            return r2
        L30:
            j$.util.concurrent.k r2 = r2.f50183d
            if (r2 != 0) goto Lf
        L34:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.g.a(int, java.lang.Object):j$.util.concurrent.k");
    }
}
