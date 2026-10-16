package com.waze.copilot.data;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class s extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f23054a;

    /* renamed from: b, reason: collision with root package name */
    int f23055b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f23056c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ af f23057d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ag f23058e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ w f23059f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f23060g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(c cVar, af afVar, ag agVar, w wVar, h.c.e eVar) {
        super(2, eVar);
        this.f23056c = cVar;
        this.f23057d = afVar;
        this.f23058e = agVar;
        this.f23059f = wVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        s sVar = new s(this.f23056c, this.f23057d, this.f23058e, this.f23059f, eVar);
        sVar.f23060g = obj;
        return sVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((s) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        if (r13 != r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.data.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
