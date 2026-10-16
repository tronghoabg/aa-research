package com.google.android.libraries.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.LatLngBounds;
import com.google.android.libraries.maps.model.MapColorScheme;
import defpackage.spu;
import defpackage.thg;
import defpackage.vja;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new GoogleMapOptionsCreator();
    private static final Integer a = Integer.valueOf(Color.argb(255, 236, 233, 225));
    private Boolean b;
    private Boolean c;
    private int d;
    private CameraPosition e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Boolean n;
    private Float o;
    private Float p;
    private LatLngBounds q;
    private Boolean r;
    private Integer s;
    private String t;
    private Boolean u;

    @MapColorScheme
    private int v;

    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12, Integer num, String str, byte b13, @MapColorScheme int i2) {
        this.d = -1;
        this.o = null;
        this.p = null;
        this.q = null;
        this.s = null;
        this.t = null;
        this.v = -1;
        this.b = vja.g(b);
        this.c = vja.g(b2);
        this.d = i;
        this.e = cameraPosition;
        this.f = vja.g(b3);
        this.g = vja.g(b4);
        this.h = vja.g(b5);
        this.i = vja.g(b6);
        this.j = vja.g(b7);
        this.k = vja.g(b8);
        this.l = vja.g(b9);
        this.m = vja.g(b10);
        this.n = vja.g(b11);
        this.o = f;
        this.p = f2;
        this.q = latLngBounds;
        this.r = vja.g(b12);
        this.s = num;
        this.t = str;
        this.u = vja.g(b13);
        this.v = i2;
    }

    public static CameraPosition createCameraPositionFromAttributes(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        LatLng latLng = new LatLng(typedArrayObtainAttributes.hasValue(5) ? typedArrayObtainAttributes.getFloat(5, BitmapDescriptorFactory.HUE_RED) : 0.0f, typedArrayObtainAttributes.hasValue(6) ? typedArrayObtainAttributes.getFloat(6, BitmapDescriptorFactory.HUE_RED) : 0.0f);
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        if (typedArrayObtainAttributes.hasValue(8)) {
            builder.zoom(typedArrayObtainAttributes.getFloat(8, BitmapDescriptorFactory.HUE_RED));
        }
        if (typedArrayObtainAttributes.hasValue(2)) {
            builder.bearing(typedArrayObtainAttributes.getFloat(2, BitmapDescriptorFactory.HUE_RED));
        }
        if (typedArrayObtainAttributes.hasValue(7)) {
            builder.tilt(typedArrayObtainAttributes.getFloat(7, BitmapDescriptorFactory.HUE_RED));
        }
        typedArrayObtainAttributes.recycle();
        return builder.build();
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (typedArrayObtainAttributes.hasValue(17)) {
            googleMapOptions.mapType(typedArrayObtainAttributes.getInt(17, -1));
        }
        if (typedArrayObtainAttributes.hasValue(27)) {
            googleMapOptions.zOrderOnTop(typedArrayObtainAttributes.getBoolean(27, false));
        }
        if (typedArrayObtainAttributes.hasValue(26)) {
            googleMapOptions.useViewLifecycleInFragment(typedArrayObtainAttributes.getBoolean(26, false));
        }
        if (typedArrayObtainAttributes.hasValue(18)) {
            googleMapOptions.compassEnabled(typedArrayObtainAttributes.getBoolean(18, true));
        }
        if (typedArrayObtainAttributes.hasValue(20)) {
            googleMapOptions.rotateGesturesEnabled(typedArrayObtainAttributes.getBoolean(20, true));
        }
        if (typedArrayObtainAttributes.hasValue(22)) {
            googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(typedArrayObtainAttributes.getBoolean(22, true));
        }
        if (typedArrayObtainAttributes.hasValue(21)) {
            googleMapOptions.scrollGesturesEnabled(typedArrayObtainAttributes.getBoolean(21, true));
        }
        if (typedArrayObtainAttributes.hasValue(23)) {
            googleMapOptions.tiltGesturesEnabled(typedArrayObtainAttributes.getBoolean(23, true));
        }
        if (typedArrayObtainAttributes.hasValue(25)) {
            googleMapOptions.zoomGesturesEnabled(typedArrayObtainAttributes.getBoolean(25, true));
        }
        if (typedArrayObtainAttributes.hasValue(24)) {
            googleMapOptions.zoomControlsEnabled(typedArrayObtainAttributes.getBoolean(24, true));
        }
        if (typedArrayObtainAttributes.hasValue(14)) {
            googleMapOptions.liteMode(typedArrayObtainAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainAttributes.hasValue(19)) {
            googleMapOptions.mapToolbarEnabled(typedArrayObtainAttributes.getBoolean(19, true));
        }
        if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_ambientEnabled)) {
            googleMapOptions.ambientEnabled(typedArrayObtainAttributes.getBoolean(R.styleable.MapAttrs_ambientEnabled, false));
        }
        if (typedArrayObtainAttributes.hasValue(4)) {
            googleMapOptions.minZoomPreference(typedArrayObtainAttributes.getFloat(4, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(4)) {
            googleMapOptions.maxZoomPreference(typedArrayObtainAttributes.getFloat(3, Float.POSITIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(9)) {
            googleMapOptions.setInstrumentClusterMap(typedArrayObtainAttributes.getBoolean(9, false));
        }
        if (typedArrayObtainAttributes.hasValue(16) && (string = typedArrayObtainAttributes.getString(16)) != null && !string.isEmpty()) {
            googleMapOptions.mapId(string);
        }
        if (typedArrayObtainAttributes.hasValue(1)) {
            googleMapOptions.backgroundColor(Integer.valueOf(typedArrayObtainAttributes.getColor(1, a.intValue())));
        }
        if (typedArrayObtainAttributes.hasValue(15)) {
            googleMapOptions.mapColorScheme(typedArrayObtainAttributes.getInt(15, -1));
        }
        googleMapOptions.latLngBoundsForCameraTarget(createLatLngBoundsFromAttributes(context, attributeSet));
        googleMapOptions.camera(createCameraPositionFromAttributes(context, attributeSet));
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    public static LatLngBounds createLatLngBoundsFromAttributes(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        Float fValueOf = typedArrayObtainAttributes.hasValue(12) ? Float.valueOf(typedArrayObtainAttributes.getFloat(12, BitmapDescriptorFactory.HUE_RED)) : null;
        Float fValueOf2 = typedArrayObtainAttributes.hasValue(13) ? Float.valueOf(typedArrayObtainAttributes.getFloat(13, BitmapDescriptorFactory.HUE_RED)) : null;
        Float fValueOf3 = typedArrayObtainAttributes.hasValue(10) ? Float.valueOf(typedArrayObtainAttributes.getFloat(10, BitmapDescriptorFactory.HUE_RED)) : null;
        Float fValueOf4 = typedArrayObtainAttributes.hasValue(11) ? Float.valueOf(typedArrayObtainAttributes.getFloat(11, BitmapDescriptorFactory.HUE_RED)) : null;
        typedArrayObtainAttributes.recycle();
        if (fValueOf == null || fValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
    }

    public GoogleMapOptions ambientEnabled(boolean z) {
        this.n = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions backgroundColor(Integer num) {
        this.s = num;
        return this;
    }

    public GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.e = cameraPosition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    public Boolean getAmbientEnabled() {
        return this.n;
    }

    public Integer getBackgroundColor() {
        return this.s;
    }

    public CameraPosition getCamera() {
        return this.e;
    }

    public Boolean getCompassEnabled() {
        return this.g;
    }

    public LatLngBounds getLatLngBoundsForCameraTarget() {
        LatLngBounds latLngBounds = this.q;
        if (latLngBounds != null) {
            return new LatLngBounds(latLngBounds);
        }
        return null;
    }

    public Boolean getLiteMode() {
        return this.l;
    }

    @MapColorScheme
    public int getMapColorScheme() {
        return this.v;
    }

    public String getMapId() {
        return this.t;
    }

    public Boolean getMapToolbarEnabled() {
        return this.m;
    }

    public int getMapType() {
        return this.d;
    }

    public Float getMaxZoomPreference() {
        return this.p;
    }

    public Float getMinZoomPreference() {
        return this.o;
    }

    public Boolean getRotateGesturesEnabled() {
        return this.k;
    }

    public Boolean getScrollGesturesEnabled() {
        return this.h;
    }

    public Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.r;
    }

    public Boolean getTiltGesturesEnabled() {
        return this.j;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.c;
    }

    public Boolean getZOrderOnTop() {
        return this.b;
    }

    public Boolean getZoomControlsEnabled() {
        return this.f;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.i;
    }

    public Boolean isInstrumentClusterMap() {
        return this.u;
    }

    public GoogleMapOptions latLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        this.q = latLngBounds;
        return this;
    }

    public GoogleMapOptions liteMode(boolean z) {
        this.l = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapColorScheme(@MapColorScheme int i) {
        this.v = i;
        return this;
    }

    public GoogleMapOptions mapId(String str) {
        this.t = str;
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.m = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapType(int i) {
        this.d = i;
        return this;
    }

    public GoogleMapOptions maxZoomPreference(float f) {
        this.p = Float.valueOf(f);
        return this;
    }

    public GoogleMapOptions minZoomPreference(float f) {
        this.o = Float.valueOf(f);
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.k = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.h = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z) {
        this.r = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions setInstrumentClusterMap(boolean z) {
        this.u = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        thg.w("MapType", Integer.valueOf(this.d), arrayList);
        thg.w("LiteMode", this.l, arrayList);
        thg.w("Camera", this.e, arrayList);
        thg.w("CompassEnabled", this.g, arrayList);
        thg.w("ZoomControlsEnabled", this.f, arrayList);
        thg.w("ScrollGesturesEnabled", this.h, arrayList);
        thg.w("ZoomGesturesEnabled", this.i, arrayList);
        thg.w("TiltGesturesEnabled", this.j, arrayList);
        thg.w("RotateGesturesEnabled", this.k, arrayList);
        thg.w("ScrollGesturesEnabledDuringRotateOrZoom", this.r, arrayList);
        thg.w("MapToolbarEnabled", this.m, arrayList);
        thg.w("AmbientEnabled", this.n, arrayList);
        thg.w("MinZoomPreference", this.o, arrayList);
        thg.w("MaxZoomPreference", this.p, arrayList);
        thg.w("BackgroundColor", this.s, arrayList);
        thg.w("LatLngBoundsForCameraTarget", this.q, arrayList);
        thg.w("ZOrderOnTop", this.b, arrayList);
        thg.w("UseViewLifecycleInFragment", this.c, arrayList);
        thg.w("isInstrumentClusterMap", this.u, arrayList);
        thg.w("mapColorScheme", Integer.valueOf(this.v), arrayList);
        return thg.v(arrayList, this);
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.c = Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.o(parcel, 2, vja.f(this.b));
        spu.o(parcel, 3, vja.f(this.c));
        spu.r(parcel, 4, getMapType());
        spu.E(parcel, 5, getCamera(), i);
        spu.o(parcel, 6, vja.f(this.f));
        spu.o(parcel, 7, vja.f(this.g));
        spu.o(parcel, 8, vja.f(this.h));
        spu.o(parcel, 9, vja.f(this.i));
        spu.o(parcel, 10, vja.f(this.j));
        spu.o(parcel, 11, vja.f(this.k));
        spu.o(parcel, 12, vja.f(this.l));
        spu.o(parcel, 14, vja.f(this.m));
        spu.o(parcel, 15, vja.f(this.n));
        spu.x(parcel, 16, getMinZoomPreference());
        spu.x(parcel, 17, getMaxZoomPreference());
        spu.E(parcel, 18, getLatLngBoundsForCameraTarget(), i);
        spu.o(parcel, 19, vja.f(this.r));
        spu.B(parcel, 20, getBackgroundColor());
        spu.F(parcel, 21, getMapId());
        spu.o(parcel, 22, vja.f(this.u));
        spu.r(parcel, 23, getMapColorScheme());
        spu.m(parcel, iL);
    }

    public GoogleMapOptions zOrderOnTop(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions() {
        this.d = -1;
        this.o = null;
        this.p = null;
        this.q = null;
        this.s = null;
        this.t = null;
        this.v = -1;
    }
}
