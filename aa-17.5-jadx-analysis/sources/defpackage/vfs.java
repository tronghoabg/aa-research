package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate;

/* loaded from: classes3.dex */
public final class vfs extends ijn implements vfu {
    public vfs(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnIndoorStateChangeListener");
    }

    @Override // defpackage.vfu
    public final void e() throws RemoteException {
        gj(1, gh());
    }

    @Override // defpackage.vfu
    public final void f(IIndoorBuildingDelegate iIndoorBuildingDelegate) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, iIndoorBuildingDelegate);
        gj(2, parcelGh);
    }
}
