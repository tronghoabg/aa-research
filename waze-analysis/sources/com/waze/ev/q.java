package com.waze.ev;

import h.ab;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f23710a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f23711b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(s sVar, List list, h.c.e eVar) {
        super(2, eVar);
        this.f23710a = sVar;
        this.f23711b = list;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new q(this.f23710a, this.f23711b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((q) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        s sVar = this.f23710a;
        sVar.f23723g.i(com.waze.ac.e.d(sVar.f23718b, this.f23711b, (String) sVar.f23723g.f().d(), sVar.f()));
        return ab.f48028a;
    }
}
