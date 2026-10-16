package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class zzbsg extends AbstractC2614a {
    public static final Parcelable.Creator<zzbsg> CREATOR = new zzbsh();
    public final String zza;
    public final Bundle zzb;

    public zzbsg(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, str, false);
        AbstractC1304a.S(parcel, 2, this.zzb, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
