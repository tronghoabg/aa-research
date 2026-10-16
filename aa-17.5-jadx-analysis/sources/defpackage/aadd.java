package defpackage;

import com.google.android.libraries.maps.model.LatLngBounds;

/* loaded from: classes3.dex */
final class aadd implements aaeu {
    final /* synthetic */ zsb a;
    final /* synthetic */ int b;
    final /* synthetic */ LatLngBounds c;
    final /* synthetic */ int d;
    final /* synthetic */ aado e;

    public aadd(aado aadoVar, zsb zsbVar, int i, LatLngBounds latLngBounds, int i2) {
        this.a = zsbVar;
        this.b = i;
        this.c = latLngBounds;
        this.d = i2;
        this.e = aadoVar;
    }

    @Override // defpackage.aaeu
    public final void a(aaem aaemVar) throws Throwable {
        aado aadoVar = this.e;
        boolean z = true;
        ysi.V(!aadoVar.d, "Camera moved during a cancellation");
        zrq zrqVar = (zrq) aaemVar.f(this.a);
        int i = zrqVar.b;
        int i2 = this.b;
        if (i2 >= i / 2 && i2 >= zrqVar.a / 2) {
            z = false;
        }
        int i3 = zrqVar.a;
        ysi.T(z, a.br(i, i3, i2, "Additional padding must be less than half the existing padded map view width or height: ", " vs ", "x"));
        aadoVar.C(aaemVar, "CAMERA_UPDATE_NEW_LATLNG_BOUNDS", aadoVar.y(this.c, i3, i, i2), this.d, false, 3);
    }
}
