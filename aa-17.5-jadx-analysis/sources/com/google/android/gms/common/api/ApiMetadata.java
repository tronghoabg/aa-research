package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.sht;
import defpackage.spu;
import defpackage.uqw;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class ApiMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiMetadata> CREATOR = sht.a;
    public static final ApiMetadata a = uqw.J(null, false);
    public final ComplianceOptions b;
    public final boolean c;
    public boolean d;

    static {
        uqw.J(null, true);
    }

    public ApiMetadata(ComplianceOptions complianceOptions, boolean z) {
        this.b = complianceOptions;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return Objects.equals(this.b, apiMetadata.b) && this.d == apiMetadata.d && this.c == apiMetadata.c;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Boolean.valueOf(this.d), Boolean.valueOf(this.c));
    }

    public final String toString() {
        return "ApiMetadata(complianceOptions=" + String.valueOf(this.b) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.d) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, this.b, i);
        spu.n(parcel, 2, this.c);
        spu.m(parcel, iL);
    }
}
