package com.waze.w;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class x extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f45469a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f45470b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f45471c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(y yVar, h.c.e eVar) {
        super(2, eVar);
        this.f45470b = yVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        x xVar = new x(this.f45470b, eVar);
        xVar.f45471c = obj;
        return xVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((x) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f45469a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f45469a = 1;
            if (((kotlinx.coroutines.b.l) this.f45471c).emit(this.f45470b.b(), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
