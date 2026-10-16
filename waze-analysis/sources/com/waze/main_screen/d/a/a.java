package com.waze.main_screen.d.a;

import h.ab;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a extends h.c.b.a.g implements q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26304a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26305b;

    a(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = new a((h.c.e) obj3);
        aVar.f26304a = (Boolean) obj;
        aVar.f26305b = (Boolean) obj2;
        return aVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Boolean bool = (Boolean) this.f26304a;
        Boolean bool2 = (Boolean) this.f26305b;
        boolean z = false;
        if (!bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
