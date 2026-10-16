package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;

/* loaded from: classes3.dex */
final class aadb implements aaeu {
    final /* synthetic */ LatLng a;
    final /* synthetic */ float b;
    final /* synthetic */ int c;
    final /* synthetic */ aado d;

    public aadb(aado aadoVar, LatLng latLng, float f, int i) {
        this.a = latLng;
        this.b = f;
        this.c = i;
        this.d = aadoVar;
    }

    @Override // defpackage.aaeu
    public final void a(aaem aaemVar) throws Throwable {
        aado aadoVar = this.d;
        ysi.V(!aadoVar.d, "Camera moved during a cancellation");
        CameraPosition.Builder builder = CameraPosition.builder(aaemVar.d());
        builder.target(this.a);
        builder.zoom(this.b);
        aadoVar.C(aaemVar, "CAMERA_UPDATE_NEW_LATLNG_ZOOM", builder.build(), this.c, false, 3);
    }
}
