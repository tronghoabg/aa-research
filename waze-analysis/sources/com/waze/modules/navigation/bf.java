package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bf extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f30379a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bk f30380b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ao f30381c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f30382d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f30383e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.google_assistant.an f30384f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f30385g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bf(bk bkVar, ao aoVar, h.g.a.l lVar, boolean z, com.waze.google_assistant.an anVar, h.c.e eVar) {
        super(2, eVar);
        this.f30380b = bkVar;
        this.f30381c = aoVar;
        this.f30382d = lVar;
        this.f30383e = z;
        this.f30384f = anVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        bf bfVar = new bf(this.f30380b, this.f30381c, this.f30382d, this.f30383e, this.f30384f, eVar);
        bfVar.f30385g = obj;
        return bfVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bf) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r13 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (r13 != r0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.navigation.bf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
