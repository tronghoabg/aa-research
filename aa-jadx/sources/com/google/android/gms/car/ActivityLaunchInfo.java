package com.google.android.gms.car;

/* JADX INFO: loaded from: classes.dex */
public class ActivityLaunchInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.ActivityLaunchInfo> CREATOR = new defpackage.ea(7);
    public final android.content.Intent a;
    public final com.google.android.gms.car.display.CarRegionId b;

    public ActivityLaunchInfo(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
        this.a = intent;
        this.b = carRegionId;
    }

    public final java.lang.String toString() {
        com.google.android.gms.car.display.CarRegionId carRegionId = this.b;
        return "ActivityLaunchInfo{intent=" + java.lang.String.valueOf(this.a) + " carRegionId=" + java.lang.String.valueOf(carRegionId) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 1, this.a, i);
        defpackage.sqs.I(parcel, 2, this.b, i);
        defpackage.sqs.q(parcel, iP);
    }
}
