package com.waze.trip_overview.c.a;

import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f41239a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f41240b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f41241c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ab f41242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(kotlinx.coroutines.b.k kVar, kotlinx.coroutines.b.k kVar2, ab abVar, h.c.e eVar) {
        super(2, eVar);
        this.f41240b = kVar;
        this.f41241c = kVar2;
        this.f41242d = abVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new n(this.f41240b, this.f41241c, this.f41242d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((n) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f41239a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            aq aqVar = new aq();
            this.f41239a = 1;
            if (kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.q(this.f41240b, this.f41241c, new w(null, 1, null)), new m(this.f41242d, aqVar, null), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
