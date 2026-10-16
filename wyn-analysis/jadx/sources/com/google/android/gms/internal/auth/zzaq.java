package com.google.android.gms.internal.auth;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class zzaq extends AbstractC2614a {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
    final int zza;
    public final String zzb;

    public zzaq(int i5, String str) {
        this.zza = 1;
        AbstractC1732v.i(str);
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        int i10 = this.zza;
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(i10);
        AbstractC1304a.a0(parcel, 2, this.zzb, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public zzaq(String str) {
        this(1, str);
    }
}
