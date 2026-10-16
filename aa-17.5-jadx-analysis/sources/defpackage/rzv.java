package defpackage;

import android.os.RemoteException;
import android.view.Surface;
import com.google.android.gms.car.DrawingSpec;

/* loaded from: classes.dex */
final class rzv implements roo {
    final /* synthetic */ DrawingSpec a;
    final /* synthetic */ rzx b;

    public rzv(rzx rzxVar, DrawingSpec drawingSpec) {
        this.a = drawingSpec;
        this.b = rzxVar;
    }

    @Override // defpackage.roo
    public final void a() {
        this.b.k(this.a);
    }

    @Override // defpackage.roo
    public final void b(Surface surface) {
        try {
            this.b.i.i();
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.roo
    public final void c() {
        this.b.l();
    }
}
