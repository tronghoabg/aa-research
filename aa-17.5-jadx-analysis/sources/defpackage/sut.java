package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class sut extends ijn implements IInterface {
    public sut(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void e(sus susVar, String str) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, susVar);
        parcelGh.writeString(str);
        gj(5, parcelGh);
    }
}
