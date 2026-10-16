package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class ckg {
    public static final ckg a = new ckg();
    public final float b = BitmapDescriptorFactory.HUE_RED;
    public final float c = BitmapDescriptorFactory.HUE_RED;
    public final float d = BitmapDescriptorFactory.HUE_RED;
    public final float e = BitmapDescriptorFactory.HUE_RED;

    private ckg() {
        if (dlj.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) < 0 || dlj.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) < 0 || dlj.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) < 0 || dlj.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) < 0) {
            ckf.a("Layer outsets must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckg)) {
            return false;
        }
        ckg ckgVar = (ckg) obj;
        float f = ckgVar.b;
        if (Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0) {
            float f2 = ckgVar.c;
            if (Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0) {
                float f3 = ckgVar.d;
                if (Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0) {
                    float f4 = ckgVar.e;
                    if (Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) * 31) + Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) * 31) + Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) * 31) + Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
    }

    public final String toString() {
        return "LayerOutsets(left=" + dlj.b(BitmapDescriptorFactory.HUE_RED) + ", top=" + dlj.b(BitmapDescriptorFactory.HUE_RED) + ", right=" + dlj.b(BitmapDescriptorFactory.HUE_RED) + ", bottom=" + dlj.b(BitmapDescriptorFactory.HUE_RED) + ")";
    }
}
