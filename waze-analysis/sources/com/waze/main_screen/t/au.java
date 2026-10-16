package com.waze.main_screen.t;

import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class au extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f27519a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aw f27520b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(aw awVar, h.c.e eVar) {
        super(2, eVar);
        this.f27520b = awVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        au auVar = new au(this.f27520b, eVar);
        auVar.f27519a = ((Boolean) obj).booleanValue();
        return auVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((au) create(bool, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f27519a;
        bn bnVar = this.f27520b.C;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, as.m((as) objD, null, null, null, null, null, null, !z, null, null, null, false, null, 16319)));
        return h.ab.f48028a;
    }
}
