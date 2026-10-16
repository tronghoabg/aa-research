package com.airbnb.lottie.f;

import android.graphics.Path;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2367a = com.airbnb.lottie.f.a.c.a("nm", "g", "o", "t", CmcdData.STREAMING_FORMAT_SS, "e", "r", "hd");

    /* renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2368b = com.airbnb.lottie.f.a.c.a(TtmlNode.TAG_P, "k");

    static com.airbnb.lottie.d.b.e a(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        com.airbnb.lottie.d.a.d dVar2 = null;
        Path.FillType fillType = Path.FillType.WINDING;
        int i2 = 0;
        boolean zR = false;
        String strH = null;
        com.airbnb.lottie.d.a.c cVarD = null;
        com.airbnb.lottie.d.a.f fVarF = null;
        com.airbnb.lottie.d.a.f fVarF2 = null;
        while (dVar.q()) {
            switch (dVar.c(f2367a)) {
                case 0:
                    strH = dVar.h();
                    break;
                case 1:
                    dVar.k();
                    int iB = -1;
                    while (dVar.q()) {
                        int iC = dVar.c(f2368b);
                        if (iC == 0) {
                            iB = dVar.b();
                        } else if (iC != 1) {
                            dVar.o();
                            dVar.p();
                        } else {
                            cVarD = d.d(dVar, hVar, iB);
                        }
                    }
                    dVar.m();
                    break;
                case 2:
                    dVar2 = d.e(dVar, hVar);
                    break;
                case 3:
                    if (dVar.b() != 1) {
                        i2 = 2;
                        break;
                    } else {
                        i2 = 1;
                        break;
                    }
                case 4:
                    fVarF = d.f(dVar, hVar);
                    break;
                case 5:
                    fVarF2 = d.f(dVar, hVar);
                    break;
                case 6:
                    if (dVar.b() != 1) {
                        fillType = Path.FillType.EVEN_ODD;
                        break;
                    } else {
                        fillType = Path.FillType.WINDING;
                        break;
                    }
                case 7:
                    zR = dVar.r();
                    break;
                default:
                    dVar.o();
                    dVar.p();
                    break;
            }
        }
        if (dVar2 == null) {
            dVar2 = new com.airbnb.lottie.d.a.d(Collections.singletonList(new com.airbnb.lottie.h.a(100)));
        }
        return new com.airbnb.lottie.d.b.e(strH, i2, fillType, cVarD, dVar2, fVarF, fVarF2, zR);
    }
}
