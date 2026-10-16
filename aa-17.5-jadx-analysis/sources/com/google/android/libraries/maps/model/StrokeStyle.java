package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class StrokeStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StrokeStyle> CREATOR = new StrokeStyleCreator();
    private final float a;
    private final int b;
    private final int c;
    private final boolean d;
    private final StampStyle e;

    public StrokeStyle(float f, int i, int i2, boolean z, StampStyle stampStyle) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = stampStyle;
    }

    public static Builder colorBuilder(int i) {
        Builder builder = new Builder();
        builder.color(i);
        return builder;
    }

    public static Builder gradientBuilder(int i, int i2) {
        Builder builder = new Builder();
        builder.gradientColors(i, i2);
        return builder;
    }

    public static Builder transparentColorBuilder() {
        Builder builder = new Builder();
        builder.color(0);
        return builder;
    }

    public int getColor() {
        return this.b;
    }

    public Pair<Integer, Integer> getGradientColors() {
        return new Pair<>(Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public StampStyle getStamp() {
        return this.e;
    }

    public int getToColor() {
        return this.c;
    }

    public float getWidth() {
        return this.a;
    }

    public boolean isVisible() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.q(parcel, 2, getWidth());
        spu.r(parcel, 3, getColor());
        spu.r(parcel, 4, getToColor());
        spu.n(parcel, 5, isVisible());
        spu.E(parcel, 6, getStamp(), i);
        spu.m(parcel, iL);
    }

    public static final class Builder {
        private float a;
        private int b;
        private int c;
        private boolean d;
        private StampStyle e;

        public Builder(StrokeStyle strokeStyle) {
            this.a = strokeStyle.getWidth();
            Pair<Integer, Integer> gradientColors = strokeStyle.getGradientColors();
            this.b = ((Integer) gradientColors.first).intValue();
            this.c = ((Integer) gradientColors.second).intValue();
            this.d = strokeStyle.isVisible();
            this.e = strokeStyle.getStamp();
        }

        public StrokeStyle build() {
            return new StrokeStyle(this.a, this.b, this.c, this.d, this.e);
        }

        public Builder color(int i) {
            this.b = i;
            this.c = i;
            return this;
        }

        public Pair<Integer, Integer> getColors() {
            return new Pair<>(Integer.valueOf(this.b), Integer.valueOf(this.c));
        }

        public float getWidth() {
            return this.a;
        }

        public Builder gradientColors(int i, int i2) {
            this.b = i;
            this.c = i2;
            return this;
        }

        public boolean isVisible() {
            return this.d;
        }

        public Builder stamp(StampStyle stampStyle) {
            this.e = stampStyle;
            return this;
        }

        public Builder visible(boolean z) {
            this.d = z;
            return this;
        }

        public Builder width(float f) {
            this.a = f;
            return this;
        }

        public Builder() {
        }
    }
}
