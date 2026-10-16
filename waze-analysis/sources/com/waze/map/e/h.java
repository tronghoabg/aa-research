package com.waze.map.e;

import h.ab;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class h extends h.c.b.a.g implements q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28806a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f28807b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f28808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, h.c.e eVar) {
        super(3, eVar);
        this.f28808c = iVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        h hVar = new h(this.f28808c, (h.c.e) obj3);
        hVar.f28806a = (Double) obj;
        hVar.f28807b = zBooleanValue;
        return hVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Double d2 = (Double) this.f28806a;
        boolean z = false;
        if (this.f28807b && d2 != null) {
            if (d2.doubleValue() > this.f28808c.f28811c) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
