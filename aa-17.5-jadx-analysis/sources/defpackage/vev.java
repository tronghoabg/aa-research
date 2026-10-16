package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.MapsAppCheckTokenProvider;

/* loaded from: classes3.dex */
public final class vev extends ijo implements vew {
    final /* synthetic */ MapsAppCheckTokenProvider a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vev(MapsAppCheckTokenProvider mapsAppCheckTokenProvider) {
        super("com.google.android.libraries.maps.internal.IMapsAppCheckTokenProvider");
        this.a = mapsAppCheckTokenProvider;
    }

    @Override // defpackage.vew
    public final void e(vet vetVar) {
        this.a.fetchToken(new vdk(vetVar));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        vet verVar;
        if (i != 2) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            verVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.libraries.maps.internal.IMapsAppCheckTokenCallback");
            verVar = iInterfaceQueryLocalInterface instanceof vet ? (vet) iInterfaceQueryLocalInterface : new ver(strongBinder);
        }
        ijp.d(parcel);
        e(verVar);
        parcel2.writeNoException();
        return true;
    }
}
