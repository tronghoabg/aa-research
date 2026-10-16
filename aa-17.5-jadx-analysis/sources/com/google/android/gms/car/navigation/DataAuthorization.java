package com.google.android.gms.car.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rrn;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class DataAuthorization extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataAuthorization> CREATOR = new rrn(2);
    public final String a;

    public DataAuthorization(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataAuthorization) {
            return Objects.equals(this.a, ((DataAuthorization) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return "DataAuthorization{id=" + this.a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iL = spu.l(parcel, 20293);
        spu.F(parcel, 1, str);
        spu.m(parcel, iL);
    }
}
