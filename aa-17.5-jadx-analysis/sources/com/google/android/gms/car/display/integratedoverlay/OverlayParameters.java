package com.google.android.gms.car.display.integratedoverlay;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public class OverlayParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OverlayParameters> CREATOR = new rhl(20);
    public final int a;
    public final Rect b;
    public final float c;

    public OverlayParameters(int i, Rect rect, float f) {
        this.a = i;
        this.b = rect;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverlayParameters)) {
            return false;
        }
        OverlayParameters overlayParameters = (OverlayParameters) obj;
        return this.a == overlayParameters.a && Objects.equals(this.b, overlayParameters.b) && this.c == overlayParameters.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, Float.valueOf(this.c));
    }

    public final String toString() {
        return "OverlayParameters{contentType=" + this.a + ", bounds=" + String.valueOf(this.b) + ", cornerRadius=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.E(parcel, 2, this.b, i);
        spu.q(parcel, 3, this.c);
        spu.m(parcel, iL);
    }
}
