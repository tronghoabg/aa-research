package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;

/* loaded from: classes3.dex */
final class aadm implements aaeu {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ int c;
    final /* synthetic */ aado d;

    public aadm(aado aadoVar, float f, float f2, int i) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = aadoVar;
    }

    @Override // defpackage.aaeu
    public final void a(aaem aaemVar) throws Throwable {
        aado aadoVar = this.d;
        ysi.V(!aadoVar.d, "Camera moved during a cancellation");
        float f = this.a;
        CameraPosition cameraPositionD = aaemVar.d();
        LatLng latLngE = aaemVar.e(f, this.b, true);
        zkt.e(latLngE != null, "Unable to scroll to an invalid location.");
        CameraPosition.Builder builder = CameraPosition.builder(cameraPositionD);
        builder.target(latLngE);
        aadoVar.C(aaemVar, "CAMERA_UPDATE_SCROLL_BY", builder.build(), aado.x(this.c), false, 3);
    }
}
