package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.khy;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public class AppRestrictionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppRestrictionState> CREATOR = new khy(19);
    public final boolean a;
    public final boolean b;

    public AppRestrictionState(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppRestrictionState)) {
            return false;
        }
        AppRestrictionState appRestrictionState = (AppRestrictionState) obj;
        return this.a == appRestrictionState.a && this.b == appRestrictionState.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }

    public final String toString() {
        return String.format("AppRestrictionState{isRestricted=%b, isAccountHidden=%b}", Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iL = spu.l(parcel, 20293);
        spu.n(parcel, 1, z);
        spu.n(parcel, 2, this.b);
        spu.m(parcel, iL);
    }
}
