package com.google.android.gms.internal.mlkit_vision_text_common;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class zzd extends AbstractC2614a {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();
    public int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    public int zze;

    public zzd() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        int i10 = this.zza;
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.zzb;
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.zzc;
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(i12);
        long j8 = this.zzd;
        AbstractC1304a.k0(parcel, 5, 8);
        parcel.writeLong(j8);
        int i13 = this.zze;
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeInt(i13);
        AbstractC1304a.m0(iL0, parcel);
    }

    public zzd(int i5, int i10, int i11, long j8, int i12) {
        this.zza = i5;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j8;
        this.zze = i12;
    }
}
