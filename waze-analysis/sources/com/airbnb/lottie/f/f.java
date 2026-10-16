package com.airbnb.lottie.f;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2340a = com.airbnb.lottie.f.a.c.a("nm", TtmlNode.TAG_P, CmcdData.STREAMING_FORMAT_SS, "hd", "d");

    static com.airbnb.lottie.d.b.b a(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar, int i2) {
        boolean z = i2 == 3;
        boolean zR = false;
        String strH = null;
        com.airbnb.lottie.d.a.m mVarB = null;
        com.airbnb.lottie.d.a.f fVarF = null;
        while (dVar.q()) {
            int iC = dVar.c(f2340a);
            if (iC == 0) {
                strH = dVar.h();
            } else if (iC == 1) {
                mVarB = a.b(dVar, hVar);
            } else if (iC == 2) {
                fVarF = d.f(dVar, hVar);
            } else if (iC == 3) {
                zR = dVar.r();
            } else if (iC != 4) {
                dVar.o();
                dVar.p();
            } else {
                z = dVar.b() == 3;
            }
        }
        return new com.airbnb.lottie.d.b.b(strH, mVarB, fVarF, z, zR);
    }
}
