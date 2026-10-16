package com.google.android.gms.car.display;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class CarDisplay extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.display.CarDisplay> CREATOR = new defpackage.rcy(3);
    public final com.google.android.gms.car.display.CarDisplayId a;
    public final int b;
    public final int c;
    public final android.graphics.Point d;
    public final android.graphics.Rect e;
    public final int f;
    public final java.lang.String g;
    public final java.util.List h;
    public final com.google.android.gms.car.display.CarDisplayBlendedUiConfig i;
    private final android.graphics.Rect j;

    public CarDisplay(com.google.android.gms.car.display.CarDisplayId carDisplayId, int i, int i2, android.graphics.Point point, android.graphics.Rect rect, android.graphics.Rect rect2, java.util.List list, int i3, java.lang.String str, com.google.android.gms.car.display.CarDisplayBlendedUiConfig carDisplayBlendedUiConfig) {
        this.a = carDisplayId;
        this.b = i;
        this.c = i2;
        this.d = point;
        this.e = rect;
        this.f = i3;
        this.g = str;
        this.j = rect2;
        this.h = list;
        this.i = carDisplayBlendedUiConfig;
    }

    public final android.graphics.Rect a() {
        android.graphics.Rect rect = this.j;
        return rect == null ? new android.graphics.Rect(this.e) : new android.graphics.Rect(rect);
    }

    public final java.util.List b() {
        java.util.List list = this.h;
        if (list == null) {
            return null;
        }
        return defpackage.ygw.o(list);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.car.display.CarDisplay)) {
            return false;
        }
        com.google.android.gms.car.display.CarDisplay carDisplay = (com.google.android.gms.car.display.CarDisplay) obj;
        return carDisplay.a.equals(this.a) && carDisplay.b == this.b && carDisplay.c == this.c && j$.util.Objects.equals(carDisplay.d, this.d) && j$.util.Objects.equals(carDisplay.e, this.e) && j$.util.Objects.equals(carDisplay.j, this.j) && carDisplay.f == this.f && j$.util.Objects.equals(carDisplay.g, this.g) && j$.util.Objects.equals(carDisplay.i, this.i);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), this.d, this.e, this.j, java.lang.Integer.valueOf(this.f), this.g, this.i});
    }

    public final java.lang.String toString() {
        com.google.android.gms.car.display.CarDisplayBlendedUiConfig carDisplayBlendedUiConfig = this.i;
        android.graphics.Rect rect = this.j;
        android.graphics.Rect rect2 = this.e;
        android.graphics.Point point = this.d;
        return "CarDisplay{carDisplayId=" + java.lang.String.valueOf(this.a) + ", carDisplayType=" + this.b + ", displayDpi=" + this.c + ", displayDimensions=" + java.lang.String.valueOf(point) + ", stableInsets=" + java.lang.String.valueOf(rect2) + ", contentInsets=" + java.lang.String.valueOf(rect) + ", initialContentType=" + this.f + ", configurationId=" + this.g + ", blendedUiConfig=" + java.lang.String.valueOf(carDisplayBlendedUiConfig) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 1, this.a, i);
        parcel.writeInt(262146);
        parcel.writeInt(this.b);
        parcel.writeInt(262147);
        parcel.writeInt(this.c);
        defpackage.sqs.I(parcel, 4, this.d, i);
        defpackage.sqs.I(parcel, 5, this.e, i);
        parcel.writeInt(262150);
        parcel.writeInt(this.f);
        java.lang.String str = this.g;
        if (str != null) {
            int iP2 = defpackage.sqs.p(parcel, 7);
            parcel.writeString(str);
            defpackage.sqs.q(parcel, iP2);
        }
        android.graphics.Rect rect = this.j;
        defpackage.sqs.I(parcel, 8, rect == null ? null : new android.graphics.Rect(rect), i);
        defpackage.sqs.N(parcel, 9, b());
        defpackage.sqs.I(parcel, 10, this.i, i);
        defpackage.sqs.q(parcel, iP);
    }
}
