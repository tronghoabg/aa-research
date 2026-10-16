package com.waze.car_lib;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bi extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19185a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f19186b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f19187c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(WazeCarAppService wazeCarAppService, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f19187c = i2;
        this.f19186b = wazeCarAppService;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f19187c;
        if (i2 == 0) {
            return new bi((WazeCarAppService) this.f19186b, eVar, 0);
        }
        Object obj2 = this.f19186b;
        return i2 != 1 ? new bi((com.waze.car_lib.f.am) obj2, eVar, 2) : new bi((bd) obj2, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f19187c;
        return i2 != 0 ? i2 != 1 ? ((bi) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bi) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bi) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (kotlinx.coroutines.b.ai.i(r6.f19176k.d(), new com.waze.car_lib.av(null), r5) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        if (com.waze.car_lib.bd.j(r6, r5) == r0) goto L33;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.bi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(bd bdVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f19187c = i2;
        this.f19186b = bdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(com.waze.car_lib.f.am amVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f19187c = i2;
        this.f19186b = amVar;
    }
}
