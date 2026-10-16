package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class RootTelemetryConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.RootTelemetryConfiguration> CREATOR = new defpackage.smf(4);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, i2);
        defpackage.sqs.r(parcel, 2, this.b);
        defpackage.sqs.r(parcel, 3, this.c);
        defpackage.sqs.v(parcel, 4, this.d);
        defpackage.sqs.v(parcel, 5, this.e);
        defpackage.sqs.q(parcel, iP);
    }
}
