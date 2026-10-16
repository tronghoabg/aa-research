package com.waze.car_lib.i;

import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f20054a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f20055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, h.c.e eVar) {
        super(2, eVar);
        this.f20055b = dVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f20055b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f20054a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f20054a = 1;
            if (d.c(this.f20055b, this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
