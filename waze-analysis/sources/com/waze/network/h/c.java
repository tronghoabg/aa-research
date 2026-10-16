package com.waze.network.h;

import h.ab;
import h.c.b.a.g;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f32390a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f32391b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e eVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f32391b = eVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f32391b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((ab) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        l lVarC;
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.f32390a;
        e.b.c.b(obj);
        do {
            a aVarA = e.a(this.f32391b);
            if (aVarA == null) {
                return ab.f48028a;
            }
            lVarC = aVarA.c();
            this.f32390a = 1;
        } while (lVarC.invoke(this) != aVar);
        return aVar;
    }
}
