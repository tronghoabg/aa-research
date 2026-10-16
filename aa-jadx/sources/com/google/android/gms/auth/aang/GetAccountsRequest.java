package com.google.android.gms.auth.aang;

/* JADX INFO: loaded from: classes2.dex */
public final class GetAccountsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.aang.GetAccountsRequest> CREATOR = new defpackage.qpf(3);
    public final java.lang.String a;
    public final java.util.List b;
    public final java.util.List c;
    public final boolean d;
    public final boolean e;

    public GetAccountsRequest(java.lang.String str, java.util.List list, java.util.List list2, boolean z, boolean z2) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = z2;
    }

    public static defpackage.qph a() {
        defpackage.qph qphVar = new defpackage.qph();
        qphVar.a = (byte) 3;
        return qphVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.J(parcel, 1, str);
        defpackage.sqs.L(parcel, 2, this.b);
        defpackage.sqs.L(parcel, 3, this.c);
        defpackage.sqs.r(parcel, 4, this.d);
        defpackage.sqs.r(parcel, 5, this.e);
        defpackage.sqs.q(parcel, iP);
    }
}
