package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzbjo extends zzbem implements zzbjp {
    public zzbjo() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 == 1) {
            String strZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(strZzb);
        } else if (i5 == 2) {
            String strZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(strZzc);
        } else if (i5 == 3) {
            InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
            zzben.zzh(parcel);
            zzd(interfaceC3876aR);
            parcel2.writeNoException();
        } else if (i5 == 4) {
            zze();
            parcel2.writeNoException();
        } else {
            if (i5 != 5) {
                return false;
            }
            zzf();
            parcel2.writeNoException();
        }
        return true;
    }
}
