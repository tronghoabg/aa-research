package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.identity.zzb;
import com.google.android.gms.internal.identity.zzc;

/* loaded from: classes4.dex */
public abstract class B extends zzb implements C {
    public static C zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return iInterfaceQueryLocalInterface instanceof C ? (C) iInterfaceQueryLocalInterface : new A(iBinder, "com.google.android.gms.location.IDeviceOrientationListener");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 != 1) {
            return false;
        }
        C4493e c4493e = (C4493e) zzc.zza(parcel, C4493e.CREATOR);
        zzc.zzd(parcel);
        zzd(c4493e);
        return true;
    }
}
