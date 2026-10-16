package com.google.android.gms.internal.auth;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class zzav extends AbstractC2614a {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    final int zza;
    public final String zzb;
    public final int zzc;

    public zzav(int i5, String str, int i10) {
        this.zza = 1;
        AbstractC1732v.i(str);
        this.zzb = str;
        this.zzc = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        int i10 = this.zza;
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(i10);
        AbstractC1304a.a0(parcel, 2, this.zzb, false);
        int i11 = this.zzc;
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(i11);
        AbstractC1304a.m0(iL0, parcel);
    }

    public zzav(String str, int i5) {
        this(1, str, i5);
    }
}
