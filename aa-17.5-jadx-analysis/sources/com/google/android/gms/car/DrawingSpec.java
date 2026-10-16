package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ea;
import defpackage.spu;

/* loaded from: classes.dex */
public class DrawingSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DrawingSpec> CREATOR = new ea(17);
    public final int a;
    public final int b;
    public int c;
    public final Surface d;
    public final Rect e;
    public final int f;
    public final int g;
    public final Bundle h;

    public DrawingSpec(int i, int i2, int i3, Surface surface, Rect rect, int i4, int i5, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = surface;
        this.e = rect;
        this.f = i4;
        this.g = i5;
        this.h = bundle;
    }

    public final String toString() {
        Rect rect = this.e;
        Surface surface = this.d;
        return "DrawingSpec{width=" + this.a + ", height=" + this.b + ", dpi=" + this.c + ", surface=" + String.valueOf(surface) + ", systemWindowInsets=" + String.valueOf(rect) + ", displayId=" + this.g + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.a);
        parcel.writeInt(262146);
        parcel.writeInt(this.b);
        int i2 = this.c;
        parcel.writeInt(262147);
        parcel.writeInt(i2);
        spu.E(parcel, 4, this.d, i);
        spu.E(parcel, 5, this.e, i);
        parcel.writeInt(262150);
        parcel.writeInt(this.f);
        parcel.writeInt(262151);
        parcel.writeInt(this.g);
        Bundle bundle = this.h;
        if (bundle != null) {
            int iL2 = spu.l(parcel, 8);
            parcel.writeBundle(bundle);
            spu.m(parcel, iL2);
        }
        spu.m(parcel, iL);
    }
}
