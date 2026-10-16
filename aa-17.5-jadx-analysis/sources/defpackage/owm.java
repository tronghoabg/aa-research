package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class owm extends ijn implements IInterface {
    public owm(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.nav.INavigationProvider");
    }

    public final owp e() throws RemoteException {
        owp owpVar;
        Parcel parcelGi = gi(5, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            owpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.sdk.nav.state.INavigationStateManager");
            owpVar = iInterfaceQueryLocalInterface instanceof owp ? (owp) iInterfaceQueryLocalInterface : new owp(strongBinder);
        }
        parcelGi.recycle();
        return owpVar;
    }

    public final ows f() throws RemoteException {
        ows owsVar;
        Parcel parcelGi = gi(6, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            owsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.sdk.nav.suggestion.INavigationSuggestionManager");
            owsVar = iInterfaceQueryLocalInterface instanceof ows ? (ows) iInterfaceQueryLocalInterface : new ows(strongBinder);
        }
        parcelGi.recycle();
        return owsVar;
    }
}
