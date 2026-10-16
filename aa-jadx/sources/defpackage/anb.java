package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class anb implements defpackage.and {
    @Override // defpackage.and
    public final /* synthetic */ float a(float f, float f2, float f3) {
        float f4 = f2 + f;
        if (f >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && f4 <= f3) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        if (f < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && f4 > f3) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        float f5 = f4 - f3;
        return java.lang.Math.abs(f) >= java.lang.Math.abs(f5) ? f5 : f;
    }

    @Override // defpackage.and
    public final /* synthetic */ defpackage.aej b() {
        return defpackage.anc.a;
    }
}
