package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ae extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f30970a;

    /* renamed from: b, reason: collision with root package name */
    int f30971b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ af f30972c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.av.b.n f30973d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.av.d.k f30974e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f30975f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f30976g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(af afVar, com.waze.av.b.n nVar, com.waze.av.d.k kVar, long j2, h.c.e eVar) {
        super(2, eVar);
        this.f30972c = afVar;
        this.f30973d = nVar;
        this.f30974e = kVar;
        this.f30975f = j2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ae aeVar = new ae(this.f30972c, this.f30973d, this.f30974e, this.f30975f, eVar);
        aeVar.f30976g = obj;
        return aeVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ae) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x011d, code lost:
    
        if (kotlinx.coroutines.aj.O(new com.waze.navigate.ad(r23.f30972c, r11, r23.f30973d, r13, r23.f30975f, r23.f30974e, null), r23) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.ae.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
