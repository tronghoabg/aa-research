package com.airbnb.lottie.f;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2365a = com.airbnb.lottie.f.a.c.a("fFamily", "fName", "fStyle", "ascent");

    static com.airbnb.lottie.d.c a(com.airbnb.lottie.f.a.d dVar) {
        dVar.k();
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        while (dVar.q()) {
            int iC = dVar.c(f2365a);
            if (iC == 0) {
                strH = dVar.h();
            } else if (iC == 1) {
                strH2 = dVar.h();
            } else if (iC == 2) {
                strH3 = dVar.h();
            } else if (iC != 3) {
                dVar.o();
                dVar.p();
            } else {
                dVar.a();
            }
        }
        dVar.m();
        return new com.airbnb.lottie.d.c(strH, strH2, strH3);
    }
}
