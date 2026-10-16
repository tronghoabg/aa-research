package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.sli;
import defpackage.spu;
import defpackage.sqy;

/* loaded from: classes2.dex */
public final class FusedLocationProviderResult extends AbstractSafeParcelable implements sli {
    public static final Parcelable.Creator<FusedLocationProviderResult> CREATOR = new sqy(18);
    public final Status a;

    public FusedLocationProviderResult(Status status) {
        this.a = status;
    }

    @Override // defpackage.sli
    public final Status b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, status, i);
        spu.m(parcel, iL);
    }
}
