package com.google.android.gms.car.display;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.spu;

/* loaded from: classes2.dex */
public class UiStyleColorToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UiStyleColorToken> CREATOR = new rhl(17);
    public final int a;

    public UiStyleColorToken(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof UiStyleColorToken) && this.a == ((UiStyleColorToken) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "UiStyleColorToken{color=" + this.a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.m(parcel, iL);
    }
}
