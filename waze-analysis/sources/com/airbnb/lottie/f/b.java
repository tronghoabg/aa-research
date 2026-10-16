package com.airbnb.lottie.f;

import androidx.media3.exoplayer.upstream.CmcdData;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2334a = com.airbnb.lottie.f.a.c.a(CmcdData.OBJECT_TYPE_AUDIO_ONLY);

    /* renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2335b = com.airbnb.lottie.f.a.c.a("fc", "sc", "sw", "t");

    public static com.airbnb.lottie.d.a.k a(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        dVar.k();
        com.airbnb.lottie.d.a.k kVar = null;
        while (dVar.q()) {
            if (dVar.c(f2334a) != 0) {
                dVar.o();
                dVar.p();
            } else {
                dVar.k();
                com.airbnb.lottie.d.a.a aVarA = null;
                com.airbnb.lottie.d.a.a aVarA2 = null;
                com.airbnb.lottie.d.a.b bVarB = null;
                com.airbnb.lottie.d.a.b bVarB2 = null;
                while (dVar.q()) {
                    int iC = dVar.c(f2335b);
                    if (iC == 0) {
                        aVarA = d.a(dVar, hVar);
                    } else if (iC == 1) {
                        aVarA2 = d.a(dVar, hVar);
                    } else if (iC == 2) {
                        bVarB = d.b(dVar, hVar);
                    } else if (iC != 3) {
                        dVar.o();
                        dVar.p();
                    } else {
                        bVarB2 = d.b(dVar, hVar);
                    }
                }
                dVar.m();
                kVar = new com.airbnb.lottie.d.a.k(aVarA, aVarA2, bVarB, bVarB2);
            }
        }
        dVar.m();
        return kVar == null ? new com.airbnb.lottie.d.a.k(null, null, null, null) : kVar;
    }
}
