package com.google.android.gms.internal.safetynet;

import C7.b;
import C7.h;
import C7.i;
import C7.j;
import C7.k;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes4.dex */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    @Override // com.google.android.gms.internal.safetynet.zzb
    public final boolean zza(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 == 1) {
            zzd((Status) zzc.zza(parcel, Status.CREATOR), (h) zzc.zza(parcel, h.CREATOR));
        } else if (i5 == 2) {
            zze(parcel.readString());
        } else if (i5 == 3) {
            zzj((Status) zzc.zza(parcel, Status.CREATOR), (b) zzc.zza(parcel, b.CREATOR));
        } else if (i5 == 4) {
            zzb((Status) zzc.zza(parcel, Status.CREATOR), zzc.zzc(parcel));
        } else if (i5 == 6) {
            zzh((Status) zzc.zza(parcel, Status.CREATOR), (j) zzc.zza(parcel, j.CREATOR));
        } else if (i5 == 8) {
            zzg((Status) zzc.zza(parcel, Status.CREATOR), (i) zzc.zza(parcel, i.CREATOR));
        } else if (i5 == 10) {
            zzf((Status) zzc.zza(parcel, Status.CREATOR), zzc.zzc(parcel));
        } else if (i5 == 11) {
            zzc((Status) zzc.zza(parcel, Status.CREATOR));
        } else if (i5 == 15) {
            zzi((Status) zzc.zza(parcel, Status.CREATOR), (k) zzc.zza(parcel, k.CREATOR));
        } else {
            if (i5 != 16) {
                return false;
            }
            zzk((Status) zzc.zza(parcel, Status.CREATOR), parcel.readString(), parcel.readInt());
        }
        return true;
    }
}
