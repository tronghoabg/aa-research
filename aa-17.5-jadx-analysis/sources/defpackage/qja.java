package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class qja extends ijo implements qjb {
    public qja() {
        super("com.google.android.gearhead.sdk.assistant.IActionPlate");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            ijp.d(parcel);
            b();
        } else if (i == 2) {
            ijp.d(parcel);
            c();
        } else {
            if (i != 3) {
                return false;
            }
            parcel.readString();
            ijp.d(parcel);
            a();
        }
        return true;
    }
}
