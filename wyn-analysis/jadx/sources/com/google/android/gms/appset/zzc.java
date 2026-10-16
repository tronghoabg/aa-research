package com.google.android.gms.appset;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class zzc extends AbstractC2614a {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();
    private final String zza;
    private final int zzb;

    public zzc(String str, int i5) {
        this.zza = str;
        this.zzb = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.zza, false);
        int i10 = this.zzb;
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(i10);
        AbstractC1304a.m0(iL0, parcel);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
