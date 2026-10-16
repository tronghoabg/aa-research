package com.google.android.gms.libs.throttling;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.sqy;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ThrottlingLimits extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ThrottlingLimits> CREATOR = new sqy(13);
    private final int a;

    private ThrottlingLimits() {
        this.a = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThrottlingLimits) {
            return Objects.equals(Integer.valueOf(this.a), Integer.valueOf(((ThrottlingLimits) obj).a));
        }
        return false;
    }

    public int getMaxInflight() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, getMaxInflight());
        spu.m(parcel, iL);
    }

    public ThrottlingLimits(int i) {
        this.a = i;
    }
}
