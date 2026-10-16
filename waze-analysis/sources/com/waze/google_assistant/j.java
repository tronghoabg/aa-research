package com.waze.google_assistant;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class j extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f24201a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f24202b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.b.at f24203c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f24204d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ g f24205e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ f f24206f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(k kVar, com.waze.reports_v2.b.at atVar, int i2, g gVar, f fVar, h.c.e eVar) {
        super(2, eVar);
        this.f24202b = kVar;
        this.f24203c = atVar;
        this.f24204d = i2;
        this.f24205e = gVar;
        this.f24206f = fVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new j(this.f24202b, this.f24203c, this.f24204d, this.f24205e, this.f24206f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((j) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Long lI;
        h.c.a.a aVar = h.c.a.a.f48038a;
        boolean z = true;
        if (this.f24201a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f24201a = 1;
            obj = aa.e(this.f24202b.f24207a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        com.waze.sharedui.e.c cVar = (com.waze.sharedui.e.c) obj;
        Long l2 = null;
        if (cVar != null && (lI = cVar.i()) != null) {
            l2 = new Long(com.waze.settings.h.c.h(lI.longValue()));
        }
        if (cVar != null && l2 != null) {
            k kVar = this.f24202b;
            com.waze.reports_v2.c.f fVarA = kVar.f24210d.c(this.f24203c, cVar, l2.longValue(), com.waze.rtalerts.y.f35167b, null).a();
            com.waze.reports_v2.c.f fVar = com.waze.reports_v2.c.f.f34483a;
            int iOrdinal = fVarA.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new h.i();
                }
                z = false;
            }
            kVar.f24208b.d(this.f24205e, this.f24206f, z);
            return h.ab.f48028a;
        }
        k kVar2 = this.f24202b;
        com.waze.reports_v2.b.at atVar = this.f24203c;
        int i2 = this.f24204d;
        kVar2.f24217k.g("failure to send report on missing location type=" + atVar + " direction=" + i2 + " location=" + cVar);
        kVar2.f24208b.d(this.f24205e, this.f24206f, false);
        return h.ab.f48028a;
    }
}
