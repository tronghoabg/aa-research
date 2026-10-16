package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzgqu extends zzbem implements zzgqv {
    public zzgqu() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
        zzben.zzh(parcel);
        zzb(bundle);
        return true;
    }
}
