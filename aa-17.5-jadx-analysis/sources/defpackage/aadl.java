package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;

/* loaded from: classes3.dex */
final class aadl implements aaeu {
    final /* synthetic */ float a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ aado e;

    public aadl(aado aadoVar, float f, int i, int i2, int i3) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = aadoVar;
    }

    @Override // defpackage.aaeu
    public final void a(aaem aaemVar) throws Throwable {
        aado aadoVar = this.e;
        ysi.V(!aadoVar.d, "Camera moved during a cancellation");
        aaemVar.j();
        aaet aaetVar = (aaet) aaemVar.b;
        aadu aaduVarN = aaetVar.n();
        CameraPosition cameraPositionD = aaemVar.d();
        aadu aaduVar = new aadu(this.b - aaduVarN.a, this.c - aaduVarN.b);
        aaemVar.j();
        aadoVar.C(aaemVar, "CAMERA_UPDATE_ZOOM_BY_FIXING", aaetVar.f(cameraPositionD, this.a, aaduVar, aadoVar.c), aado.x(this.d), false, 3);
    }
}
