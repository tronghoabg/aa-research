package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uxs {
    public final float[] a = {1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f};

    public final void a(int i, int i2, float f) {
        this.a[(i * 3) + i2] = f;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < 9; i += 3) {
            float[] fArr = this.a;
            sb.append(fArr[i] + ", " + fArr[i + 1] + ", " + fArr[i + 2] + "\n");
        }
        return sb.toString();
    }
}
