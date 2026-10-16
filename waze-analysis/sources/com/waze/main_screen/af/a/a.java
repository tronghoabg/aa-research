package com.waze.main_screen.af.a;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f25755a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(i iVar, h.c.e eVar) {
        super(2, eVar);
        this.f25755a = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new a(this.f25755a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        i iVar = this.f25755a;
        aj.z(iVar.f25780i, null, null, new h(iVar, null), 3);
        return ab.f48028a;
    }
}
