package com.google.android.gms.car;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ea;
import defpackage.spu;

/* loaded from: classes.dex */
public class ActivityLaunchInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityLaunchInfo> CREATOR = new ea(7);
    public final Intent a;
    public final CarRegionId b;

    public ActivityLaunchInfo(Intent intent, CarRegionId carRegionId) {
        this.a = intent;
        this.b = carRegionId;
    }

    public final String toString() {
        CarRegionId carRegionId = this.b;
        return "ActivityLaunchInfo{intent=" + String.valueOf(this.a) + " carRegionId=" + String.valueOf(carRegionId) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, this.a, i);
        spu.E(parcel, 2, this.b, i);
        spu.m(parcel, iL);
    }
}
