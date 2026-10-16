package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new PolygonOptionsCreator();
    public final List a;
    private final List b;
    private float c;
    private int d;
    private int e;
    private float f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private List k;

    public PolygonOptions() {
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = BitmapDescriptorFactory.HUE_RED;
        this.g = true;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = null;
        this.b = new ArrayList();
        this.a = new ArrayList();
    }

    public PolygonOptions add(LatLng latLng) {
        this.b.add(latLng);
        return this;
    }

    public PolygonOptions addAll(Iterable<LatLng> iterable) {
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.b.add(it.next());
        }
        return this;
    }

    public PolygonOptions addHole(Iterable<LatLng> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.a.add(arrayList);
        return this;
    }

    public PolygonOptions clickable(boolean z) {
        this.i = z;
        return this;
    }

    public PolygonOptions fillColor(int i) {
        this.e = i;
        return this;
    }

    public PolygonOptions geodesic(boolean z) {
        this.h = z;
        return this;
    }

    public int getFillColor() {
        return this.e;
    }

    public List<List<LatLng>> getHoles() {
        return new ArrayList(this.a);
    }

    public List<LatLng> getPoints() {
        return new ArrayList(this.b);
    }

    public int getStrokeColor() {
        return this.d;
    }

    public int getStrokeJointType() {
        return this.j;
    }

    public List<PatternItem> getStrokePattern() {
        List list = this.k;
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    public float getStrokeWidth() {
        return this.c;
    }

    public float getZIndex() {
        return this.f;
    }

    public boolean isClickable() {
        return this.i;
    }

    public boolean isGeodesic() {
        return this.h;
    }

    public boolean isVisible() {
        return this.g;
    }

    public PolygonOptions strokeColor(int i) {
        this.d = i;
        return this;
    }

    public PolygonOptions strokeJointType(int i) {
        this.j = i;
        return this;
    }

    public PolygonOptions strokePattern(List<PatternItem> list) {
        this.k = list;
        return this;
    }

    public PolygonOptions strokeWidth(float f) {
        this.c = f;
        return this;
    }

    public PolygonOptions visible(boolean z) {
        this.g = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.J(parcel, 2, getPoints());
        int iL2 = spu.l(parcel, 3);
        parcel.writeList(this.a);
        spu.m(parcel, iL2);
        spu.q(parcel, 4, getStrokeWidth());
        spu.r(parcel, 5, getStrokeColor());
        spu.r(parcel, 6, getFillColor());
        spu.q(parcel, 7, getZIndex());
        spu.n(parcel, 8, isVisible());
        spu.n(parcel, 9, isGeodesic());
        spu.n(parcel, 10, isClickable());
        spu.r(parcel, 11, getStrokeJointType());
        spu.J(parcel, 12, getStrokePattern());
        spu.m(parcel, iL);
    }

    public PolygonOptions zIndex(float f) {
        this.f = f;
        return this;
    }

    public PolygonOptions add(LatLng... latLngArr) {
        Collections.addAll(this.b, latLngArr);
        return this;
    }

    public PolygonOptions(List list, List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, List list3) {
        this.b = list;
        this.a = list2;
        this.c = f;
        this.d = i;
        this.e = i2;
        this.f = f2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = i3;
        this.k = list3;
    }
}
