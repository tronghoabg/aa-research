package com.google.android.gms.car.diagnostics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.spu;
import defpackage.yze;
import defpackage.yzf;
import j$.util.Objects;

/* loaded from: classes.dex */
public class CriticalError extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CriticalError> CREATOR = new rhl(13);
    public final int a;
    public final int b;

    public CriticalError(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static CriticalError a(yze yzeVar, yzf yzfVar) {
        return new CriticalError(yzeVar.D, yzfVar.az);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CriticalError) {
            CriticalError criticalError = (CriticalError) obj;
            if (criticalError.a == this.a && criticalError.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.r(parcel, 2, this.b);
        spu.m(parcel, iL);
    }
}
