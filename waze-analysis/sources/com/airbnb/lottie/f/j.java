package com.airbnb.lottie.f;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2349a = com.airbnb.lottie.f.a.c.a("ef");

    /* renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2350b = com.airbnb.lottie.f.a.c.a("nm", "v");

    /* renamed from: c, reason: collision with root package name */
    private com.airbnb.lottie.d.a.a f2351c;

    /* renamed from: d, reason: collision with root package name */
    private com.airbnb.lottie.d.a.b f2352d;

    /* renamed from: e, reason: collision with root package name */
    private com.airbnb.lottie.d.a.b f2353e;

    /* renamed from: f, reason: collision with root package name */
    private com.airbnb.lottie.d.a.b f2354f;

    /* renamed from: g, reason: collision with root package name */
    private com.airbnb.lottie.d.a.b f2355g;

    final i a(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        com.airbnb.lottie.d.a.b bVar;
        com.airbnb.lottie.d.a.b bVar2;
        com.airbnb.lottie.d.a.b bVar3;
        com.airbnb.lottie.d.a.b bVar4;
        while (dVar.q()) {
            if (dVar.c(f2349a) != 0) {
                dVar.o();
                dVar.p();
            } else {
                dVar.j();
                while (dVar.q()) {
                    dVar.k();
                    String strH = "";
                    while (dVar.q()) {
                        int iC = dVar.c(f2350b);
                        if (iC == 0) {
                            strH = dVar.h();
                        } else if (iC == 1) {
                            switch (strH.hashCode()) {
                                case 353103893:
                                    if (!strH.equals("Distance")) {
                                        dVar.p();
                                        break;
                                    } else {
                                        this.f2354f = d.b(dVar, hVar);
                                        break;
                                    }
                                case 397447147:
                                    if (!strH.equals("Opacity")) {
                                        dVar.p();
                                        break;
                                    } else {
                                        this.f2352d = d.c(dVar, hVar, false);
                                        break;
                                    }
                                case 1041377119:
                                    if (!strH.equals("Direction")) {
                                        dVar.p();
                                        break;
                                    } else {
                                        this.f2353e = d.c(dVar, hVar, false);
                                        break;
                                    }
                                case 1379387491:
                                    if (!strH.equals("Shadow Color")) {
                                        dVar.p();
                                        break;
                                    } else {
                                        this.f2351c = d.a(dVar, hVar);
                                        break;
                                    }
                                case 1383710113:
                                    if (!strH.equals("Softness")) {
                                        dVar.p();
                                        break;
                                    } else {
                                        this.f2355g = d.b(dVar, hVar);
                                        break;
                                    }
                                default:
                                    dVar.p();
                                    break;
                            }
                        } else {
                            dVar.o();
                            dVar.p();
                        }
                    }
                    dVar.m();
                }
                dVar.l();
            }
        }
        com.airbnb.lottie.d.a.a aVar = this.f2351c;
        if (aVar == null || (bVar = this.f2352d) == null || (bVar2 = this.f2353e) == null || (bVar3 = this.f2354f) == null || (bVar4 = this.f2355g) == null) {
            return null;
        }
        return new i(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
