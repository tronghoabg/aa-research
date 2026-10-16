package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class qpb extends ijo implements IInterface {
    public qpb() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    public void a(String str) throws RemoteException {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            ijp.d(parcel);
            throw new UnsupportedOperationException();
        }
        if (i != 2) {
            return false;
        }
        String string = parcel.readString();
        ijp.d(parcel);
        a(string);
        parcel2.writeNoException();
        return true;
    }
}
