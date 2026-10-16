package com.google.android.gms.car.display;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.spu;
import defpackage.yfq;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
public final class UiStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UiStyle> CREATOR = new rhl(18);
    public final yfq a;
    public final yfq b;

    public UiStyle(List list, List list2) {
        this.a = yfq.o(list);
        this.b = yfq.o(list2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UiStyle) {
            UiStyle uiStyle = (UiStyle) obj;
            if (Objects.equals(this.a, uiStyle.a) && Objects.equals(this.b, uiStyle.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        yfq yfqVar = this.b;
        return "UiStyle{lightTokens=" + String.valueOf(this.a) + ", darkTokens=" + String.valueOf(yfqVar) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.J(parcel, 1, this.a);
        spu.J(parcel, 2, this.b);
        spu.m(parcel, iL);
    }
}
