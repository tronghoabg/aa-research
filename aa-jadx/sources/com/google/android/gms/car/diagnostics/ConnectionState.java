package com.google.android.gms.car.diagnostics;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionState extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.diagnostics.ConnectionState> CREATOR = new defpackage.rcy(2);
    public final long a;
    public final int b;
    public final com.google.android.gms.car.diagnostics.CriticalError c;
    public final long d;

    public ConnectionState(long j, int i, com.google.android.gms.car.diagnostics.CriticalError criticalError, long j2) {
        this.a = j;
        this.b = i;
        this.c = criticalError;
        this.d = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.w(parcel, 1, this.a);
        defpackage.sqs.v(parcel, 2, this.b);
        defpackage.sqs.I(parcel, 3, this.c, i);
        defpackage.sqs.w(parcel, 4, this.d);
        defpackage.sqs.q(parcel, iP);
    }
}
