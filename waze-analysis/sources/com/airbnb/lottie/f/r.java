package com.airbnb.lottie.f;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.media3.exoplayer.upstream.CmcdData;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class r {

    /* renamed from: c, reason: collision with root package name */
    private static final Interpolator f2375c = new LinearInterpolator();

    /* renamed from: a, reason: collision with root package name */
    static final com.airbnb.lottie.f.a.c f2373a = com.airbnb.lottie.f.a.c.a("t", CmcdData.STREAMING_FORMAT_SS, "e", "o", CmcdData.OBJECT_TYPE_INIT_SEGMENT, CmcdData.STREAMING_FORMAT_HLS, TypedValues.TransitionType.S_TO, "ti");

    /* renamed from: b, reason: collision with root package name */
    static final com.airbnb.lottie.f.a.c f2374b = com.airbnb.lottie.f.a.c.a("x", "y");

    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.airbnb.lottie.h.a a(com.airbnb.lottie.f.a.d r20, com.airbnb.lottie.h r21, float r22, com.airbnb.lottie.f.ag r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.f.r.a(com.airbnb.lottie.f.a.d, com.airbnb.lottie.h, float, com.airbnb.lottie.f.ag, boolean, boolean):com.airbnb.lottie.h.a");
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        float f2 = pointF.x;
        int i2 = com.airbnb.lottie.g.f.f2413a;
        pointF.x = Math.max(-1.0f, Math.min(1.0f, f2));
        pointF.y = Math.max(-100.0f, Math.min(100.0f, pointF.y));
        pointF2.x = Math.max(-1.0f, Math.min(1.0f, pointF2.x));
        pointF2.y = Math.max(-100.0f, Math.min(100.0f, pointF2.y));
        float f3 = pointF.x;
        float f4 = pointF.y;
        float f5 = pointF2.x;
        float f6 = pointF2.y;
        int i3 = com.airbnb.lottie.g.k.f2415a;
        try {
            return PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e2) {
            return "The Path cannot loop back on itself.".equals(e2.getMessage()) ? PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }
}
