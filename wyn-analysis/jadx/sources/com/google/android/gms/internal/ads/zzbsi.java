package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class zzbsi extends AbstractC2614a {
    public static final Parcelable.Creator<zzbsi> CREATOR = new zzbsj();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    public zzbsi(int i5, int i10, String str, int i11) {
        this.zza = i5;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i10 = this.zzb;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(i10);
        AbstractC1304a.a0(parcel, 2, this.zzc, false);
        int i11 = this.zzd;
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.zza;
        AbstractC1304a.k0(parcel, 1000, 4);
        parcel.writeInt(i12);
        AbstractC1304a.m0(iL0, parcel);
    }
}
