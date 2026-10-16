package com.google.android.libraries.maps;

/* JADX INFO: loaded from: classes3.dex */
public final class StreetViewPanoramaOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.StreetViewPanoramaOptions> CREATOR = new com.google.android.libraries.maps.StreetViewPanoramaOptionsCreator();
    private com.google.android.libraries.maps.model.StreetViewPanoramaCamera a;
    private java.lang.String b;
    private com.google.android.libraries.maps.model.LatLng c;
    private java.lang.Integer d;
    private java.lang.Boolean e;
    private java.lang.Boolean f;
    private java.lang.Boolean g;
    private java.lang.Boolean h;
    private java.lang.Boolean i;
    private com.google.android.libraries.maps.model.StreetViewSource j;

    public StreetViewPanoramaOptions(com.google.android.libraries.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera, java.lang.String str, com.google.android.libraries.maps.model.LatLng latLng, java.lang.Integer num, byte b, byte b2, byte b3, byte b4, byte b5, com.google.android.libraries.maps.model.StreetViewSource streetViewSource) {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.e = bool;
        this.f = bool;
        this.g = bool;
        this.h = bool;
        this.j = com.google.android.libraries.maps.model.StreetViewSource.DEFAULT;
        this.a = streetViewPanoramaCamera;
        this.c = latLng;
        this.d = num;
        this.b = str;
        this.e = defpackage.vjx.i(b);
        this.f = defpackage.vjx.i(b2);
        this.g = defpackage.vjx.i(b3);
        this.h = defpackage.vjx.i(b4);
        this.i = defpackage.vjx.i(b5);
        this.j = streetViewSource;
    }

    public java.lang.Boolean getPanningGesturesEnabled() {
        return this.g;
    }

    public java.lang.String getPanoramaId() {
        return this.b;
    }

    public com.google.android.libraries.maps.model.LatLng getPosition() {
        return this.c;
    }

    public java.lang.Integer getRadius() {
        return this.d;
    }

    public com.google.android.libraries.maps.model.StreetViewSource getSource() {
        return this.j;
    }

    public java.lang.Boolean getStreetNamesEnabled() {
        return this.h;
    }

    public com.google.android.libraries.maps.model.StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.a;
    }

    public java.lang.Boolean getUseViewLifecycleInFragment() {
        return this.i;
    }

    public java.lang.Boolean getUserNavigationEnabled() {
        return this.e;
    }

    public java.lang.Boolean getZoomGesturesEnabled() {
        return this.f;
    }

    public com.google.android.libraries.maps.StreetViewPanoramaOptions panningGesturesEnabled(boolean z) {
        this.g = java.lang.Boolean.valueOf(z);
        return this;
    }

    public com.google.android.libraries.maps.StreetViewPanoramaOptions panoramaCamera(com.google.android.libraries.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.a = streetViewPanoramaCamera;
        return this;
    }

    public com.google.android.libraries.maps.StreetViewPanoramaOptions panoramaId(java.lang.String str) {
        this.b = str;
        return this;
    }

    public com.google.android.libraries.maps.StreetViewPanoramaOptions position(com.google.android.libraries.maps.model.LatLng latLng, java.lang.Integer num, com.google.android.libraries.maps.model.StreetViewSource streetViewSource) {
        this.c = latLng;
        this.d = num;
        this.j = streetViewSource;
        return this;
    }

    public com.google.android.libraries.maps.StreetViewPanoramaOptions streetNamesEnabled(boolean z) {
        this.h = java.lang.Boolean.valueOf(z);
        return this;
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.sqg.b("PanoramaId", this.b, arrayList);
        defpackage.sqg.b("Position", this.c, arrayList);
        defpackage.sqg.b("Radius", this.d, arrayList);
        defpackage.sqg.b("Source", this.j, arrayList);
        defpackage.sqg.b("StreetViewPanoramaCamera", this.a, arrayList);
        defpackage.sqg.b("UserNavigationEnabled", this.e, arrayList);
        defpackage.sqg.b("ZoomGesturesEnabled", this.f, arrayList);
        defpackage.sqg.b("PanningGesturesEnabled", this.g, arrayList);
        defpackage.sqg.b("StreetNamesEnabled", this.h, arrayList);
        defpackage.sqg.b("UseViewLifecycleInFragment", this.i, arrayList);
        return defpackage.sqg.a(arrayList, this);
    }

    public com.google.android.libraries.maps.StreetViewPanoramaOptions useViewLifecycleInFragment(boolean z) {
        this.i = java.lang.Boolean.valueOf(z);
        return this;
    }

    public com.google.android.libraries.maps.StreetViewPanoramaOptions userNavigationEnabled(boolean z) {
        this.e = java.lang.Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 2, getStreetViewPanoramaCamera(), i);
        defpackage.sqs.J(parcel, 3, getPanoramaId());
        defpackage.sqs.I(parcel, 4, getPosition(), i);
        defpackage.sqs.F(parcel, 5, getRadius());
        defpackage.sqs.s(parcel, 6, defpackage.vjx.h(this.e));
        defpackage.sqs.s(parcel, 7, defpackage.vjx.h(this.f));
        defpackage.sqs.s(parcel, 8, defpackage.vjx.h(this.g));
        defpackage.sqs.s(parcel, 9, defpackage.vjx.h(this.h));
        defpackage.sqs.s(parcel, 10, defpackage.vjx.h(this.i));
        defpackage.sqs.I(parcel, 11, getSource(), i);
        defpackage.sqs.q(parcel, iP);
    }

    public com.google.android.libraries.maps.StreetViewPanoramaOptions zoomGesturesEnabled(boolean z) {
        this.f = java.lang.Boolean.valueOf(z);
        return this;
    }

    public com.google.android.libraries.maps.StreetViewPanoramaOptions position(com.google.android.libraries.maps.model.LatLng latLng, com.google.android.libraries.maps.model.StreetViewSource streetViewSource) {
        this.c = latLng;
        this.j = streetViewSource;
        return this;
    }

    public com.google.android.libraries.maps.StreetViewPanoramaOptions position(com.google.android.libraries.maps.model.LatLng latLng, java.lang.Integer num) {
        this.c = latLng;
        this.d = num;
        return this;
    }

    public com.google.android.libraries.maps.StreetViewPanoramaOptions position(com.google.android.libraries.maps.model.LatLng latLng) {
        this.c = latLng;
        return this;
    }

    public StreetViewPanoramaOptions() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.e = bool;
        this.f = bool;
        this.g = bool;
        this.h = bool;
        this.j = com.google.android.libraries.maps.model.StreetViewSource.DEFAULT;
    }
}
