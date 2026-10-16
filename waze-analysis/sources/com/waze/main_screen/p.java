package com.waze.main_screen;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class p extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.ui.p.g f26728a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ be f26729b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(com.waze.ui.p.g gVar, be beVar, h.c.e eVar) {
        super(2, eVar);
        this.f26728a = gVar;
        this.f26729b = beVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new p(this.f26728a, this.f26729b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((p) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.map.b.ai aiVarC = this.f26728a.c();
        Boolean boolB = ConfigValues.CONFIG_VALUE_INSIGHTS_INFRA_CYCLISTS_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        aiVarC.m(boolB.booleanValue());
        return h.ab.f48028a;
    }
}
