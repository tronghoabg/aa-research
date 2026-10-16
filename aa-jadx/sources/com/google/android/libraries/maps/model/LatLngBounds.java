package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public final class LatLngBounds extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.model.LatLngBounds> CREATOR = new com.google.android.libraries.maps.model.LatLngBoundsCreator();
    public final com.google.android.libraries.maps.model.LatLng northeast;
    public final com.google.android.libraries.maps.model.LatLng southwest;

    public static final class Builder {
        private double a = Double.POSITIVE_INFINITY;
        private double b = Double.NEGATIVE_INFINITY;
        private double c = Double.NaN;
        private double d = Double.NaN;

        public com.google.android.libraries.maps.model.LatLngBounds build() {
            defpackage.sqs.aw(!java.lang.Double.isNaN(this.c), "no included points");
            return new com.google.android.libraries.maps.model.LatLngBounds(new com.google.android.libraries.maps.model.LatLng(this.a, this.c), new com.google.android.libraries.maps.model.LatLng(this.b, this.d));
        }

        public com.google.android.libraries.maps.model.LatLngBounds.Builder include(com.google.android.libraries.maps.model.LatLng latLng) {
            this.a = java.lang.Math.min(this.a, latLng.latitude);
            this.b = java.lang.Math.max(this.b, latLng.latitude);
            double d = latLng.longitude;
            if (java.lang.Double.isNaN(this.c)) {
                this.c = d;
                this.d = d;
                return this;
            }
            double d2 = this.c;
            double d3 = this.d;
            if (d2 > d3 ? !(d2 <= d || d <= d3) : !(d2 <= d && d <= d3)) {
                if (((d2 - d) + 360.0d) % 360.0d < ((d - d3) + 360.0d) % 360.0d) {
                    this.c = d;
                    return this;
                }
                this.d = d;
            }
            return this;
        }
    }

    public LatLngBounds(com.google.android.libraries.maps.model.LatLng latLng, com.google.android.libraries.maps.model.LatLng latLng2) {
        defpackage.sqs.aB(latLng, "null southwest");
        defpackage.sqs.aB(latLng2, "null northeast");
        double d = latLng2.latitude;
        double d2 = latLng.latitude;
        defpackage.acmj.h(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", new java.lang.Object[]{java.lang.Double.valueOf(d2), java.lang.Double.valueOf(latLng2.latitude)});
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    private final boolean a(double d) {
        com.google.android.libraries.maps.model.LatLng latLng = this.northeast;
        double d2 = this.southwest.longitude;
        double d3 = latLng.longitude;
        if (d2 <= d3) {
            return d2 <= d && d <= d3;
        }
        return d2 <= d || d <= d3;
    }

    public static com.google.android.libraries.maps.model.LatLngBounds.Builder builder() {
        return new com.google.android.libraries.maps.model.LatLngBounds.Builder();
    }

    public static com.google.android.libraries.maps.model.LatLngBounds createFromAttributes(android.content.Context context, android.util.AttributeSet attributeSet) {
        return com.google.android.libraries.maps.GoogleMapOptions.createLatLngBoundsFromAttributes(context, attributeSet);
    }

    public boolean contains(com.google.android.libraries.maps.model.LatLng latLng) {
        com.google.android.libraries.maps.model.LatLng latLng2 = this.southwest;
        double d = latLng.latitude;
        return latLng2.latitude <= d && d <= this.northeast.latitude && a(latLng.longitude);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.maps.model.LatLngBounds)) {
            return false;
        }
        com.google.android.libraries.maps.model.LatLngBounds latLngBounds = (com.google.android.libraries.maps.model.LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    public com.google.android.libraries.maps.model.LatLng getCenter() {
        com.google.android.libraries.maps.model.LatLng latLng = this.northeast;
        com.google.android.libraries.maps.model.LatLng latLng2 = this.southwest;
        double d = latLng2.latitude + latLng.latitude;
        double d2 = latLng.longitude;
        double d3 = latLng2.longitude;
        if (d3 > d2) {
            d2 += 360.0d;
        }
        return new com.google.android.libraries.maps.model.LatLng(d / 2.0d, (d2 + d3) / 2.0d);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.southwest, this.northeast});
    }

    public com.google.android.libraries.maps.model.LatLngBounds including(com.google.android.libraries.maps.model.LatLng latLng) {
        double dMin = java.lang.Math.min(this.southwest.latitude, latLng.latitude);
        double dMax = java.lang.Math.max(this.northeast.latitude, latLng.latitude);
        double d = this.northeast.longitude;
        double d2 = this.southwest.longitude;
        double d3 = latLng.longitude;
        if (!a(d3)) {
            if (((d2 - d3) + 360.0d) % 360.0d < ((d3 - d) + 360.0d) % 360.0d) {
                d2 = d3;
            } else {
                d = d3;
            }
        }
        return new com.google.android.libraries.maps.model.LatLngBounds(new com.google.android.libraries.maps.model.LatLng(dMin, d2), new com.google.android.libraries.maps.model.LatLng(dMax, d));
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.sqg.b("southwest", this.southwest, arrayList);
        defpackage.sqg.b("northeast", this.northeast, arrayList);
        return defpackage.sqg.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 2, this.southwest, i);
        defpackage.sqs.I(parcel, 3, this.northeast, i);
        defpackage.sqs.q(parcel, iP);
    }

    public LatLngBounds(com.google.android.libraries.maps.model.LatLngBounds latLngBounds) {
        this(latLngBounds.southwest, latLngBounds.northeast);
    }
}
