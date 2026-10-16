package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzbns extends zzbem implements zzbnt {
    public zzbns() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbnt zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterfaceQueryLocalInterface instanceof zzbnt ? (zzbnt) iInterfaceQueryLocalInterface : new zzbnr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 != 1) {
            return false;
        }
        D6.L lZzZ = D6.K.zzZ(parcel.readStrongBinder());
        InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
        zzben.zzh(parcel);
        zze(lZzZ, interfaceC3876aR);
        parcel2.writeNoException();
        return true;
    }
}
