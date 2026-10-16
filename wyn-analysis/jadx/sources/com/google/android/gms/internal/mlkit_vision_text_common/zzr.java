package com.google.android.gms.internal.mlkit_vision_text_common;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class zzr extends AbstractC2614a {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    public final zzn[] zza;
    public final zzf zzb;
    public final zzf zzc;
    public final String zzd;
    public final float zze;
    public final String zzf;
    public final boolean zzg;

    public zzr(zzn[] zznVarArr, zzf zzfVar, zzf zzfVar2, String str, float f10, String str2, boolean z2) {
        this.zza = zznVarArr;
        this.zzb = zzfVar;
        this.zzc = zzfVar2;
        this.zzd = str;
        this.zze = f10;
        this.zzf = str2;
        this.zzg = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        zzn[] zznVarArr = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.d0(parcel, 2, zznVarArr, i5);
        AbstractC1304a.Z(parcel, 3, this.zzb, i5, false);
        AbstractC1304a.Z(parcel, 4, this.zzc, i5, false);
        AbstractC1304a.a0(parcel, 5, this.zzd, false);
        float f10 = this.zze;
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeFloat(f10);
        AbstractC1304a.a0(parcel, 7, this.zzf, false);
        boolean z2 = this.zzg;
        AbstractC1304a.k0(parcel, 8, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
