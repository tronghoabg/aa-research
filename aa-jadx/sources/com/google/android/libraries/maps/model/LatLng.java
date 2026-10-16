package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public final class LatLng extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.model.LatLng> CREATOR = new com.google.android.libraries.maps.model.LatLngCreator();
    public final double latitude;
    public final double longitude;

    public LatLng(double d, double d2) {
        this.longitude = (d2 < -180.0d || d2 >= 180.0d) ? ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d : d2;
        this.latitude = java.lang.Math.max(-90.0d, java.lang.Math.min(90.0d, d));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.maps.model.LatLng)) {
            return false;
        }
        com.google.android.libraries.maps.model.LatLng latLng = (com.google.android.libraries.maps.model.LatLng) obj;
        return java.lang.Double.doubleToLongBits(this.latitude) == java.lang.Double.doubleToLongBits(latLng.latitude) && java.lang.Double.doubleToLongBits(this.longitude) == java.lang.Double.doubleToLongBits(latLng.longitude);
    }

    public int hashCode() {
        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(this.latitude);
        long j = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = java.lang.Double.doubleToLongBits(this.longitude);
        return ((((int) j) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public java.lang.String toString() {
        return "lat/lng: (" + this.latitude + "," + this.longitude + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.t(parcel, 2, this.latitude);
        defpackage.sqs.t(parcel, 3, this.longitude);
        defpackage.sqs.q(parcel, iP);
    }
}
