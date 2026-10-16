package com.waze.car_lib.f;

import com.waze.car_lib.login.LoginController$LoginState;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class je extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19750a;

    je(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        je jeVar = new je(eVar);
        jeVar.f19750a = obj;
        return jeVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((je) create((LoginController$LoginState) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(((LoginController$LoginState) this.f19750a).getState() instanceof com.waze.car_lib.login.f);
    }
}
