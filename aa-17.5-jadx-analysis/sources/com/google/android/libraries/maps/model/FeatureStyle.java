package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class FeatureStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FeatureStyle> CREATOR = new FeatureStyleCreator();
    private final Integer a;
    private final Integer b;
    private final Float c;
    private final Float d;

    public static final class Builder {
        public Integer a;
        public Integer b;
        public Float c;
        public Float d;

        public FeatureStyle build() {
            return new FeatureStyle(this);
        }

        public Builder fillColor(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public Builder pointRadius(float f) {
            spu.an(f >= BitmapDescriptorFactory.HUE_RED, "Point radius cannot be negative.");
            spu.an(f <= 128.0f, "The max allowed pointRadius value is 128px.");
            this.d = Float.valueOf(f);
            return this;
        }

        public Builder strokeColor(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public Builder strokeWidth(float f) {
            spu.an(f >= BitmapDescriptorFactory.HUE_RED, "Stroke width cannot be negative.");
            this.c = Float.valueOf(f);
            return this;
        }
    }

    public FeatureStyle(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getFillColor() {
        return this.a;
    }

    public Float getPointRadius() {
        return this.d;
    }

    public Integer getStrokeColor() {
        return this.b;
    }

    public Float getStrokeWidth() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.B(parcel, 1, getFillColor());
        spu.B(parcel, 2, getStrokeColor());
        spu.x(parcel, 3, getStrokeWidth());
        spu.x(parcel, 4, getPointRadius());
        spu.m(parcel, iL);
    }

    public FeatureStyle(Integer num, Integer num2, Float f, Float f2) {
        this.a = num;
        this.b = num2;
        this.c = f;
        this.d = f2;
    }
}
