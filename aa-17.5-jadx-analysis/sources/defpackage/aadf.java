package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;

/* loaded from: classes3.dex */
final class aadf implements aaeu {
    final /* synthetic */ CameraPosition a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ aado d;

    public aadf(aado aadoVar, CameraPosition cameraPosition, int i, int i2) {
        this.a = cameraPosition;
        this.b = i;
        this.c = i2;
        this.d = aadoVar;
    }

    @Override // defpackage.aaeu
    public final void a(aaem aaemVar) throws Throwable {
        aado aadoVar = this.d;
        ysi.V(!aadoVar.d, "Camera moved during a cancellation");
        aadoVar.C(aaemVar, "CAMERA_UPDATE_NEW_CAMERA_POSITION", this.a, this.b, false, this.c);
    }
}
