package com.waze.main_screen.c.f;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f26224a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(i iVar, h.c.e eVar) {
        super(2, eVar);
        this.f26224a = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f26224a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return ab.f48028a;
    }
}
