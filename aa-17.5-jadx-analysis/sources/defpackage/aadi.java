package defpackage;

import android.util.Log;

/* loaded from: classes3.dex */
final class aadi implements aaeu {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aadi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.aaeu
    public final void a(aaem aaemVar) throws Throwable {
        if (this.b == 0) {
            aado aadoVar = (aado) this.a;
            ysi.V(!aadoVar.d, "Camera stopped during a cancellation");
            ysi.V(aadoVar.e == null, "stopAnimation() is not a CameraUpdate.");
            aadoVar.C(aaemVar, "MAP_STOP_ANIMATION", aaemVar.d(), 0, false, -4);
            return;
        }
        aaemVar.j();
        Object obj = aaemVar.b;
        Object obj2 = this.a;
        ((aaet) obj).r((aaep) obj2);
        String str = aado.b;
        if (zrn.e(str, 3)) {
            Log.d(str, "Queueing: setPadding ".concat(obj2.toString()));
        }
        if (zrn.e(str, 3)) {
            Log.d(str, "Expected Optical Center: " + String.valueOf(aaemVar.i()) + " for " + String.valueOf(aaemVar.g()));
        }
    }
}
