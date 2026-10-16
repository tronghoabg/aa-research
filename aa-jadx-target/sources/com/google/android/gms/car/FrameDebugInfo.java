package com.google.android.gms.car;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class FrameDebugInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.FrameDebugInfo> CREATOR = new qua(4);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public FrameDebugInfo(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        long j = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.w(parcel, 1, j);
        defpackage.sqs.w(parcel, 2, this.b);
        defpackage.sqs.w(parcel, 3, this.c);
        defpackage.sqs.w(parcel, 4, this.d);
        defpackage.sqs.w(parcel, 5, this.e);
        defpackage.sqs.q(parcel, iP);
    }
}
