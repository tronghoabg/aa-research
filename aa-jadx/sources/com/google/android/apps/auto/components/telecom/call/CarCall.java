package com.google.android.apps.auto.components.telecom.call;

/* JADX INFO: loaded from: classes2.dex */
public class CarCall extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.lang.Comparable<com.google.android.apps.auto.components.telecom.call.CarCall> {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.components.telecom.call.CarCall> CREATOR = new defpackage.kid(10);
    private static final defpackage.ygw h;
    public final int a;
    public final com.google.android.apps.auto.components.telecom.call.CarCall b;
    public final java.util.List c;
    public final java.lang.String d;
    public final int e;
    public final com.google.android.apps.auto.components.telecom.call.CarCall.Details f;
    public final boolean g;

    public static class Details extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.apps.auto.components.telecom.call.CarCall.Details> CREATOR = new defpackage.kid(11);
        public final android.net.Uri a;
        public final java.lang.String b;
        public final android.telecom.DisconnectCause c;
        public final long d;

        @java.lang.Deprecated
        public final android.net.Uri e;

        @java.lang.Deprecated
        public final android.net.Uri f;
        public final int g;
        public final android.telecom.PhoneAccountHandle h;
        public final int i;
        public final android.os.Bundle j;
        public final android.os.Bundle k;
        public final int l;
        public final android.telecom.GatewayInfo m;

        public Details(android.net.Uri uri, java.lang.String str, android.telecom.DisconnectCause disconnectCause, long j, android.net.Uri uri2, android.net.Uri uri3, int i, android.telecom.PhoneAccountHandle phoneAccountHandle, int i2, android.os.Bundle bundle, android.os.Bundle bundle2, int i3, android.telecom.GatewayInfo gatewayInfo) {
            this.a = uri;
            this.b = str;
            this.c = disconnectCause;
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
            defpackage.xym xymVarBy = defpackage.ysr.by(this);
            xymVarBy.b("handle", this.a);
            xymVarBy.b("callerDisplayName", this.b);
            xymVarBy.b("disconnectCause", this.c);
            xymVarBy.g("connectTimeMillis", this.d);
            xymVarBy.b("gatewayInfoOriginalAddress", this.e);
            xymVarBy.b("gatewayInfoGatewayAddress", this.f);
            xymVarBy.f("callCapabilities", this.g);
            xymVarBy.b("accountHandle", this.h);
            xymVarBy.f("callProperties", this.i);
            xymVarBy.b("extras", this.j);
            xymVarBy.b("intentExtras", this.k);
            xymVarBy.f("videoState", this.l);
            xymVarBy.b("gatewayInfo", this.m);
            return xymVarBy.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            int iP = defpackage.sqs.p(parcel, 20293);
            defpackage.sqs.I(parcel, 1, this.a, i);
            defpackage.sqs.J(parcel, 2, this.b);
            defpackage.sqs.I(parcel, 3, this.c, i);
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
    }

    static {
        int i = defpackage.ygw.d;
        h = defpackage.ygw.m(7, 0, 9, 8, 3, 4, 1, 2);
    }

    public CarCall(int i, com.google.android.apps.auto.components.telecom.call.CarCall carCall, java.util.List list, java.lang.String str, int i2, com.google.android.apps.auto.components.telecom.call.CarCall.Details details, boolean z) {
        this.a = i;
        this.b = carCall;
        this.c = list;
        this.d = str;
        this.e = i2;
        this.f = details;
        this.g = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        com.google.android.apps.auto.components.telecom.call.CarCall carCall2 = carCall;
        com.google.android.apps.auto.components.telecom.call.CarCall carCall3 = this.b;
        if (carCall3 != null && carCall2.b == null) {
            return 1;
        }
        if (carCall3 == null && carCall2.b != null) {
            return -1;
        }
        int i = this.e;
        defpackage.ygw ygwVar = h;
        int iIndexOf = ygwVar.indexOf(java.lang.Integer.valueOf(i));
        int iIndexOf2 = ygwVar.indexOf(java.lang.Integer.valueOf(carCall2.e));
        return iIndexOf != iIndexOf2 ? iIndexOf2 - iIndexOf : this.a - carCall2.a;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.apps.auto.components.telecom.call.CarCall) && this.a == ((com.google.android.apps.auto.components.telecom.call.CarCall) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.f("id", this.a);
        xymVarBy.b("parent", this.b);
        xymVarBy.b("cannedTextResponses", this.c);
        xymVarBy.b("remainingPostDialSequence", this.d);
        xymVarBy.f("state", this.e);
        xymVarBy.b("details", this.f);
        xymVarBy.h("hasChildren", this.g);
        return xymVarBy.toString();
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
        defpackage.sqs.q(parcel, iP);
    }
}
