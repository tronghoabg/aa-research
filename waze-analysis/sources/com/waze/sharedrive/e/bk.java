package com.waze.sharedrive.e;

import com.waze.modules.c.eb;
import com.waze.navigate.em;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bk extends h.c.b.a.g implements h.g.a.s {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38437a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f38438b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f38439c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ boolean f38440d;

    bk(h.c.e eVar) {
        super(5, eVar);
    }

    @Override // h.g.a.s
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        bk bkVar = new bk((h.c.e) obj5);
        bkVar.f38437a = (em) obj;
        bkVar.f38438b = (eb) obj2;
        bkVar.f38439c = (com.waze.navigate.ci) obj3;
        bkVar.f38440d = zBooleanValue;
        return bkVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new be((em) this.f38437a, (eb) this.f38438b, (com.waze.navigate.ci) this.f38439c, this.f38440d);
    }
}
