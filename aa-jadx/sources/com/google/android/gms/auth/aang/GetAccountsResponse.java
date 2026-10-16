package com.google.android.gms.auth.aang;

/* JADX INFO: loaded from: classes2.dex */
public final class GetAccountsResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.aang.GetAccountsResponse> CREATOR = new defpackage.qpf(4);
    public final java.util.List a;
    public final java.util.List b;

    public GetAccountsResponse(java.util.List list, java.util.List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.N(parcel, 1, list);
        defpackage.sqs.N(parcel, 2, this.b);
        defpackage.sqs.q(parcel, iP);
    }
}
