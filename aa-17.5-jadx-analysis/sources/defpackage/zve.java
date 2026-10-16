package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;

/* loaded from: classes3.dex */
final class zve extends vey {
    private final zyz a;
    private final ztt b;

    public zve(ztt zttVar, zyz zyzVar) {
        this.a = zyzVar;
        this.b = zttVar;
    }

    @Override // defpackage.vez
    public final void a(CameraPosition cameraPosition) {
        float f = cameraPosition.zoom;
        ztt zttVar = this.b;
        boolean z = f < zttVar.a(cameraPosition.target);
        zyz zyzVar = this.a;
        zyzVar.a.setEnabled(z);
        zyzVar.b.setEnabled(cameraPosition.zoom > zttVar.b());
    }
}
