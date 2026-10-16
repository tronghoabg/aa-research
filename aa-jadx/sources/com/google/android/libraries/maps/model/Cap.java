package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public class Cap extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.model.Cap> CREATOR = new com.google.android.libraries.maps.model.CapCreator();
    public static final int TYPE_BUTT = 0;
    public static final int TYPE_CUSTOM = 3;
    public static final int TYPE_ROUND = 2;
    public static final int TYPE_SQUARE = 1;
    public static final java.lang.String UNRECOGNIZED_CAP_TYPE_ERROR_MESSAGE_TEMPLATE = "Skipping unrecognized %s cap type for %s, drawing TYPE_BUTT instead.";
    private static final java.lang.String a = "Cap";
    private final int b;
    private final com.google.android.libraries.maps.model.BitmapDescriptor c;
    private final java.lang.Float d;

    public Cap(int i, com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor, java.lang.Float f) {
        boolean z;
        boolean z2 = f != null && f.floatValue() > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        if (i == 3) {
            z = bitmapDescriptor != null && z2;
            i = 3;
        } else {
            z = true;
        }
        defpackage.sqs.ar(z, java.lang.String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", java.lang.Integer.valueOf(i), bitmapDescriptor, f));
        this.b = i;
        this.c = bitmapDescriptor;
        this.d = f;
    }

    public static boolean isRecognizedCapType(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    final com.google.android.libraries.maps.model.Cap a() {
        int i = this.b;
        if (i == 0) {
            return new com.google.android.libraries.maps.model.ButtCap();
        }
        if (i == 1) {
            return new com.google.android.libraries.maps.model.SquareCap();
        }
        if (i == 2) {
            return new com.google.android.libraries.maps.model.RoundCap();
        }
        if (i == 3) {
            return new com.google.android.libraries.maps.model.CustomCap(this.c, this.d.floatValue());
        }
        android.util.Log.w(a, defpackage.a.bo(i, "Unknown Cap type: "));
        return this;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.maps.model.Cap)) {
            return false;
        }
        com.google.android.libraries.maps.model.Cap cap = (com.google.android.libraries.maps.model.Cap) obj;
        return this.b == cap.b && j$.util.Objects.equals(this.c, cap.c) && j$.util.Objects.equals(this.d, cap.d);
    }

    public com.google.android.libraries.maps.model.BitmapDescriptor getBitmapDescriptor() {
        return this.c;
    }

    public java.lang.Float getBitmapRefWidth() {
        return this.d;
    }

    public int getType() {
        return this.b;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.b), this.c, this.d);
    }

    public java.lang.String toString() {
        return "[Cap: type=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 2, getType());
        com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor = this.c;
        defpackage.sqs.C(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.getRemoteObject().asBinder());
        defpackage.sqs.B(parcel, 4, getBitmapRefWidth());
        defpackage.sqs.q(parcel, iP);
    }
}
