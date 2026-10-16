package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class sck extends ijo implements scl {
    public sck() {
        super("com.google.android.gms.carsetup.IZeroPartyChecker");
    }

    @Override // defpackage.scl
    public final void e(sco scoVar) {
        try {
            scoVar.e();
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        sco scmVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            scmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.carsetup.IZeroPartyCheckerCallback");
            scmVar = iInterfaceQueryLocalInterface instanceof sco ? (sco) iInterfaceQueryLocalInterface : new scm(strongBinder);
        }
        ijp.d(parcel);
        e(scmVar);
        return true;
    }
}
