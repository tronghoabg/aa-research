package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.auto.components.projectionstate.ProjectionStateService;

/* loaded from: classes.dex */
public final class mia extends ijo implements mib {
    public mia() {
        super("com.google.android.apps.auto.components.projectionstate.IProjectionStateService");
    }

    @Override // defpackage.mib
    public final void e(mhy mhyVar) {
        ProjectionStateService.a = mhyVar;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        mhy mhwVar;
        if (i != 2) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            mhwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.components.projectionstate.IProjectionStateOwner");
            mhwVar = iInterfaceQueryLocalInterface instanceof mhy ? (mhy) iInterfaceQueryLocalInterface : new mhw(strongBinder);
        }
        ijp.d(parcel);
        ProjectionStateService.a = mhwVar;
        return true;
    }
}
