package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public class MarkerOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.model.MarkerOptions> CREATOR = new com.google.android.libraries.maps.model.MarkerOptionsCreator();
    private com.google.android.libraries.maps.model.LatLng a;
    private java.lang.String b;
    private java.lang.String c;
    private com.google.android.libraries.maps.model.BitmapDescriptor d;
    private float e;
    private float f;
    private boolean g;
    private boolean h;
    private boolean i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private int o;
    private android.view.View p;
    private int q;
    private java.lang.String r;

    public MarkerOptions(com.google.android.libraries.maps.model.LatLng latLng, java.lang.String str, java.lang.String str2, android.os.IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7, int i, android.os.IBinder iBinder2, int i2, java.lang.String str3) {
        defpackage.srh srfVar;
        this.e = 0.5f;
        this.f = 1.0f;
        this.h = true;
        this.i = false;
        this.j = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.k = 0.5f;
        this.l = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.m = 1.0f;
        this.o = 0;
        this.a = latLng;
        this.b = str;
        this.c = str2;
        if (iBinder == null) {
            this.d = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            this.d = new com.google.android.libraries.maps.model.BitmapDescriptor(iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(iBinder));
        }
        this.e = f;
        this.f = f2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = f3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
        this.o = i;
        if (iBinder2 == null) {
            srfVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            srfVar = iInterfaceQueryLocalInterface2 instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface2 : new defpackage.srf(iBinder2);
        }
        this.p = srfVar != null ? (android.view.View) defpackage.srg.a(srfVar) : null;
        this.q = i2;
        this.r = str3;
    }

    public com.google.android.libraries.maps.model.MarkerOptions alpha(float f) {
        this.m = f;
        return this;
    }

    public com.google.android.libraries.maps.model.MarkerOptions anchor(float f, float f2) {
        this.e = f;
        this.f = f2;
        return this;
    }

    @java.lang.Deprecated
    public com.google.android.libraries.maps.model.MarkerOptions collisionBehavior(@com.google.android.libraries.maps.model.Marker.CollisionBehavior int i) {
        this.o = i;
        return this;
    }

    public com.google.android.libraries.maps.model.MarkerOptions collisionBehaviorInternal(@com.google.android.libraries.maps.model.AdvancedMarkerOptions.CollisionBehavior int i) {
        this.o = i;
        return this;
    }

    public com.google.android.libraries.maps.model.MarkerOptions contentDescription(java.lang.String str) {
        this.r = str;
        return this;
    }

    public com.google.android.libraries.maps.model.MarkerOptions draggable(boolean z) {
        this.g = z;
        return this;
    }

    public com.google.android.libraries.maps.model.MarkerOptions flat(boolean z) {
        this.i = z;
        return this;
    }

    public float getAlpha() {
        return this.m;
    }

    public float getAnchorU() {
        return this.e;
    }

    public float getAnchorV() {
        return this.f;
    }

    @java.lang.Deprecated
    public int getCollisionBehavior() {
        return this.o;
    }

    public int getCollisionBehaviorInternal() {
        return this.o;
    }

    public java.lang.String getContentDescription() {
        return this.r;
    }

    public com.google.android.libraries.maps.model.BitmapDescriptor getIcon() {
        return this.d;
    }

    public android.view.View getIconViewInternal() {
        return this.p;
    }

    public float getInfoWindowAnchorU() {
        return this.k;
    }

    public float getInfoWindowAnchorV() {
        return this.l;
    }

    public int getMarkerType() {
        return this.q;
    }

    public com.google.android.libraries.maps.model.LatLng getPosition() {
        return this.a;
    }

    public float getRotation() {
        return this.j;
    }

    public java.lang.String getSnippet() {
        return this.c;
    }

    public java.lang.String getTitle() {
        return this.b;
    }

    public float getZIndex() {
        return this.n;
    }

    public com.google.android.libraries.maps.model.MarkerOptions icon(com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor) {
        this.d = bitmapDescriptor;
        return this;
    }

    public com.google.android.libraries.maps.model.MarkerOptions infoWindowAnchor(float f, float f2) {
        this.k = f;
        this.l = f2;
        return this;
    }

    public boolean isDraggable() {
        return this.g;
    }

    public boolean isFlat() {
        return this.i;
    }

    public boolean isVisible() {
        return this.h;
    }

    public com.google.android.libraries.maps.model.MarkerOptions position(com.google.android.libraries.maps.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.a = latLng;
        return this;
    }

    public com.google.android.libraries.maps.model.MarkerOptions rotation(float f) {
        this.j = f;
        return this;
    }

    public com.google.android.libraries.maps.model.MarkerOptions setIconViewInternal(android.view.View view) {
        this.p = view;
        return this;
    }

    public com.google.android.libraries.maps.model.MarkerOptions setMarkerType(int i) {
        this.q = i;
        return this;
    }

    public com.google.android.libraries.maps.model.MarkerOptions snippet(java.lang.String str) {
        this.c = str;
        return this;
    }

    public com.google.android.libraries.maps.model.MarkerOptions title(java.lang.String str) {
        this.b = str;
        return this;
    }

    public com.google.android.libraries.maps.model.MarkerOptions visible(boolean z) {
        this.h = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 2, getPosition(), i);
        defpackage.sqs.J(parcel, 3, getTitle());
        defpackage.sqs.J(parcel, 4, getSnippet());
        com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor = this.d;
        defpackage.sqs.C(parcel, 5, bitmapDescriptor == null ? null : bitmapDescriptor.getRemoteObject().asBinder());
        defpackage.sqs.u(parcel, 6, getAnchorU());
        defpackage.sqs.u(parcel, 7, getAnchorV());
        defpackage.sqs.r(parcel, 8, isDraggable());
        defpackage.sqs.r(parcel, 9, isVisible());
        defpackage.sqs.r(parcel, 10, isFlat());
        defpackage.sqs.u(parcel, 11, getRotation());
        defpackage.sqs.u(parcel, 12, getInfoWindowAnchorU());
        defpackage.sqs.u(parcel, 13, getInfoWindowAnchorV());
        defpackage.sqs.u(parcel, 14, getAlpha());
        defpackage.sqs.u(parcel, 15, getZIndex());
        defpackage.sqs.v(parcel, 17, getCollisionBehavior());
        defpackage.sqs.C(parcel, 18, new defpackage.srg(this.p));
        defpackage.sqs.v(parcel, 19, getMarkerType());
        defpackage.sqs.J(parcel, 20, getContentDescription());
        defpackage.sqs.q(parcel, iP);
    }

    public com.google.android.libraries.maps.model.MarkerOptions zIndex(float f) {
        this.n = f;
        return this;
    }

    public MarkerOptions() {
        this.e = 0.5f;
        this.f = 1.0f;
        this.h = true;
        this.i = false;
        this.j = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.k = 0.5f;
        this.l = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.m = 1.0f;
        this.o = 0;
    }
}
