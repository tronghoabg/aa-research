package com.google.android.gms.internal.mlkit_vision_text_common;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class zzf extends AbstractC2614a {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;

    public zzf(int i5, int i10, int i11, int i12, float f10) {
        this.zza = i5;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = f10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i10 = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.zzb;
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.zzc;
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.zzd;
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(i13);
        float f10 = this.zze;
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeFloat(f10);
        AbstractC1304a.m0(iL0, parcel);
    }
}
