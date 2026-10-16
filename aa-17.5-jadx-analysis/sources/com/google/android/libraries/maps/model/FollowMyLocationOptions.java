package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public class FollowMyLocationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FollowMyLocationOptions> CREATOR = new FollowMyLocationOptionsCreator();
    private final Float a;

    public static final class Builder {
        public Float a;

        public FollowMyLocationOptions build() {
            return new FollowMyLocationOptions(this);
        }

        public Builder setZoomLevel(float f) {
            if (f < 2.0f || f > 21.0f) {
                throw new IllegalArgumentException("Zoom level should be between 2.0 and 21.0.");
            }
            this.a = Float.valueOf(f);
            return this;
        }
    }

    public FollowMyLocationOptions(Builder builder) {
        this.a = builder.a;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Float getZoomLevel() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.x(parcel, 1, getZoomLevel());
        spu.m(parcel, iL);
    }

    public FollowMyLocationOptions(Float f) {
        this.a = f;
    }
}
