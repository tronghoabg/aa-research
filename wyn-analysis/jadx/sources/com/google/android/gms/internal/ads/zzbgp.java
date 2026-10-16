package com.google.android.gms.internal.ads;

import D6.A0;
import D6.H0;
import D6.n1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzbgp extends zzbem implements zzbgq {
    public zzbgp() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzbgq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return iInterfaceQueryLocalInterface instanceof zzbgq ? (zzbgq) iInterfaceQueryLocalInterface : new zzbgo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbgx zzbgvVar;
        switch (i5) {
            case 2:
                D6.L lZze = zze();
                parcel2.writeNoException();
                zzben.zze(parcel2, lZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof zzbgu) {
                    }
                }
                zzben.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbgvVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbgvVar = iInterfaceQueryLocalInterface2 instanceof zzbgx ? (zzbgx) iInterfaceQueryLocalInterface2 : new zzbgv(strongBinder2);
                }
                zzben.zzh(parcel);
                zzf(interfaceC3876aR, zzbgvVar);
                parcel2.writeNoException();
                return true;
            case 5:
                H0 h0Zzg = zzg();
                parcel2.writeNoException();
                zzben.zze(parcel2, h0Zzg);
                return true;
            case 6:
                boolean zZza = zzben.zza(parcel);
                zzben.zzh(parcel);
                zzh(zZza);
                parcel2.writeNoException();
                return true;
            case 7:
                A0 a0R = n1.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzi(a0R);
                parcel2.writeNoException();
                return true;
            case 8:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 9:
                long jZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeLong(jZzk);
                return true;
            case 10:
                long j8 = parcel.readLong();
                zzben.zzh(parcel);
                zzl(j8);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
