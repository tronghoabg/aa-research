package com.google.android.gms.car.diagnostics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rcd;
import defpackage.spu;

/* loaded from: classes.dex */
public class ConnectionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionState> CREATOR = new rcd(2);
    public final long a;
    public final int b;
    public final CriticalError c;
    public final long d;

    public ConnectionState(long j, int i, CriticalError criticalError, long j2) {
        this.a = j;
        this.b = i;
        this.c = criticalError;
        this.d = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.s(parcel, 1, this.a);
        spu.r(parcel, 2, this.b);
        spu.E(parcel, 3, this.c, i);
        spu.s(parcel, 4, this.d);
        spu.m(parcel, iL);
    }
}
