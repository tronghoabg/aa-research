package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class zzfyq extends AbstractC2614a {
    public static final Parcelable.Creator<zzfyq> CREATOR = new zzfyr();
    public final int zza;
    public final byte[] zzb;

    public zzfyq(int i5, byte[] bArr) {
        this.zza = i5;
        this.zzb = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i10 = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(i10);
        AbstractC1304a.T(parcel, 2, this.zzb, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public zzfyq(byte[] bArr) {
        this(1, bArr);
    }
}
