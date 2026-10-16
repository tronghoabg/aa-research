package com.google.android.gms.car.lifecycle;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rcd;
import defpackage.spu;
import defpackage.yfq;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes.dex */
public class CarDisplayLayoutConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarDisplayLayoutConfig> CREATOR = new rcd(10);
    public final CarDisplayId a;
    public final String b;
    private final List c;
    private final List d;

    public CarDisplayLayoutConfig(CarDisplayId carDisplayId, List list, String str, List list2) {
        this.a = carDisplayId;
        this.c = list;
        this.b = str;
        this.d = list2;
    }

    public final yfq a() {
        return yfq.o(this.c);
    }

    public final yfq b() {
        return yfq.o(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarDisplayLayoutConfig)) {
            return false;
        }
        CarDisplayLayoutConfig carDisplayLayoutConfig = (CarDisplayLayoutConfig) obj;
        return Objects.equals(this.a, carDisplayLayoutConfig.a) && Objects.equals(this.c, carDisplayLayoutConfig.c) && Objects.equals(this.b, carDisplayLayoutConfig.b) && Objects.equals(this.d, carDisplayLayoutConfig.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.c, this.b, this.d);
    }

    public final String toString() {
        List list = this.c;
        List list2 = this.d;
        return "CarDisplayLayoutConfig{carDisplayId=" + String.valueOf(this.a) + ", criticalCarRegions=" + String.valueOf(list2) + ", carActivityRegionConfigs=" + String.valueOf(list) + ", carDisplayConfigurationId=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, this.a, i);
        spu.J(parcel, 2, a());
        String str = this.b;
        if (str != null) {
            int iL2 = spu.l(parcel, 3);
            parcel.writeString(str);
            spu.m(parcel, iL2);
        }
        spu.J(parcel, 4, b());
        spu.m(parcel, iL);
    }
}
