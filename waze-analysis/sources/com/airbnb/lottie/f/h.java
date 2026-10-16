package com.airbnb.lottie.f;

import android.graphics.PointF;
import androidx.media3.exoplayer.upstream.CmcdData;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class h implements ag {

    /* renamed from: a, reason: collision with root package name */
    public static final h f2342a = new h();

    /* renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2343b = com.airbnb.lottie.f.a.c.a("t", "f", CmcdData.STREAMING_FORMAT_SS, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // com.airbnb.lottie.f.ag
    public final /* synthetic */ Object a(com.airbnb.lottie.f.a.d dVar, float f2) {
        dVar.k();
        String strH = null;
        String strH2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        boolean zR = true;
        float fA = 0.0f;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        float fA4 = 0.0f;
        int iB = 0;
        int iB2 = 0;
        int iB3 = 0;
        while (true) {
            int i2 = 3;
            while (dVar.q()) {
                switch (dVar.c(f2343b)) {
                    case 0:
                        strH = dVar.h();
                        break;
                    case 1:
                        strH2 = dVar.h();
                        break;
                    case 2:
                        fA = (float) dVar.a();
                        break;
                    case 3:
                        int iB4 = dVar.b();
                        if (iB4 <= 2 && iB4 >= 0) {
                            i2 = com.google.android.gms.identitycredentials.a.k.b()[iB4];
                            break;
                        } else {
                            break;
                        }
                        break;
                    case 4:
                        iB = dVar.b();
                        break;
                    case 5:
                        fA2 = (float) dVar.a();
                        break;
                    case 6:
                        fA3 = (float) dVar.a();
                        break;
                    case 7:
                        iB2 = q.b(dVar);
                        break;
                    case 8:
                        iB3 = q.b(dVar);
                        break;
                    case 9:
                        fA4 = (float) dVar.a();
                        break;
                    case 10:
                        zR = dVar.r();
                        break;
                    case 11:
                        dVar.j();
                        PointF pointF3 = new PointF(((float) dVar.a()) * f2, ((float) dVar.a()) * f2);
                        dVar.l();
                        pointF = pointF3;
                        break;
                    case 12:
                        dVar.j();
                        PointF pointF4 = new PointF(((float) dVar.a()) * f2, ((float) dVar.a()) * f2);
                        dVar.l();
                        pointF2 = pointF4;
                        break;
                    default:
                        dVar.o();
                        dVar.p();
                        break;
                }
            }
            dVar.m();
            return new com.airbnb.lottie.d.b(strH, strH2, fA, i2, iB, fA2, fA3, iB2, iB3, fA4, zR, pointF, pointF2);
        }
    }
}
