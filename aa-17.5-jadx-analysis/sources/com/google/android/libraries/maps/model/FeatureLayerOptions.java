package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.ygr;

/* loaded from: classes3.dex */
public final class FeatureLayerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FeatureLayerOptions> CREATOR = new FeatureLayerOptionsCreator();
    public static final ygr a = ygr.t(FeatureType.ADMINISTRATIVE_AREA_LEVEL_1, FeatureType.ADMINISTRATIVE_AREA_LEVEL_2, FeatureType.COUNTRY, FeatureType.LOCALITY, FeatureType.POSTAL_CODE, FeatureType.SCHOOL_DISTRICT, FeatureType.DATASET);

    @FeatureType
    private final String b;
    private final String c;

    public static final class Builder {
        public String a;
        public String b;

        public FeatureLayerOptions build() {
            String str = this.a;
            if (str == null) {
                throw new IllegalArgumentException("FeatureType must be specified.");
            }
            if (str.equals(FeatureType.DATASET) && this.b == null) {
                throw new IllegalArgumentException("A datasetId must be specified for DATASET feature layers.");
            }
            return new FeatureLayerOptions(this);
        }

        public Builder datasetId(String str) {
            this.b = str;
            return this;
        }

        public Builder featureType(@FeatureType String str) {
            spu.an(FeatureLayerOptions.a.contains(str), "Invalid FeatureType value");
            this.a = str;
            return this;
        }
    }

    public FeatureLayerOptions(Builder builder) {
        this.b = builder.a;
        this.c = builder.b;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getDatasetId() {
        return this.c;
    }

    @FeatureType
    public String getFeatureType() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.F(parcel, 1, getFeatureType());
        spu.F(parcel, 2, getDatasetId());
        spu.m(parcel, iL);
    }

    public FeatureLayerOptions(@FeatureType String str, String str2) {
        this.b = str;
        this.c = str2;
    }
}
