package com.waze.search.f;

import com.waze.search.h.bx;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bx f35740a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f35741b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(bx bxVar, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f35740a = bxVar;
        this.f35741b = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new p(this.f35740a, this.f35741b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((p) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f35740a.F(this.f35741b);
        return ab.f48028a;
    }
}
