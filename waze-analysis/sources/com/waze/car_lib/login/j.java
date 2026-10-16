package com.waze.car_lib.login;

import com.waze.install.x;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ org.a.d.a.a f20307a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20308b;

    public j(org.a.d.a.a aVar, int i2) {
        this.f20308b = i2;
        this.f20307a = aVar;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f20308b;
        if (i2 == 0) {
            org.a.d.a.a aVar = this.f20307a;
            if (aVar instanceof org.a.d.a.b) {
                org.a.d.k.b bVarL = ((org.a.d.a.b) aVar).l();
                int i3 = ar.f48106a;
                return bVarL.a(new h.g.b.m(x.class), null, null);
            }
            org.a.d.k.b bVarC = aVar.getKoin().a().c();
            int i4 = ar.f48106a;
            return bVarC.a(new h.g.b.m(x.class), null, null);
        }
        org.a.d.a.a aVar2 = this.f20307a;
        if (i2 != 1) {
            if (aVar2 instanceof org.a.d.a.b) {
                org.a.d.k.b bVarL2 = ((org.a.d.a.b) aVar2).l();
                int i5 = ar.f48106a;
                return bVarL2.a(new h.g.b.m(com.waze.al.a.a.class), null, null);
            }
            org.a.d.k.b bVarC2 = aVar2.getKoin().a().c();
            int i6 = ar.f48106a;
            return bVarC2.a(new h.g.b.m(com.waze.al.a.a.class), null, null);
        }
        if (aVar2 instanceof org.a.d.a.b) {
            org.a.d.k.b bVarL3 = ((org.a.d.a.b) aVar2).l();
            int i7 = ar.f48106a;
            return bVarL3.a(new h.g.b.m(o.class), null, null);
        }
        org.a.d.k.b bVarC3 = aVar2.getKoin().a().c();
        int i8 = ar.f48106a;
        return bVarC3.a(new h.g.b.m(o.class), null, null);
    }
}
