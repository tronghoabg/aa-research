package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jig extends defpackage.jih {
    @Override // defpackage.jih, defpackage.jic
    public final float a(float f, float f2, float f3) {
        if (f <= f2) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        if (f >= f3) {
            return 1.0f;
        }
        return 1.0f - (b(1.0f - ((f - f2) / (f3 - f2))) * this.a);
    }
}
