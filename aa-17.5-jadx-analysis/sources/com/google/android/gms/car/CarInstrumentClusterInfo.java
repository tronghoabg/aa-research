package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ea;
import defpackage.spu;

/* loaded from: classes.dex */
public class CarInstrumentClusterInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarInstrumentClusterInfo> CREATOR = new ea(12);
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public CarInstrumentClusterInfo(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.r(parcel, 2, this.b);
        spu.r(parcel, 3, this.c);
        spu.r(parcel, 4, this.d);
        spu.r(parcel, 5, this.e);
        spu.m(parcel, iL);
    }
}
