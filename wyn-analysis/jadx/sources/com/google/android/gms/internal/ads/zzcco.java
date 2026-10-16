package com.google.android.gms.internal.ads;

import D6.A0;
import D6.C0406x0;
import D6.H0;
import D6.InterfaceC0408y0;
import D6.n1;
import D6.v1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzcco extends zzbem implements zzccp {
    public zzcco() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzccp zzt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzccp ? (zzccp) iInterfaceQueryLocalInterface : new zzccn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzccw zzccuVar = null;
        zzccw zzccuVar2 = null;
        InterfaceC0408y0 c0406x0 = null;
        zzccx zzccxVar = null;
        zzccs zzccqVar = null;
        switch (i5) {
            case 1:
                v1 v1Var = (v1) zzben.zzb(parcel, v1.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccuVar = iInterfaceQueryLocalInterface instanceof zzccw ? (zzccw) iInterfaceQueryLocalInterface : new zzccu(strongBinder);
                }
                zzben.zzh(parcel);
                zzc(v1Var, zzccuVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzccqVar = iInterfaceQueryLocalInterface2 instanceof zzccs ? (zzccs) iInterfaceQueryLocalInterface2 : new zzccq(strongBinder2);
                }
                zzben.zzh(parcel);
                zze(zzccqVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzi = zzi();
                parcel2.writeNoException();
                int i11 = zzben.zza;
                parcel2.writeInt(zZzi ? 1 : 0);
                return true;
            case 4:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 5:
                InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzb(interfaceC3876aR);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzccxVar = iInterfaceQueryLocalInterface3 instanceof zzccx ? (zzccx) iInterfaceQueryLocalInterface3 : new zzccx(strongBinder3);
                }
                zzben.zzh(parcel);
                zzs(zzccxVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcdd zzcddVar = (zzcdd) zzben.zzb(parcel, zzcdd.CREATOR);
                zzben.zzh(parcel);
                zzh(zzcddVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    c0406x0 = iInterfaceQueryLocalInterface4 instanceof InterfaceC0408y0 ? (InterfaceC0408y0) iInterfaceQueryLocalInterface4 : new C0406x0(strongBinder4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                }
                zzben.zzh(parcel);
                zzf(c0406x0);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundleZzg);
                return true;
            case 10:
                InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
                boolean zZza = zzben.zza(parcel);
                zzben.zzh(parcel);
                zzk(interfaceC3876aR2, zZza);
                parcel2.writeNoException();
                return true;
            case 11:
                zzccm zzccmVarZzl = zzl();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzccmVarZzl);
                return true;
            case 12:
                H0 h0Zzm = zzm();
                parcel2.writeNoException();
                zzben.zze(parcel2, h0Zzm);
                return true;
            case 13:
                A0 a0R = n1.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzo(a0R);
                parcel2.writeNoException();
                return true;
            case 14:
                v1 v1Var2 = (v1) zzben.zzb(parcel, v1.CREATOR);
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccuVar2 = iInterfaceQueryLocalInterface5 instanceof zzccw ? (zzccw) iInterfaceQueryLocalInterface5 : new zzccu(strongBinder5);
                }
                zzben.zzh(parcel);
                zzd(v1Var2, zzccuVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZza2 = zzben.zza(parcel);
                zzben.zzh(parcel);
                zzp(zZza2);
                parcel2.writeNoException();
                return true;
            case 16:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 17:
                long jZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeLong(jZzq);
                return true;
            case 18:
                long j8 = parcel.readLong();
                zzben.zzh(parcel);
                zzr(j8);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
