package com.airbnb.lottie.f;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2369a = com.airbnb.lottie.f.a.c.a("nm", "g", "o", "t", CmcdData.STREAMING_FORMAT_SS, "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2370b = com.airbnb.lottie.f.a.c.a(TtmlNode.TAG_P, "k");

    /* renamed from: c, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2371c = com.airbnb.lottie.f.a.c.a("n", "v");

    static com.airbnb.lottie.d.b.f a(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        com.airbnb.lottie.d.a.d dVar2;
        ArrayList arrayList = new ArrayList();
        com.airbnb.lottie.d.a.c cVarD = null;
        float fA = 0.0f;
        com.airbnb.lottie.d.a.d dVarE = null;
        String strH = null;
        com.airbnb.lottie.d.a.f fVarF = null;
        com.airbnb.lottie.d.a.f fVarF2 = null;
        com.airbnb.lottie.d.a.b bVarB = null;
        com.airbnb.lottie.d.a.b bVar = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean zR = false;
        while (dVar.q()) {
            switch (dVar.c(f2369a)) {
                case 0:
                    dVar2 = dVarE;
                    strH = dVar.h();
                    break;
                case 1:
                    dVar2 = dVarE;
                    dVar.k();
                    int iB = -1;
                    while (dVar.q()) {
                        int iC = dVar.c(f2370b);
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
                    dVarE = d.e(dVar, hVar);
                    continue;
                case 3:
                    dVar2 = dVarE;
                    if (dVar.b() != 1) {
                        i2 = 2;
                        break;
                    } else {
                        dVarE = dVar2;
                        i2 = 1;
                    }
                case 4:
                    fVarF = d.f(dVar, hVar);
                    continue;
                case 5:
                    fVarF2 = d.f(dVar, hVar);
                    continue;
                case 6:
                    bVarB = d.b(dVar, hVar);
                    continue;
                case 7:
                    dVar2 = dVarE;
                    i3 = com.google.android.gms.identitycredentials.a.k.b()[dVar.b() - 1];
                    break;
                case 8:
                    dVar2 = dVarE;
                    i4 = com.google.android.gms.identitycredentials.a.k.b()[dVar.b() - 1];
                    break;
                case 9:
                    dVar2 = dVarE;
                    fA = (float) dVar.a();
                    break;
                case 10:
                    zR = dVar.r();
                    continue;
                case 11:
                    dVar.j();
                    while (dVar.q()) {
                        dVar.k();
                        String strH2 = null;
                        com.airbnb.lottie.d.a.b bVarB2 = null;
                        while (dVar.q()) {
                            int iC2 = dVar.c(f2371c);
                            if (iC2 != 0) {
                                com.airbnb.lottie.d.a.d dVar3 = dVarE;
                                if (iC2 != 1) {
                                    dVar.o();
                                    dVar.p();
                                } else {
                                    bVarB2 = d.b(dVar, hVar);
                                }
                                dVarE = dVar3;
                            } else {
                                strH2 = dVar.h();
                            }
                        }
                        com.airbnb.lottie.d.a.d dVar4 = dVarE;
                        dVar.m();
                        if (strH2.equals("o")) {
                            bVar = bVarB2;
                        } else if (strH2.equals("d") || strH2.equals("g")) {
                            arrayList.add(bVarB2);
                        }
                        dVarE = dVar4;
                    }
                    dVar2 = dVarE;
                    dVar.l();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((com.airbnb.lottie.d.a.b) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    dVar2 = dVarE;
                    dVar.o();
                    dVar.p();
                    break;
            }
            dVarE = dVar2;
        }
        com.airbnb.lottie.d.a.d dVar5 = dVarE;
        return new com.airbnb.lottie.d.b.f(strH, i2, cVarD, dVar5 == null ? new com.airbnb.lottie.d.a.d(Collections.singletonList(new com.airbnb.lottie.h.a(100))) : dVar5, fVarF, fVarF2, bVarB, i3, i4, fA, arrayList, bVar, zR);
    }
}
