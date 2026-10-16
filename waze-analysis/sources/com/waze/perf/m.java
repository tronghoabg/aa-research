package com.waze.perf;

import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class m extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f33059a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f33060b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(n nVar, h.c.e eVar) {
        super(2, eVar);
        this.f33060b = nVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new m(this.f33060b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((m) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f33059a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f33059a = 1;
            obj = ai.k(this.f33060b.f33061a.d(), new l(null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((com.waze.sharedui.e.c) obj) != null) {
            c.a(b.f33034l);
        }
        return ab.f48028a;
    }
}
