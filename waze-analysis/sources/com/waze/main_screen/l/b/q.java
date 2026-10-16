package com.waze.main_screen.l.b;

import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f26632a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f26633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(r rVar, h.c.e eVar) {
        super(2, eVar);
        this.f26633b = rVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new q(this.f26633b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((q) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f26632a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            r rVar = this.f26633b;
            this.f26632a = 1;
            if (rVar.f26636c.R().collect(new p(rVar), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
