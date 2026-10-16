package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class ioe extends rhu {
    final /* synthetic */ iof a;

    public ioe(iof iofVar) {
        this.a = iofVar;
    }

    @Override // defpackage.rhu
    public final void a(ComponentName componentName, IBinder iBinder) {
        rmf rmdVar;
        ilb.d();
        yph yphVar = iof.a;
        ((ype) yphVar.l().ai((char) 811)).u("onServiceConnected");
        iof iofVar = this.a;
        if (iofVar.d != 1) {
            ((ype) yphVar.l().ai((char) 812)).u("Input no longer starting when service connected");
            return;
        }
        if (iBinder == null) {
            rmdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.input.ICarProjectionInputService");
            rmdVar = iInterfaceQueryLocalInterface instanceof rmf ? (rmf) iInterfaceQueryLocalInterface : new rmd(iBinder);
        }
        iofVar.c = rmdVar;
        try {
            iofVar.c.f(iofVar.h);
            try {
                iof iofVar2 = this.a;
                iofVar2.i(iofVar2.e, iofVar2.f, iofVar2.g);
                iof iofVar3 = this.a;
                iofVar3.f();
                iofVar3.d = 2;
            } catch (RemoteException e) {
                this.a.h("Failed to notify input service of start", e);
            }
        } catch (RemoteException e2) {
            this.a.h("Unable to register input service callback", e2);
        }
    }

    @Override // defpackage.rhu
    public final void b(ComponentName componentName) {
        ilb.d();
        ((ype) ((ype) iof.a.g()).ai((char) 813)).u("Input service disconnected.");
        iof iofVar = this.a;
        iofVar.c = null;
        iofVar.g();
    }
}
