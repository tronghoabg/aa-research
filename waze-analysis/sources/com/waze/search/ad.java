package com.waze.search;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ad extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f35493a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f35494b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f35495c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.z.a.al f35496d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f35497e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(int i2, int i3, com.waze.z.a.al alVar, h.c.e eVar, int i4) {
        super(2, eVar);
        this.f35497e = i4;
        this.f35494b = i2;
        this.f35495c = i3;
        this.f35496d = alVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f35497e;
        return i2 != 0 ? i2 != 1 ? new ad(this.f35494b, this.f35495c, this.f35496d, eVar, 2, (char[]) null) : new ad(this.f35494b, this.f35495c, this.f35496d, eVar, 1, (byte[]) null) : new ad(this.f35494b, this.f35495c, this.f35496d, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f35497e;
        return i2 != 0 ? i2 != 1 ? ((ad) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ad) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ad) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r4.f(r5) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r4.d(r5) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r4.f(r5) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r4.d(r5) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r0;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f35497e
            r1 = 1
            if (r0 == 0) goto L78
            r2 = 2
            if (r0 == r1) goto L40
            h.c.a.a r0 = h.c.a.a.f48038a
            int r3 = r5.f35493a
            if (r3 == 0) goto L12
            e.b.c.b(r6)
            goto L3d
        L12:
            e.b.c.b(r6)
            int r6 = r5.f35494b
            int r3 = r5.f35495c
            com.waze.z.a.al r4 = r5.f35496d
            if (r6 != r3) goto L29
            r6 = r5
            h.c.e r6 = (h.c.e) r6
            r5.f35493a = r1
            java.lang.Object r5 = r4.f(r6)
            if (r5 != r0) goto L3d
            goto L3c
        L29:
            com.waze.z.a.ae r6 = r4.b()
            com.waze.z.a.ae r1 = com.waze.z.a.ae.f45619a
            if (r6 == r1) goto L3d
            r6 = r5
            h.c.e r6 = (h.c.e) r6
            r5.f35493a = r2
            java.lang.Object r5 = r4.d(r6)
            if (r5 != r0) goto L3d
        L3c:
            return r0
        L3d:
            h.ab r5 = h.ab.f48028a
            return r5
        L40:
            h.c.a.a r0 = h.c.a.a.f48038a
            int r3 = r5.f35493a
            if (r3 == 0) goto L4a
            e.b.c.b(r6)
            goto L75
        L4a:
            e.b.c.b(r6)
            int r6 = r5.f35494b
            int r3 = r5.f35495c
            com.waze.z.a.al r4 = r5.f35496d
            if (r6 != r3) goto L61
            r6 = r5
            h.c.e r6 = (h.c.e) r6
            r5.f35493a = r1
            java.lang.Object r5 = r4.f(r6)
            if (r5 != r0) goto L75
            goto L74
        L61:
            com.waze.z.a.ae r6 = r4.b()
            com.waze.z.a.ae r1 = com.waze.z.a.ae.f45619a
            if (r6 == r1) goto L75
            r6 = r5
            h.c.e r6 = (h.c.e) r6
            r5.f35493a = r2
            java.lang.Object r5 = r4.d(r6)
            if (r5 != r0) goto L75
        L74:
            return r0
        L75:
            h.ab r5 = h.ab.f48028a
            return r5
        L78:
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r5.f35493a
            if (r2 == 0) goto L82
            e.b.c.b(r6)
            goto L99
        L82:
            e.b.c.b(r6)
            int r6 = r5.f35494b
            int r2 = r5.f35495c
            if (r6 == r2) goto L99
            com.waze.z.a.al r6 = r5.f35496d
            r2 = r5
            h.c.e r2 = (h.c.e) r2
            r5.f35493a = r1
            java.lang.Object r5 = r6.e(r2)
            if (r5 != r0) goto L99
            return r0
        L99:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.ad.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(int i2, int i3, com.waze.z.a.al alVar, h.c.e eVar, int i4, byte[] bArr) {
        super(2, eVar);
        this.f35497e = i4;
        this.f35494b = i2;
        this.f35495c = i3;
        this.f35496d = alVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(int i2, int i3, com.waze.z.a.al alVar, h.c.e eVar, int i4, char[] cArr) {
        super(2, eVar);
        this.f35497e = i4;
        this.f35494b = i2;
        this.f35495c = i3;
        this.f35496d = alVar;
    }
}
