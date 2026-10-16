package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class zzbrw extends AbstractC2614a {
    public static final Parcelable.Creator<zzbrw> CREATOR = new zzbrx();
    public final String zza;
    public final boolean zzb;
    public final int zzc;
    public final String zzd;

    public zzbrw(String str, boolean z2, int i5, String str2) {
        this.zza = str;
        this.zzb = z2;
        this.zzc = i5;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, str, false);
        boolean z2 = this.zzb;
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i10 = this.zzc;
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(i10);
        AbstractC1304a.a0(parcel, 4, this.zzd, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
