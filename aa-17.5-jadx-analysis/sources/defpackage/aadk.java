package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;

/* loaded from: classes3.dex */
final class aadk implements aaeu {
    final /* synthetic */ float a;
    final /* synthetic */ int b;
    final /* synthetic */ aado c;
    private final /* synthetic */ int d;

    public aadk(aado aadoVar, float f, int i, int i2) {
        this.d = i2;
        this.a = f;
        this.b = i;
        this.c = aadoVar;
    }

    @Override // defpackage.aaeu
    public final void a(aaem aaemVar) throws Throwable {
        int i = this.d;
        aado aadoVar = this.c;
        if (i == 0) {
            ysi.V(!aadoVar.d, "Camera moved during a cancellation");
            CameraPosition.Builder builder = CameraPosition.builder(aaemVar.d());
            builder.zoom(this.a);
            aadoVar.C(aaemVar, "CAMERA_UPDATE_ZOOM_TO", builder.build(), aado.x(this.b), false, 3);
            return;
        }
        ysi.V(!aadoVar.d, "Camera moved during a cancellation");
        CameraPosition cameraPositionD = aaemVar.d();
        CameraPosition.Builder builder2 = CameraPosition.builder(cameraPositionD);
        builder2.zoom(cameraPositionD.zoom + this.a);
        aadoVar.C(aaemVar, "CAMERA_UPDATE_ZOOM_BY", builder2.build(), aado.x(this.b), false, 3);
    }
}
