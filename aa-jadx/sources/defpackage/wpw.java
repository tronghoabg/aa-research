package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wpw {
    private static final int c = 5;
    public final boolean a;
    public final int b;
    private final int d;
    private final int e;
    private final float f;

    public wpw(android.content.Context context) {
        boolean zBq = defpackage.sqs.bq(context, com.google.android.projection.gearhead.R.attr.elevationOverlayEnabled, false);
        int iBw = defpackage.sqs.bw(context, com.google.android.projection.gearhead.R.attr.elevationOverlayColor, 0);
        int iBw2 = defpackage.sqs.bw(context, com.google.android.projection.gearhead.R.attr.elevationOverlayAccentColor, 0);
        int iBw3 = defpackage.sqs.bw(context, com.google.android.projection.gearhead.R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.a = zBq;
        this.d = iBw;
        this.e = iBw2;
        this.b = iBw3;
        this.f = f;
    }

    public final int a(int i, float f) {
        int i2;
        if (!this.a || defpackage.dvk.e(i, 255) != this.b) {
            return i;
        }
        float f2 = this.f;
        float fMin = (f2 <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || f <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) ? 0.0f : java.lang.Math.min(((((float) java.lang.Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = android.graphics.Color.alpha(i);
        int iBx = defpackage.sqs.bx(defpackage.dvk.e(i, 255), this.d, fMin);
        if (fMin > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && (i2 = this.e) != 0) {
            iBx = defpackage.dvk.d(defpackage.dvk.e(i2, c), iBx);
        }
        return defpackage.dvk.e(iBx, iAlpha);
    }
}
