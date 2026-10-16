package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class ver extends ijn implements vet {
    public ver(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IMapsAppCheckTokenCallback");
    }

    @Override // defpackage.vet
    public final void e() throws RemoteException {
        gk(3, gh());
    }

    @Override // defpackage.vet
    public final void f(String str) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        gk(2, parcelGh);
    }
}
