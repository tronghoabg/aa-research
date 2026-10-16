package com.waze.ui.w;

import com.waze.ui.w.b.av;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ac extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f43528a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f43529b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f43530c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c f43531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(h.g.a.l lVar, av avVar, c cVar, h.c.e eVar) {
        super(2, eVar);
        this.f43529b = lVar;
        this.f43530c = avVar;
        this.f43531d = cVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ac(this.f43529b, this.f43530c, this.f43531d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ac) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f43528a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f43528a = 1;
            if (aj.q(200L, this) == aVar) {
                return aVar;
            }
        }
        this.f43529b.invoke(new com.waze.ui.w.b.h(this.f43530c, this.f43531d.d()));
        return h.ab.f48028a;
    }
}
