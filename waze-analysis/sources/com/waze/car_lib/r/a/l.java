package com.waze.car_lib.r.a;

import com.waze.c.e.a.t;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class l extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f20903a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(p pVar, h.c.e eVar) {
        super(2, eVar);
        this.f20903a = pVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new l(this.f20903a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((l) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        t tVar = this.f20903a.f20925k;
        if (tVar != null) {
            tVar.r();
        }
        return ab.f48028a;
    }
}
