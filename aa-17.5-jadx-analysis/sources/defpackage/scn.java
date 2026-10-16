package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class scn extends ijo implements sco {
    public scn() {
        super("com.google.android.gms.carsetup.IZeroPartyCheckerCallback");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        e();
        parcel2.writeNoException();
        return true;
    }
}
