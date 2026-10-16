package com.google.android.gms.internal.ads;

import D6.H0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzcby extends zzbem implements zzcbz {
    public zzcby() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 == 1) {
            zzccd zzccdVar = (zzccd) zzben.zzb(parcel, zzccd.CREATOR);
            zzben.zzh(parcel);
            zzb(zzccdVar);
            parcel2.writeNoException();
            return true;
        }
        if (i5 == 2) {
            zzc();
            parcel2.writeNoException();
            return true;
        }
        zzccc zzccaVar = null;
        zzcbx zzcbxVar = null;
        D6.O n10 = null;
        if (i5 == 3) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                zzccaVar = iInterfaceQueryLocalInterface instanceof zzccc ? (zzccc) iInterfaceQueryLocalInterface : new zzcca(strongBinder);
            }
            zzben.zzh(parcel);
            zzd(zzccaVar);
            parcel2.writeNoException();
            return true;
        }
        if (i5 == 34) {
            boolean zZza = zzben.zza(parcel);
            zzben.zzh(parcel);
            zzr(zZza);
            parcel2.writeNoException();
            return true;
        }
        switch (i5) {
            case 5:
                boolean zZze = zze();
                parcel2.writeNoException();
                int i11 = zzben.zza;
                parcel2.writeInt(zZze ? 1 : 0);
                break;
            case 6:
                zzf();
                parcel2.writeNoException();
                break;
            case 7:
                zzg();
                parcel2.writeNoException();
                break;
            case 8:
                zzh();
                parcel2.writeNoException();
                break;
            case 9:
                InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzi(interfaceC3876aR);
                parcel2.writeNoException();
                break;
            case 10:
                InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzj(interfaceC3876aR2);
                parcel2.writeNoException();
                break;
            case 11:
                InterfaceC3876a interfaceC3876aR3 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzk(interfaceC3876aR3);
                parcel2.writeNoException();
                break;
            case 12:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                break;
            case 13:
                String string = parcel.readString();
                zzben.zzh(parcel);
                zzm(string);
                parcel2.writeNoException();
                break;
            case 14:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    n10 = iInterfaceQueryLocalInterface2 instanceof D6.O ? (D6.O) iInterfaceQueryLocalInterface2 : new D6.N(strongBinder2);
                }
                zzben.zzh(parcel);
                zzn(n10);
                parcel2.writeNoException();
                break;
            case 15:
                Bundle bundleZzo = zzo();
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundleZzo);
                break;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    zzcbxVar = iInterfaceQueryLocalInterface3 instanceof zzcbx ? (zzcbx) iInterfaceQueryLocalInterface3 : new zzcbx(strongBinder3);
                }
                zzben.zzh(parcel);
                zzu(zzcbxVar);
                parcel2.writeNoException();
                break;
            case 17:
                parcel.readString();
                zzben.zzh(parcel);
                parcel2.writeNoException();
                break;
            case 18:
                InterfaceC3876a interfaceC3876aR4 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzp(interfaceC3876aR4);
                parcel2.writeNoException();
                break;
            case 19:
                String string2 = parcel.readString();
                zzben.zzh(parcel);
                zzq(string2);
                parcel2.writeNoException();
                break;
            case 20:
                boolean zZzs = zzs();
                parcel2.writeNoException();
                int i12 = zzben.zza;
                parcel2.writeInt(zZzs ? 1 : 0);
                break;
            case 21:
                H0 h0Zzt = zzt();
                parcel2.writeNoException();
                zzben.zze(parcel2, h0Zzt);
                break;
        }
        return true;
    }
}
