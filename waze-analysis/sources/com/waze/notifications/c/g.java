package com.waze.notifications.c;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class g extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.notifications.b.a f32598a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.presentation.k f32599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(com.waze.reports_v2.presentation.k kVar, com.waze.notifications.b.a aVar, h.c.e eVar) {
        super(2, eVar);
        this.f32599b = kVar;
        this.f32598a = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new g(this.f32599b, this.f32598a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.reports_v2.presentation.k kVar = this.f32599b;
        if (kVar.d() == kVar.e() && kVar.d() == a.f32573b) {
            this.f32598a.b(com.waze.notifications.b.c.f32549d);
        }
        return ab.f48028a;
    }
}
