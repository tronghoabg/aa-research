package com.google.android.gms.car.display.integratedoverlay;

/* JADX INFO: loaded from: classes2.dex */
public class OverlayParameters extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.display.integratedoverlay.OverlayParameters> CREATOR = new defpackage.rih(20);
    public final int a;
    public final android.graphics.Rect b;
    public final float c;

    public OverlayParameters(int i, android.graphics.Rect rect, float f) {
        this.a = i;
        this.b = rect;
        this.c = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.car.display.integratedoverlay.OverlayParameters)) {
            return false;
        }
        com.google.android.gms.car.display.integratedoverlay.OverlayParameters overlayParameters = (com.google.android.gms.car.display.integratedoverlay.OverlayParameters) obj;
        return this.a == overlayParameters.a && j$.util.Objects.equals(this.b, overlayParameters.b) && this.c == overlayParameters.c;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.a), this.b, java.lang.Float.valueOf(this.c));
    }

    public final java.lang.String toString() {
        return "OverlayParameters{contentType=" + this.a + ", bounds=" + java.lang.String.valueOf(this.b) + ", cornerRadius=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.a);
        defpackage.sqs.I(parcel, 2, this.b, i);
        defpackage.sqs.u(parcel, 3, this.c);
        defpackage.sqs.q(parcel, iP);
    }
}
