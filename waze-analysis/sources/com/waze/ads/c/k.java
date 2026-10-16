package com.waze.ads.c;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class k extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f13977a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f13978b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(m mVar, h.c.e eVar) {
        super(2, eVar);
        this.f13978b = mVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new k(this.f13978b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((k) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f13977a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            m mVar = this.f13978b;
            this.f13977a = 1;
            if (mVar.f(mVar.f13988i, this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
