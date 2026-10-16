package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pao implements ServiceConnection {
    final /* synthetic */ Executor a;
    public final /* synthetic */ pap b;

    public pao(pap papVar, Executor executor) {
        this.a = executor;
        this.b = papVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        pbg pbeVar;
        pap papVar = this.b;
        papVar.i = true;
        if (iBinder == null) {
            pbeVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.wireless.setup.service.IWirelessSetupSharedService");
            pbeVar = iInterfaceQueryLocalInterface instanceof pbg ? (pbg) iInterfaceQueryLocalInterface : new pbe(iBinder);
        }
        papVar.g = pbeVar;
        this.a.execute(new oyy(this, 14));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((ype) pap.a.l().ai((char) 6268)).u("Connection to wirelessSetupSharedService disconnected.");
        pap papVar = this.b;
        papVar.i = false;
        papVar.j = false;
        pak pakVar = papVar.h;
        ((ype) ((ype) pan.a.g()).ai((char) 6261)).u("Connection failed to service");
        ((pan) pakVar).j.b(false);
    }
}
