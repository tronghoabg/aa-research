package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class fn extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28970a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cx f28971b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ gb f28972c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.bn f28973d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f28974e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.map.canvas.a.e f28975f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.bn f28976g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ cw f28977h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ com.waze.map.main.v f28978i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fn(cx cxVar, gb gbVar, com.waze.map.main.v vVar, kotlinx.coroutines.b.bn bnVar, boolean z, com.waze.map.canvas.a.e eVar, kotlinx.coroutines.b.bn bnVar2, cw cwVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f28971b = cxVar;
        this.f28972c = gbVar;
        this.f28978i = vVar;
        this.f28973d = bnVar;
        this.f28974e = z;
        this.f28975f = eVar;
        this.f28976g = bnVar2;
        this.f28977h = cwVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new fn(this.f28971b, this.f28972c, this.f28978i, this.f28973d, this.f28974e, this.f28975f, this.f28976g, this.f28977h, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((fn) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f28970a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            h.g.b.am amVar = new h.g.b.am();
            amVar.f48101a = true;
            cx cxVar = this.f28971b;
            gb gbVar = this.f28972c;
            com.waze.map.main.v vVar = this.f28978i;
            kotlinx.coroutines.b.bn bnVar = this.f28973d;
            boolean z = this.f28974e;
            com.waze.map.canvas.a.e eVar = this.f28975f;
            kotlinx.coroutines.b.bn bnVar2 = this.f28976g;
            cw cwVar = this.f28977h;
            this.f28970a = 1;
            if (kotlinx.coroutines.b.ai.e(cxVar.c(), new fm(gbVar, vVar, bnVar, z, amVar, eVar, bnVar2, cwVar, null), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
