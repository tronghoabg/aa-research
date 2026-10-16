package com.google.android.gms.internal.identity;

import a.AbstractC1304a;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import x7.E;
import x7.F;
import x7.H;
import x7.I;

@Deprecated
/* loaded from: classes.dex */
public final class zzei extends AbstractC2614a {
    public static final Parcelable.Creator<zzei> CREATOR = new zzej();
    private final int zza;
    private final zzeg zzb;
    private final I zzc;
    private final F zzd;
    private final PendingIntent zze;
    private final zzr zzf;
    private final String zzg;

    public zzei(int i5, zzeg zzegVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.zza = i5;
        this.zzb = zzegVar;
        zzr zzpVar = null;
        this.zzc = iBinder != null ? H.zzb(iBinder) : null;
        this.zze = pendingIntent;
        this.zzd = iBinder2 != null ? E.zzb(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzpVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzp(iBinder3);
        }
        this.zzf = zzpVar;
        this.zzg = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i10 = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(i10);
        AbstractC1304a.Z(parcel, 2, this.zzb, i5, false);
        I i11 = this.zzc;
        AbstractC1304a.V(parcel, 3, i11 == null ? null : i11.asBinder());
        AbstractC1304a.Z(parcel, 4, this.zze, i5, false);
        F f10 = this.zzd;
        AbstractC1304a.V(parcel, 5, f10 == null ? null : f10.asBinder());
        zzr zzrVar = this.zzf;
        AbstractC1304a.V(parcel, 6, zzrVar != null ? zzrVar.asBinder() : null);
        AbstractC1304a.a0(parcel, 8, this.zzg, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
