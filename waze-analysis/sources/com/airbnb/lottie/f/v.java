package com.airbnb.lottie.f;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2385a = com.airbnb.lottie.f.a.c.a("nm", "mm", "hd");

    static com.airbnb.lottie.d.b.h a(com.airbnb.lottie.f.a.d dVar) {
        int i2 = 0;
        boolean zR = false;
        while (dVar.q()) {
            int iC = dVar.c(f2385a);
            if (iC == 0) {
                dVar.h();
            } else if (iC == 1) {
                int iB = dVar.b();
                if (iB != 1) {
                    if (iB != 2) {
                        int i3 = 3;
                        if (iB != 3) {
                            i3 = 4;
                            if (iB != 4) {
                                i3 = 5;
                                if (iB != 5) {
                                }
                            }
                        }
                        i2 = i3;
                    } else {
                        i2 = 2;
                    }
                }
                i2 = 1;
            } else if (iC != 2) {
                dVar.o();
                dVar.p();
            } else {
                zR = dVar.r();
            }
        }
        return new com.airbnb.lottie.d.b.h(i2, zR);
    }
}
