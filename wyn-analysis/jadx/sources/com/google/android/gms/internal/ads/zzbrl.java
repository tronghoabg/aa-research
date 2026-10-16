package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class zzbrl extends AbstractC2614a {
    public static final Parcelable.Creator<zzbrl> CREATOR = new zzbrm();
    public final boolean zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;
    public final String[] zze;
    public final String[] zzf;
    public final boolean zzg;
    public final long zzh;

    public zzbrl(boolean z2, String str, int i5, byte[] bArr, String[] strArr, String[] strArr2, boolean z10, long j8) {
        this.zza = z2;
        this.zzb = str;
        this.zzc = i5;
        this.zzd = bArr;
        this.zze = strArr;
        this.zzf = strArr2;
        this.zzg = z10;
        this.zzh = j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        boolean z2 = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC1304a.a0(parcel, 2, this.zzb, false);
        int i10 = this.zzc;
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(i10);
        AbstractC1304a.T(parcel, 4, this.zzd, false);
        AbstractC1304a.b0(parcel, 5, this.zze, false);
        AbstractC1304a.b0(parcel, 6, this.zzf, false);
        boolean z10 = this.zzg;
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        long j8 = this.zzh;
        AbstractC1304a.k0(parcel, 8, 8);
        parcel.writeLong(j8);
        AbstractC1304a.m0(iL0, parcel);
    }
}
