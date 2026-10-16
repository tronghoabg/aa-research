package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qte;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class TouchEventCompleteData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TouchEventCompleteData> CREATOR = new qte(17);
    public final int a;
    public final Rect b;
    public final int c;

    public TouchEventCompleteData(int i, Rect rect, int i2) {
        this.a = i;
        this.b = rect;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TouchEventCompleteData touchEventCompleteData = (TouchEventCompleteData) obj;
        if (this.a == touchEventCompleteData.a && this.c == touchEventCompleteData.c) {
            return Objects.equals(this.b, touchEventCompleteData.b);
        }
        return false;
    }

    public final int hashCode() {
        Rect rect = this.b;
        return (((this.a * 31) + (rect != null ? rect.hashCode() : 0)) * 31) + this.c;
    }

    public final String toString() {
        return "TouchEventCompleteData{hint=" + this.a + ", currentFocus=" + String.valueOf(this.b) + ", direction=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.E(parcel, 2, this.b, i);
        spu.r(parcel, 3, this.c);
        spu.m(parcel, iL);
    }
}
