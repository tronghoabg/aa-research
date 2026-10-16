package com.google.android.gms.location.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationReceiver extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.internal.LocationReceiver> CREATOR = new defpackage.srw(20);
    public final int a;
    public final android.os.IBinder b;
    public final android.os.IBinder c;
    public final android.app.PendingIntent d;
    public final java.lang.String e;

    public LocationReceiver(int i, android.os.IBinder iBinder, android.os.IBinder iBinder2, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this.a = i;
        this.b = iBinder;
        this.c = iBinder2;
        this.d = pendingIntent;
        this.e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, stx] */
    public static com.google.android.gms.location.internal.LocationReceiver a(android.os.IInterface iInterface, defpackage.stx stxVar, java.lang.String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new com.google.android.gms.location.internal.LocationReceiver(2, iInterface, stxVar, null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, sua] */
    public static com.google.android.gms.location.internal.LocationReceiver b(android.os.IInterface iInterface, defpackage.sua suaVar, java.lang.String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new com.google.android.gms.location.internal.LocationReceiver(1, iInterface, suaVar, null, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, i2);
        defpackage.sqs.C(parcel, 2, this.b);
        defpackage.sqs.C(parcel, 3, this.c);
        defpackage.sqs.I(parcel, 4, this.d, i);
        defpackage.sqs.J(parcel, 6, this.e);
        defpackage.sqs.q(parcel, iP);
    }
}
