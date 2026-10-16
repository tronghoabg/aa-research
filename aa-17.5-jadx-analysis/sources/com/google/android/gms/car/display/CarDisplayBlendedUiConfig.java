package com.google.android.gms.car.display;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.spu;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
public final class CarDisplayBlendedUiConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarDisplayBlendedUiConfig> CREATOR = new rhl(14);
    public final CarDisplayCornerRadii a;
    public final List b;

    public CarDisplayBlendedUiConfig(CarDisplayCornerRadii carDisplayCornerRadii, List list) {
        this.a = carDisplayCornerRadii;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarDisplayBlendedUiConfig) {
            CarDisplayBlendedUiConfig carDisplayBlendedUiConfig = (CarDisplayBlendedUiConfig) obj;
            if (Objects.equals(this.a, carDisplayBlendedUiConfig.a) && Objects.equals(this.b, carDisplayBlendedUiConfig.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        List list = this.b;
        return "CarDisplayBlendedUiConfig{windowCornerRadii=" + String.valueOf(this.a) + ", nativeUiElements=" + String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, this.a, i);
        spu.J(parcel, 2, this.b);
        spu.m(parcel, iL);
    }
}
