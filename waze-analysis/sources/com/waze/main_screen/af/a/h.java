package com.waze.main_screen.af.a;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class h extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f25770a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f25771b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, h.c.e eVar) {
        super(2, eVar);
        this.f25771b = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new h(this.f25771b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f25770a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            i iVar = this.f25771b;
            this.f25770a = 1;
            if (new g(iVar.f25779h.getQuestionFlow()).collect(new d(iVar), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
