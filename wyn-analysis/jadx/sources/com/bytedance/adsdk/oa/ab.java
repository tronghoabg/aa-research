package com.bytedance.adsdk.oa;

import N0.a;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
class ab implements Interpolator {

    /* renamed from: oa, reason: collision with root package name */
    private final float[] f24524oa;
    private final float[] uef;

    public ab(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i5 = (int) (length / 0.002f);
        int i10 = i5 + 1;
        this.uef = new float[i10];
        this.f24524oa = new float[i10];
        float[] fArr = new float[2];
        for (int i11 = 0; i11 < i10; i11++) {
            pathMeasure.getPosTan((i11 * length) / i5, fArr, null);
            this.uef[i11] = fArr[0];
            this.f24524oa[i11] = fArr[1];
        }
    }

    private static Path uef(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int length = this.uef.length - 1;
        int i5 = 0;
        while (length - i5 > 1) {
            int i10 = (i5 + length) / 2;
            if (f10 < this.uef[i10]) {
                length = i10;
            } else {
                i5 = i10;
            }
        }
        float[] fArr = this.uef;
        float f11 = fArr[length];
        float f12 = fArr[i5];
        float f13 = f11 - f12;
        if (f13 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return this.f24524oa[i5];
        }
        float f14 = (f10 - f12) / f13;
        float[] fArr2 = this.f24524oa;
        float f15 = fArr2[i5];
        return a.b(fArr2[length], f15, f14, f15);
    }

    public ab(float f10, float f11, float f12, float f13) {
        this(uef(f10, f11, f12, f13));
    }
}
