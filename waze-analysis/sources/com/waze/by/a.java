package com.waze.by;

import com.waze.navigate.location_preview.q;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f18202a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, e eVar) {
        super(2, eVar);
        this.f18202a = bVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new a(this.f18202a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        c.b(obj);
        b bVar = this.f18202a;
        com.waze.az.b bVar2 = bVar.f18203a;
        Thread threadCurrentThread = Thread.currentThread();
        x.e(threadCurrentThread, "currentThread(...)");
        return bVar2.b(new com.waze.coroutines.c(threadCurrentThread, bVar.f18204b, bVar.f18205c.f(), bVar.f18205c.g(), bVar.f18205c.e()), new q(7));
    }
}
