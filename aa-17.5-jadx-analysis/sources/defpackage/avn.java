package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class avn implements avp {
    private final float a = BitmapDescriptorFactory.HUE_RED;
    private final float b = BitmapDescriptorFactory.HUE_RED;
    private final float c = BitmapDescriptorFactory.HUE_RED;
    private final float d = BitmapDescriptorFactory.HUE_RED;

    @Override // defpackage.avp
    public final float a() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.avp
    public final float b(dlr dlrVar) {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.avp
    public final float c(dlr dlrVar) {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.avp
    public final float d() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof avn)) {
            return false;
        }
        avn avnVar = (avn) obj;
        float f = avnVar.a;
        if (Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0) {
            float f2 = avnVar.b;
            if (Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0) {
                float f3 = avnVar.c;
                if (Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0) {
                    float f4 = avnVar.d;
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
        return "PaddingValues.Absolute(left=" + dlj.b(BitmapDescriptorFactory.HUE_RED) + ", top=" + dlj.b(BitmapDescriptorFactory.HUE_RED) + ", right=" + dlj.b(BitmapDescriptorFactory.HUE_RED) + ", bottom=" + dlj.b(BitmapDescriptorFactory.HUE_RED) + ")";
    }
}
