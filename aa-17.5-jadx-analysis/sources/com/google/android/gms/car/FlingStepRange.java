package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ea;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes.dex */
public class FlingStepRange extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FlingStepRange> CREATOR = new ea(18);
    public final int a;
    public final int b;

    public FlingStepRange(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FlingStepRange) {
            FlingStepRange flingStepRange = (FlingStepRange) obj;
            if (this.a == flingStepRange.a && this.b == flingStepRange.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        return "FlingStepRange{minStep=" + this.a + ", maxStep=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.a);
        parcel.writeInt(262146);
        parcel.writeInt(this.b);
        spu.m(parcel, iL);
    }
}
