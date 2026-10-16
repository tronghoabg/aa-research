package com.waze.app_nav.hub.service;

import h.g.b.ar;
import h.g.b.m;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ j f15394a = new j();

    public final k a() {
        org.a.d.k.b bVarC;
        m mVar;
        j jVar = this;
        if (jVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) jVar).l();
            int i2 = ar.f48106a;
            mVar = new m(k.class);
        } else {
            bVarC = jVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new m(k.class);
        }
        return (k) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
