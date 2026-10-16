package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;

/* loaded from: classes3.dex */
final class aada implements aaeu {
    final /* synthetic */ LatLng a;
    final /* synthetic */ int b;
    final /* synthetic */ aado c;

    public aada(aado aadoVar, LatLng latLng, int i) {
        this.a = latLng;
        this.b = i;
        this.c = aadoVar;
    }

    @Override // defpackage.aaeu
    public final void a(aaem aaemVar) throws Throwable {
        aado aadoVar = this.c;
        ysi.V(!aadoVar.d, "Camera moved during a cancellation");
        CameraPosition.Builder builder = CameraPosition.builder(aaemVar.d());
        builder.target(this.a);
        aadoVar.C(aaemVar, "CAMERA_UPDATE_NEW_LATLNG", builder.build(), this.b, false, 3);
    }
}
