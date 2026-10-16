package com.waze.profile;

import androidx.compose.runtime.State;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ State f33381a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f33382b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(State state, g gVar, h.c.e eVar) {
        super(2, eVar);
        this.f33381a = state;
        this.f33382b = gVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f33381a, this.f33382b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Integer numB = g.n(this.f33381a).b();
        if (numB != null) {
            this.f33382b.j(numB.intValue());
        }
        return ab.f48028a;
    }
}
