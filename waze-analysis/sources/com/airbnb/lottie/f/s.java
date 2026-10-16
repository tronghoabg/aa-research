package com.airbnb.lottie.f;

import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    static final com.airbnb.lottie.f.a.c f2376a = com.airbnb.lottie.f.a.c.a("k");

    static List a(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar, float f2, ag agVar, boolean z) {
        com.airbnb.lottie.f.a.d dVar2;
        com.airbnb.lottie.h hVar2;
        float f3;
        ag agVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (dVar.s() == 6) {
            hVar.p("Lottie doesn't support expressions.");
            return arrayList;
        }
        dVar.k();
        while (dVar.q()) {
            if (dVar.c(f2376a) != 0) {
                dVar.p();
            } else if (dVar.s() == 1) {
                dVar.j();
                if (dVar.s() != 7) {
                    while (dVar.q()) {
                        com.airbnb.lottie.f.a.d dVar3 = dVar;
                        com.airbnb.lottie.h hVar3 = hVar;
                        float f4 = f2;
                        ag agVar3 = agVar;
                        boolean z3 = z;
                        arrayList.add(r.a(dVar3, hVar3, f4, agVar3, true, z3));
                        dVar = dVar3;
                        hVar = hVar3;
                        f2 = f4;
                        agVar = agVar3;
                        z = z3;
                    }
                    dVar2 = dVar;
                    hVar2 = hVar;
                    f3 = f2;
                    agVar2 = agVar;
                    z2 = z;
                } else {
                    dVar2 = dVar;
                    hVar2 = hVar;
                    f3 = f2;
                    agVar2 = agVar;
                    z2 = z;
                    arrayList.add(r.a(dVar2, hVar2, f3, agVar2, false, z2));
                }
                dVar2.l();
                dVar = dVar2;
                hVar = hVar2;
                f2 = f3;
                agVar = agVar2;
                z = z2;
            } else {
                com.airbnb.lottie.f.a.d dVar4 = dVar;
                arrayList.add(r.a(dVar4, hVar, f2, agVar, false, z));
                dVar = dVar4;
            }
        }
        dVar.m();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i2;
        Object obj;
        int size = list.size();
        int i3 = 0;
        while (true) {
            i2 = size - 1;
            if (i3 >= i2) {
                break;
            }
            com.airbnb.lottie.h.a aVar = (com.airbnb.lottie.h.a) list.get(i3);
            i3++;
            com.airbnb.lottie.h.a aVar2 = (com.airbnb.lottie.h.a) list.get(i3);
            aVar.f2439g = Float.valueOf(aVar2.f2438f);
            if (aVar.f2434b == null && (obj = aVar2.f2433a) != null) {
                aVar.f2434b = obj;
                if (aVar instanceof com.airbnb.lottie.a.b.o) {
                    ((com.airbnb.lottie.a.b.o) aVar).b();
                }
            }
        }
        com.airbnb.lottie.h.a aVar3 = (com.airbnb.lottie.h.a) list.get(i2);
        if ((aVar3.f2433a == null || aVar3.f2434b == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
