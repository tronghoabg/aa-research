package defpackage;

import com.google.android.libraries.maps.model.LatLngBounds;

/* loaded from: classes3.dex */
final class ztw implements zts {
    final /* synthetic */ LatLngBounds a;
    final /* synthetic */ int b;

    public ztw(LatLngBounds latLngBounds, int i) {
        this.a = latLngBounds;
        this.b = i;
    }

    @Override // defpackage.zts
    public final void a(ztt zttVar, int i, zys zysVar) {
        zysVar.b(aahu.CAMERA_UPDATE_NEW_LATLNG_BOUNDS);
        zttVar.j(this.a, this.b, i);
    }

    public final String toString() {
        return "CAMERA_UPDATE_NEW_LATLNG_BOUNDS";
    }
}
