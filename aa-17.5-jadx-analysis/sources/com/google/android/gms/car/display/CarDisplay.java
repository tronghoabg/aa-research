package com.google.android.gms.car.display;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rcd;
import defpackage.spu;
import defpackage.yfq;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes.dex */
public final class CarDisplay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarDisplay> CREATOR = new rcd(3);
    public final CarDisplayId a;
    public final int b;
    public final int c;
    public final Point d;
    public final Rect e;
    public final int f;
    public final String g;
    public final List h;
    public final CarDisplayBlendedUiConfig i;
    private final Rect j;

    public CarDisplay(CarDisplayId carDisplayId, int i, int i2, Point point, Rect rect, Rect rect2, List list, int i3, String str, CarDisplayBlendedUiConfig carDisplayBlendedUiConfig) {
        this.a = carDisplayId;
        this.b = i;
        this.c = i2;
        this.d = point;
        this.e = rect;
        this.f = i3;
        this.g = str;
        this.j = rect2;
        this.h = list;
        this.i = carDisplayBlendedUiConfig;
    }

    public final Rect a() {
        Rect rect = this.j;
        return rect == null ? new Rect(this.e) : new Rect(rect);
    }

    public final List b() {
        List list = this.h;
        if (list == null) {
            return null;
        }
        return yfq.o(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarDisplay)) {
            return false;
        }
        CarDisplay carDisplay = (CarDisplay) obj;
        return carDisplay.a.equals(this.a) && carDisplay.b == this.b && carDisplay.c == this.c && Objects.equals(carDisplay.d, this.d) && Objects.equals(carDisplay.e, this.e) && Objects.equals(carDisplay.j, this.j) && carDisplay.f == this.f && Objects.equals(carDisplay.g, this.g) && Objects.equals(carDisplay.i, this.i);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e, this.j, Integer.valueOf(this.f), this.g, this.i);
    }

    public final String toString() {
        CarDisplayBlendedUiConfig carDisplayBlendedUiConfig = this.i;
        Rect rect = this.j;
        Rect rect2 = this.e;
        Point point = this.d;
        return "CarDisplay{carDisplayId=" + String.valueOf(this.a) + ", carDisplayType=" + this.b + ", displayDpi=" + this.c + ", displayDimensions=" + String.valueOf(point) + ", stableInsets=" + String.valueOf(rect2) + ", contentInsets=" + String.valueOf(rect) + ", initialContentType=" + this.f + ", configurationId=" + this.g + ", blendedUiConfig=" + String.valueOf(carDisplayBlendedUiConfig) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, this.a, i);
        parcel.writeInt(262146);
        parcel.writeInt(this.b);
        parcel.writeInt(262147);
        parcel.writeInt(this.c);
        spu.E(parcel, 4, this.d, i);
        spu.E(parcel, 5, this.e, i);
        parcel.writeInt(262150);
        parcel.writeInt(this.f);
        String str = this.g;
        if (str != null) {
            int iL2 = spu.l(parcel, 7);
            parcel.writeString(str);
            spu.m(parcel, iL2);
        }
        Rect rect = this.j;
        spu.E(parcel, 8, rect == null ? null : new Rect(rect), i);
        spu.J(parcel, 9, b());
        spu.E(parcel, 10, this.i, i);
        spu.m(parcel, iL);
    }
}
