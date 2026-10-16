package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cko {
    public static final defpackage.cko a = new defpackage.cko();
    public final float b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    public final float c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    public final float d = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    public final float e = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;

    private cko() {
        if (defpackage.dlr.a(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) < 0 || defpackage.dlr.a(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) < 0 || defpackage.dlr.a(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) < 0 || defpackage.dlr.a(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) < 0) {
            defpackage.ckn.a("Layer outsets must be non-negative");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cko)) {
            return false;
        }
        defpackage.cko ckoVar = (defpackage.cko) obj;
        float f = ckoVar.b;
        float f2 = ckoVar.c;
        float f3 = ckoVar.d;
        float f4 = ckoVar.e;
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final java.lang.String toString() {
        return "LayerOutsets(left=" + defpackage.dlr.b(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) + ", top=" + defpackage.dlr.b(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) + ", right=" + defpackage.dlr.b(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) + ", bottom=" + defpackage.dlr.b(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) + ")";
    }
}
