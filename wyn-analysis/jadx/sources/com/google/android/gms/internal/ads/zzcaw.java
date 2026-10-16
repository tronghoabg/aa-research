package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzcaw extends zzbem implements zzcax {
    public zzcaw() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzcbb zzcazVar = null;
        zzcbc zzcbcVar = null;
        zzcbb zzcazVar2 = null;
        zzcbb zzcazVar3 = null;
        zzcbb zzcazVar4 = null;
        switch (i5) {
            case 1:
                zzben.zzh(parcel);
                parcel2.writeNoException();
                zzben.zzd(parcel2, null);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (iInterfaceQueryLocalInterface instanceof zzcay) {
                    }
                }
                zzben.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzcbk zzcbkVar = (zzcbk) zzben.zzb(parcel, zzcbk.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcazVar = iInterfaceQueryLocalInterface2 instanceof zzcbb ? (zzcbb) iInterfaceQueryLocalInterface2 : new zzcaz(strongBinder2);
                }
                zzben.zzh(parcel);
                zze(zzcbkVar, zzcazVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzcbk zzcbkVar2 = (zzcbk) zzben.zzb(parcel, zzcbk.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcazVar4 = iInterfaceQueryLocalInterface3 instanceof zzcbb ? (zzcbb) iInterfaceQueryLocalInterface3 : new zzcaz(strongBinder3);
                }
                zzben.zzh(parcel);
                zzf(zzcbkVar2, zzcazVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzcbk zzcbkVar3 = (zzcbk) zzben.zzb(parcel, zzcbk.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcazVar3 = iInterfaceQueryLocalInterface4 instanceof zzcbb ? (zzcbb) iInterfaceQueryLocalInterface4 : new zzcaz(strongBinder4);
                }
                zzben.zzh(parcel);
                zzg(zzcbkVar3, zzcazVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcazVar2 = iInterfaceQueryLocalInterface5 instanceof zzcbb ? (zzcbb) iInterfaceQueryLocalInterface5 : new zzcaz(strongBinder5);
                }
                zzben.zzh(parcel);
                zzh(string, zzcazVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzcat zzcatVar = (zzcat) zzben.zzb(parcel, zzcat.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzcbcVar = iInterfaceQueryLocalInterface6 instanceof zzcbc ? (zzcbc) iInterfaceQueryLocalInterface6 : new zzcbc(strongBinder6);
                }
                zzben.zzh(parcel);
                zzj(zzcatVar, zzcbcVar);
                parcel2.writeNoException();
                return true;
            case 9:
                String string2 = parcel.readString();
                zzben.zzh(parcel);
                zzi(string2);
                parcel2.writeNoException();
                return true;
        }
    }
}
