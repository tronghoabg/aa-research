package com.google.android.libraries.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.libraries.maps.model.AdvancedMarkerOptions;
import com.google.android.libraries.maps.model.Marker;
import defpackage.spu;
import defpackage.sqh;
import defpackage.sqi;
import defpackage.sqj;

/* loaded from: classes3.dex */
public class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new MarkerOptionsCreator();
    private LatLng a;
    private String b;
    private String c;
    private BitmapDescriptor d;
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
    private View p;
    private int q;
    private String r;

    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7, int i, IBinder iBinder2, int i2, String str3) {
        sqj sqhVar;
        this.e = 0.5f;
        this.f = 1.0f;
        this.h = true;
        this.i = false;
        this.j = BitmapDescriptorFactory.HUE_RED;
        this.k = 0.5f;
        this.l = BitmapDescriptorFactory.HUE_RED;
        this.m = 1.0f;
        this.o = 0;
        this.a = latLng;
        this.b = str;
        this.c = str2;
        if (iBinder == null) {
            this.d = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            this.d = new BitmapDescriptor(iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(iBinder));
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
            sqhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            sqhVar = iInterfaceQueryLocalInterface2 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface2 : new sqh(iBinder2);
        }
        this.p = sqhVar != null ? (View) sqi.a(sqhVar) : null;
        this.q = i2;
        this.r = str3;
    }

    public MarkerOptions alpha(float f) {
        this.m = f;
        return this;
    }

    public MarkerOptions anchor(float f, float f2) {
        this.e = f;
        this.f = f2;
        return this;
    }

    @Deprecated
    public MarkerOptions collisionBehavior(@Marker.CollisionBehavior int i) {
        this.o = i;
        return this;
    }

    public MarkerOptions collisionBehaviorInternal(@AdvancedMarkerOptions.CollisionBehavior int i) {
        this.o = i;
        return this;
    }

    public MarkerOptions contentDescription(String str) {
        this.r = str;
        return this;
    }

    public MarkerOptions draggable(boolean z) {
        this.g = z;
        return this;
    }

    public MarkerOptions flat(boolean z) {
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

    @Deprecated
    public int getCollisionBehavior() {
        return this.o;
    }

    public int getCollisionBehaviorInternal() {
        return this.o;
    }

    public String getContentDescription() {
        return this.r;
    }

    public BitmapDescriptor getIcon() {
        return this.d;
    }

    public View getIconViewInternal() {
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

    public LatLng getPosition() {
        return this.a;
    }

    public float getRotation() {
        return this.j;
    }

    public String getSnippet() {
        return this.c;
    }

    public String getTitle() {
        return this.b;
    }

    public float getZIndex() {
        return this.n;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        this.d = bitmapDescriptor;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f, float f2) {
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

    public MarkerOptions position(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.a = latLng;
        return this;
    }

    public MarkerOptions rotation(float f) {
        this.j = f;
        return this;
    }

    public MarkerOptions setIconViewInternal(View view) {
        this.p = view;
        return this;
    }

    public MarkerOptions setMarkerType(int i) {
        this.q = i;
        return this;
    }

    public MarkerOptions snippet(String str) {
        this.c = str;
        return this;
    }

    public MarkerOptions title(String str) {
        this.b = str;
        return this;
    }

    public MarkerOptions visible(boolean z) {
        this.h = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 2, getPosition(), i);
        spu.F(parcel, 3, getTitle());
        spu.F(parcel, 4, getSnippet());
        BitmapDescriptor bitmapDescriptor = this.d;
        spu.y(parcel, 5, bitmapDescriptor == null ? null : bitmapDescriptor.getRemoteObject().asBinder());
        spu.q(parcel, 6, getAnchorU());
        spu.q(parcel, 7, getAnchorV());
        spu.n(parcel, 8, isDraggable());
        spu.n(parcel, 9, isVisible());
        spu.n(parcel, 10, isFlat());
        spu.q(parcel, 11, getRotation());
        spu.q(parcel, 12, getInfoWindowAnchorU());
        spu.q(parcel, 13, getInfoWindowAnchorV());
        spu.q(parcel, 14, getAlpha());
        spu.q(parcel, 15, getZIndex());
        spu.r(parcel, 17, getCollisionBehavior());
        spu.y(parcel, 18, new sqi(this.p));
        spu.r(parcel, 19, getMarkerType());
        spu.F(parcel, 20, getContentDescription());
        spu.m(parcel, iL);
    }

    public MarkerOptions zIndex(float f) {
        this.n = f;
        return this;
    }

    public MarkerOptions() {
        this.e = 0.5f;
        this.f = 1.0f;
        this.h = true;
        this.i = false;
        this.j = BitmapDescriptorFactory.HUE_RED;
        this.k = 0.5f;
        this.l = BitmapDescriptorFactory.HUE_RED;
        this.m = 1.0f;
        this.o = 0;
    }
}
