package com.waze.cg.b;

import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f22290a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f22291b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f22291b = eVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new d(this.f22291b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f22290a == 0) {
            e.b.c.b(obj);
            e eVar = this.f22291b;
            eVar.f22297f.e("Live score active, observing states");
            this.f22290a = 1;
            if (eVar.f22292a.a().collect(new c(eVar), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
