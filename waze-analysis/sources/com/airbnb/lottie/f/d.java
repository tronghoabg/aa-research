package com.airbnb.lottie.f;

import android.content.res.Resources;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class d {
    static com.airbnb.lottie.d.a.a a(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        return new com.airbnb.lottie.d.a.a(s.a(dVar, hVar, 1.0f, k.f2357b, false));
    }

    public static com.airbnb.lottie.d.a.b b(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        return c(dVar, hVar, true);
    }

    public static com.airbnb.lottie.d.a.b c(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar, boolean z) {
        float f2;
        if (z) {
            int i2 = com.airbnb.lottie.g.k.f2415a;
            f2 = Resources.getSystem().getDisplayMetrics().density;
        } else {
            f2 = 1.0f;
        }
        return new com.airbnb.lottie.d.a.b(s.a(dVar, hVar, f2, k.f2356a, false));
    }

    static com.airbnb.lottie.d.a.c d(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar, int i2) {
        return new com.airbnb.lottie.d.a.c(s.a(dVar, hVar, 1.0f, new n(i2), false));
    }

    static com.airbnb.lottie.d.a.d e(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        return new com.airbnb.lottie.d.a.d(s.a(dVar, hVar, 1.0f, k.f2358c, false));
    }

    static com.airbnb.lottie.d.a.f f(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        int i2 = com.airbnb.lottie.g.k.f2415a;
        return new com.airbnb.lottie.d.a.f(s.a(dVar, hVar, Resources.getSystem().getDisplayMetrics().density, k.f2360e, true));
    }

    static com.airbnb.lottie.d.a.h g(com.airbnb.lottie.f.a.d dVar, com.airbnb.lottie.h hVar) {
        int i2 = com.airbnb.lottie.g.k.f2415a;
        return new com.airbnb.lottie.d.a.h(s.a(dVar, hVar, Resources.getSystem().getDisplayMetrics().density, aa.f2325a, false));
    }

    public static int h(float f2, int i2, int i3) {
        if (i2 == i3 || f2 <= 0.0f) {
            return i2;
        }
        if (f2 >= 1.0f) {
            return i3;
        }
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float f4 = ((((i3 >> 24) & 255) / 255.0f) - f3) * f2;
        float fI = i(((i2 >> 16) & 255) / 255.0f);
        float fI2 = i(((i2 >> 8) & 255) / 255.0f);
        float fI3 = i((i2 & 255) / 255.0f);
        float fI4 = fI + ((i(((i3 >> 16) & 255) / 255.0f) - fI) * f2);
        float fI5 = fI2 + ((i(((i3 >> 8) & 255) / 255.0f) - fI2) * f2);
        float fI6 = fI3 + (f2 * (i((i3 & 255) / 255.0f) - fI3));
        float fJ = j(fI4) * 255.0f;
        float fJ2 = j(fI5) * 255.0f;
        float fJ3 = j(fI6) * 255.0f;
        return (Math.round(fJ) << 16) | (Math.round((f3 + f4) * 255.0f) << 24) | (Math.round(fJ2) << 8) | Math.round(fJ3);
    }

    private static float i(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float j(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }
}
