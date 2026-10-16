package com.waze.shared_infra.a;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    Object f37773a;

    /* renamed from: b, reason: collision with root package name */
    Object f37774b;

    /* renamed from: c, reason: collision with root package name */
    int f37775c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f37776d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ k f37777e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(k kVar, h.c.e eVar) {
        super(2, eVar);
        this.f37777e = kVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        g gVar = new g(this.f37777e, eVar);
        gVar.f37776d = obj;
        return gVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((a) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        k kVar;
        kotlinx.coroutines.h.a aVar2;
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f37775c != 0) {
            kVar = (k) this.f37774b;
            aVar2 = (kotlinx.coroutines.h.a) this.f37773a;
            aVar = (a) this.f37776d;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            a aVar4 = (a) this.f37776d;
            k kVar2 = this.f37777e;
            kotlinx.coroutines.h.a aVar5 = kVar2.f37792d;
            this.f37776d = aVar4;
            this.f37773a = aVar5;
            this.f37774b = kVar2;
            this.f37775c = 1;
            if (aVar5.lock(null, this) == aVar3) {
                return aVar3;
            }
            aVar = aVar4;
            kVar = kVar2;
            aVar2 = aVar5;
        }
        try {
            kVar.f37794f = aVar;
            k.e(kVar);
            aVar2.unlock(null);
            return ab.f48028a;
        } catch (Throwable th) {
            aVar2.unlock(null);
            throw th;
        }
    }
}
