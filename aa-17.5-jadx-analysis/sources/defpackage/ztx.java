package defpackage;

import com.google.android.libraries.maps.model.LatLngBounds;

/* loaded from: classes3.dex */
final class ztx implements zts {
    final /* synthetic */ LatLngBounds a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    public ztx(LatLngBounds latLngBounds, int i, int i2, int i3) {
        this.a = latLngBounds;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // defpackage.zts
    public final void a(ztt zttVar, int i, zys zysVar) {
        zysVar.b(aahu.CAMERA_UPDATE_NEW_LATLNG_BOUNDS_WITH_DIMENSIONS);
        zttVar.k(this.a, this.b, this.c, this.d, i);
    }

    public final String toString() {
        return "CAMERA_UPDATE_NEW_LATLNG_BOUNDS_WITH_DIMENSIONS";
    }
}
