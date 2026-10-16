package com.google.android.gms.car.display;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class CarDisplayUiFeatures extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.display.CarDisplayUiFeatures> CREATOR = new defpackage.rcy(5);
    public final int a;
    public final int b;

    public CarDisplayUiFeatures(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean a(int i) {
        return (this.b & i) != 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.car.display.CarDisplayUiFeatures)) {
            return false;
        }
        com.google.android.gms.car.display.CarDisplayUiFeatures carDisplayUiFeatures = (com.google.android.gms.car.display.CarDisplayUiFeatures) obj;
        return this.a == carDisplayUiFeatures.a && this.b == carDisplayUiFeatures.b;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b)});
    }

    public final java.lang.String toString() {
        return "CarDisplayUiFeatures{resizeType=" + this.a + ", hasClock=" + a(1) + ", hasBatteryLevel=" + a(2) + ", hasPhoneSignal=" + a(4) + ", hasNativeUiAffordance=" + a(8) + ", hasClusterTurnCard=" + a(16) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.a);
        defpackage.sqs.v(parcel, 2, this.b);
        defpackage.sqs.q(parcel, iP);
    }
}
