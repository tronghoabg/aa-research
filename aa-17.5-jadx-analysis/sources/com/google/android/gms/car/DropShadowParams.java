package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qte;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes.dex */
public class DropShadowParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DropShadowParams> CREATOR = new qte(2);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public DropShadowParams(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropShadowParams) {
            DropShadowParams dropShadowParams = (DropShadowParams) obj;
            if (this.a == dropShadowParams.a && this.b == dropShadowParams.b && this.c == dropShadowParams.c && this.d == dropShadowParams.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        return "DropShadowParams{xOffset=" + this.a + ", yOffset=" + this.b + ", radius=" + this.c + ", color=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.r(parcel, 2, this.b);
        spu.r(parcel, 3, this.c);
        spu.r(parcel, 4, this.d);
        spu.m(parcel, iL);
    }
}
