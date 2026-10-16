package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gvu {
    public final float a;
    public final float b;
    private final float c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    private final float d;

    public /* synthetic */ gvu(float f, float f2, int i) {
        this.a = (i & 2) != 0 ? 0.0f : f;
        this.d = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.b = (i & 8) != 0 ? 0.0f : f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.gvu)) {
            return false;
        }
        defpackage.gvu gvuVar = (defpackage.gvu) obj;
        float f = gvuVar.c;
        if (!defpackage.dlr.c(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) || !defpackage.dlr.c(this.a, gvuVar.a)) {
            return false;
        }
        float f2 = gvuVar.d;
        return defpackage.dlr.c(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) && defpackage.dlr.c(this.b, gvuVar.b);
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 961) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        float f = this.b;
        float f2 = this.a;
        return "OverlayInsets(top=" + defpackage.dlr.b(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) + ", bottom=" + defpackage.dlr.b(f2) + ", start=" + defpackage.dlr.b(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) + ", end=" + defpackage.dlr.b(f) + ")";
    }
}
