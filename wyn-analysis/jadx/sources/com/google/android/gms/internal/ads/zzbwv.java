package com.google.android.gms.internal.ads;

import D6.K0;
import android.os.Parcel;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzbwv extends zzbem implements zzbww {
    public zzbwv() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 == 1) {
            InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
            zzben.zzh(parcel);
            zze(interfaceC3876aR);
        } else if (i5 == 2) {
            String string = parcel.readString();
            zzben.zzh(parcel);
            zzf(string);
        } else if (i5 == 3) {
            K0 k02 = (K0) zzben.zzb(parcel, K0.CREATOR);
            zzben.zzh(parcel);
            zzg(k02);
        } else {
            if (i5 != 4) {
                return false;
            }
            zzbvs zzbvsVarZzb = zzbvr.zzb(parcel.readStrongBinder());
            zzben.zzh(parcel);
            zzh(zzbvsVarZzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
