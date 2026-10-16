package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ai extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f39424a;

    /* renamed from: b, reason: collision with root package name */
    int f39425b;

    /* renamed from: c, reason: collision with root package name */
    int f39426c;

    /* renamed from: d, reason: collision with root package name */
    int f39427d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.h.b.e f39428e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.a.ad f39429f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f39430g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(com.waze.h.b.e eVar, kotlinx.coroutines.a.ad adVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f39428e = eVar;
        this.f39429f = adVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ai aiVar = new ai(this.f39428e, this.f39429f, eVar);
        aiVar.f39430g = obj;
        return aiVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ai) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r13.f39429f.g(com.waze.sound.w.f40426a, r13) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if (r13.f39429f.g(new com.waze.sound.x(((com.waze.h.b.c) r10).a()), r13) != r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f5, code lost:
    
        return r0;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.ai.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
