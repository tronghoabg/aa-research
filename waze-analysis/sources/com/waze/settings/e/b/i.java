package com.waze.settings.e.b;

import com.waze.bs;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ org.a.d.a.a f37142a;

    public i(org.a.d.a.a aVar) {
        this.f37142a = aVar;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [com.waze.bs, java.lang.Object] */
    @Override // h.g.a.a
    public final bs invoke() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.a.a aVar = this.f37142a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(bs.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(bs.class);
        }
        return bVarC.a(mVar, null, null);
    }
}
