package com.waze.c.e.a;

import h.ab;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class n extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f18449a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f18450b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(t tVar, h.c.e eVar) {
        super(2, eVar);
        this.f18450b = tVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        n nVar = new n(this.f18450b, eVar);
        nVar.f18449a = ((Boolean) obj).booleanValue();
        return nVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((n) create(bool, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f18449a;
        bn bnVar = this.f18450b.m;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, c.g((c) objD, false, null, null, z, null, 55)));
        return ab.f48028a;
    }
}
