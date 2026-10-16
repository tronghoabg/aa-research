package com.google.android.gms.car.display;

/* JADX INFO: loaded from: classes2.dex */
public final class CarDisplayBlendedUiConfig extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.display.CarDisplayBlendedUiConfig> CREATOR = new defpackage.rih(14);
    public final com.google.android.gms.car.display.CarDisplayCornerRadii a;
    public final java.util.List b;

    public CarDisplayBlendedUiConfig(com.google.android.gms.car.display.CarDisplayCornerRadii carDisplayCornerRadii, java.util.List list) {
        this.a = carDisplayCornerRadii;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.car.display.CarDisplayBlendedUiConfig) {
            com.google.android.gms.car.display.CarDisplayBlendedUiConfig carDisplayBlendedUiConfig = (com.google.android.gms.car.display.CarDisplayBlendedUiConfig) obj;
            if (j$.util.Objects.equals(this.a, carDisplayBlendedUiConfig.a) && j$.util.Objects.equals(this.b, carDisplayBlendedUiConfig.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b);
    }

    public final java.lang.String toString() {
        java.util.List list = this.b;
        return "CarDisplayBlendedUiConfig{windowCornerRadii=" + java.lang.String.valueOf(this.a) + ", nativeUiElements=" + java.lang.String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 1, this.a, i);
        defpackage.sqs.N(parcel, 2, this.b);
        defpackage.sqs.q(parcel, iP);
    }
}
