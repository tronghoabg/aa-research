package com.airbnb.lottie.f;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2338a = com.airbnb.lottie.f.a.c.a("ef");

    /* renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2339b = com.airbnb.lottie.f.a.c.a("ty", "v");

    static com.airbnb.lottie.d.b.a a(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        com.airbnb.lottie.d.b.a aVar = null;
        while (dVar.q()) {
            if (dVar.c(f2338a) != 0) {
                dVar.o();
                dVar.p();
            } else {
                dVar.j();
                while (dVar.q()) {
                    dVar.k();
                    com.airbnb.lottie.d.b.a aVar2 = null;
                    while (true) {
                        boolean z = false;
                        while (dVar.q()) {
                            int iC = dVar.c(f2339b);
                            if (iC != 0) {
                                if (iC != 1) {
                                    dVar.o();
                                    dVar.p();
                                } else if (z) {
                                    aVar2 = new com.airbnb.lottie.d.b.a(d.b(dVar, hVar));
                                } else {
                                    dVar.p();
                                }
                            } else if (dVar.b() == 0) {
                                z = true;
                            }
                        }
                    }
                    dVar.m();
                    if (aVar2 != null) {
                        aVar = aVar2;
                    }
                }
                dVar.l();
            }
        }
        return aVar;
    }
}
