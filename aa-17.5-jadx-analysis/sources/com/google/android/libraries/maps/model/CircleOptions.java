package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import java.util.List;

/* loaded from: classes3.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new CircleOptionsCreator();
    private LatLng a;
    private double b;
    private float c;
    private int d;
    private int e;
    private float f;
    private boolean g;
    private boolean h;
    private List i;

    public CircleOptions() {
        this.a = null;
        this.b = 0.0d;
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = BitmapDescriptorFactory.HUE_RED;
        this.g = true;
        this.h = false;
        this.i = null;
    }

    public CircleOptions center(LatLng latLng) {
        this.a = latLng;
        return this;
    }

    public CircleOptions clickable(boolean z) {
        this.h = z;
        return this;
    }

    public CircleOptions fillColor(int i) {
        this.e = i;
        return this;
    }

    public LatLng getCenter() {
        return this.a;
    }

    public int getFillColor() {
        return this.e;
    }

    public double getRadius() {
        return this.b;
    }

    public int getStrokeColor() {
        return this.d;
    }

    public List<PatternItem> getStrokePattern() {
        return this.i;
    }

    public float getStrokeWidth() {
        return this.c;
    }

    public float getZIndex() {
        return this.f;
    }

    public boolean isClickable() {
        return this.h;
    }

    public boolean isVisible() {
        return this.g;
    }

    public CircleOptions radius(double d) {
        this.b = d;
        return this;
    }

    public CircleOptions strokeColor(int i) {
        this.d = i;
        return this;
    }

    public CircleOptions strokePattern(List<PatternItem> list) {
        this.i = list;
        return this;
    }

    public CircleOptions strokeWidth(float f) {
        this.c = f;
        return this;
    }

    public CircleOptions visible(boolean z) {
        this.g = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 2, getCenter(), i);
        spu.p(parcel, 3, getRadius());
        spu.q(parcel, 4, getStrokeWidth());
        spu.r(parcel, 5, getStrokeColor());
        spu.r(parcel, 6, getFillColor());
        spu.q(parcel, 7, getZIndex());
        spu.n(parcel, 8, isVisible());
        spu.n(parcel, 9, isClickable());
        spu.J(parcel, 10, getStrokePattern());
        spu.m(parcel, iL);
    }

    public CircleOptions zIndex(float f) {
        this.f = f;
        return this;
    }

    public CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List list) {
        this.a = latLng;
        this.b = d;
        this.c = f;
        this.d = i;
        this.e = i2;
        this.f = f2;
        this.g = z;
        this.h = z2;
        this.i = list;
    }
}
