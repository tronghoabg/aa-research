package com.waze.main_screen.a.a;

import androidx.lifecycle.ViewModelKt;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class m extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f25553a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(n nVar, h.c.e eVar) {
        super(2, eVar);
        this.f25553a = nVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new m(this.f25553a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((m) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        n nVar = this.f25553a;
        aj.z(ViewModelKt.getViewModelScope(nVar), null, null, new j(nVar, null), 3);
        return ab.f48028a;
    }
}
