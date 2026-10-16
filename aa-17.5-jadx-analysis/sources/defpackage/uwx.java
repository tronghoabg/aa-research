package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class uwx {
    public final float[] a;

    public uwx(byte[] bArr) {
        this.a = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 0.0f};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uwx) {
            return Arrays.equals(((uwx) obj).a, this.a);
        }
        return false;
    }

    public final String toString() {
        float[] fArr = this.a;
        return "[" + fArr[0] + ", " + fArr[1] + ", " + fArr[2] + "]";
    }

    public uwx() {
        this.a = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.0f};
    }
}
