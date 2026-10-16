package com.google.android.gms.auth.aang;

/* JADX INFO: loaded from: classes2.dex */
public class AppRestriction extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.aang.AppRestriction> CREATOR = new defpackage.qpf(1);
    public final com.google.android.gms.auth.aang.AppRestrictionState a;
    public final com.google.android.gms.auth.aang.AppRestrictionInfo b;

    public AppRestriction(com.google.android.gms.auth.aang.AppRestrictionState appRestrictionState, com.google.android.gms.auth.aang.AppRestrictionInfo appRestrictionInfo) {
        this.a = appRestrictionState;
        this.b = appRestrictionInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.auth.aang.AppRestrictionState appRestrictionState = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 1, appRestrictionState, i);
        defpackage.sqs.I(parcel, 2, this.b, i);
        defpackage.sqs.q(parcel, iP);
    }
}
