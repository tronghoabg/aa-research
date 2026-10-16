package com.google.android.gms.location.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class FusedLocationProviderResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements defpackage.sme {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.internal.FusedLocationProviderResult> CREATOR = new defpackage.srw(19);
    public final com.google.android.gms.common.api.Status a;

    public FusedLocationProviderResult(com.google.android.gms.common.api.Status status) {
        this.a = status;
    }

    @Override // defpackage.sme
    public final com.google.android.gms.common.api.Status b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.api.Status status = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 1, status, i);
        defpackage.sqs.q(parcel, iP);
    }
}
