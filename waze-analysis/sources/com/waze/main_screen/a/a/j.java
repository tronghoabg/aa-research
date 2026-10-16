package com.waze.main_screen.a.a;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class j extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f25549a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f25550b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(n nVar, h.c.e eVar) {
        super(2, eVar);
        this.f25550b = nVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new j(this.f25550b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f25549a == 0) {
            e.b.c.b(obj);
            n nVar = this.f25550b;
            this.f25549a = 1;
            if (nVar.f25556c.ag().collect(new i(nVar), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
