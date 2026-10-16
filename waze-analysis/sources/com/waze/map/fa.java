package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class fa extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28911a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f28912b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ gb f28913c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.af f28914d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.map.canvas.a.e f28915e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.bn f28916f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ cr f28917g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fa(gb gbVar, kotlinx.coroutines.af afVar, com.waze.map.canvas.a.e eVar, kotlinx.coroutines.b.bn bnVar, cr crVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f28913c = gbVar;
        this.f28914d = afVar;
        this.f28915e = eVar;
        this.f28916f = bnVar;
        this.f28917g = crVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        fa faVar = new fa(this.f28913c, this.f28914d, this.f28915e, this.f28916f, this.f28917g, eVar);
        faVar.f28912b = obj;
        return faVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((fa) create((dc) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.fa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
