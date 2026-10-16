package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.RemoteException;
import x7.r;

/* loaded from: classes.dex */
public abstract class zzaa extends zzb implements zzab {
    public zzaa() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 != 1) {
            return false;
        }
        r rVar = (r) zzc.zza(parcel, r.CREATOR);
        zzc.zzd(parcel);
        zzb(rVar);
        return true;
    }
}
