package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.auto.sdk.MenuItem;

/* loaded from: classes2.dex */
public final class ovr extends ijn implements IInterface {
    public ovr(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.IMenuAdapter");
    }

    public final MenuItem e(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(2, parcelGh);
        MenuItem menuItem = (MenuItem) ijp.a(parcelGi, MenuItem.CREATOR);
        parcelGi.recycle();
        return menuItem;
    }

    public final void f(Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, bundle);
        gj(9, parcelGh);
    }
}
