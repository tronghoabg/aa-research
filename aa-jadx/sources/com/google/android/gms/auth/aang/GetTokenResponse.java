package com.google.android.gms.auth.aang;

/* JADX INFO: loaded from: classes2.dex */
public final class GetTokenResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.aang.GetTokenResponse> CREATOR = new defpackage.qpf(6);
    public final java.lang.String a;
    public final com.google.android.gms.auth.aang.Oauth2TokenMetadata b;

    public GetTokenResponse(java.lang.String str, com.google.android.gms.auth.aang.Oauth2TokenMetadata oauth2TokenMetadata) {
        this.a = str;
        this.b = oauth2TokenMetadata;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.J(parcel, 1, str);
        defpackage.sqs.I(parcel, 2, this.b, i);
        defpackage.sqs.q(parcel, iP);
    }
}
