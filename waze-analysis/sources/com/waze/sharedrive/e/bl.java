package com.waze.sharedrive.e;

import com.waze.navigate.ek;
import com.waze.navigate.el;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bl extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38441a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f38442b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bn bnVar, h.c.e eVar) {
        super(2, eVar);
        this.f38442b = bnVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        bl blVar = new bl(this.f38442b, eVar);
        blVar.f38441a = obj;
        return blVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bl) create((be) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        be beVar = (be) this.f38441a;
        boolean z = (beVar.b() instanceof el) && ((el) beVar.b()).a() == ek.f31320g;
        if (!beVar.c()) {
            this.f38442b.f38450e.a("awaitNavigationAndBecomeDriver: active session ended, aborting role update");
        }
        return Boolean.valueOf(beVar.c() && !z);
    }
}
