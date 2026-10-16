package com.waze.car_lib.r;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ef extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21518a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f21519b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ef(List list, h.c.e eVar) {
        super(2, eVar);
        this.f21519b = list;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ef efVar = new ef(this.f21519b, eVar);
        efVar.f21518a = obj;
        return efVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ef) create((h.k) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        h.k kVar = (h.k) this.f21518a;
        int iIntValue = ((Number) kVar.a()).intValue();
        int iIntValue2 = ((Number) kVar.b()).intValue();
        boolean z = false;
        if (iIntValue >= 0 && iIntValue < iIntValue2 && iIntValue2 <= this.f21519b.size()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
