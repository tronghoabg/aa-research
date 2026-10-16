package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class zzbrj extends AbstractC2614a {
    public static final Parcelable.Creator<zzbrj> CREATOR = new zzbrk();
    public final String zza;
    public final String[] zzb;
    public final String[] zzc;

    public zzbrj(String str, String[] strArr, String[] strArr2) {
        this.zza = str;
        this.zzb = strArr;
        this.zzc = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, str, false);
        AbstractC1304a.b0(parcel, 2, this.zzb, false);
        AbstractC1304a.b0(parcel, 3, this.zzc, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
