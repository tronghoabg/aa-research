package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbnv extends zzbem implements zzbnw {
    public zzbnv() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static zzbnw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof zzbnw ? (zzbnw) iInterfaceQueryLocalInterface : new zzbnu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzboc zzboaVar;
        if (i5 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzboaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            zzboaVar = iInterfaceQueryLocalInterface instanceof zzboc ? (zzboc) iInterfaceQueryLocalInterface : new zzboa(strongBinder);
        }
        zzben.zzh(parcel);
        zze(zzboaVar);
        parcel2.writeNoException();
        return true;
    }
}
