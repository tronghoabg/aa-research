package com.airbnb.lottie.f;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2387a = com.airbnb.lottie.f.a.c.a("nm", TtmlNode.TAG_P, CmcdData.STREAMING_FORMAT_SS, "r", "hd");

    static com.airbnb.lottie.d.b.j a(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        boolean zR = false;
        String strH = null;
        com.airbnb.lottie.d.a.m mVarB = null;
        com.airbnb.lottie.d.a.f fVarF = null;
        com.airbnb.lottie.d.a.b bVarC = null;
        while (dVar.q()) {
            int iC = dVar.c(f2387a);
            if (iC == 0) {
                strH = dVar.h();
            } else if (iC == 1) {
                mVarB = a.b(dVar, hVar);
            } else if (iC == 2) {
                fVarF = d.f(dVar, hVar);
            } else if (iC == 3) {
                bVarC = d.c(dVar, hVar, true);
            } else if (iC != 4) {
                dVar.p();
            } else {
                zR = dVar.r();
            }
        }
        return new com.airbnb.lottie.d.b.j(strH, mVarB, fVarF, bVarC, zR);
    }
}
