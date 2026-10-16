package com.airbnb.lottie.f;

import android.content.res.Resources;
import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2382b = com.airbnb.lottie.f.a.c.a("w", CmcdData.STREAMING_FORMAT_HLS, "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: a, reason: collision with root package name */
    static final com.airbnb.lottie.f.a.c f2381a = com.airbnb.lottie.f.a.c.a(TtmlNode.ATTR_ID, "layers", "w", CmcdData.STREAMING_FORMAT_HLS, TtmlNode.TAG_P, "u");

    /* renamed from: c, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2383c = com.airbnb.lottie.f.a.c.a("list");

    /* renamed from: d, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2384d = com.airbnb.lottie.f.a.c.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0052. Please report as an issue. */
    public static com.airbnb.lottie.h a(com.airbnb.lottie.f.a.d dVar) throws Throwable {
        float f2;
        float f3;
        SparseArrayCompat sparseArrayCompat;
        SparseArrayCompat sparseArrayCompat2;
        float f4;
        int i2 = com.airbnb.lottie.g.k.f2415a;
        float f5 = Resources.getSystem().getDisplayMetrics().density;
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArrayCompat sparseArrayCompat3 = new SparseArrayCompat();
        com.airbnb.lottie.h hVar = new com.airbnb.lottie.h();
        dVar.k();
        float fA = 0.0f;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        int iB = 0;
        int iB2 = 0;
        while (dVar.q()) {
            float f6 = f5;
            switch (dVar.c(f2382b)) {
                case 0:
                    iB = dVar.b();
                    f5 = f6;
                    break;
                case 1:
                    iB2 = dVar.b();
                    f5 = f6;
                    break;
                case 2:
                    fA = (float) dVar.a();
                    f5 = f6;
                    break;
                case 3:
                    f4 = fA;
                    fA2 = ((float) dVar.a()) - 0.01f;
                    f5 = f6;
                    fA = f4;
                    break;
                case 4:
                    f4 = fA;
                    fA3 = (float) dVar.a();
                    f5 = f6;
                    fA = f4;
                    break;
                case 5:
                    f2 = fA;
                    f3 = fA2;
                    sparseArrayCompat = sparseArrayCompat3;
                    String[] strArrSplit = dVar.h().split("\\.");
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    int i4 = Integer.parseInt(strArrSplit[1]);
                    int i5 = Integer.parseInt(strArrSplit[2]);
                    if (i3 < 4 || (i3 <= 4 && (i4 < 4 || (i4 <= 4 && i5 < 0)))) {
                        hVar.p("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f5 = f6;
                    fA = f2;
                    fA2 = f3;
                    sparseArrayCompat3 = sparseArrayCompat;
                    break;
                case 6:
                    f2 = fA;
                    f3 = fA2;
                    sparseArrayCompat = sparseArrayCompat3;
                    dVar.j();
                    int i6 = 0;
                    while (dVar.q()) {
                        com.airbnb.lottie.d.c.e eVarA = t.a(dVar, hVar);
                        if (eVarA.y() == 3) {
                            i6++;
                        }
                        arrayList.add(eVarA);
                        longSparseArray.put(eVarA.h(), eVarA);
                        if (i6 > 4) {
                            com.airbnb.lottie.g.c.a("You have " + i6 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    dVar.l();
                    f5 = f6;
                    fA = f2;
                    fA2 = f3;
                    sparseArrayCompat3 = sparseArrayCompat;
                    break;
                case 7:
                    f2 = fA;
                    f3 = fA2;
                    dVar.j();
                    while (dVar.q()) {
                        ArrayList arrayList3 = new ArrayList();
                        LongSparseArray longSparseArray2 = new LongSparseArray();
                        dVar.k();
                        int iB3 = 0;
                        int iB4 = 0;
                        String strH = null;
                        String strH2 = null;
                        String strH3 = null;
                        while (dVar.q()) {
                            int iC = dVar.c(f2381a);
                            if (iC != 0) {
                                if (iC == 1) {
                                    dVar.j();
                                    while (dVar.q()) {
                                        com.airbnb.lottie.d.c.e eVarA2 = t.a(dVar, hVar);
                                        longSparseArray2.put(eVarA2.h(), eVarA2);
                                        arrayList3.add(eVarA2);
                                        sparseArrayCompat3 = sparseArrayCompat3;
                                    }
                                    sparseArrayCompat2 = sparseArrayCompat3;
                                    dVar.l();
                                } else if (iC == 2) {
                                    iB3 = dVar.b();
                                } else if (iC == 3) {
                                    iB4 = dVar.b();
                                } else if (iC == 4) {
                                    strH2 = dVar.h();
                                } else if (iC != 5) {
                                    dVar.o();
                                    dVar.p();
                                    sparseArrayCompat2 = sparseArrayCompat3;
                                } else {
                                    strH3 = dVar.h();
                                }
                                sparseArrayCompat3 = sparseArrayCompat2;
                            } else {
                                strH = dVar.h();
                            }
                        }
                        SparseArrayCompat sparseArrayCompat4 = sparseArrayCompat3;
                        dVar.m();
                        if (strH2 != null) {
                            com.airbnb.lottie.t tVar = new com.airbnb.lottie.t(iB3, iB4, strH, strH2, strH3);
                            map2.put(tVar.f(), tVar);
                        } else {
                            map.put(strH, arrayList3);
                        }
                        sparseArrayCompat3 = sparseArrayCompat4;
                    }
                    sparseArrayCompat = sparseArrayCompat3;
                    dVar.l();
                    f5 = f6;
                    fA = f2;
                    fA2 = f3;
                    sparseArrayCompat3 = sparseArrayCompat;
                    break;
                case 8:
                    f2 = fA;
                    f3 = fA2;
                    dVar.k();
                    while (dVar.q()) {
                        if (dVar.c(f2383c) != 0) {
                            dVar.o();
                            dVar.p();
                        } else {
                            dVar.j();
                            while (dVar.q()) {
                                com.airbnb.lottie.d.c cVarA = m.a(dVar);
                                map3.put(cVarA.c(), cVarA);
                            }
                            dVar.l();
                        }
                    }
                    dVar.m();
                    sparseArrayCompat = sparseArrayCompat3;
                    f5 = f6;
                    fA = f2;
                    fA2 = f3;
                    sparseArrayCompat3 = sparseArrayCompat;
                    break;
                case 9:
                    f2 = fA;
                    f3 = fA2;
                    dVar.j();
                    while (dVar.q()) {
                        com.airbnb.lottie.d.d dVarA = l.a(dVar, hVar);
                        sparseArrayCompat3.put(dVarA.hashCode(), dVarA);
                    }
                    dVar.l();
                    sparseArrayCompat = sparseArrayCompat3;
                    f5 = f6;
                    fA = f2;
                    fA2 = f3;
                    sparseArrayCompat3 = sparseArrayCompat;
                    break;
                case 10:
                    dVar.j();
                    while (dVar.q()) {
                        dVar.k();
                        float fA4 = 0.0f;
                        String strH4 = null;
                        while (dVar.q()) {
                            float f7 = fA;
                            int iC2 = dVar.c(f2384d);
                            if (iC2 != 0) {
                                float f8 = fA2;
                                if (iC2 == 1) {
                                    fA4 = (float) dVar.a();
                                } else if (iC2 != 2) {
                                    dVar.o();
                                    dVar.p();
                                } else {
                                    dVar.a();
                                }
                                fA = f7;
                                fA2 = f8;
                            } else {
                                strH4 = dVar.h();
                                fA = f7;
                            }
                        }
                        dVar.m();
                        arrayList2.add(new com.airbnb.lottie.d.h(strH4, fA4));
                        fA = fA;
                    }
                    f2 = fA;
                    f3 = fA2;
                    dVar.l();
                    sparseArrayCompat = sparseArrayCompat3;
                    f5 = f6;
                    fA = f2;
                    fA2 = f3;
                    sparseArrayCompat3 = sparseArrayCompat;
                    break;
                default:
                    f2 = fA;
                    f3 = fA2;
                    sparseArrayCompat = sparseArrayCompat3;
                    dVar.o();
                    dVar.p();
                    f5 = f6;
                    fA = f2;
                    fA2 = f3;
                    sparseArrayCompat3 = sparseArrayCompat;
                    break;
            }
        }
        float f9 = f5;
        hVar.r(new Rect(0, 0, (int) (iB * f9), (int) (iB2 * f9)), fA, fA2, fA3, arrayList, longSparseArray, map, map2, Resources.getSystem().getDisplayMetrics().density, sparseArrayCompat3, map3, arrayList2);
        return hVar;
    }
}
