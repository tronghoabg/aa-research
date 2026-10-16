package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qoj;
import defpackage.spu;

/* loaded from: classes2.dex */
public class CarFacet extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarFacet> CREATOR = new qoj(15);
    public final int a;
    public final String b;

    public CarFacet(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.F(parcel, 2, this.b);
        spu.m(parcel, iL);
    }
}
