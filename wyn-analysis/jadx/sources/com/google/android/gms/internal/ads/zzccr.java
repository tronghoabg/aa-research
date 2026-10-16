package com.google.android.gms.internal.ads;

import D6.K0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzccr extends zzbem implements zzccs {
    public zzccr() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzccm zzcckVar;
        switch (i5) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzcckVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzcckVar = iInterfaceQueryLocalInterface instanceof zzccm ? (zzccm) iInterfaceQueryLocalInterface : new zzcck(strongBinder);
                }
                zzben.zzh(parcel);
                zzg(zzcckVar);
                break;
            case 4:
                int i11 = parcel.readInt();
                zzben.zzh(parcel);
                zzh(i11);
                break;
            case 5:
                K0 k02 = (K0) zzben.zzb(parcel, K0.CREATOR);
                zzben.zzh(parcel);
                zzi(k02);
                break;
            case 6:
                zzj();
                break;
            case 7:
                zzk();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
