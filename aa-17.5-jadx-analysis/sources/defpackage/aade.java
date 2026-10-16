package defpackage;

import com.google.android.libraries.maps.model.LatLngBounds;

/* loaded from: classes3.dex */
final class aade implements aaeu {
    final /* synthetic */ zrq a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ LatLngBounds e;
    final /* synthetic */ int f;
    final /* synthetic */ aado g;

    public aade(aado aadoVar, zrq zrqVar, int i, int i2, int i3, LatLngBounds latLngBounds, int i4) {
        this.a = zrqVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = latLngBounds;
        this.f = i4;
        this.g = aadoVar;
    }

    @Override // defpackage.aaeu
    public final void a(aaem aaemVar) throws Throwable {
        aado aadoVar = this.g;
        ysi.V(!aadoVar.d, "Camera moved during a cancellation");
        zsb zsbVarF = aaemVar.f(this.a);
        if (addm.a.gu().w()) {
            int i = this.b;
            int i2 = this.c;
            int i3 = i2 + i2;
            ysi.V(((double) (i - i3)) > 0.0d && ((double) (this.d - i3)) > 0.0d, "Error using newLatLngBounds(LatLngBounds, int, int, int): View size is too small after padding is applied.");
        } else {
            int i4 = this.c;
            zrq zrqVar = (zrq) zsbVarF;
            int i5 = zrqVar.b;
            if (i4 >= i5 / 2 && i4 >= zrqVar.a / 2) {
                z = false;
            }
            ysi.T(z, "Additional camera padding must be less than half of the existing padded map view width or height: " + i4 + " vs " + zrqVar.a + "x" + i5);
        }
        zrq zrqVar2 = (zrq) zsbVarF;
        aadoVar.C(aaemVar, "CAMERA_UPDATE_NEW_LATLNG_BOUNDS_WITH_DIMENSIONS", aadoVar.y(this.e, zrqVar2.a, zrqVar2.b, this.c), this.f, false, 3);
    }
}
