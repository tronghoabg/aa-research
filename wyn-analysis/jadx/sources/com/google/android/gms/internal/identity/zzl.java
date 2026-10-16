package com.google.android.gms.internal.identity;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import f7.AbstractC2614a;

/* loaded from: classes.dex */
public final class zzl extends AbstractC2614a implements t {
    private final Status zzb;
    public static final zzl zza = new zzl(Status.f26424e);
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();

    public zzl(Status status) {
        this.zzb = status;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 1, this.zzb, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
