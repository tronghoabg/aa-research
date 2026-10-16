package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uxu {
    public final float[] a;

    public uxu(byte[] bArr) {
        this.a = new float[]{com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f, 0.0f};
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.uxu) {
            return java.util.Arrays.equals(((defpackage.uxu) obj).a, this.a);
        }
        return false;
    }

    public final java.lang.String toString() {
        float[] fArr = this.a;
        return "[" + fArr[0] + ", " + fArr[1] + ", " + fArr[2] + "]";
    }

    public uxu() {
        this.a = new float[]{com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 0.0f};
    }
}
