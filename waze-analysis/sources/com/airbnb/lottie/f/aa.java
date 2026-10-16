package com.airbnb.lottie.f;

import android.graphics.PointF;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class aa implements ag {

    /* renamed from: a, reason: collision with root package name */
    public static final aa f2325a = new aa();

    /* renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2326b = com.airbnb.lottie.f.a.c.a("c", "v", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "o");

    @Override // com.airbnb.lottie.f.ag
    public final /* bridge */ /* synthetic */ Object a(com.airbnb.lottie.f.a.d dVar, float f2) {
        if (dVar.s() == 1) {
            dVar.j();
        }
        dVar.k();
        List listD = null;
        List listD2 = null;
        List listD3 = null;
        boolean zR = false;
        while (dVar.q()) {
            int iC = dVar.c(f2326b);
            if (iC == 0) {
                zR = dVar.r();
            } else if (iC == 1) {
                listD = q.d(dVar, f2);
            } else if (iC == 2) {
                listD2 = q.d(dVar, f2);
            } else if (iC != 3) {
                dVar.o();
                dVar.p();
            } else {
                listD3 = q.d(dVar, f2);
            }
        }
        dVar.m();
        if (dVar.s() == 2) {
            dVar.l();
        }
        if (listD == null || listD2 == null || listD3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listD.isEmpty()) {
            return new com.airbnb.lottie.d.b.m(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listD.size();
        PointF pointF = (PointF) listD.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 1; i2 < size; i2++) {
            PointF pointF2 = (PointF) listD.get(i2);
            int i3 = i2 - 1;
            arrayList.add(new com.airbnb.lottie.d.a(com.airbnb.lottie.g.f.b((PointF) listD.get(i3), (PointF) listD3.get(i3)), com.airbnb.lottie.g.f.b(pointF2, (PointF) listD2.get(i2)), pointF2));
        }
        if (zR) {
            PointF pointF3 = (PointF) listD.get(0);
            int i4 = size - 1;
            arrayList.add(new com.airbnb.lottie.d.a(com.airbnb.lottie.g.f.b((PointF) listD.get(i4), (PointF) listD3.get(i4)), com.airbnb.lottie.g.f.b(pointF3, (PointF) listD2.get(0)), pointF3));
        }
        return new com.airbnb.lottie.d.b.m(pointF, zR, arrayList);
    }
}
