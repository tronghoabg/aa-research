package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes2.dex */
public class MethodInvocation extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.MethodInvocation> CREATOR = new defpackage.sjy(18);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final int h;
    public final int i;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, java.lang.String str, java.lang.String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, i2);
        defpackage.sqs.v(parcel, 2, this.b);
        defpackage.sqs.v(parcel, 3, this.c);
        defpackage.sqs.w(parcel, 4, this.d);
        defpackage.sqs.w(parcel, 5, this.e);
        defpackage.sqs.J(parcel, 6, this.f);
        defpackage.sqs.J(parcel, 7, this.g);
        defpackage.sqs.v(parcel, 8, this.h);
        defpackage.sqs.v(parcel, 9, this.i);
        defpackage.sqs.q(parcel, iP);
    }
}
