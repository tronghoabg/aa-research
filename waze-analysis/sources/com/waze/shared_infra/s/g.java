package com.waze.shared_infra.s;

import com.waze.search.h.ay;
import com.waze.search.h.az;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.a.ad;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f38007a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f38008b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f38009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(f fVar, h.c.e eVar) {
        super(2, eVar);
        this.f38008b = fVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        g gVar = new g(this.f38008b, eVar);
        gVar.f38009c = obj;
        return gVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((ad) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f38007a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ad adVar = (ad) this.f38009c;
            f fVar = this.f38008b;
            this.f38007a = 1;
            if (kotlinx.coroutines.a.ab.a(adVar, new az(fVar, fVar.d(new ay(adVar)), 6), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
