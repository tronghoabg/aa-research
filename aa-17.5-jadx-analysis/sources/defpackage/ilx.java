package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
final class ilx extends rhu {
    public sbt a;
    public boolean b = true;
    final /* synthetic */ ima c;

    public ilx(ima imaVar) {
        this.c = imaVar;
    }

    @Override // defpackage.rhu
    public final void a(ComponentName componentName, IBinder iBinder) {
        sbt sbrVar;
        ilb.d();
        if (iBinder == null) {
            sbrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.ICarSetupBinder");
            sbrVar = iInterfaceQueryLocalInterface instanceof sbt ? (sbt) iInterfaceQueryLocalInterface : new sbr(iBinder);
        }
        this.a = sbrVar;
        Object obj = this.c.Q;
        synchronized (obj) {
            this.b = false;
            obj.notify();
        }
    }

    @Override // defpackage.rhu
    public final void b(ComponentName componentName) {
    }
}
