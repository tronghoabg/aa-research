package com.airbnb.lottie.f;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2388a = com.airbnb.lottie.f.a.c.a("nm", "c", "o", "tr", "hd");

    static com.airbnb.lottie.d.b.k a(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        boolean zR = false;
        String strH = null;
        com.airbnb.lottie.d.a.b bVarC = null;
        com.airbnb.lottie.d.a.b bVarC2 = null;
        com.airbnb.lottie.d.a.l lVarA = null;
        while (dVar.q()) {
            int iC = dVar.c(f2388a);
            if (iC == 0) {
                strH = dVar.h();
            } else if (iC == 1) {
                bVarC = d.c(dVar, hVar, false);
            } else if (iC == 2) {
                bVarC2 = d.c(dVar, hVar, false);
            } else if (iC == 3) {
                lVarA = c.a(dVar, hVar);
            } else if (iC != 4) {
                dVar.p();
            } else {
                zR = dVar.r();
            }
        }
        return new com.airbnb.lottie.d.b.k(strH, bVarC, bVarC2, lVarA, zR);
    }
}
