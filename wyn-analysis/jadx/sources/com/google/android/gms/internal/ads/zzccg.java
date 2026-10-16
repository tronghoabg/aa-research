package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzccg extends zzbem implements zzcch {
    public zzccg() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzcch zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof zzcch ? (zzcch) iInterfaceQueryLocalInterface : new zzccf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i5) {
            case 1:
                InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zze(interfaceC3876aR);
                break;
            case 2:
                InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzben.zzh(parcel);
                zzf(interfaceC3876aR2, i11);
                break;
            case 3:
                InterfaceC3876a interfaceC3876aR3 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzg(interfaceC3876aR3);
                break;
            case 4:
                InterfaceC3876a interfaceC3876aR4 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzh(interfaceC3876aR4);
                break;
            case 5:
                InterfaceC3876a interfaceC3876aR5 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzi(interfaceC3876aR5);
                break;
            case 6:
                InterfaceC3876a interfaceC3876aR6 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzj(interfaceC3876aR6);
                break;
            case 7:
                InterfaceC3876a interfaceC3876aR7 = BinderC3877b.R(parcel.readStrongBinder());
                zzcci zzcciVar = (zzcci) zzben.zzb(parcel, zzcci.CREATOR);
                zzben.zzh(parcel);
                zzk(interfaceC3876aR7, zzcciVar);
                break;
            case 8:
                InterfaceC3876a interfaceC3876aR8 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzl(interfaceC3876aR8);
                break;
            case 9:
                InterfaceC3876a interfaceC3876aR9 = BinderC3877b.R(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzben.zzh(parcel);
                zzm(interfaceC3876aR9, i12);
                break;
            case 10:
                InterfaceC3876a interfaceC3876aR10 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzn(interfaceC3876aR10);
                break;
            case 11:
                InterfaceC3876a interfaceC3876aR11 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzo(interfaceC3876aR11);
                break;
            case 12:
                zzben.zzh(parcel);
                break;
            case 13:
                InterfaceC3876a interfaceC3876aR12 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzp(interfaceC3876aR12);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
