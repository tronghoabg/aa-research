package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class owd extends ijo implements owe {
    public owd() {
        super("com.google.android.apps.auto.sdk.IVoiceSearchController");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
        ijp.d(parcel);
        a(bundle);
        parcel2.writeNoException();
        return true;
    }
}
