package com.waze.settings;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dr extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37059a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f37060b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ds f37061c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dr(ds dsVar, h.c.e eVar) {
        super(3, eVar);
        this.f37061c = dsVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        dr drVar = new dr(this.f37061c, (h.c.e) obj3);
        drVar.f37059a = (List) obj;
        drVar.f37060b = (Boolean) obj2;
        return drVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        List list = (List) this.f37059a;
        Boolean bool = (Boolean) this.f37060b;
        h.g.b.x.c(bool);
        return !bool.booleanValue() ? a.f36697a : new b(list);
    }
}
