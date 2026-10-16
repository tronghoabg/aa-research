package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.libraries.maps.model.StrokeStyle;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.spu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new PolylineOptionsCreator();
    public static final float DEFAULT_STROKE_WIDTH = 10.0f;
    private final List a;
    private float b;
    private int c;
    private float d;
    private boolean e;
    private boolean f;
    private boolean g;
    private Cap h;
    private Cap i;
    private int j;
    private List k;
    private List l;

    public PolylineOptions(List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, Cap cap, Cap cap2, int i2, List list2, List list3) {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = new ButtCap();
        this.i = new ButtCap();
        this.j = 0;
        this.k = null;
        this.l = new ArrayList();
        this.a = list;
        this.b = f;
        this.c = i;
        this.d = f2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        if (cap != null) {
            this.h = cap;
        }
        if (cap2 != null) {
            this.i = cap2;
        }
        this.j = i2;
        this.k = list2;
        if (list3 != null) {
            this.l = list3;
        }
    }

    public PolylineOptions add(LatLng latLng) {
        this.a.add(latLng);
        return this;
    }

    public PolylineOptions addAll(Iterable<LatLng> iterable) {
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.a.add(it.next());
        }
        return this;
    }

    public PolylineOptions addAllSpans(Iterable<StyleSpan> iterable) {
        Iterator<StyleSpan> it = iterable.iterator();
        while (it.hasNext()) {
            addSpan(it.next());
        }
        return this;
    }

    public PolylineOptions addSpan(StyleSpan... styleSpanArr) {
        for (StyleSpan styleSpan : styleSpanArr) {
            addSpan(styleSpan);
        }
        return this;
    }

    public PolylineOptions clickable(boolean z) {
        this.g = z;
        return this;
    }

    public PolylineOptions color(int i) {
        this.c = i;
        return this;
    }

    public PolylineOptions endCap(Cap cap) {
        spu.ax(cap, "endCap must not be null");
        this.i = cap;
        return this;
    }

    public PolylineOptions geodesic(boolean z) {
        this.f = z;
        return this;
    }

    public int getColor() {
        return this.c;
    }

    public Cap getEndCap() {
        return this.i.a();
    }

    public int getJointType() {
        return this.j;
    }

    public List<PatternItem> getPattern() {
        List list = this.k;
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    public List<LatLng> getPoints() {
        return new ArrayList(this.a);
    }

    @ResultIgnorabilityUnspecified
    public List<StyleSpan> getSpans() {
        ArrayList arrayList = new ArrayList(this.l.size());
        for (StyleSpan styleSpan : this.l) {
            StrokeStyle.Builder builder = new StrokeStyle.Builder(styleSpan.getStyle());
            builder.width(this.b);
            builder.visible(this.e);
            arrayList.add(new StyleSpan(builder.build(), styleSpan.getSegments()));
        }
        return arrayList;
    }

    public Cap getStartCap() {
        return this.h.a();
    }

    public float getWidth() {
        return this.b;
    }

    public float getZIndex() {
        return this.d;
    }

    public boolean isClickable() {
        return this.g;
    }

    public boolean isGeodesic() {
        return this.f;
    }

    public boolean isVisible() {
        return this.e;
    }

    public PolylineOptions jointType(int i) {
        this.j = i;
        return this;
    }

    public PolylineOptions pattern(List<PatternItem> list) {
        this.k = list;
        return this;
    }

    public PolylineOptions startCap(Cap cap) {
        spu.ax(cap, "startCap must not be null");
        this.h = cap;
        return this;
    }

    public PolylineOptions visible(boolean z) {
        this.e = z;
        return this;
    }

    public PolylineOptions width(float f) {
        this.b = f;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.J(parcel, 2, getPoints());
        spu.q(parcel, 3, getWidth());
        spu.r(parcel, 4, getColor());
        spu.q(parcel, 5, getZIndex());
        spu.n(parcel, 6, isVisible());
        spu.n(parcel, 7, isGeodesic());
        spu.n(parcel, 8, isClickable());
        spu.E(parcel, 9, getStartCap(), i);
        spu.E(parcel, 10, getEndCap(), i);
        spu.r(parcel, 11, getJointType());
        spu.J(parcel, 12, getPattern());
        spu.J(parcel, 13, getSpans());
        spu.m(parcel, iL);
    }

    public PolylineOptions zIndex(float f) {
        this.d = f;
        return this;
    }

    public PolylineOptions add(LatLng... latLngArr) {
        Collections.addAll(this.a, latLngArr);
        return this;
    }

    public PolylineOptions addSpan(StyleSpan styleSpan) {
        this.l.add(styleSpan);
        return this;
    }

    public PolylineOptions() {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = new ButtCap();
        this.i = new ButtCap();
        this.j = 0;
        this.k = null;
        this.l = new ArrayList();
        this.a = new ArrayList();
    }
}
