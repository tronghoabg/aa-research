package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ouy extends ijo implements ouz {
    public ouy() {
        super("com.google.android.apps.auto.sdk.ICapabilityController");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        List<String> listE = e();
        parcel2.writeNoException();
        parcel2.writeStringList(listE);
        return true;
    }
}
