package com.google.android.apps.auto.components.telecom.call;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.telecom.DisconnectCause;
import android.telecom.GatewayInfo;
import android.telecom.PhoneAccountHandle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.khy;
import defpackage.spu;
import defpackage.woy;
import defpackage.xxg;
import defpackage.yfq;
import java.util.List;

/* loaded from: classes2.dex */
public class CarCall extends AbstractSafeParcelable implements Comparable<CarCall> {
    public static final Parcelable.Creator<CarCall> CREATOR = new khy(10);
    private static final yfq h;
    public final int a;
    public final CarCall b;
    public final List c;
    public final String d;
    public final int e;
    public final Details f;
    public final boolean g;

    public static class Details extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Details> CREATOR = new khy(11);
        public final Uri a;
        public final String b;
        public final DisconnectCause c;
        public final long d;

        @Deprecated
        public final Uri e;

        @Deprecated
        public final Uri f;
        public final int g;
        public final PhoneAccountHandle h;
        public final int i;
        public final Bundle j;
        public final Bundle k;
        public final int l;
        public final GatewayInfo m;

        public Details(Uri uri, String str, DisconnectCause disconnectCause, long j, Uri uri2, Uri uri3, int i, PhoneAccountHandle phoneAccountHandle, int i2, Bundle bundle, Bundle bundle2, int i3, GatewayInfo gatewayInfo) {
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

        public final String toString() {
            xxg xxgVarAo = woy.ao(this);
            xxgVarAo.b("handle", this.a);
            xxgVarAo.b("callerDisplayName", this.b);
            xxgVarAo.b("disconnectCause", this.c);
            xxgVarAo.g("connectTimeMillis", this.d);
            xxgVarAo.b("gatewayInfoOriginalAddress", this.e);
            xxgVarAo.b("gatewayInfoGatewayAddress", this.f);
            xxgVarAo.f("callCapabilities", this.g);
            xxgVarAo.b("accountHandle", this.h);
            xxgVarAo.f("callProperties", this.i);
            xxgVarAo.b("extras", this.j);
            xxgVarAo.b("intentExtras", this.k);
            xxgVarAo.f("videoState", this.l);
            xxgVarAo.b("gatewayInfo", this.m);
            return xxgVarAo.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iL = spu.l(parcel, 20293);
            spu.E(parcel, 1, this.a, i);
            spu.F(parcel, 2, this.b);
            spu.E(parcel, 3, this.c, i);
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
    }

    static {
        int i = yfq.d;
        h = yfq.m(7, 0, 9, 8, 3, 4, 1, 2);
    }

    public CarCall(int i, CarCall carCall, List list, String str, int i2, Details details, boolean z) {
        this.a = i;
        this.b = carCall;
        this.c = list;
        this.d = str;
        this.e = i2;
        this.f = details;
        this.g = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(CarCall carCall) {
        CarCall carCall2 = carCall;
        CarCall carCall3 = this.b;
        if (carCall3 != null && carCall2.b == null) {
            return 1;
        }
        if (carCall3 == null && carCall2.b != null) {
            return -1;
        }
        int i = this.e;
        yfq yfqVar = h;
        int iIndexOf = yfqVar.indexOf(Integer.valueOf(i));
        int iIndexOf2 = yfqVar.indexOf(Integer.valueOf(carCall2.e));
        return iIndexOf != iIndexOf2 ? iIndexOf2 - iIndexOf : this.a - carCall2.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof CarCall) && this.a == ((CarCall) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.f("id", this.a);
        xxgVarAo.b("parent", this.b);
        xxgVarAo.b("cannedTextResponses", this.c);
        xxgVarAo.b("remainingPostDialSequence", this.d);
        xxgVarAo.f("state", this.e);
        xxgVarAo.b("details", this.f);
        xxgVarAo.h("hasChildren", this.g);
        return xxgVarAo.toString();
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
        spu.m(parcel, iL);
    }
}
