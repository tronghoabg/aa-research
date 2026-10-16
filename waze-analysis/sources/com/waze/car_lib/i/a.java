package com.waze.car_lib.i;

import h.ab;
import h.c.b.a.g;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f19835a;

    a(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        a aVar = new a(eVar);
        aVar.f19835a = ((Boolean) obj).booleanValue();
        return aVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((a) create(bool, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(!this.f19835a);
    }
}
