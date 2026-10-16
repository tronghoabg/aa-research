package com.waze.sharedrive.d;

import j$.time.Instant;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class al extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38195a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f38196b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aq f38197c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f38198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    al(aq aqVar, String str, h.c.e eVar) {
        super(2, eVar);
        this.f38197c = aqVar;
        this.f38198d = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        al alVar = new al(this.f38197c, this.f38198d, eVar);
        alVar.f38196b = obj;
        return alVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((al) create((h.k) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f38195a == 0) {
            e.b.c.b(obj);
            h.k kVar = (h.k) this.f38196b;
            Integer num = (Integer) kVar.a();
            String str = (String) kVar.b();
            if (num != null && str != null) {
                Instant instantPlusSeconds = Instant.now().plusSeconds(num.intValue());
                aq aqVar = this.f38197c;
                String str2 = this.f38198d;
                com.waze.sharedrive.c.y yVar = aqVar.f38213a;
                h.g.b.x.c(instantPlusSeconds);
                this.f38195a = 1;
                obj = yVar.k(str2, instantPlusSeconds, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        e.b.c.b(obj);
        com.waze.sharedrive.c.d dVar = (com.waze.sharedrive.c.d) obj;
        if (dVar != null) {
            aq.p(this.f38197c, dVar);
        }
        return h.ab.f48028a;
    }
}
