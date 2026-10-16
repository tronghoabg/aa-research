package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class omj implements android.view.animation.Interpolator {
    final float a = 1.0f / a(1.0f);

    static float a(float f) {
        return ((float) (-java.lang.Math.pow(100.0d, -f))) + 1.0f + (f * com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return a(f) * this.a;
    }
}
