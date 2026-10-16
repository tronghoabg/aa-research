package com.waze.main_screen.w.a;

import com.waze.settings.hc;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27856a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f27857b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, e eVar) {
        super(2, eVar);
        this.f27857b = cVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        b bVar = new b(this.f27857b, eVar);
        bVar.f27856a = obj;
        return bVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((hc) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f27857b.f27858a.e(c.f((hc) this.f27856a));
        return ab.f48028a;
    }
}
