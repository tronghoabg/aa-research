package com.waze.sound.f;

import h.g.b.ar;
import h.g.b.m;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ a f39976a = new a();

    public final d a() {
        org.a.d.k.b bVarC;
        m mVar;
        a aVar = this;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = ar.f48106a;
            mVar = new m(d.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new m(d.class);
        }
        return (d) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
