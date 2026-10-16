package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class mic implements ServiceConnection {
    final /* synthetic */ mid a;

    public mic(mid midVar) {
        this.a = midVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        mib mhzVar;
        if (iBinder == null) {
            mhzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.components.projectionstate.IProjectionStateService");
            mhzVar = iInterfaceQueryLocalInterface instanceof mib ? (mib) iInterfaceQueryLocalInterface : new mhz(iBinder);
        }
        mid midVar = this.a;
        midVar.d = mhzVar;
        mib mibVar = midVar.d;
        if (mibVar == null) {
            ((ype) ((ype) mid.a.g()).ai((char) 4973)).u("Bound to car connection checker service but received null binder");
            return;
        }
        try {
            mibVar.e(midVar.b);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) mid.a.h()).p(e)).ai((char) 4972)).u("ProjectionStateService is dead during onServiceConnected");
        }
        this.a.c.sendBroadcast(new Intent("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED").addFlags(268435456));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.c.sendBroadcast(new Intent("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED").addFlags(268435456));
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
    }
}
