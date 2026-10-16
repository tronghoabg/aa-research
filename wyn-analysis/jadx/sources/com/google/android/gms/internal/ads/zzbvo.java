package com.google.android.gms.internal.ads;

import D6.K0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbvo extends zzbem implements zzbvp {
    public zzbvo() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbvp zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface : new zzbvn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i5) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i11 = parcel.readInt();
                zzben.zzh(parcel);
                zzg(i11);
                break;
            case 4:
                zzh();
                break;
            case 5:
                zzi();
                break;
            case 6:
                zzj();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    boolean z2 = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata") instanceof zzbvt;
                }
                zzben.zzh(parcel);
                break;
            case 8:
                zzk();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzben.zzh(parcel);
                zzl(string, string2);
                break;
            case 10:
                zzbnb.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzben.zzh(parcel);
                break;
            case 11:
                zzn();
                break;
            case 12:
                parcel.readString();
                zzben.zzh(parcel);
                break;
            case 13:
                zzo();
                break;
            case 14:
                zzcci zzcciVar = (zzcci) zzben.zzb(parcel, zzcci.CREATOR);
                zzben.zzh(parcel);
                zzp(zzcciVar);
                break;
            case 15:
                zzq();
                break;
            case 16:
                zzccm zzccmVarZzb = zzccl.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzr(zzccmVarZzb);
                break;
            case 17:
                int i12 = parcel.readInt();
                zzben.zzh(parcel);
                zzs(i12);
                break;
            case 18:
                zzt();
                break;
            case 19:
                zzben.zzh(parcel);
                break;
            case 20:
                zzu();
                break;
            case 21:
                String string3 = parcel.readString();
                zzben.zzh(parcel);
                zzv(string3);
                break;
            case 22:
                int i13 = parcel.readInt();
                String string4 = parcel.readString();
                zzben.zzh(parcel);
                zzw(i13, string4);
                break;
            case 23:
                K0 k02 = (K0) zzben.zzb(parcel, K0.CREATOR);
                zzben.zzh(parcel);
                zzx(k02);
                break;
            case 24:
                K0 k03 = (K0) zzben.zzb(parcel, K0.CREATOR);
                zzben.zzh(parcel);
                zzy(k03);
                break;
            case 25:
                zzz();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
