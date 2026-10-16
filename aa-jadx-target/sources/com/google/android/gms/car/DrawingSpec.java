package com.google.android.gms.car;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class DrawingSpec extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.DrawingSpec> CREATOR = new defpackage.ea(17);
    public final int a;
    public final int b;
    public int c;
    public final android.view.Surface d;
    public final android.graphics.Rect e;
    public final int f;
    public final int g;
    public final android.os.Bundle h;

    public DrawingSpec(int i, int i2, int i3, android.view.Surface surface, android.graphics.Rect rect, int i4, int i5, android.os.Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = surface;
        this.e = rect;
        this.f = i4;
        this.g = i5;
        this.h = bundle;
    }

    public final java.lang.String toString() {
        android.graphics.Rect rect = this.e;
        android.view.Surface surface = this.d;
        return "DrawingSpec{width=" + this.a + ", height=" + this.b + ", dpi=" + this.c + ", surface=" + java.lang.String.valueOf(surface) + ", systemWindowInsets=" + java.lang.String.valueOf(rect) + ", displayId=" + this.g + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.a);
        parcel.writeInt(262146);
        parcel.writeInt(this.b);
        int i2 = this.c;
        parcel.writeInt(262147);
        parcel.writeInt(i2);
        defpackage.sqs.I(parcel, 4, this.d, i);
        defpackage.sqs.I(parcel, 5, this.e, i);
        parcel.writeInt(262150);
        parcel.writeInt(this.f);
        parcel.writeInt(262151);
        parcel.writeInt(this.g);
        android.os.Bundle bundle = this.h;
        if (bundle != null) {
            int iP2 = defpackage.sqs.p(parcel, 8);
            parcel.writeBundle(bundle);
            defpackage.sqs.q(parcel, iP2);
        }
        defpackage.sqs.q(parcel, iP);
    }
}
