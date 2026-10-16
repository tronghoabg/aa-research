package com.waze.sharedui.api;

import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static final t f38826a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f38827b;

    static {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        t tVar = new t();
        f38826a = tVar;
        t tVar2 = tVar;
        if (tVar2 instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) tVar2).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(com.waze.sharedui.h.j.class);
        } else {
            bVarC = tVar2.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(com.waze.sharedui.h.j.class);
        }
        f38827b = new q((com.waze.sharedui.h.j) bVarC.a(mVar, null, null));
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
