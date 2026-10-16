package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fy extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f36574a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ft f36575b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.navigate.location_preview.ay f36576c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f36577d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f36578e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.navigate.location_preview.o f36579f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fy(ft ftVar, com.waze.navigate.location_preview.ay ayVar, h.g.b.aq aqVar, h.g.a.l lVar, com.waze.navigate.location_preview.o oVar, h.c.e eVar) {
        super(2, eVar);
        this.f36575b = ftVar;
        this.f36576c = ayVar;
        this.f36577d = aqVar;
        this.f36578e = lVar;
        this.f36579f = oVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new fy(this.f36575b, this.f36576c, this.f36577d, this.f36578e, this.f36579f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((fy) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f36574a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f36574a = 1;
            obj = this.f36575b.f(this.f36576c, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        h.g.b.aq aqVar = this.f36577d;
        aqVar.f48105a = this.f36578e.invoke(new com.waze.car_lib.r.fl((com.waze.realtime_report_feedback.c) obj, 19));
        this.f36579f.f((com.waze.navigate.location_preview.ay) aqVar.f48105a);
        return h.ab.f48028a;
    }
}
