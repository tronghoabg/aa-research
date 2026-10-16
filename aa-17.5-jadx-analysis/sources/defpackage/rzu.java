package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.car.DrawingSpec;

/* loaded from: classes2.dex */
final class rzu implements ros {
    final /* synthetic */ DrawingSpec a;
    final /* synthetic */ rzx b;

    public rzu(rzx rzxVar, DrawingSpec drawingSpec) {
        this.a = drawingSpec;
        this.b = rzxVar;
    }

    @Override // defpackage.ros
    public final void a() {
        this.b.k(this.a);
    }

    @Override // defpackage.ros
    public final void b(Bundle bundle) {
        try {
            this.b.i.o(bundle);
        } catch (RemoteException e) {
            rrd.b("CAR.CLIENT.WM.WIN", e, "Failed to send SurfacePackage");
        }
    }

    @Override // defpackage.ros
    public final void c() {
        this.b.l();
    }
}
