package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes3.dex */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new CapCreator();
    public static final int TYPE_BUTT = 0;
    public static final int TYPE_CUSTOM = 3;
    public static final int TYPE_ROUND = 2;
    public static final int TYPE_SQUARE = 1;
    public static final String UNRECOGNIZED_CAP_TYPE_ERROR_MESSAGE_TEMPLATE = "Skipping unrecognized %s cap type for %s, drawing TYPE_BUTT instead.";
    private static final String a = "Cap";
    private final int b;
    private final BitmapDescriptor c;
    private final Float d;

    public Cap(int i, BitmapDescriptor bitmapDescriptor, Float f) {
        boolean z;
        boolean z2 = f != null && f.floatValue() > BitmapDescriptorFactory.HUE_RED;
        if (i == 3) {
            z = bitmapDescriptor != null && z2;
            i = 3;
        } else {
            z = true;
        }
        spu.an(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i), bitmapDescriptor, f));
        this.b = i;
        this.c = bitmapDescriptor;
        this.d = f;
    }

    public static boolean isRecognizedCapType(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    final Cap a() {
        int i = this.b;
        if (i == 0) {
            return new ButtCap();
        }
        if (i == 1) {
            return new SquareCap();
        }
        if (i == 2) {
            return new RoundCap();
        }
        if (i == 3) {
            return new CustomCap(this.c, this.d.floatValue());
        }
        Log.w(a, a.bp(i, "Unknown Cap type: "));
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.b == cap.b && Objects.equals(this.c, cap.c) && Objects.equals(this.d, cap.d);
    }

    public BitmapDescriptor getBitmapDescriptor() {
        return this.c;
    }

    public Float getBitmapRefWidth() {
        return this.d;
    }

    public int getType() {
        return this.b;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), this.c, this.d);
    }

    public String toString() {
        return "[Cap: type=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 2, getType());
        BitmapDescriptor bitmapDescriptor = this.c;
        spu.y(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.getRemoteObject().asBinder());
        spu.x(parcel, 4, getBitmapRefWidth());
        spu.m(parcel, iL);
    }
}
