package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ft extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f29007a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gb f29008b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f29009c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f29010d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f29011e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ cx f29012f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f29013g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.s f29014h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f29015i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.bn f29016j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ cw f29017k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ cx f29018l;
    final /* synthetic */ com.waze.map.main.v m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ft(gb gbVar, cx cxVar, h.g.b.aq aqVar, h.g.b.aq aqVar2, h.g.b.aq aqVar3, cx cxVar2, h.g.b.aq aqVar4, kotlinx.coroutines.s sVar, com.waze.map.main.v vVar, boolean z, kotlinx.coroutines.b.bn bnVar, cw cwVar, h.c.e eVar) {
        super(2, eVar);
        this.f29008b = gbVar;
        this.f29018l = cxVar;
        this.f29009c = aqVar;
        this.f29010d = aqVar2;
        this.f29011e = aqVar3;
        this.f29012f = cxVar2;
        this.f29013g = aqVar4;
        this.f29014h = sVar;
        this.m = vVar;
        this.f29015i = z;
        this.f29016j = bnVar;
        this.f29017k = cwVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ft(this.f29008b, this.f29018l, this.f29009c, this.f29010d, this.f29011e, this.f29012f, this.f29013g, this.f29014h, this.m, this.f29015i, this.f29016j, this.f29017k, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ft) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f29007a == 0) {
            e.b.c.b(obj);
            gb gbVar = this.f29008b;
            cx cxVar = this.f29018l;
            h.g.b.aq aqVar = this.f29009c;
            h.g.b.aq aqVar2 = this.f29010d;
            h.g.b.aq aqVar3 = this.f29011e;
            cx cxVar2 = this.f29012f;
            h.g.b.aq aqVar4 = this.f29013g;
            kotlinx.coroutines.s sVar = this.f29014h;
            com.waze.map.main.v vVar = this.m;
            boolean z = this.f29015i;
            kotlinx.coroutines.b.bn bnVar = this.f29016j;
            cw cwVar = this.f29017k;
            this.f29007a = 1;
            if (gbVar.f29137j.collect(new fs(gbVar, cxVar, aqVar, aqVar2, aqVar3, cxVar2, aqVar4, sVar, vVar, z, bnVar, cwVar), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
