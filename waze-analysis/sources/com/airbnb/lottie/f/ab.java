package com.airbnb.lottie.f;

import android.graphics.Path;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ab {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2327a = com.airbnb.lottie.f.a.c.a("nm", "c", "o", "fillEnabled", "r", "hd");

    static com.airbnb.lottie.d.b.n a(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        com.airbnb.lottie.d.a.d dVar2 = null;
        boolean zR = false;
        boolean zR2 = false;
        int iB = 1;
        String strH = null;
        com.airbnb.lottie.d.a.a aVarA = null;
        while (dVar.q()) {
            int iC = dVar.c(f2327a);
            if (iC == 0) {
                strH = dVar.h();
            } else if (iC == 1) {
                aVarA = d.a(dVar, hVar);
            } else if (iC == 2) {
                dVar2 = d.e(dVar, hVar);
            } else if (iC == 3) {
                zR = dVar.r();
            } else if (iC == 4) {
                iB = dVar.b();
            } else if (iC != 5) {
                dVar.o();
                dVar.p();
            } else {
                zR2 = dVar.r();
            }
        }
        if (dVar2 == null) {
            dVar2 = new com.airbnb.lottie.d.a.d(Collections.singletonList(new com.airbnb.lottie.h.a(100)));
        }
        return new com.airbnb.lottie.d.b.n(strH, zR, iB == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVarA, dVar2, zR2);
    }
}
