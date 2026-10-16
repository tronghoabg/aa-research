package com.waze.notifications.c;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class h extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f32600a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.notifications.b.a f32601b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.notifications.b.c f32602c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.presentation.k f32603d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(com.waze.reports_v2.presentation.k kVar, com.waze.notifications.b.a aVar, com.waze.notifications.b.c cVar, h.c.e eVar) {
        super(2, eVar);
        this.f32603d = kVar;
        this.f32601b = aVar;
        this.f32602c = cVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new h(this.f32603d, this.f32601b, this.f32602c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f32600a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f32600a = 1;
            if (this.f32603d.f(this) == aVar) {
                return aVar;
            }
        }
        this.f32601b.b(this.f32602c);
        return ab.f48028a;
    }
}
