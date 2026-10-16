package com.waze.an.b;

import com.waze.an.a.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final r f14632a;

    public h(r rVar) {
        x.f(rVar, "insightDescriptor");
        this.f14632a = rVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        h hVar = (h) obj;
        x.f(hVar, "other");
        r rVar = this.f14632a;
        int iA = rVar.j().a();
        r rVar2 = hVar.f14632a;
        int iA2 = rVar2.j().a();
        if (iA != iA2) {
            return x.a(iA, iA2);
        }
        if (!(rVar instanceof com.waze.an.a.b) || !(rVar2 instanceof com.waze.an.a.b)) {
            return 0;
        }
        Integer numA = ((com.waze.an.a.b) rVar).a();
        int iIntValue = numA != null ? numA.intValue() : 0;
        Integer numA2 = ((com.waze.an.a.b) rVar2).a();
        return x.a(iIntValue, numA2 != null ? numA2.intValue() : 0);
    }
}
