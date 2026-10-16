package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable, defpackage.sme {
    public final int f;
    public final java.lang.String g;
    public final android.app.PendingIntent h;
    public final com.google.android.gms.common.ConnectionResult i;
    public static final com.google.android.gms.common.api.Status a = new com.google.android.gms.common.api.Status(0, null, null, null);
    public static final com.google.android.gms.common.api.Status b = new com.google.android.gms.common.api.Status(14, null, null, null);
    public static final com.google.android.gms.common.api.Status c = new com.google.android.gms.common.api.Status(8, null, null, null);
    public static final com.google.android.gms.common.api.Status d = new com.google.android.gms.common.api.Status(15, null, null, null);
    public static final com.google.android.gms.common.api.Status e = new com.google.android.gms.common.api.Status(16, null, null, null);
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Status> CREATOR = new defpackage.smf(0);

    public Status(int i, java.lang.String str, android.app.PendingIntent pendingIntent, com.google.android.gms.common.ConnectionResult connectionResult) {
        this.f = i;
        this.g = str;
        this.h = pendingIntent;
        this.i = connectionResult;
    }

    public final java.lang.String a() {
        java.lang.String str = this.g;
        return str != null ? str : defpackage.sqg.e(this.f);
    }

    public final boolean c() {
        return this.f <= 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.api.Status)) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) obj;
        return this.f == status.f && j$.util.Objects.equals(this.g, status.g) && j$.util.Objects.equals(this.h, status.h) && j$.util.Objects.equals(this.i, status.i);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.f), this.g, this.h, this.i});
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.sqg.b("statusCode", a(), arrayList);
        defpackage.sqg.b("resolution", this.h, arrayList);
        return defpackage.sqg.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.f;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, i2);
        defpackage.sqs.J(parcel, 2, this.g);
        defpackage.sqs.I(parcel, 3, this.h, i);
        defpackage.sqs.I(parcel, 4, this.i, i);
        defpackage.sqs.q(parcel, iP);
    }

    @java.lang.Deprecated
    public Status(com.google.android.gms.common.ConnectionResult connectionResult, java.lang.String str) {
        this(17, str, connectionResult.d, connectionResult);
    }

    @Override // defpackage.sme
    public final com.google.android.gms.common.api.Status b() {
        return this;
    }
}
