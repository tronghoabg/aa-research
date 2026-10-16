package com.airbnb.lottie.f;

import androidx.media3.exoplayer.upstream.CmcdData;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class af {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2333a = com.airbnb.lottie.f.a.c.a(CmcdData.STREAMING_FORMAT_SS, "e", "o", "nm", CmcdData.OBJECT_TYPE_MANIFEST, "hd");

    static com.airbnb.lottie.d.b.r a(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        int i2 = 0;
        boolean zR = false;
        com.airbnb.lottie.d.a.b bVarC = null;
        com.airbnb.lottie.d.a.b bVarC2 = null;
        com.airbnb.lottie.d.a.b bVarC3 = null;
        while (dVar.q()) {
            int iC = dVar.c(f2333a);
            if (iC == 0) {
                bVarC = d.c(dVar, hVar, false);
            } else if (iC == 1) {
                bVarC2 = d.c(dVar, hVar, false);
            } else if (iC == 2) {
                bVarC3 = d.c(dVar, hVar, false);
            } else if (iC == 3) {
                dVar.h();
            } else if (iC == 4) {
                int iB = dVar.b();
                if (iB == 1) {
                    i2 = 1;
                } else {
                    if (iB != 2) {
                        throw new IllegalArgumentException("Unknown trim path type " + iB);
                    }
                    i2 = 2;
                }
            } else if (iC != 5) {
                dVar.p();
            } else {
                zR = dVar.r();
            }
        }
        return new com.airbnb.lottie.d.b.r(i2, bVarC, bVarC2, bVarC3, zR);
    }
}
