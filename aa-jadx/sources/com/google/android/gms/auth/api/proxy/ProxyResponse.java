package com.google.android.gms.auth.api.proxy;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.proxy.ProxyResponse> CREATOR = new defpackage.qpf(9);
    final int a;
    public final int b;
    public final android.app.PendingIntent c;
    public final int d;
    final android.os.Bundle e;
    public final byte[] f;

    public ProxyResponse(int i, int i2, android.app.PendingIntent pendingIntent, int i3, android.os.Bundle bundle, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.e = bundle;
        this.f = bArr;
        this.c = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.b);
        defpackage.sqs.I(parcel, 2, this.c, i);
        defpackage.sqs.v(parcel, 3, this.d);
        defpackage.sqs.y(parcel, 4, this.e);
        defpackage.sqs.z(parcel, 5, this.f);
        defpackage.sqs.v(parcel, 1000, this.a);
        defpackage.sqs.q(parcel, iP);
    }
}
