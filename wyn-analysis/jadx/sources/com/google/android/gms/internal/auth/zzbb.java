package com.google.android.gms.internal.auth;

import a.AbstractC1304a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class zzbb extends AbstractC2614a {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    final int zza;
    public final String zzb;
    public final PendingIntent zzc;

    public zzbb(int i5, String str, PendingIntent pendingIntent) {
        this.zza = 1;
        AbstractC1732v.i(str);
        this.zzb = str;
        AbstractC1732v.i(pendingIntent);
        this.zzc = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        int i10 = this.zza;
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(i10);
        AbstractC1304a.a0(parcel, 2, this.zzb, false);
        AbstractC1304a.Z(parcel, 3, this.zzc, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public zzbb(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }
}
