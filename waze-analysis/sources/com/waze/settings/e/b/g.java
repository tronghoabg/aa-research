package com.waze.settings.e.b;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f37140a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f37141b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f37141b = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new g(this.f37141b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f37140a == 0) {
            e.b.c.b(obj);
            l lVar = this.f37141b;
            this.f37140a = 1;
            if (lVar.h().a().collect(new f(lVar), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
