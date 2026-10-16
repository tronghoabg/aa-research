package com.airbnb.lottie.f;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2386a = com.airbnb.lottie.f.a.c.a("nm", "sy", "pt", TtmlNode.TAG_P, "r", "or", "os", "ir", "is", "hd", "d");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    static com.airbnb.lottie.d.b.i a(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar, int i2) {
        int i3 = 1;
        boolean z = false;
        int i4 = 0;
        boolean zR = false;
        boolean z2 = i2 == 3;
        String strH = null;
        com.airbnb.lottie.d.a.b bVarC = null;
        com.airbnb.lottie.d.a.m mVarB = null;
        com.airbnb.lottie.d.a.b bVarC2 = null;
        com.airbnb.lottie.d.a.b bVarC3 = null;
        com.airbnb.lottie.d.a.b bVarC4 = null;
        com.airbnb.lottie.d.a.b bVarC5 = null;
        com.airbnb.lottie.d.a.b bVarC6 = null;
        while (dVar.q()) {
            switch (dVar.c(f2386a)) {
                case 0:
                    strH = dVar.h();
                    break;
                case 1:
                    int iB = dVar.b();
                    int[] iArr = {i3, 2};
                    for (?? r2 = z; r2 < 2; r2++) {
                        int i5 = iArr[r2];
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i5 == iB) {
                            i4 = i5;
                            break;
                        }
                    }
                    i3 = 1;
                    z = false;
                    i4 = 0;
                case 2:
                    bVarC = d.c(dVar, hVar, z);
                    continue;
                case 3:
                    mVarB = a.b(dVar, hVar);
                    continue;
                case 4:
                    bVarC2 = d.c(dVar, hVar, z);
                    continue;
                case 5:
                    bVarC4 = d.c(dVar, hVar, i3);
                    continue;
                case 6:
                    bVarC6 = d.c(dVar, hVar, z);
                    continue;
                case 7:
                    bVarC3 = d.c(dVar, hVar, i3);
                    continue;
                case 8:
                    bVarC5 = d.c(dVar, hVar, z);
                    continue;
                case 9:
                    zR = dVar.r();
                    continue;
                case 10:
                    if (dVar.b() == 3) {
                        z2 = i3;
                    } else {
                        z2 = z;
                        continue;
                    }
                default:
                    dVar.o();
                    dVar.p();
                    break;
            }
            i3 = 1;
            z = false;
        }
        return new com.airbnb.lottie.d.b.i(strH, i4, bVarC, mVarB, bVarC2, bVarC3, bVarC4, bVarC5, bVarC6, zR, z2);
    }
}
