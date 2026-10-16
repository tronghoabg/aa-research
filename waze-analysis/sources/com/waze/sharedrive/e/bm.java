package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bm extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38443a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f38444b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f38445c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bm(at atVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38445c = i2;
        this.f38444b = atVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f38445c;
        Object obj2 = this.f38444b;
        return i2 != 0 ? new bm((at) obj2, eVar, 1) : new bm((bn) obj2, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f38445c != 0 ? ((bm) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bm) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0104, code lost:
    
        if (r2.j(r1, r9, r8) == r0) goto L26;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.e.bm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bm(bn bnVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38445c = i2;
        this.f38444b = bnVar;
    }
}
