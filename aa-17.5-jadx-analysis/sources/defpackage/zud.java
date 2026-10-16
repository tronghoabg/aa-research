package defpackage;

import com.google.android.libraries.maps.model.LatLng;

/* loaded from: classes3.dex */
final class zud implements zts {
    final /* synthetic */ LatLng a;
    final /* synthetic */ float b;

    public zud(LatLng latLng, float f) {
        this.a = latLng;
        this.b = f;
    }

    @Override // defpackage.zts
    public final void a(ztt zttVar, int i, zys zysVar) {
        zysVar.b(aahu.CAMERA_UPDATE_NEW_LATLNG_ZOOM);
        zttVar.l(this.a, this.b, i);
    }

    public final String toString() {
        return "CAMERA_UPDATE_NEW_LATLNG_ZOOM";
    }
}
