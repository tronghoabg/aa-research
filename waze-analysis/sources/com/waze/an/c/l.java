package com.waze.an.c;

import com.waze.ui.l.cg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class l extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f14784a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cg f14785b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(cg cgVar, h.c.e eVar) {
        super(2, eVar);
        this.f14785b = cgVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new l(this.f14785b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((l) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f14784a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f14784a = 1;
            if (this.f14785b.l(this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
