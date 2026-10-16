package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class rwi extends ijo implements rwj {
    public rwi() {
        super("com.google.android.gms.car.servicebroker.ICarServiceBroker");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
        ijp.d(parcel);
        qup qupVarA = a(bundle);
        parcel2.writeNoException();
        ijp.i(parcel2, qupVarA);
        return true;
    }
}
