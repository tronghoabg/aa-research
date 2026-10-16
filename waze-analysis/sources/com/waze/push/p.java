package com.waze.push;

import com.waze.navigate.dg;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ org.a.d.a.a f33447a;

    public p(org.a.d.a.a aVar) {
        this.f33447a = aVar;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [com.waze.navigate.dg, java.lang.Object] */
    @Override // h.g.a.a
    public final dg invoke() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.a.a aVar = this.f33447a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(dg.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(dg.class);
        }
        return bVarC.a(mVar, null, null);
    }
}
