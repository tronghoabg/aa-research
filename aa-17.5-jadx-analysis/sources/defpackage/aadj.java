package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.CameraPosition;

/* loaded from: classes3.dex */
final class aadj implements aaeu {
    final /* synthetic */ float a;
    final /* synthetic */ aado b;

    public aadj(aado aadoVar, float f) {
        this.a = f;
        this.b = aadoVar;
    }

    @Override // defpackage.aaeu
    public final void a(aaem aaemVar) throws Throwable {
        aado aadoVar = this.b;
        ysi.V(!aadoVar.d, "Camera moved during a cancellation");
        zkt.g(aadoVar.e == null, "zoomByCumulative() is not a CameraUpdate.");
        CameraPosition cameraPositionD = aaemVar.d();
        float fC = aaemVar.c();
        CameraPosition.Builder builder = CameraPosition.builder(cameraPositionD);
        float f = this.a;
        builder.zoom(fC + f);
        aadoVar.C(aaemVar, f > BitmapDescriptorFactory.HUE_RED ? "ZOOM_IN_BUTTON_CLICK" : "ZOOM_OUT_BUTTON_CLICK", builder.build(), aado.x(-1), true, 2);
    }
}
