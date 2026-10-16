package com.google.android.gms.car;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class CarUiInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.CarUiInfo> CREATOR = new defpackage.ea(14);
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int[] e;
    public boolean f;
    public int g;
    public boolean h;
    public int i;
    public int j;

    public CarUiInfo(boolean z, int i, boolean z2, boolean z3, android.graphics.Point point, boolean z4, boolean z5, int i2, int i3) {
        this.a = z;
        this.b = i != 0;
        this.c = z2;
        this.d = z3;
        if (point != null) {
            this.e = new int[]{point.x, 0};
            this.e[1] = point.y;
        }
        this.f = z4;
        this.g = i;
        this.h = z5;
        this.i = i2;
        this.j = i3;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "CarUiInfo (hasRotaryController: %b, touchscreenType: %d, hasSearchButton: %b, hasTouchpadForUiNavigation: %b, hasDpad: %b, isTouchpadUiAbsolute: %b, touchpadMoveThresholdPx: %d, touchpadMultimoveThresholdPx: %d)", java.lang.Boolean.valueOf(this.a), java.lang.Integer.valueOf(this.g), java.lang.Boolean.valueOf(this.c), java.lang.Boolean.valueOf(this.d), java.lang.Boolean.valueOf(this.f), java.lang.Boolean.valueOf(this.h), java.lang.Integer.valueOf(this.i), java.lang.Integer.valueOf(this.j));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        boolean z = this.a;
        parcel.writeInt(262145);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.b;
        parcel.writeInt(262146);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.c;
        parcel.writeInt(262147);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.d;
        parcel.writeInt(262148);
        parcel.writeInt(z4 ? 1 : 0);
        int[] iArr = this.e;
        if (iArr != null) {
            int iP2 = defpackage.sqs.p(parcel, 5);
            parcel.writeIntArray(iArr);
            defpackage.sqs.q(parcel, iP2);
        }
        boolean z5 = this.f;
        parcel.writeInt(262150);
        parcel.writeInt(z5 ? 1 : 0);
        int i2 = this.g;
        parcel.writeInt(262151);
        parcel.writeInt(i2);
        boolean z6 = this.h;
        parcel.writeInt(262152);
        parcel.writeInt(z6 ? 1 : 0);
        int i3 = this.i;
        parcel.writeInt(262153);
        parcel.writeInt(i3);
        int i4 = this.j;
        parcel.writeInt(262154);
        parcel.writeInt(i4);
        defpackage.sqs.q(parcel, iP);
    }

    public CarUiInfo(boolean z, boolean z2, boolean z3, boolean z4, int[] iArr, boolean z5, int i, boolean z6, int i2, int i3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = iArr;
        this.f = z5;
        this.g = i;
        this.h = z6;
        this.i = i2;
        this.j = i3;
    }

    public CarUiInfo() {
    }
}
