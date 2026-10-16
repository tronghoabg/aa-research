package com.airbnb.lottie.f;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.f.a.c f2372a = com.airbnb.lottie.f.a.c.a("x", "y");

    static float a(com.airbnb.lottie.f.a.d dVar) {
        int iS = dVar.s();
        int i2 = iS - 1;
        if (i2 != 0) {
            if (i2 == 6) {
                return (float) dVar.a();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(com.waze.c.c.e.c(iS)));
        }
        dVar.j();
        float fA = (float) dVar.a();
        while (dVar.q()) {
            dVar.p();
        }
        dVar.l();
        return fA;
    }

    static int b(com.airbnb.lottie.f.a.d dVar) {
        dVar.j();
        double dA = dVar.a() * 255.0d;
        double dA2 = dVar.a() * 255.0d;
        double dA3 = dVar.a() * 255.0d;
        while (dVar.q()) {
            dVar.p();
        }
        int i2 = (int) dA2;
        int i3 = (int) dA;
        dVar.l();
        return Color.argb(255, i3, i2, (int) dA3);
    }

    static PointF c(com.airbnb.lottie.f.a.d dVar, float f2) {
        int iS = dVar.s() - 1;
        if (iS == 0) {
            dVar.j();
            float fA = (float) dVar.a();
            float fA2 = (float) dVar.a();
            while (dVar.s() != 2) {
                dVar.p();
            }
            dVar.l();
            return new PointF(fA * f2, fA2 * f2);
        }
        if (iS != 2) {
            if (iS != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(com.waze.c.c.e.c(dVar.s())));
            }
            float fA3 = (float) dVar.a();
            float fA4 = (float) dVar.a();
            while (dVar.q()) {
                dVar.p();
            }
            return new PointF(fA3 * f2, fA4 * f2);
        }
        dVar.k();
        float fA5 = 0.0f;
        float fA6 = 0.0f;
        while (dVar.q()) {
            int iC = dVar.c(f2372a);
            if (iC == 0) {
                fA5 = a(dVar);
            } else if (iC != 1) {
                dVar.o();
                dVar.p();
            } else {
                fA6 = a(dVar);
            }
        }
        dVar.m();
        return new PointF(fA5 * f2, fA6 * f2);
    }

    static List d(com.airbnb.lottie.f.a.d dVar, float f2) {
        ArrayList arrayList = new ArrayList();
        dVar.j();
        while (dVar.s() == 1) {
            dVar.j();
            arrayList.add(c(dVar, f2));
            dVar.l();
        }
        dVar.l();
        return arrayList;
    }
}
