package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class zzfzc extends AbstractC2614a {
    public static final Parcelable.Creator<zzfzc> CREATOR = new zzfzd();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;

    public zzfzc(int i5, int i10, int i11, String str, String str2) {
        this.zza = i5;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i10 = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = this.zzb;
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(i11);
        AbstractC1304a.a0(parcel, 3, this.zzc, false);
        AbstractC1304a.a0(parcel, 4, this.zzd, false);
        int i12 = this.zze;
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(i12);
        AbstractC1304a.m0(iL0, parcel);
    }

    public zzfzc(int i5, zzbdz zzbdzVar, String str, String str2) {
        this(1, 1, zzbdzVar.zza(), str, str2);
    }
}
