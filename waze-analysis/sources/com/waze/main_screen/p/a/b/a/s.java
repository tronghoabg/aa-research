package com.waze.main_screen.p.a.b.a;

import com.waze.z.a.b.ad;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class s implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f26818a;

    s(t tVar) {
        this.f26818a = tVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        t tVar = this.f26818a;
        ad adVar = (ad) obj;
        ad adVar2 = tVar.f26829k;
        ad adVar3 = ad.f45734b;
        boolean z = adVar2 == adVar3 && adVar != adVar3;
        boolean z2 = tVar.f26829k != adVar3 && adVar == adVar3;
        if (z) {
            t.z(tVar);
        } else if (z2) {
            tVar.f26819a.e();
        }
        tVar.f26829k = adVar;
        return h.ab.f48028a;
    }
}
