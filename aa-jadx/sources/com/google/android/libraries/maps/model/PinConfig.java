package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public class PinConfig extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int BITMAP_LENGTH_DP = 37;
    public static final int BITMAP_WIDTH_DP = 26;
    public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.model.PinConfig> CREATOR = new com.google.android.libraries.maps.model.PinConfigCreator();
    public static final int DEFAULT_PIN_BACKGROUND_COLOR = -1424587;
    public static final int DEFAULT_PIN_BORDER_COLOR = -3857889;
    public static final int DEFAULT_PIN_GLYPH_COLOR = -5041134;
    private final int a;
    private final int b;
    private final com.google.android.libraries.maps.model.PinConfig.Glyph c;

    public static class Builder {
        private int a = com.google.android.libraries.maps.model.PinConfig.DEFAULT_PIN_BACKGROUND_COLOR;
        private int b = com.google.android.libraries.maps.model.PinConfig.DEFAULT_PIN_BORDER_COLOR;
        private com.google.android.libraries.maps.model.PinConfig.Glyph c = new com.google.android.libraries.maps.model.PinConfig.Glyph(com.google.android.libraries.maps.model.PinConfig.DEFAULT_PIN_GLYPH_COLOR);

        public com.google.android.libraries.maps.model.PinConfig build() {
            return new com.google.android.libraries.maps.model.PinConfig(this.a, this.b, this.c);
        }

        public com.google.android.libraries.maps.model.PinConfig.Builder setBackgroundColor(int i) {
            this.a = i;
            return this;
        }

        public com.google.android.libraries.maps.model.PinConfig.Builder setBorderColor(int i) {
            this.b = i;
            return this;
        }

        public com.google.android.libraries.maps.model.PinConfig.Builder setGlyph(com.google.android.libraries.maps.model.PinConfig.Glyph glyph) {
            this.c = glyph;
            return this;
        }
    }

    public PinConfig(int i, int i2, com.google.android.libraries.maps.model.PinConfig.Glyph glyph) {
        this.a = i;
        this.b = i2;
        this.c = glyph;
    }

    public static com.google.android.libraries.maps.model.PinConfig.Builder builder() {
        return new com.google.android.libraries.maps.model.PinConfig.Builder();
    }

    public int getBackgroundColor() {
        return this.a;
    }

    public int getBorderColor() {
        return this.b;
    }

    public com.google.android.libraries.maps.model.PinConfig.Glyph getGlyph() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 2, getBackgroundColor());
        defpackage.sqs.v(parcel, 3, getBorderColor());
        defpackage.sqs.I(parcel, 4, getGlyph(), i);
        defpackage.sqs.q(parcel, iP);
    }

    public static class Glyph extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.model.PinConfig.Glyph> CREATOR = new com.google.android.libraries.maps.model.GlyphCreator();
        public static final float DEFAULT_CIRCLE_RADIUS_DP = 5.0f;
        public static final float X_COORDINATE_DP = 13.0f;
        public static final float Y_COORDINATE_DP = 13.0f;
        public com.google.android.libraries.maps.model.BitmapDescriptor a;
        private java.lang.String b;
        private int c;
        private int d;

        public Glyph(java.lang.String str, android.os.IBinder iBinder, int i, int i2) {
            com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor;
            this.c = com.google.android.libraries.maps.model.PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.d = -16777216;
            this.b = str;
            if (iBinder == null) {
                bitmapDescriptor = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bitmapDescriptor = new com.google.android.libraries.maps.model.BitmapDescriptor(iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(iBinder));
            }
            this.a = bitmapDescriptor;
            this.c = i;
            this.d = i2;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.libraries.maps.model.PinConfig.Glyph)) {
                return false;
            }
            com.google.android.libraries.maps.model.PinConfig.Glyph glyph = (com.google.android.libraries.maps.model.PinConfig.Glyph) obj;
            if (this.c != glyph.c || !j$.util.Objects.equals(this.b, glyph.b) || this.d != glyph.d) {
                return false;
            }
            com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor = this.a;
            if ((bitmapDescriptor == null && glyph.a != null) || (bitmapDescriptor != null && glyph.a == null)) {
                return false;
            }
            com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor2 = glyph.a;
            if (bitmapDescriptor == null || bitmapDescriptor2 == null) {
                return true;
            }
            return j$.util.Objects.equals(defpackage.srg.a(bitmapDescriptor.getRemoteObject()), defpackage.srg.a(bitmapDescriptor2.getRemoteObject()));
        }

        public com.google.android.libraries.maps.model.BitmapDescriptor getBitmapDescriptor() {
            return this.a;
        }

        public int getGlyphColor() {
            return this.c;
        }

        public java.lang.String getText() {
            return this.b;
        }

        public int getTextColor() {
            return this.d;
        }

        public int hashCode() {
            return j$.util.Objects.hash(this.b, this.a, java.lang.Integer.valueOf(this.c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iP = defpackage.sqs.p(parcel, 20293);
            defpackage.sqs.J(parcel, 2, getText());
            com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor = this.a;
            defpackage.sqs.C(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.getRemoteObject().asBinder());
            defpackage.sqs.v(parcel, 4, getGlyphColor());
            defpackage.sqs.v(parcel, 5, getTextColor());
            defpackage.sqs.q(parcel, iP);
        }

        public Glyph(com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor) {
            this.c = com.google.android.libraries.maps.model.PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.d = -16777216;
            this.a = bitmapDescriptor;
        }

        public Glyph(java.lang.String str, int i) {
            this.c = com.google.android.libraries.maps.model.PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.b = str;
            this.d = i;
        }

        public Glyph(java.lang.String str) {
            this(str, -16777216);
        }

        public Glyph(int i) {
            this.d = -16777216;
            this.c = i;
        }
    }
}
