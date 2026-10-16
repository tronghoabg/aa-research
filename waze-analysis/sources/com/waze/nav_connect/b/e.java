package com.waze.nav_connect.b;

import com.waze.navigate.ej;
import com.waze.navigate.em;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class e extends h.c.b.a.g implements h.g.a.s {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f30789a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f30790b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ boolean f30791c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ long f30792d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f30793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, h.c.e eVar) {
        super(5, eVar);
        this.f30793e = fVar;
    }

    @Override // h.g.a.s
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        long jLongValue = ((Number) obj4).longValue();
        e eVar = new e(this.f30793e, (h.c.e) obj5);
        eVar.f30789a = (em) obj;
        eVar.f30790b = zBooleanValue;
        eVar.f30791c = zBooleanValue2;
        eVar.f30792d = jLongValue;
        return eVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = ((em) this.f30789a) instanceof ej;
        boolean z2 = this.f30790b;
        boolean z3 = this.f30791c;
        long j2 = this.f30792d;
        boolean z4 = false;
        if (z && !z2 && !z3 && j2 < com.waze.nav_connect.a.f()) {
            z4 = true;
        }
        return new c(z4);
    }
}
