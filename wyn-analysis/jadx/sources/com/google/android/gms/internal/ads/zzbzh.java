package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public abstract class zzbzh extends zzbem implements zzbzi {
    public zzbzh() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzbzi zzI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof zzbzi ? (zzbzi) iInterfaceQueryLocalInterface : new zzbzg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i5) {
            case 1:
                Bundle bundle = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
                zzben.zzh(parcel);
                zzh(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                zzi();
                parcel2.writeNoException();
                return true;
            case 3:
                zzj();
                parcel2.writeNoException();
                return true;
            case 4:
                zzk();
                parcel2.writeNoException();
                return true;
            case 5:
                zzl();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
                zzben.zzh(parcel);
                zzo(bundle2);
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundle2);
                return true;
            case 7:
                zzp();
                parcel2.writeNoException();
                return true;
            case 8:
                zzq();
                parcel2.writeNoException();
                return true;
            case 9:
                zzs();
                parcel2.writeNoException();
                return true;
            case 10:
                zze();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zZzg = zzg();
                parcel2.writeNoException();
                int i11 = zzben.zza;
                parcel2.writeInt(zZzg ? 1 : 0);
                return true;
            case 12:
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                Intent intent = (Intent) zzben.zzb(parcel, Intent.CREATOR);
                zzben.zzh(parcel);
                zzm(i12, i13, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 14:
                zzf();
                parcel2.writeNoException();
                return true;
            case 15:
                int i14 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                zzben.zzh(parcel);
                zzH(i14, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
