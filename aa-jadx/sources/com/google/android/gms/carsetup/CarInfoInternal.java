package com.google.android.gms.carsetup;

/* JADX INFO: loaded from: classes.dex */
public class CarInfoInternal extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.carsetup.CarInfoInternal> CREATOR = new defpackage.sbe();
    public final com.google.android.gms.car.CarInfo a;

    @java.lang.Deprecated
    public java.lang.String b;
    public boolean c;
    public long d;
    public long e;
    public java.lang.String f;
    public java.lang.String g;
    public java.lang.String h;
    public java.lang.String i;
    public int j;
    public java.lang.String k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public long q;
    public boolean r;
    public java.lang.String s;
    public int t;
    public java.lang.String u;

    public CarInfoInternal(com.google.android.gms.car.CarInfo carInfo, java.lang.String str, boolean z, long j, long j2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.String str6, int i2, int i3, int i4, boolean z2, boolean z3, long j3, boolean z4, java.lang.String str7, int i5, java.lang.String str8) {
        if (carInfo == null) {
            throw new java.lang.NullPointerException("null reference");
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

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.carsetup.CarInfoInternal)) {
            return false;
        }
        com.google.android.gms.carsetup.CarInfoInternal carInfoInternal = (com.google.android.gms.carsetup.CarInfoInternal) obj;
        return j$.util.Objects.equals(this.a, carInfoInternal.a) && j$.util.Objects.equals(this.b, carInfoInternal.b) && this.c == carInfoInternal.c && this.d == carInfoInternal.d && this.e == carInfoInternal.e && j$.util.Objects.equals(this.f, carInfoInternal.f) && j$.util.Objects.equals(this.g, carInfoInternal.g) && j$.util.Objects.equals(this.h, carInfoInternal.h) && j$.util.Objects.equals(this.i, carInfoInternal.i) && this.j == carInfoInternal.j && j$.util.Objects.equals(this.k, carInfoInternal.k) && this.l == carInfoInternal.l && this.m == carInfoInternal.m && this.n == carInfoInternal.n && this.o == carInfoInternal.o && this.p == carInfoInternal.p && this.q == carInfoInternal.q && this.r == carInfoInternal.r && j$.util.Objects.equals(this.s, carInfoInternal.s) && this.t == carInfoInternal.t && j$.util.Objects.equals(this.u, carInfoInternal.u);
    }

    public final int hashCode() {
        boolean zIsEmpty = android.text.TextUtils.isEmpty(this.u);
        com.google.android.gms.car.CarInfo carInfo = this.a;
        return zIsEmpty ? j$.util.Objects.hash(carInfo, this.b) : j$.util.Objects.hash(carInfo, this.u);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String name = getClass().getName();
        long j = this.d;
        com.google.android.gms.car.CarInfo carInfo = this.a;
        java.lang.String str2 = carInfo.a;
        java.lang.String str3 = carInfo.b;
        int i = carInfo.e;
        int i2 = carInfo.f;
        java.lang.String str4 = carInfo.c;
        java.lang.String str5 = carInfo.d;
        int iAx = defpackage.a.ax(carInfo.r);
        if (iAx == 0) {
            str = java.lang.String.format(java.util.Locale.US, "UNKNOWN(%d)", java.lang.Integer.valueOf(carInfo.r));
        } else if (iAx == 1) {
            str = "VEHICLE_TYPE_UNSPECIFIED";
        } else if (iAx != 2) {
            str = iAx != 3 ? "VEHICLE_TYPE_MOTORCYCLE" : "VEHICLE_TYPE_TRUCK";
        } else {
            str = "VEHICLE_TYPE_CAR";
        }
        return name + "[dbId=" + j + ",manufacturer=" + str2 + ",model=" + str3 + ",headUnitProtocolVersion=" + i + "." + i2 + ",modelYear=" + str4 + ",vehicleId=" + str5 + ",vehicleType=" + str + ",bluetoothAllowed=" + this.c + ",hideProjectedClock=" + carInfo.g + ",driverPosition=" + carInfo.h + ",headUnitMake=" + carInfo.i + ",headUnitModel=" + carInfo.j + ",headUnitSoftwareBuild=" + carInfo.k + ",headUnitSoftwareVersion=" + carInfo.l + ",canPlayNativeMediaDuringVr=" + carInfo.m + ",hidePhoneSignal=" + carInfo.n + ",hideBatteryLevel=" + carInfo.o + ",bluetoothaddress=" + this.f + ",wifiSsid=" + this.g + ",wifiBssid=" + this.h + ",wifiSecurityMode=" + this.j + ",sslSubjectName=" + this.k + ",wifiVersionMajor=" + this.l + ",wifiVersionMinor=" + this.m + ",wifiFrequencyMHz=" + this.n + ",known=" + this.o + ",projectionAllowed=" + this.p + ",sslSerialNumber=" + this.q + ",wifiProjectionProtocolOnTcp=" + this.r + ",wifiProjectionProtocolIpAddress=" + this.s + ",wifiProjectionProtocolTcpPort=" + this.t + ",hashedVehicleId=[REDACTED]]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        defpackage.sbe.a(this, parcel, i);
    }

    public CarInfoInternal() {
        this.a = new com.google.android.gms.car.CarInfo();
    }
}
