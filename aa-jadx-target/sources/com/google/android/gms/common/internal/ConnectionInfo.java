package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ConnectionInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.ConnectionInfo> CREATOR = new defpackage.smf(2);
    public android.os.Bundle a;
    public com.google.android.gms.common.Feature[] b;
    int c;
    public com.google.android.gms.common.internal.ConnectionTelemetryConfiguration d;
    public com.google.android.gms.common.internal.ConnectionThrottlingConfig e;

    public ConnectionInfo(android.os.Bundle bundle, com.google.android.gms.common.Feature[] featureArr, int i, com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfiguration, com.google.android.gms.common.internal.ConnectionThrottlingConfig connectionThrottlingConfig) {
        this.a = bundle;
        this.b = featureArr;
        this.c = i;
        this.d = connectionTelemetryConfiguration;
        this.e = connectionThrottlingConfig;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.y(parcel, 1, this.a);
        defpackage.sqs.M(parcel, 2, this.b, i);
        defpackage.sqs.v(parcel, 3, this.c);
        defpackage.sqs.I(parcel, 4, this.d, i);
        defpackage.sqs.I(parcel, 5, this.e, i);
        defpackage.sqs.q(parcel, iP);
    }

    public ConnectionInfo() {
    }
}
