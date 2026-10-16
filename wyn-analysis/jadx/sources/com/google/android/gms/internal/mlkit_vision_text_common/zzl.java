package com.google.android.gms.internal.mlkit_vision_text_common;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class zzl extends AbstractC2614a {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    public final zzr[] zza;
    public final zzf zzb;
    public final zzf zzc;
    public final zzf zzd;
    public final String zze;
    public final float zzf;
    public final String zzg;
    public final int zzh;
    public final boolean zzi;
    public final int zzj;
    public final int zzk;

    public zzl(zzr[] zzrVarArr, zzf zzfVar, zzf zzfVar2, zzf zzfVar3, String str, float f10, String str2, int i5, boolean z2, int i10, int i11) {
        this.zza = zzrVarArr;
        this.zzb = zzfVar;
        this.zzc = zzfVar2;
        this.zzd = zzfVar3;
        this.zze = str;
        this.zzf = f10;
        this.zzg = str2;
        this.zzh = i5;
        this.zzi = z2;
        this.zzj = i10;
        this.zzk = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        zzr[] zzrVarArr = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.d0(parcel, 2, zzrVarArr, i5);
        AbstractC1304a.Z(parcel, 3, this.zzb, i5, false);
        AbstractC1304a.Z(parcel, 4, this.zzc, i5, false);
        AbstractC1304a.Z(parcel, 5, this.zzd, i5, false);
        AbstractC1304a.a0(parcel, 6, this.zze, false);
        float f10 = this.zzf;
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeFloat(f10);
        AbstractC1304a.a0(parcel, 8, this.zzg, false);
        int i10 = this.zzh;
        AbstractC1304a.k0(parcel, 9, 4);
        parcel.writeInt(i10);
        boolean z2 = this.zzi;
        AbstractC1304a.k0(parcel, 10, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i11 = this.zzj;
        AbstractC1304a.k0(parcel, 11, 4);
        parcel.writeInt(i11);
        int i12 = this.zzk;
        AbstractC1304a.k0(parcel, 12, 4);
        parcel.writeInt(i12);
        AbstractC1304a.m0(iL0, parcel);
    }
}
