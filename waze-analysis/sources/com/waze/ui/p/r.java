package com.waze.ui.p;

import com.waze.map.gb;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f43227a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gb f43228b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(i iVar, gb gbVar, h.c.e eVar) {
        super(2, eVar);
        this.f43227a = iVar;
        this.f43228b = gbVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new r(this.f43227a, this.f43228b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((r) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        i iVar = this.f43227a;
        iVar.a().B(this.f43228b, new h(iVar, 0));
        return ab.f48028a;
    }
}
