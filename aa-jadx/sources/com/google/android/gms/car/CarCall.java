package com.google.android.gms.car;

/* JADX INFO: loaded from: classes2.dex */
public class CarCall extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.CarCall> CREATOR = new defpackage.qpf(13);
    public final int a;
    public final com.google.android.gms.car.CarCall b;
    public final java.util.List c;
    public final java.lang.String d;
    public final int e;
    public final com.google.android.gms.car.CarCall.Details f;

    @java.lang.Deprecated
    public final boolean g;
    public final java.util.List h;
    public final java.util.List i;

    public CarCall(int i, com.google.android.gms.car.CarCall carCall, java.util.List list, java.lang.String str, int i2, com.google.android.gms.car.CarCall.Details details, boolean z, java.util.List list2, java.util.List list3) {
        this.a = i;
        this.b = carCall;
        this.c = list;
        this.d = str;
        this.e = i2;
        this.f = details;
        this.g = z;
        this.h = list2;
        this.i = list3;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.gms.car.CarCall) && this.a == ((com.google.android.gms.car.CarCall) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "CarCall{id=" + this.a + ", parent=" + java.lang.String.valueOf(this.b) + ", cannedTextResponses=" + java.lang.String.valueOf(this.c) + ", remainingPostDialSequence='" + this.d + "', state=" + this.e + ", details=" + java.lang.String.valueOf(this.f) + ", hasChildren=" + this.g + ", children=" + java.lang.String.valueOf(this.h) + ", conferenceableCalls=" + java.lang.String.valueOf(this.i) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.a);
        defpackage.sqs.I(parcel, 2, this.b, i);
        defpackage.sqs.L(parcel, 3, this.c);
        defpackage.sqs.J(parcel, 4, this.d);
        defpackage.sqs.v(parcel, 5, this.e);
        defpackage.sqs.I(parcel, 6, this.f, i);
        defpackage.sqs.r(parcel, 7, this.g);
        defpackage.sqs.N(parcel, 8, this.h);
        defpackage.sqs.N(parcel, 9, this.i);
        defpackage.sqs.q(parcel, iP);
    }

    public static class Details extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.car.CarCall.Details> CREATOR = new defpackage.qpf(14);
        public android.net.Uri a;
        public java.lang.String b;
        public java.lang.String c;
        public long d;

        @java.lang.Deprecated
        public android.net.Uri e;

        @java.lang.Deprecated
        public android.net.Uri f;
        public int g;
        public android.telecom.PhoneAccountHandle h;
        public int i;
        public android.os.Bundle j;
        public android.os.Bundle k;
        public int l;
        public android.telecom.GatewayInfo m;

        public Details(android.net.Uri uri, java.lang.String str, java.lang.String str2, long j, android.net.Uri uri2, android.net.Uri uri3, int i, android.telecom.PhoneAccountHandle phoneAccountHandle, int i2, android.os.Bundle bundle, android.os.Bundle bundle2, int i3, android.telecom.GatewayInfo gatewayInfo) {
            this.a = uri;
            this.b = str;
            this.c = str2;
            this.d = j;
            this.e = uri2;
            this.f = uri3;
            this.g = i;
            this.h = phoneAccountHandle;
            this.i = i2;
            this.j = bundle;
            this.k = bundle2;
            this.l = i3;
            this.m = gatewayInfo;
        }

        public final java.lang.String toString() {
            return "Details{handle=" + java.lang.String.valueOf(this.a) + ", callerDisplayName='" + this.b + "', disconnectCause='" + this.c + "', connectTimeMillis=" + this.d + ", gatewayInfoOriginal=" + java.lang.String.valueOf(this.e) + ", gatewayInfoGateway=" + java.lang.String.valueOf(this.f) + ", callCapabilities=" + this.g + ", accountHandle=" + java.lang.String.valueOf(this.h) + ", callProperties=" + this.i + ", extras=" + java.lang.String.valueOf(this.j) + ", intentExtras=" + java.lang.String.valueOf(this.k) + ", videoState=" + this.l + ", gatewayInfo=" + java.lang.String.valueOf(this.m) + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            int iP = defpackage.sqs.p(parcel, 20293);
            defpackage.sqs.I(parcel, 1, this.a, i);
            defpackage.sqs.J(parcel, 2, this.b);
            defpackage.sqs.J(parcel, 3, this.c);
            defpackage.sqs.w(parcel, 4, this.d);
            defpackage.sqs.I(parcel, 5, this.e, i);
            defpackage.sqs.I(parcel, 6, this.f, i);
            defpackage.sqs.v(parcel, 7, this.g);
            defpackage.sqs.I(parcel, 8, this.h, i);
            defpackage.sqs.v(parcel, 9, this.i);
            defpackage.sqs.y(parcel, 10, this.j);
            defpackage.sqs.y(parcel, 11, this.k);
            defpackage.sqs.v(parcel, 12, this.l);
            defpackage.sqs.I(parcel, 13, this.m, i);
            defpackage.sqs.q(parcel, iP);
        }

        public Details() {
        }
    }
}
