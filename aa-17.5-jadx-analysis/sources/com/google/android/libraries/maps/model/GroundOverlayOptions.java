package com.google.android.libraries.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.sqh;
import defpackage.sqj;

/* loaded from: classes3.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new GroundOverlayOptionsCreator();
    public static final float NO_DIMENSION = -1.0f;
    private BitmapDescriptor a;
    private LatLng b;
    private float c;
    private float d;
    private LatLngBounds e;
    private float f;
    private float g;
    private boolean h;
    private float i;
    private float j;
    private float k;
    private boolean l;

    public GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        sqj sqhVar;
        this.h = true;
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.j = 0.5f;
        this.k = 0.5f;
        this.l = false;
        if (iBinder == null) {
            sqhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(iBinder);
        }
        this.a = new BitmapDescriptor(sqhVar);
        this.b = latLng;
        this.c = f;
        this.d = f2;
        this.e = latLngBounds;
        this.f = f3;
        this.g = f4;
        this.h = z;
        this.i = f5;
        this.j = f6;
        this.k = f7;
        this.l = z2;
    }

    private final void a(LatLng latLng, float f, float f2) {
        this.b = latLng;
        this.c = f;
        this.d = f2;
    }

    public GroundOverlayOptions anchor(float f, float f2) {
        this.j = f;
        this.k = f2;
        return this;
    }

    public GroundOverlayOptions bearing(float f) {
        this.f = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public GroundOverlayOptions clickable(boolean z) {
        this.l = z;
        return this;
    }

    public float getAnchorU() {
        return this.j;
    }

    public float getAnchorV() {
        return this.k;
    }

    public float getBearing() {
        return this.f;
    }

    public LatLngBounds getBounds() {
        return this.e;
    }

    public float getHeight() {
        return this.d;
    }

    public BitmapDescriptor getImage() {
        return this.a;
    }

    public LatLng getLocation() {
        return this.b;
    }

    public float getTransparency() {
        return this.i;
    }

    public float getWidth() {
        return this.c;
    }

    public float getZIndex() {
        return this.g;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapDescriptor) {
        spu.ax(bitmapDescriptor, "imageDescriptor must not be null");
        this.a = bitmapDescriptor;
        return this;
    }

    public boolean isClickable() {
        return this.l;
    }

    public boolean isVisible() {
        return this.h;
    }

    public GroundOverlayOptions position(LatLng latLng, float f, float f2) {
        spu.as(this.e == null, "Position has already been set using positionFromBounds");
        spu.an(latLng != null, "Location must be specified");
        spu.an(f >= BitmapDescriptorFactory.HUE_RED, "Width must be non-negative");
        spu.an(f2 >= BitmapDescriptorFactory.HUE_RED, "Height must be non-negative");
        a(latLng, f, f2);
        return this;
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        LatLng latLng = this.b;
        spu.as(latLng == null, "Position has already been set using position: ".concat(String.valueOf(String.valueOf(latLng))));
        this.e = latLngBounds;
        return this;
    }

    public GroundOverlayOptions transparency(float f) {
        boolean z = false;
        if (f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
            z = true;
        }
        spu.an(z, "Transparency must be in the range [0..1]");
        this.i = f;
        return this;
    }

    public GroundOverlayOptions visible(boolean z) {
        this.h = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.y(parcel, 2, this.a.getRemoteObject().asBinder());
        spu.E(parcel, 3, getLocation(), i);
        spu.q(parcel, 4, getWidth());
        spu.q(parcel, 5, getHeight());
        spu.E(parcel, 6, getBounds(), i);
        spu.q(parcel, 7, getBearing());
        spu.q(parcel, 8, getZIndex());
        spu.n(parcel, 9, isVisible());
        spu.q(parcel, 10, getTransparency());
        spu.q(parcel, 11, getAnchorU());
        spu.q(parcel, 12, getAnchorV());
        spu.n(parcel, 13, isClickable());
        spu.m(parcel, iL);
    }

    public GroundOverlayOptions zIndex(float f) {
        this.g = f;
        return this;
    }

    public GroundOverlayOptions position(LatLng latLng, float f) {
        spu.as(this.e == null, "Position has already been set using positionFromBounds");
        spu.an(latLng != null, "Location must be specified");
        spu.an(f >= BitmapDescriptorFactory.HUE_RED, "Width must be non-negative");
        a(latLng, f, -1.0f);
        return this;
    }

    public GroundOverlayOptions() {
        this.h = true;
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.j = 0.5f;
        this.k = 0.5f;
        this.l = false;
    }
}
