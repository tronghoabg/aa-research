package com.airbnb.lottie.f;

import android.content.res.Resources;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2309a = com.airbnb.lottie.f.a.c.a("k", "x", "y");

    public static com.airbnb.lottie.d.a.e a(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        ArrayList arrayList = new ArrayList();
        if (dVar.s() == 1) {
            dVar.j();
            while (dVar.q()) {
                int iS = dVar.s();
                int i2 = com.airbnb.lottie.g.k.f2415a;
                com.airbnb.lottie.f.a.d dVar2 = dVar;
                com.airbnb.lottie.h hVar2 = hVar;
                arrayList.add(new com.airbnb.lottie.a.b.o(hVar2, r.a(dVar2, hVar2, Resources.getSystem().getDisplayMetrics().density, k.f2359d, iS == 3, false)));
                dVar = dVar2;
                hVar = hVar2;
            }
            dVar.l();
            s.b(arrayList);
        } else {
            int i3 = com.airbnb.lottie.g.k.f2415a;
            arrayList.add(new com.airbnb.lottie.h.a(q.c(dVar, Resources.getSystem().getDisplayMetrics().density)));
        }
        return new com.airbnb.lottie.d.a.e(arrayList);
    }

    static com.airbnb.lottie.d.a.m b(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        dVar.k();
        boolean z = false;
        com.airbnb.lottie.d.a.e eVarA = null;
        com.airbnb.lottie.d.a.b bVarC = null;
        com.airbnb.lottie.d.a.b bVarC2 = null;
        while (dVar.s() != 4) {
            int iC = dVar.c(f2309a);
            if (iC == 0) {
                eVarA = a(dVar, hVar);
            } else if (iC != 1) {
                if (iC != 2) {
                    dVar.o();
                    dVar.p();
                } else if (dVar.s() == 6) {
                    dVar.p();
                    z = true;
                } else {
                    bVarC2 = d.c(dVar, hVar, true);
                }
            } else if (dVar.s() == 6) {
                dVar.p();
                z = true;
            } else {
                bVarC = d.c(dVar, hVar, true);
            }
        }
        dVar.m();
        if (z) {
            hVar.p("Lottie doesn't support expressions.");
        }
        return eVarA != null ? eVarA : new com.airbnb.lottie.d.a.i(bVarC, bVarC2);
    }
}
