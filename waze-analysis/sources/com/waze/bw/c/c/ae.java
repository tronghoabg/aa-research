package com.waze.bw.c.c;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ae extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f17779a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f17780b;

    ae(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ae aeVar = new ae((h.c.e) obj3);
        aeVar.f17779a = zBooleanValue;
        aeVar.f17780b = (List) obj2;
        return aeVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f17779a;
        return new h.k(Boolean.valueOf(z), (List) this.f17780b);
    }
}
