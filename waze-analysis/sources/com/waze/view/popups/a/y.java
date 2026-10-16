package com.waze.view.popups.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f45238a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f45239b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aa f45240c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f45241d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f45242e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(u uVar, aa aaVar, int i2, h.c.e eVar) {
        super(2, eVar);
        this.f45239b = uVar;
        this.f45240c = aaVar;
        this.f45241d = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        y yVar = new y(this.f45239b, this.f45240c, this.f45241d, eVar);
        yVar.f45242e = obj;
        return yVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (r9 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        if (r9 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
    
        if (r9 != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ec, code lost:
    
        if (r9 != r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01cc, code lost:
    
        if (kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.y(r1.f(r9)), new com.waze.view.popups.a.x(r2, null), r8) == r0) goto L70;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.view.popups.a.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
