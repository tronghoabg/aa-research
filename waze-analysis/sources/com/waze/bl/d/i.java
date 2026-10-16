package com.waze.bl.d;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f17089a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f17090b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f17090b = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new i(this.f17090b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((i) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f17089a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f17089a = 1;
            if (this.f17090b.f17102g.a(this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
