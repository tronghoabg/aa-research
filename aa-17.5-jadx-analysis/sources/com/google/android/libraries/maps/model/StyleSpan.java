package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class StyleSpan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StyleSpan> CREATOR = new StyleSpanCreator();
    private final StrokeStyle a;
    private final double b;

    public StyleSpan(int i, double d) {
        if (d <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.a = StrokeStyle.colorBuilder(i).build();
        this.b = d;
    }

    public double getSegments() {
        return this.b;
    }

    public StrokeStyle getStyle() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 2, getStyle(), i);
        spu.p(parcel, 3, getSegments());
        spu.m(parcel, iL);
    }

    public StyleSpan(int i) {
        this.a = StrokeStyle.colorBuilder(i).build();
        this.b = 1.0d;
    }

    public StyleSpan(StrokeStyle strokeStyle, double d) {
        if (d <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.a = strokeStyle;
        this.b = d;
    }

    public StyleSpan(StrokeStyle strokeStyle) {
        this.a = strokeStyle;
        this.b = 1.0d;
    }
}
