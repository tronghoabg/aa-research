package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public class StreetViewPanoramaOrientation extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.model.StreetViewPanoramaOrientation> CREATOR = new com.google.android.libraries.maps.model.StreetViewPanoramaOrientationCreator();
    public final float bearing;
    public final float tilt;

    public StreetViewPanoramaOrientation(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f) {
            z = true;
        }
        defpackage.sqs.ar(z, defpackage.a.bF(f, "Tilt needs to be between -90 and 90 inclusive: "));
        this.tilt = f + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.bearing = (((double) f2) <= 0.0d ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
    }

    public static com.google.android.libraries.maps.model.StreetViewPanoramaOrientation.Builder builder() {
        return new com.google.android.libraries.maps.model.StreetViewPanoramaOrientation.Builder();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.maps.model.StreetViewPanoramaOrientation)) {
            return false;
        }
        com.google.android.libraries.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation = (com.google.android.libraries.maps.model.StreetViewPanoramaOrientation) obj;
        return java.lang.Float.floatToIntBits(this.tilt) == java.lang.Float.floatToIntBits(streetViewPanoramaOrientation.tilt) && java.lang.Float.floatToIntBits(this.bearing) == java.lang.Float.floatToIntBits(streetViewPanoramaOrientation.bearing);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Float.valueOf(this.tilt), java.lang.Float.valueOf(this.bearing)});
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.sqg.b("tilt", java.lang.Float.valueOf(this.tilt), arrayList);
        defpackage.sqg.b("bearing", java.lang.Float.valueOf(this.bearing), arrayList);
        return defpackage.sqg.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.u(parcel, 2, this.tilt);
        defpackage.sqs.u(parcel, 3, this.bearing);
        defpackage.sqs.q(parcel, iP);
    }

    public static com.google.android.libraries.maps.model.StreetViewPanoramaOrientation.Builder builder(com.google.android.libraries.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        return new com.google.android.libraries.maps.model.StreetViewPanoramaOrientation.Builder(streetViewPanoramaOrientation);
    }

    public static final class Builder {
        public float bearing;
        public float tilt;

        public Builder(com.google.android.libraries.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            defpackage.sqs.aB(streetViewPanoramaOrientation, "StreetViewPanoramaOrientation");
            this.bearing = streetViewPanoramaOrientation.bearing;
            this.tilt = streetViewPanoramaOrientation.tilt;
        }

        public com.google.android.libraries.maps.model.StreetViewPanoramaOrientation.Builder bearing(float f) {
            this.bearing = f;
            return this;
        }

        public com.google.android.libraries.maps.model.StreetViewPanoramaOrientation build() {
            return new com.google.android.libraries.maps.model.StreetViewPanoramaOrientation(this.tilt, this.bearing);
        }

        public com.google.android.libraries.maps.model.StreetViewPanoramaOrientation.Builder tilt(float f) {
            this.tilt = f;
            return this;
        }

        public Builder() {
        }
    }
}
