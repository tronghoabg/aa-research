package com.google.android.gms.car;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.telecom.GatewayInfo;
import android.telecom.PhoneAccountHandle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qoj;
import defpackage.spu;
import java.util.List;

/* loaded from: classes2.dex */
public class CarCall extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarCall> CREATOR = new qoj(13);
    public final int a;
    public final CarCall b;
    public final List c;
    public final String d;
    public final int e;
    public final Details f;

    @Deprecated
    public final boolean g;
    public final List h;
    public final List i;

    public CarCall(int i, CarCall carCall, List list, String str, int i2, Details details, boolean z, List list2, List list3) {
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

    public final boolean equals(Object obj) {
        return (obj instanceof CarCall) && this.a == ((CarCall) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "CarCall{id=" + this.a + ", parent=" + String.valueOf(this.b) + ", cannedTextResponses=" + String.valueOf(this.c) + ", remainingPostDialSequence='" + this.d + "', state=" + this.e + ", details=" + String.valueOf(this.f) + ", hasChildren=" + this.g + ", children=" + String.valueOf(this.h) + ", conferenceableCalls=" + String.valueOf(this.i) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.E(parcel, 2, this.b, i);
        spu.H(parcel, 3, this.c);
        spu.F(parcel, 4, this.d);
        spu.r(parcel, 5, this.e);
        spu.E(parcel, 6, this.f, i);
        spu.n(parcel, 7, this.g);
        spu.J(parcel, 8, this.h);
        spu.J(parcel, 9, this.i);
        spu.m(parcel, iL);
    }

    public static class Details extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Details> CREATOR = new qoj(14);
        public Uri a;
        public String b;
        public String c;
        public long d;

        @Deprecated
        public Uri e;

        @Deprecated
        public Uri f;
        public int g;
        public PhoneAccountHandle h;
        public int i;
        public Bundle j;
        public Bundle k;
        public int l;
        public GatewayInfo m;

        public Details(Uri uri, String str, String str2, long j, Uri uri2, Uri uri3, int i, PhoneAccountHandle phoneAccountHandle, int i2, Bundle bundle, Bundle bundle2, int i3, GatewayInfo gatewayInfo) {
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

        public final String toString() {
            return "Details{handle=" + String.valueOf(this.a) + ", callerDisplayName='" + this.b + "', disconnectCause='" + this.c + "', connectTimeMillis=" + this.d + ", gatewayInfoOriginal=" + String.valueOf(this.e) + ", gatewayInfoGateway=" + String.valueOf(this.f) + ", callCapabilities=" + this.g + ", accountHandle=" + String.valueOf(this.h) + ", callProperties=" + this.i + ", extras=" + String.valueOf(this.j) + ", intentExtras=" + String.valueOf(this.k) + ", videoState=" + this.l + ", gatewayInfo=" + String.valueOf(this.m) + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iL = spu.l(parcel, 20293);
            spu.E(parcel, 1, this.a, i);
            spu.F(parcel, 2, this.b);
            spu.F(parcel, 3, this.c);
            spu.s(parcel, 4, this.d);
            spu.E(parcel, 5, this.e, i);
            spu.E(parcel, 6, this.f, i);
            spu.r(parcel, 7, this.g);
            spu.E(parcel, 8, this.h, i);
            spu.r(parcel, 9, this.i);
            spu.u(parcel, 10, this.j);
            spu.u(parcel, 11, this.k);
            spu.r(parcel, 12, this.l);
            spu.E(parcel, 13, this.m, i);
            spu.m(parcel, iL);
        }

        public Details() {
        }
    }
}
