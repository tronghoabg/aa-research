package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzbmt extends zzbem implements zzbmu {
    public zzbmt() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 == 1) {
            InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
            zzben.zzh(parcel);
            zzb(interfaceC3876aR);
        } else if (i5 == 2) {
            zzc();
        } else {
            if (i5 != 3) {
                return false;
            }
            InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
            zzben.zzh(parcel);
            zzd(interfaceC3876aR2);
        }
        parcel2.writeNoException();
        return true;
    }
}
