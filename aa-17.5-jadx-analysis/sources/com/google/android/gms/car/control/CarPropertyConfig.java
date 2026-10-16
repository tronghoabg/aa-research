package com.google.android.gms.car.control;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class CarPropertyConfig<T> extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarPropertyConfig> CREATOR = new rhl(7);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;
    public final List f;
    public final List g;

    public CarPropertyConfig(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        parcel.readTypedList(arrayList, CarAreaId.CREATOR);
        List arrayList2 = new ArrayList();
        this.f = arrayList2;
        parcel.readList(arrayList2, getClass().getClassLoader());
        List arrayList3 = new ArrayList();
        this.g = arrayList3;
        parcel.readList(arrayList3, getClass().getClassLoader());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarPropertyConfig)) {
            return false;
        }
        CarPropertyConfig carPropertyConfig = (CarPropertyConfig) obj;
        return this.a == carPropertyConfig.a && this.b == carPropertyConfig.b && this.c == carPropertyConfig.c && this.d == carPropertyConfig.d && this.e.equals(carPropertyConfig.e) && this.f.equals(carPropertyConfig.f) && this.g.equals(carPropertyConfig.g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f, this.g);
    }

    public final String toString() {
        List list = this.g;
        List list2 = this.f;
        return "CarPropertyConfig{propertyId=" + this.a + ", areaType=" + this.b + ", valueType=" + this.c + ", access=" + this.d + ", areaIds=" + this.e.toString() + ", areaIdConfigs=" + list2.toString() + ", configArray=" + list.toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeTypedList(this.e);
        parcel.writeList(this.f);
        parcel.writeList(this.g);
    }

    public CarPropertyConfig(int i, int i2, int i3, int i4, List list, List list2, List list3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = list;
        this.f = list2;
        this.g = list3;
    }
}
