package com.waze.car_lib.screens;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class bm implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.a.d.a.a f21881a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f21882b;

    public /* synthetic */ bm(com.waze.car_lib.screens.core.n nVar, int i2) {
        this.f21882b = i2;
        this.f21881a = nVar;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f21882b) {
            case 0:
                return bo.d((bo) this.f21881a);
            case 1:
                org.a.d.a.a aVar = this.f21881a;
                if (aVar instanceof org.a.d.a.b) {
                    org.a.d.k.b bVarL = ((org.a.d.a.b) aVar).l();
                    int i2 = h.g.b.ar.f48106a;
                    return bVarL.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                }
                org.a.d.k.b bVarC = aVar.getKoin().a().c();
                int i3 = h.g.b.ar.f48106a;
                return bVarC.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
            case 2:
                return bz.f((bz) this.f21881a);
            case 3:
                return bz.g((bz) this.f21881a);
            case 4:
                return bz.h((bz) this.f21881a);
            case 5:
                return cd.d((cd) this.f21881a);
            case 6:
                return cs.d((cs) this.f21881a);
            case 7:
                return cy.f((cy) this.f21881a);
            case 8:
                return cy.d((cy) this.f21881a);
            case 9:
                return cz.b((cz) this.f21881a);
            case 10:
                return df.f((df) this.f21881a);
            default:
                return df.h((df) this.f21881a);
        }
    }

    public bm(org.a.d.a.a aVar, int i2) {
        this.f21882b = i2;
        this.f21881a = aVar;
    }
}
