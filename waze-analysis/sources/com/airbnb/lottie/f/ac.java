package com.airbnb.lottie.f;

import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ac {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2328a = com.airbnb.lottie.f.a.c.a("nm", "hd", "it");

    static com.airbnb.lottie.d.b.o a(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        ArrayList arrayList = new ArrayList();
        boolean zR = false;
        String strH = null;
        while (dVar.q()) {
            int iC = dVar.c(f2328a);
            if (iC == 0) {
                strH = dVar.h();
            } else if (iC == 1) {
                zR = dVar.r();
            } else if (iC != 2) {
                dVar.p();
            } else {
                dVar.j();
                while (dVar.q()) {
                    com.airbnb.lottie.d.b.c cVarA = g.a(dVar, hVar);
                    if (cVarA != null) {
                        arrayList.add(cVarA);
                    }
                }
                dVar.l();
            }
        }
        return new com.airbnb.lottie.d.b.o(strH, arrayList, zR);
    }
}
