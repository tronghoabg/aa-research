package com.google.android.gms.car.display;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class CarDisplayCornerRadii extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarDisplayCornerRadii> CREATOR = new rhl(15);
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public CarDisplayCornerRadii(Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarDisplayCornerRadii) {
            CarDisplayCornerRadii carDisplayCornerRadii = (CarDisplayCornerRadii) obj;
            if (Objects.equals(this.a, carDisplayCornerRadii.a) && Objects.equals(this.b, carDisplayCornerRadii.b) && Objects.equals(this.c, carDisplayCornerRadii.c) && Objects.equals(this.d, carDisplayCornerRadii.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        return "CarDisplayCornerRadii{topLeft=" + this.a + ", topRight=" + this.b + ", bottomLeft=" + this.c + ", bottomRight=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.B(parcel, 1, this.a);
        spu.B(parcel, 2, this.b);
        spu.B(parcel, 3, this.c);
        spu.B(parcel, 4, this.d);
        spu.m(parcel, iL);
    }
}
