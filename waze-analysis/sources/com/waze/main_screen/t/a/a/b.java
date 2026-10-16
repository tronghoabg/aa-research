package com.waze.main_screen.t.a.a;

import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f27436a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(f fVar, h.c.e eVar) {
        super(2, eVar);
        this.f27436a = fVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new b(this.f27436a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        f fVar = this.f27436a;
        aj.z(fVar.f27447f, null, null, new a(fVar, null), 3);
        return ab.f48028a;
    }
}
