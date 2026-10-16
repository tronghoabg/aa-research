package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class jih implements defpackage.jic {
    protected final float a = 1.0f / b(1.0f);

    static float b(float f) {
        return ((float) (-java.lang.Math.pow(100.0d, -f))) + 1.0f + (f * com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.jic
    public float a(float f, float f2, float f3) {
        if (f <= f2) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        if (f >= f3) {
            return 1.0f;
        }
        return b((f - f2) / (f3 - f2)) * this.a;
    }
}
