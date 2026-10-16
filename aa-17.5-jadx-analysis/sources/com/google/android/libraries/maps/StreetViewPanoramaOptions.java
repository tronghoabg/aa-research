package com.google.android.libraries.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;
import com.google.android.libraries.maps.model.StreetViewSource;
import defpackage.spu;
import defpackage.thg;
import defpackage.vja;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new StreetViewPanoramaOptionsCreator();
    private StreetViewPanoramaCamera a;
    private String b;
    private LatLng c;
    private Integer d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private StreetViewSource j;

    public StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5, StreetViewSource streetViewSource) {
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = true;
        this.j = StreetViewSource.DEFAULT;
        this.a = streetViewPanoramaCamera;
        this.c = latLng;
        this.d = num;
        this.b = str;
        this.e = vja.g(b);
        this.f = vja.g(b2);
        this.g = vja.g(b3);
        this.h = vja.g(b4);
        this.i = vja.g(b5);
        this.j = streetViewSource;
    }

    public Boolean getPanningGesturesEnabled() {
        return this.g;
    }

    public String getPanoramaId() {
        return this.b;
    }

    public LatLng getPosition() {
        return this.c;
    }

    public Integer getRadius() {
        return this.d;
    }

    public StreetViewSource getSource() {
        return this.j;
    }

    public Boolean getStreetNamesEnabled() {
        return this.h;
    }

    public StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.a;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.i;
    }

    public Boolean getUserNavigationEnabled() {
        return this.e;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.f;
    }

    public StreetViewPanoramaOptions panningGesturesEnabled(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    public StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.a = streetViewPanoramaCamera;
        return this;
    }

    public StreetViewPanoramaOptions panoramaId(String str) {
        this.b = str;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latLng, Integer num, StreetViewSource streetViewSource) {
        this.c = latLng;
        this.d = num;
        this.j = streetViewSource;
        return this;
    }

    public StreetViewPanoramaOptions streetNamesEnabled(boolean z) {
        this.h = Boolean.valueOf(z);
        return this;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        thg.w("PanoramaId", this.b, arrayList);
        thg.w("Position", this.c, arrayList);
        thg.w("Radius", this.d, arrayList);
        thg.w("Source", this.j, arrayList);
        thg.w("StreetViewPanoramaCamera", this.a, arrayList);
        thg.w("UserNavigationEnabled", this.e, arrayList);
        thg.w("ZoomGesturesEnabled", this.f, arrayList);
        thg.w("PanningGesturesEnabled", this.g, arrayList);
        thg.w("StreetNamesEnabled", this.h, arrayList);
        thg.w("UseViewLifecycleInFragment", this.i, arrayList);
        return thg.v(arrayList, this);
    }

    public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    public StreetViewPanoramaOptions userNavigationEnabled(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 2, getStreetViewPanoramaCamera(), i);
        spu.F(parcel, 3, getPanoramaId());
        spu.E(parcel, 4, getPosition(), i);
        spu.B(parcel, 5, getRadius());
        spu.o(parcel, 6, vja.f(this.e));
        spu.o(parcel, 7, vja.f(this.f));
        spu.o(parcel, 8, vja.f(this.g));
        spu.o(parcel, 9, vja.f(this.h));
        spu.o(parcel, 10, vja.f(this.i));
        spu.E(parcel, 11, getSource(), i);
        spu.m(parcel, iL);
    }

    public StreetViewPanoramaOptions zoomGesturesEnabled(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latLng, StreetViewSource streetViewSource) {
        this.c = latLng;
        this.j = streetViewSource;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latLng, Integer num) {
        this.c = latLng;
        this.d = num;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latLng) {
        this.c = latLng;
        return this;
    }

    public StreetViewPanoramaOptions() {
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = true;
        this.j = StreetViewSource.DEFAULT;
    }
}
