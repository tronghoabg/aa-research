package com.google.android.gms.carsetup;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.sai;
import j$.util.Objects;
import java.util.Locale;

/* loaded from: classes.dex */
public class CarInfoInternal extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CarInfoInternal> CREATOR = new sai();
    public final CarInfo a;

    @Deprecated
    public String b;
    public boolean c;
    public long d;
    public long e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;
    public String k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public long q;
    public boolean r;
    public String s;
    public int t;
    public String u;

    public CarInfoInternal(CarInfo carInfo, String str, boolean z, long j, long j2, String str2, String str3, String str4, String str5, int i, String str6, int i2, int i3, int i4, boolean z2, boolean z3, long j3, boolean z4, String str7, int i5, String str8) {
        if (carInfo == null) {
            throw new NullPointerException("null reference");
        }
        this.a = carInfo;
        this.b = str;
        this.c = z;
        this.d = j;
        this.e = j2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = i;
        this.k = str6;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = z2;
        this.p = z3;
        this.q = j3;
        this.r = z4;
        this.s = str7;
        this.t = i5;
        this.u = str8;
    }

    public static final boolean a(int i, int i2) {
        return (i & i2) == i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CarInfoInternal)) {
            return false;
        }
        CarInfoInternal carInfoInternal = (CarInfoInternal) obj;
        return Objects.equals(this.a, carInfoInternal.a) && Objects.equals(this.b, carInfoInternal.b) && this.c == carInfoInternal.c && this.d == carInfoInternal.d && this.e == carInfoInternal.e && Objects.equals(this.f, carInfoInternal.f) && Objects.equals(this.g, carInfoInternal.g) && Objects.equals(this.h, carInfoInternal.h) && Objects.equals(this.i, carInfoInternal.i) && this.j == carInfoInternal.j && Objects.equals(this.k, carInfoInternal.k) && this.l == carInfoInternal.l && this.m == carInfoInternal.m && this.n == carInfoInternal.n && this.o == carInfoInternal.o && this.p == carInfoInternal.p && this.q == carInfoInternal.q && this.r == carInfoInternal.r && Objects.equals(this.s, carInfoInternal.s) && this.t == carInfoInternal.t && Objects.equals(this.u, carInfoInternal.u);
    }

    public final int hashCode() {
        boolean zIsEmpty = TextUtils.isEmpty(this.u);
        CarInfo carInfo = this.a;
        return zIsEmpty ? Objects.hash(carInfo, this.b) : Objects.hash(carInfo, this.u);
    }

    public final String toString() {
        String name = getClass().getName();
        long j = this.d;
        CarInfo carInfo = this.a;
        String str = carInfo.a;
        String str2 = carInfo.b;
        int i = carInfo.e;
        int i2 = carInfo.f;
        String str3 = carInfo.c;
        String str4 = carInfo.d;
        int iAy = a.ay(carInfo.r);
        return name + "[dbId=" + j + ",manufacturer=" + str + ",model=" + str2 + ",headUnitProtocolVersion=" + i + "." + i2 + ",modelYear=" + str3 + ",vehicleId=" + str4 + ",vehicleType=" + (iAy == 0 ? String.format(Locale.US, "UNKNOWN(%d)", Integer.valueOf(carInfo.r)) : iAy != 1 ? iAy != 2 ? iAy != 3 ? "VEHICLE_TYPE_MOTORCYCLE" : "VEHICLE_TYPE_TRUCK" : "VEHICLE_TYPE_CAR" : "VEHICLE_TYPE_UNSPECIFIED") + ",bluetoothAllowed=" + this.c + ",hideProjectedClock=" + carInfo.g + ",driverPosition=" + carInfo.h + ",headUnitMake=" + carInfo.i + ",headUnitModel=" + carInfo.j + ",headUnitSoftwareBuild=" + carInfo.k + ",headUnitSoftwareVersion=" + carInfo.l + ",canPlayNativeMediaDuringVr=" + carInfo.m + ",hidePhoneSignal=" + carInfo.n + ",hideBatteryLevel=" + carInfo.o + ",bluetoothaddress=" + this.f + ",wifiSsid=" + this.g + ",wifiBssid=" + this.h + ",wifiSecurityMode=" + this.j + ",sslSubjectName=" + this.k + ",wifiVersionMajor=" + this.l + ",wifiVersionMinor=" + this.m + ",wifiFrequencyMHz=" + this.n + ",known=" + this.o + ",projectionAllowed=" + this.p + ",sslSerialNumber=" + this.q + ",wifiProjectionProtocolOnTcp=" + this.r + ",wifiProjectionProtocolIpAddress=" + this.s + ",wifiProjectionProtocolTcpPort=" + this.t + ",hashedVehicleId=[REDACTED]]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        sai.a(this, parcel, i);
    }

    public CarInfoInternal() {
        this.a = new CarInfo();
    }
}
