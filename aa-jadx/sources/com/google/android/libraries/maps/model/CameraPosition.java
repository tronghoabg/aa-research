package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraPosition extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.model.CameraPosition> CREATOR = new com.google.android.libraries.maps.model.CameraPositionCreator();
    public final float bearing;
    public final com.google.android.libraries.maps.model.LatLng target;
    public final float tilt;
    public final float zoom;

    public CameraPosition(com.google.android.libraries.maps.model.LatLng latLng, float f, float f2, float f3) {
        defpackage.sqs.aB(latLng, "null camera target");
        defpackage.acmj.h(f2 >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", new java.lang.Object[]{java.lang.Float.valueOf(f2)});
        this.target = latLng;
        this.zoom = f;
        this.tilt = f2 + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public static com.google.android.libraries.maps.model.CameraPosition.Builder builder() {
        return new com.google.android.libraries.maps.model.CameraPosition.Builder();
    }

    public static com.google.android.libraries.maps.model.CameraPosition createFromAttributes(android.content.Context context, android.util.AttributeSet attributeSet) {
        return com.google.android.libraries.maps.GoogleMapOptions.createCameraPositionFromAttributes(context, attributeSet);
    }

    public static final com.google.android.libraries.maps.model.CameraPosition fromLatLngZoom(com.google.android.libraries.maps.model.LatLng latLng, float f) {
        return new com.google.android.libraries.maps.model.CameraPosition(latLng, f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.maps.model.CameraPosition)) {
            return false;
        }
        com.google.android.libraries.maps.model.CameraPosition cameraPosition = (com.google.android.libraries.maps.model.CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && java.lang.Float.floatToIntBits(this.zoom) == java.lang.Float.floatToIntBits(cameraPosition.zoom) && java.lang.Float.floatToIntBits(this.tilt) == java.lang.Float.floatToIntBits(cameraPosition.tilt) && java.lang.Float.floatToIntBits(this.bearing) == java.lang.Float.floatToIntBits(cameraPosition.bearing);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.target, java.lang.Float.valueOf(this.zoom), java.lang.Float.valueOf(this.tilt), java.lang.Float.valueOf(this.bearing)});
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.sqg.b("target", this.target, arrayList);
        defpackage.sqg.b("zoom", java.lang.Float.valueOf(this.zoom), arrayList);
        defpackage.sqg.b("tilt", java.lang.Float.valueOf(this.tilt), arrayList);
        defpackage.sqg.b("bearing", java.lang.Float.valueOf(this.bearing), arrayList);
        return defpackage.sqg.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 2, this.target, i);
        defpackage.sqs.u(parcel, 3, this.zoom);
        defpackage.sqs.u(parcel, 4, this.tilt);
        defpackage.sqs.u(parcel, 5, this.bearing);
        defpackage.sqs.q(parcel, iP);
    }

    public static com.google.android.libraries.maps.model.CameraPosition.Builder builder(com.google.android.libraries.maps.model.CameraPosition cameraPosition) {
        return new com.google.android.libraries.maps.model.CameraPosition.Builder(cameraPosition);
    }

    public static final class Builder {
        private com.google.android.libraries.maps.model.LatLng a;
        private float b;
        private float c;
        private float d;

        public Builder(com.google.android.libraries.maps.model.CameraPosition cameraPosition) {
            this.a = cameraPosition.target;
            this.b = cameraPosition.zoom;
            this.c = cameraPosition.tilt;
            this.d = cameraPosition.bearing;
        }

        public com.google.android.libraries.maps.model.CameraPosition.Builder bearing(float f) {
            this.d = f;
            return this;
        }

        public com.google.android.libraries.maps.model.CameraPosition build() {
            return new com.google.android.libraries.maps.model.CameraPosition(this.a, this.b, this.c, this.d);
        }

        public com.google.android.libraries.maps.model.CameraPosition.Builder target(com.google.android.libraries.maps.model.LatLng latLng) {
            this.a = latLng;
            return this;
        }

        public com.google.android.libraries.maps.model.CameraPosition.Builder tilt(float f) {
            this.c = f;
            return this;
        }

        public com.google.android.libraries.maps.model.CameraPosition.Builder zoom(float f) {
            this.b = f;
            return this;
        }

        public Builder() {
        }
    }

    public CameraPosition(com.google.android.libraries.maps.model.CameraPosition cameraPosition) {
        this(cameraPosition.target, cameraPosition.zoom, cameraPosition.tilt, cameraPosition.bearing);
    }
}
