package com.google.android.gms.car.display;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class CarDisplayNativeUiElement extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarDisplayNativeUiElement> CREATOR = new rhl(16);
    public final Rect a;
    public final int b;

    public CarDisplayNativeUiElement(Rect rect, int i) {
        this.a = rect;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarDisplayNativeUiElement) {
            CarDisplayNativeUiElement carDisplayNativeUiElement = (CarDisplayNativeUiElement) obj;
            if (Objects.equals(this.a, carDisplayNativeUiElement.a) && this.b == carDisplayNativeUiElement.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        return "CarDisplayNativeUiElement{position=" + String.valueOf(this.a) + ", elementType=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, this.a, i);
        spu.r(parcel, 2, this.b);
        spu.m(parcel, iL);
    }
}
