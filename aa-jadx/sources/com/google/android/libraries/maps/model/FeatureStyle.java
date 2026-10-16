package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public final class FeatureStyle extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.model.FeatureStyle> CREATOR = new com.google.android.libraries.maps.model.FeatureStyleCreator();
    private final java.lang.Integer a;
    private final java.lang.Integer b;
    private final java.lang.Float c;
    private final java.lang.Float d;

    public static final class Builder {
        public java.lang.Integer a;
        public java.lang.Integer b;
        public java.lang.Float c;
        public java.lang.Float d;

        public com.google.android.libraries.maps.model.FeatureStyle build() {
            return new com.google.android.libraries.maps.model.FeatureStyle(this);
        }

        public com.google.android.libraries.maps.model.FeatureStyle.Builder fillColor(int i) {
            this.a = java.lang.Integer.valueOf(i);
            return this;
        }

        public com.google.android.libraries.maps.model.FeatureStyle.Builder pointRadius(float f) {
            defpackage.sqs.ar(f >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, "Point radius cannot be negative.");
            defpackage.sqs.ar(f <= 128.0f, "The max allowed pointRadius value is 128px.");
            this.d = java.lang.Float.valueOf(f);
            return this;
        }

        public com.google.android.libraries.maps.model.FeatureStyle.Builder strokeColor(int i) {
            this.b = java.lang.Integer.valueOf(i);
            return this;
        }

        public com.google.android.libraries.maps.model.FeatureStyle.Builder strokeWidth(float f) {
            defpackage.sqs.ar(f >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, "Stroke width cannot be negative.");
            this.c = java.lang.Float.valueOf(f);
            return this;
        }
    }

    public FeatureStyle(com.google.android.libraries.maps.model.FeatureStyle.Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    public static com.google.android.libraries.maps.model.FeatureStyle.Builder builder() {
        return new com.google.android.libraries.maps.model.FeatureStyle.Builder();
    }

    public java.lang.Integer getFillColor() {
        return this.a;
    }

    public java.lang.Float getPointRadius() {
        return this.d;
    }

    public java.lang.Integer getStrokeColor() {
        return this.b;
    }

    public java.lang.Float getStrokeWidth() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.F(parcel, 1, getFillColor());
        defpackage.sqs.F(parcel, 2, getStrokeColor());
        defpackage.sqs.B(parcel, 3, getStrokeWidth());
        defpackage.sqs.B(parcel, 4, getPointRadius());
        defpackage.sqs.q(parcel, iP);
    }

    public FeatureStyle(java.lang.Integer num, java.lang.Integer num2, java.lang.Float f, java.lang.Float f2) {
        this.a = num;
        this.b = num2;
        this.c = f;
        this.d = f2;
    }
}
