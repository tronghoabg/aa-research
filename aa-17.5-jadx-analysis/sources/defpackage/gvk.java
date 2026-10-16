package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class gvk {
    public final float a;
    public final float b;
    private final float c = BitmapDescriptorFactory.HUE_RED;
    private final float d;

    public /* synthetic */ gvk(float f, float f2, int i) {
        this.a = (i & 2) != 0 ? 0.0f : f;
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.b = (i & 8) != 0 ? 0.0f : f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvk)) {
            return false;
        }
        gvk gvkVar = (gvk) obj;
        float f = gvkVar.c;
        if (!dlj.c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) || !dlj.c(this.a, gvkVar.a)) {
            return false;
        }
        float f2 = gvkVar.d;
        return dlj.c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) && dlj.c(this.b, gvkVar.b);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        float f = this.b;
        float f2 = this.a;
        return "OverlayInsets(top=" + dlj.b(BitmapDescriptorFactory.HUE_RED) + ", bottom=" + dlj.b(f2) + ", start=" + dlj.b(BitmapDescriptorFactory.HUE_RED) + ", end=" + dlj.b(f) + ")";
    }
}
