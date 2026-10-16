package com.google.android.gms.car.display;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public class UiStyleToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UiStyleToken> CREATOR = new rhl(19);
    public final String a;
    public final UiStyleColorToken b;

    public UiStyleToken(String str, UiStyleColorToken uiStyleColorToken) {
        this.a = str;
        this.b = uiStyleColorToken;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UiStyleToken) {
            UiStyleToken uiStyleToken = (UiStyleToken) obj;
            if (Objects.equals(this.a, uiStyleToken.a) && Objects.equals(this.b, uiStyleToken.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "UiStyleToken{name='" + this.a + "', colorToken=" + String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.F(parcel, 1, this.a);
        spu.E(parcel, 2, this.b, i);
        spu.m(parcel, iL);
    }
}
