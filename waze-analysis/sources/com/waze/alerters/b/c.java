package com.waze.alerters.b;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.alerters.a.c f14222a;

    public c(com.waze.alerters.a.c cVar) {
        x.f(cVar, "stateHolder");
        this.f14222a = cVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        c cVar = (c) obj;
        x.f(cVar, "other");
        com.waze.alerters.a.c cVar2 = this.f14222a;
        int iA = cVar2.c().a();
        com.waze.alerters.a.c cVar3 = cVar.f14222a;
        if (iA != cVar3.c().a()) {
            return x.a(cVar2.c().a(), cVar3.c().a());
        }
        Integer numA = cVar2.b().a();
        int iIntValue = numA != null ? numA.intValue() : 0;
        Integer numA2 = cVar3.b().a();
        return x.a(iIntValue, numA2 != null ? numA2.intValue() : 0);
    }
}
