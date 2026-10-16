package com.google.android.gms.googlehelp;

/* JADX INFO: loaded from: classes2.dex */
public final class InProductHelp extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.googlehelp.InProductHelp> CREATOR = new defpackage.srw(7);
    public com.google.android.gms.googlehelp.GoogleHelp a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;
    public final java.lang.String e;
    public final int f;
    public final java.lang.String g;

    public InProductHelp(com.google.android.gms.googlehelp.GoogleHelp googleHelp, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, int i2, java.lang.String str4) {
        this.a = googleHelp;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = i2;
        this.g = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 1, this.a, i);
        defpackage.sqs.J(parcel, 2, this.b);
        defpackage.sqs.J(parcel, 3, this.c);
        defpackage.sqs.v(parcel, 4, this.d);
        defpackage.sqs.J(parcel, 5, this.e);
        defpackage.sqs.v(parcel, 6, this.f);
        defpackage.sqs.J(parcel, 7, this.g);
        defpackage.sqs.q(parcel, iP);
    }
}
