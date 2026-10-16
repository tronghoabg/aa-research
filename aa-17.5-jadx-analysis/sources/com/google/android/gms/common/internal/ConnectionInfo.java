package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.snf;
import defpackage.spu;

/* loaded from: classes.dex */
public class ConnectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionInfo> CREATOR = new snf(2);
    public Bundle a;
    public Feature[] b;
    int c;
    public ConnectionTelemetryConfiguration d;
    public ConnectionThrottlingConfig e;

    public ConnectionInfo(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration, ConnectionThrottlingConfig connectionThrottlingConfig) {
        this.a = bundle;
        this.b = featureArr;
        this.c = i;
        this.d = connectionTelemetryConfiguration;
        this.e = connectionThrottlingConfig;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.u(parcel, 1, this.a);
        spu.I(parcel, 2, this.b, i);
        spu.r(parcel, 3, this.c);
        spu.E(parcel, 4, this.d, i);
        spu.E(parcel, 5, this.e, i);
        spu.m(parcel, iL);
    }

    public ConnectionInfo() {
    }
}
