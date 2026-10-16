package com.google.android.gms.internal.identity;

import a.AbstractC1304a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import x7.B;
import x7.C;

/* loaded from: classes.dex */
public final class zzj extends AbstractC2614a {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    final int zza;
    final zzh zzb;
    final C zzc;
    final zzr zzd;

    public zzj(int i5, zzh zzhVar, IBinder iBinder, IBinder iBinder2) {
        this.zza = i5;
        this.zzb = zzhVar;
        zzr zzpVar = null;
        this.zzc = iBinder == null ? null : B.zzb(iBinder);
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzpVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzp(iBinder2);
        }
        this.zzd = zzpVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        int i10 = this.zza;
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(i10);
        AbstractC1304a.Z(parcel, 2, this.zzb, i5, false);
        C c10 = this.zzc;
        AbstractC1304a.V(parcel, 3, c10 == null ? null : c10.asBinder());
        zzr zzrVar = this.zzd;
        AbstractC1304a.V(parcel, 4, zzrVar != null ? zzrVar.asBinder() : null);
        AbstractC1304a.m0(iL0, parcel);
    }
}
