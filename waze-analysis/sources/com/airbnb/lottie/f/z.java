package com.airbnb.lottie.f;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2389a = com.airbnb.lottie.f.a.c.a("nm", "r", "hd");

    static com.airbnb.lottie.d.b.l a(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        boolean zR = false;
        com.airbnb.lottie.d.a.b bVarC = null;
        while (dVar.q()) {
            int iC = dVar.c(f2389a);
            if (iC == 0) {
                dVar.h();
            } else if (iC == 1) {
                bVarC = d.c(dVar, hVar, true);
            } else if (iC != 2) {
                dVar.p();
            } else {
                zR = dVar.r();
            }
        }
        if (zR) {
            return null;
        }
        return new com.airbnb.lottie.d.b.l(bVarC);
    }
}
