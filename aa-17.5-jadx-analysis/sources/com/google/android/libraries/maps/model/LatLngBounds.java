package com.google.android.libraries.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.libraries.maps.GoogleMapOptions;
import defpackage.aclh;
import defpackage.spu;
import defpackage.thg;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new LatLngBoundsCreator();
    public final LatLng northeast;
    public final LatLng southwest;

    public static final class Builder {
        private double a = Double.POSITIVE_INFINITY;
        private double b = Double.NEGATIVE_INFINITY;
        private double c = Double.NaN;
        private double d = Double.NaN;

        public LatLngBounds build() {
            spu.as(!Double.isNaN(this.c), "no included points");
            return new LatLngBounds(new LatLng(this.a, this.c), new LatLng(this.b, this.d));
        }

        public Builder include(LatLng latLng) {
            this.a = Math.min(this.a, latLng.latitude);
            this.b = Math.max(this.b, latLng.latitude);
            double d = latLng.longitude;
            if (Double.isNaN(this.c)) {
                this.c = d;
                this.d = d;
                return this;
            }
            double d2 = this.c;
            double d3 = this.d;
            if (d2 > d3 ? !(d2 <= d || d <= d3) : !(d2 <= d && d <= d3)) {
                if (((d2 - d) + 360.0d) % 360.0d < ((d - d3) + 360.0d) % 360.0d) {
                    this.c = d;
                    return this;
                }
                this.d = d;
            }
            return this;
        }
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        spu.ax(latLng, "null southwest");
        spu.ax(latLng2, "null northeast");
        double d = latLng2.latitude;
        double d2 = latLng.latitude;
        aclh.o(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", new Object[]{Double.valueOf(d2), Double.valueOf(latLng2.latitude)});
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    private final boolean a(double d) {
        LatLng latLng = this.northeast;
        double d2 = this.southwest.longitude;
        double d3 = latLng.longitude;
        return d2 <= d3 ? d2 <= d && d <= d3 : d2 <= d || d <= d3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LatLngBounds createFromAttributes(Context context, AttributeSet attributeSet) {
        return GoogleMapOptions.createLatLngBoundsFromAttributes(context, attributeSet);
    }

    public boolean contains(LatLng latLng) {
        LatLng latLng2 = this.southwest;
        double d = latLng.latitude;
        return latLng2.latitude <= d && d <= this.northeast.latitude && a(latLng.longitude);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    public LatLng getCenter() {
        LatLng latLng = this.northeast;
        LatLng latLng2 = this.southwest;
        double d = latLng2.latitude + latLng.latitude;
        double d2 = latLng.longitude;
        double d3 = latLng2.longitude;
        if (d3 > d2) {
            d2 += 360.0d;
        }
        return new LatLng(d / 2.0d, (d2 + d3) / 2.0d);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.southwest, this.northeast});
    }

    public LatLngBounds including(LatLng latLng) {
        double dMin = Math.min(this.southwest.latitude, latLng.latitude);
        double dMax = Math.max(this.northeast.latitude, latLng.latitude);
        double d = this.northeast.longitude;
        double d2 = this.southwest.longitude;
        double d3 = latLng.longitude;
        if (!a(d3)) {
            if (((d2 - d3) + 360.0d) % 360.0d < ((d3 - d) + 360.0d) % 360.0d) {
                d2 = d3;
            } else {
                d = d3;
            }
        }
        return new LatLngBounds(new LatLng(dMin, d2), new LatLng(dMax, d));
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        thg.w("southwest", this.southwest, arrayList);
        thg.w("northeast", this.northeast, arrayList);
        return thg.v(arrayList, this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 2, this.southwest, i);
        spu.E(parcel, 3, this.northeast, i);
        spu.m(parcel, iL);
    }

    public LatLngBounds(LatLngBounds latLngBounds) {
        this(latLngBounds.southwest, latLngBounds.northeast);
    }
}
