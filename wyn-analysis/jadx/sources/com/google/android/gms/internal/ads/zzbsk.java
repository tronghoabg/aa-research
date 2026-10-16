package com.google.android.gms.internal.ads;

import D6.L0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzbsk extends zzbem implements zzbsl {
    public zzbsk() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbso zzbsmVar;
        if (i5 == 3) {
            L0 l0Zzb = zzb();
            parcel2.writeNoException();
            zzben.zze(parcel2, l0Zzb);
            return true;
        }
        if (i5 == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        }
        if (i5 == 5) {
            InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbsmVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbsmVar = iInterfaceQueryLocalInterface instanceof zzbso ? (zzbso) iInterfaceQueryLocalInterface : new zzbsm(strongBinder);
            }
            zzben.zzh(parcel);
            zzd(interfaceC3876aR, zzbsmVar);
            parcel2.writeNoException();
            return true;
        }
        if (i5 == 6) {
            InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
            zzben.zzh(parcel);
            zze(interfaceC3876aR2);
            parcel2.writeNoException();
            return true;
        }
        if (i5 != 7) {
            return false;
        }
        zzbmi zzbmiVarZzf = zzf();
        parcel2.writeNoException();
        zzben.zze(parcel2, zzbmiVarZzf);
        return true;
    }
}
