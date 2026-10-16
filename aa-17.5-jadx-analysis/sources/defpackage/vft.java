package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.model.IndoorBuilding;
import com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate;

/* loaded from: classes3.dex */
public final class vft extends ijo implements vfu {
    final /* synthetic */ GoogleMap.OnIndoorStateChangeListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vft(GoogleMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        super("com.google.android.libraries.maps.internal.IOnIndoorStateChangeListener");
        this.a = onIndoorStateChangeListener;
    }

    @Override // defpackage.vfu
    public final void e() {
        this.a.onIndoorBuildingFocused();
    }

    @Override // defpackage.vfu
    public final void f(IIndoorBuildingDelegate iIndoorBuildingDelegate) {
        this.a.onIndoorLevelActivated(new IndoorBuilding(iIndoorBuildingDelegate));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            e();
        } else {
            if (i != 2) {
                return false;
            }
            IIndoorBuildingDelegate iIndoorBuildingDelegateAsInterface = IIndoorBuildingDelegate.Stub.asInterface(parcel.readStrongBinder());
            ijp.d(parcel);
            f(iIndoorBuildingDelegateAsInterface);
        }
        parcel2.writeNoException();
        return true;
    }
}
