package com.waze.shared_infra.r;

import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f37959a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f37960b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f37960b = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new d(this.f37960b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f37959a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f37959a = 1;
            obj = ai.j(new h(this.f37960b.f37976a.a(), 1), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return Boolean.valueOf(obj != null);
    }
}
