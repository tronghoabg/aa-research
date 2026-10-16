package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ek extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f39923a;

    /* renamed from: b, reason: collision with root package name */
    Object f39924b;

    /* renamed from: c, reason: collision with root package name */
    Object f39925c;

    /* renamed from: d, reason: collision with root package name */
    int f39926d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ el f39927e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.h.c.a f39928f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.a.ag f39929g;

    /* renamed from: h, reason: collision with root package name */
    private /* synthetic */ Object f39930h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ek(el elVar, com.waze.h.c.a aVar, kotlinx.coroutines.a.ag agVar, h.c.e eVar) {
        super(2, eVar);
        this.f39927e = elVar;
        this.f39928f = aVar;
        this.f39929g = agVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ek ekVar = new ek(this.f39927e, this.f39928f, this.f39929g, eVar);
        ekVar.f39930h = obj;
        return ekVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ek) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:9|(2:80|10)|51|78|52|56|57) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0152, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0153, code lost:
    
        e.b.c.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018d  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.ek.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
