package com.google.android.gms.common;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class GoogleCertificatesLookupResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.GoogleCertificatesLookupResponse> CREATOR = new defpackage.smf(1);
    public final boolean a;
    public final java.lang.String b;
    public final int c;
    public final int d;
    public final long e;

    public GoogleCertificatesLookupResponse(boolean z, java.lang.String str, int i, int i2, long j) {
        this.a = z;
        this.b = str;
        this.c = defpackage.ooa.j(i) - 1;
        this.d = defpackage.ooa.k(i2) - 1;
        this.e = j;
    }

    public final int a() {
        return defpackage.ooa.j(this.c);
    }

    public final void b() {
        defpackage.ooa.k(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        boolean z = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.r(parcel, 1, z);
        defpackage.sqs.J(parcel, 2, this.b);
        defpackage.sqs.v(parcel, 3, this.c);
        defpackage.sqs.v(parcel, 4, this.d);
        defpackage.sqs.w(parcel, 5, this.e);
        defpackage.sqs.q(parcel, iP);
    }
}
