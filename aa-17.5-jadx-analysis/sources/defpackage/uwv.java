package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class uwv {
    public final float[] a = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};

    public final void a(int i, int i2, float f) {
        this.a[(i * 3) + i2] = f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i += 3) {
            float[] fArr = this.a;
            sb.append(fArr[i] + ", " + fArr[i + 1] + ", " + fArr[i + 2] + "\n");
        }
        return sb.toString();
    }
}
