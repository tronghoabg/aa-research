package com.google.android.gms.internal.ads;

import G6.C0553q;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzcba extends zzbem implements zzcbb {
    public zzcba() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzben.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzben.zzh(parcel);
            zze(parcelFileDescriptor);
        } else if (i5 == 2) {
            C0553q c0553q = (C0553q) zzben.zzb(parcel, C0553q.CREATOR);
            zzben.zzh(parcel);
            zzf(c0553q);
        } else {
            if (i5 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzben.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzcbk zzcbkVar = (zzcbk) zzben.zzb(parcel, zzcbk.CREATOR);
            zzben.zzh(parcel);
            zzg(parcelFileDescriptor2, zzcbkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
