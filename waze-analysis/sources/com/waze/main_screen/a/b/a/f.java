package com.waze.main_screen.a.b.a;

import androidx.lifecycle.ViewModelKt;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class f extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f25580a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, h.c.e eVar) {
        super(2, eVar);
        this.f25580a = gVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new f(this.f25580a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((f) create((l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        g gVar = this.f25580a;
        aj.z(ViewModelKt.getViewModelScope(gVar), null, null, new e(gVar, null), 3);
        return ab.f48028a;
    }
}
