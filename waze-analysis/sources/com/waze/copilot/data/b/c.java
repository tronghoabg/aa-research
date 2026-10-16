package com.waze.copilot.data.b;

import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f22972a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f22973b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(f fVar, h.c.e eVar) {
        super(2, eVar);
        this.f22973b = fVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f22973b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f22972a != 0) {
            e.b.c.b(obj);
            objA = ((h.m) obj).b();
        } else {
            e.b.c.b(obj);
            this.f22972a = 1;
            objA = this.f22973b.f22983d.a(this);
            if (objA == aVar) {
                return aVar;
            }
        }
        return h.m.d(objA);
    }
}
