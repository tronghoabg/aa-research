package com.waze.tide.a;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f40919a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f40920b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, h.c.e eVar) {
        super(2, eVar);
        this.f40920b = gVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new f(this.f40920b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f40919a == 0) {
            e.b.c.b(obj);
            g gVar = this.f40920b;
            this.f40919a = 1;
            if (gVar.f40921a.a().collect(new e(gVar), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
