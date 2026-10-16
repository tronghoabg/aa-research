package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public class StreetViewPanoramaCamera extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.model.StreetViewPanoramaCamera> CREATOR = new com.google.android.libraries.maps.model.StreetViewPanoramaCameraCreator();
    private final com.google.android.libraries.maps.model.StreetViewPanoramaOrientation a;
    public final float bearing;
    public final float tilt;
    public final float zoom;

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        boolean z = false;
        if (f2 >= -90.0f && f2 <= 90.0f) {
            z = true;
        }
        defpackage.sqs.ar(z, defpackage.a.bF(f2, "Tilt needs to be between -90 and 90 inclusive: "));
        this.zoom = ((double) f) <= 0.0d ? 0.0f : f;
        this.tilt = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED + f2;
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        com.google.android.libraries.maps.model.StreetViewPanoramaOrientation.Builder builder = new com.google.android.libraries.maps.model.StreetViewPanoramaOrientation.Builder();
        builder.tilt(f2);
        builder.bearing(f3);
        this.a = builder.build();
    }

    public static com.google.android.libraries.maps.model.StreetViewPanoramaCamera.Builder builder() {
        return new com.google.android.libraries.maps.model.StreetViewPanoramaCamera.Builder();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.maps.model.StreetViewPanoramaCamera)) {
            return false;
        }
        com.google.android.libraries.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera = (com.google.android.libraries.maps.model.StreetViewPanoramaCamera) obj;
        return java.lang.Float.floatToIntBits(this.zoom) == java.lang.Float.floatToIntBits(streetViewPanoramaCamera.zoom) && java.lang.Float.floatToIntBits(this.tilt) == java.lang.Float.floatToIntBits(streetViewPanoramaCamera.tilt) && java.lang.Float.floatToIntBits(this.bearing) == java.lang.Float.floatToIntBits(streetViewPanoramaCamera.bearing);
    }

    public com.google.android.libraries.maps.model.StreetViewPanoramaOrientation getOrientation() {
        return this.a;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Float.valueOf(this.zoom), java.lang.Float.valueOf(this.tilt), java.lang.Float.valueOf(this.bearing)});
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.sqg.b("zoom", java.lang.Float.valueOf(this.zoom), arrayList);
        defpackage.sqg.b("tilt", java.lang.Float.valueOf(this.tilt), arrayList);
        defpackage.sqg.b("bearing", java.lang.Float.valueOf(this.bearing), arrayList);
        return defpackage.sqg.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.u(parcel, 2, this.zoom);
        defpackage.sqs.u(parcel, 3, this.tilt);
        defpackage.sqs.u(parcel, 4, this.bearing);
        defpackage.sqs.q(parcel, iP);
    }

    public static com.google.android.libraries.maps.model.StreetViewPanoramaCamera.Builder builder(com.google.android.libraries.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return new com.google.android.libraries.maps.model.StreetViewPanoramaCamera.Builder(streetViewPanoramaCamera);
    }

    public static final class Builder {
        public float bearing;
        public float tilt;
        public float zoom;

        public Builder(com.google.android.libraries.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera) {
            defpackage.sqs.aB(streetViewPanoramaCamera, "StreetViewPanoramaCamera");
            this.zoom = streetViewPanoramaCamera.zoom;
            this.bearing = streetViewPanoramaCamera.bearing;
            this.tilt = streetViewPanoramaCamera.tilt;
        }

        public com.google.android.libraries.maps.model.StreetViewPanoramaCamera.Builder bearing(float f) {
            this.bearing = f;
            return this;
        }

        public com.google.android.libraries.maps.model.StreetViewPanoramaCamera build() {
            return new com.google.android.libraries.maps.model.StreetViewPanoramaCamera(this.zoom, this.tilt, this.bearing);
        }

        public com.google.android.libraries.maps.model.StreetViewPanoramaCamera.Builder orientation(com.google.android.libraries.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            defpackage.sqs.aB(streetViewPanoramaOrientation, "StreetViewPanoramaOrientation");
            this.tilt = streetViewPanoramaOrientation.tilt;
            this.bearing = streetViewPanoramaOrientation.bearing;
            return this;
        }

        public com.google.android.libraries.maps.model.StreetViewPanoramaCamera.Builder tilt(float f) {
            this.tilt = f;
            return this;
        }

        public com.google.android.libraries.maps.model.StreetViewPanoramaCamera.Builder zoom(float f) {
            this.zoom = f;
            return this;
        }

        public Builder() {
        }
    }
}
