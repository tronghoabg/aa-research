package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.sht;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ComplianceOptions> CREATOR = new sht(8);
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public ComplianceOptions(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.a == complianceOptions.a && this.b == complianceOptions.b && this.c == complianceOptions.c && this.d == complianceOptions.d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d));
    }

    public final String toString() {
        return "ComplianceOptions{callerProductId=" + this.a + ", dataOwnerProductId=" + this.b + ", processingReason=" + this.c + ", isUserData=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, i2);
        spu.r(parcel, 2, this.b);
        spu.r(parcel, 3, this.c);
        spu.n(parcel, 4, this.d);
        spu.m(parcel, iL);
    }
}
