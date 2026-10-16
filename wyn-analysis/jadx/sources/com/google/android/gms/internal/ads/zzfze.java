package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzfze extends AbstractC2614a {
    public static final Parcelable.Creator<zzfze> CREATOR = new zzfzf();
    public final int zza;
    public final byte[] zzb;
    public final int zzc;

    public zzfze(int i5, byte[] bArr, int i10) {
        this.zza = i5;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i10 = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(i10);
        AbstractC1304a.T(parcel, 2, this.zzb, false);
        int i11 = this.zzc;
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(i11);
        AbstractC1304a.m0(iL0, parcel);
    }

    public zzfze(byte[] bArr, int i5) {
        this(1, null, 1);
    }
}
