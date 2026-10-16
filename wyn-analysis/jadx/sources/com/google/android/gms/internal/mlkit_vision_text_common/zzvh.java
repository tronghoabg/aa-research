package com.google.android.gms.internal.mlkit_vision_text_common;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class zzvh extends AbstractC2614a {
    public static final Parcelable.Creator<zzvh> CREATOR = new zzvi();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final boolean zzd;
    private final int zze;
    private final String zzf;
    private final boolean zzg;

    public zzvh(String str, String str2, String str3, boolean z2, int i5, String str4, boolean z10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzf = str4;
        this.zze = i5;
        this.zzd = z2;
        this.zzg = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, str, false);
        AbstractC1304a.a0(parcel, 2, this.zzb, false);
        AbstractC1304a.a0(parcel, 3, this.zzc, false);
        boolean z2 = this.zzd;
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i10 = this.zze;
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(i10);
        AbstractC1304a.a0(parcel, 6, this.zzf, false);
        boolean z10 = this.zzg;
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
