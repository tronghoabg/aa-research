package com.waze.main_screen.i.a;

import androidx.compose.runtime.State;
import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f26455a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ State f26456b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(e eVar, State state, h.c.e eVar2) {
        super(2, eVar2);
        this.f26455a = eVar;
        this.f26456b = state;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new b(this.f26455a, this.f26456b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f26455a.c(d.f(this.f26456b) != null);
        return ab.f48028a;
    }
}
