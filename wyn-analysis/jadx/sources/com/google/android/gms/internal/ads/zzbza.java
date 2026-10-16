package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzbza extends zzbem implements zzbzb {
    public zzbza() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbzb zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof zzbzb ? (zzbzb) iInterfaceQueryLocalInterface : new zzbyz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i5) {
            case 1:
                Intent intent = (Intent) zzben.zzb(parcel, Intent.CREATOR);
                zzben.zzh(parcel);
                zze(intent);
                break;
            case 2:
                InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzben.zzh(parcel);
                zzf(interfaceC3876aR, string, string2);
                break;
            case 3:
                zzg();
                break;
            case 4:
                InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzh(interfaceC3876aR2);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                InterfaceC3876a interfaceC3876aR3 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzi(strArrCreateStringArray, iArrCreateIntArray, interfaceC3876aR3);
                break;
            case 6:
                InterfaceC3876a interfaceC3876aR4 = BinderC3877b.R(parcel.readStrongBinder());
                E6.a aVar = (E6.a) zzben.zzb(parcel, E6.a.CREATOR);
                zzben.zzh(parcel);
                zzj(interfaceC3876aR4, aVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
