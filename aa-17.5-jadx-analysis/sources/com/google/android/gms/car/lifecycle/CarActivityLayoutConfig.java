package com.google.android.gms.car.lifecycle;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rcd;
import defpackage.spu;
import defpackage.yfq;
import java.util.List;

/* loaded from: classes.dex */
public class CarActivityLayoutConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarActivityLayoutConfig> CREATOR = new rcd(8);
    public final List a;

    public CarActivityLayoutConfig(List list) {
        this.a = list;
    }

    public final yfq a() {
        return yfq.o(this.a);
    }

    public final String toString() {
        return "CarActivityLayoutConfig{carDisplayLayoutConfigs=" + String.valueOf(this.a) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.J(parcel, 1, a());
        spu.m(parcel, iL);
    }
}
