package com.airbnb.lottie.f;

import androidx.camera.video.AudioStats;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2363a = com.airbnb.lottie.f.a.c.a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2364b = com.airbnb.lottie.f.a.c.a("shapes");

    static com.airbnb.lottie.d.d a(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        ArrayList arrayList = new ArrayList();
        dVar.k();
        double dA = AudioStats.AUDIO_AMPLITUDE_NONE;
        String strH = null;
        String strH2 = null;
        char cCharAt = 0;
        while (dVar.q()) {
            int iC = dVar.c(f2363a);
            if (iC == 0) {
                cCharAt = dVar.h().charAt(0);
            } else if (iC == 1) {
                dVar.a();
            } else if (iC == 2) {
                dA = dVar.a();
            } else if (iC == 3) {
                strH = dVar.h();
            } else if (iC == 4) {
                strH2 = dVar.h();
            } else if (iC != 5) {
                dVar.o();
                dVar.p();
            } else {
                dVar.k();
                while (dVar.q()) {
                    if (dVar.c(f2364b) != 0) {
                        dVar.o();
                        dVar.p();
                    } else {
                        dVar.j();
                        while (dVar.q()) {
                            arrayList.add((com.airbnb.lottie.d.b.o) g.a(dVar, hVar));
                        }
                        dVar.l();
                    }
                }
                dVar.m();
            }
        }
        dVar.m();
        return new com.airbnb.lottie.d.d(arrayList, cCharAt, dA, strH, strH2);
    }
}
