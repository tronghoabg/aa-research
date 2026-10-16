package com.waze.beacons.a;

import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f16244a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f16245b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, h.c.e eVar) {
        super(2, eVar);
        this.f16245b = fVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f16245b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f16244a == 0) {
            e.b.c.b(obj);
            f fVar = this.f16245b;
            this.f16244a = 1;
            if (fVar.f16246a.getBeaconUpdates().collect(new d(fVar), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
