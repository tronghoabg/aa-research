package com.waze.shared_infra.a;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    Object f37778a;

    /* renamed from: b, reason: collision with root package name */
    Object f37779b;

    /* renamed from: c, reason: collision with root package name */
    Object f37780c;

    /* renamed from: d, reason: collision with root package name */
    int f37781d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ k f37782e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f37783f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(k kVar, c cVar, h.c.e eVar) {
        super(2, eVar);
        this.f37782e = kVar;
        this.f37783f = cVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new h(this.f37782e, this.f37783f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        k kVar;
        c cVar;
        kotlinx.coroutines.h.a aVar;
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f37781d != 0) {
            cVar = (c) this.f37780c;
            kVar = (k) this.f37779b;
            aVar = (kotlinx.coroutines.h.a) this.f37778a;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kVar = this.f37782e;
            c cVar2 = this.f37783f;
            kotlinx.coroutines.h.a aVar3 = kVar.f37792d;
            this.f37778a = aVar3;
            this.f37779b = kVar;
            this.f37780c = cVar2;
            this.f37781d = 1;
            if (aVar3.lock(null, this) == aVar2) {
                return aVar2;
            }
            cVar = cVar2;
            aVar = aVar3;
        }
        try {
            kVar.f37793e.add(cVar);
            k.e(kVar);
            aVar.unlock(null);
            return ab.f48028a;
        } catch (Throwable th) {
            aVar.unlock(null);
            throw th;
        }
    }
}
