package com.waze.ae;

import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f14043a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f14044b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a f14045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(k kVar, a aVar, h.c.e eVar) {
        super(2, eVar);
        this.f14044b = kVar;
        this.f14045c = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new d(this.f14044b, this.f14045c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f14043a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f14043a = 1;
            if (this.f14044b.collect(new c(this.f14045c), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
