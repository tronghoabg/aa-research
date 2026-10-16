package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qte;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public class RadioProgramInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RadioProgramInfo> CREATOR = new qte(13);
    public final RadioProgramSelector a;
    public final RadioMetadata b;

    public RadioProgramInfo(RadioProgramSelector radioProgramSelector, RadioMetadata radioMetadata) {
        this.a = radioProgramSelector;
        this.b = radioMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadioProgramInfo)) {
            return false;
        }
        RadioProgramInfo radioProgramInfo = (RadioProgramInfo) obj;
        return Objects.equals(this.a, radioProgramInfo.a) && Objects.equals(this.b, radioProgramInfo.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        RadioMetadata radioMetadata = this.b;
        return "RadioProgramInfo{programSelector=" + String.valueOf(this.a) + " metadata=" + String.valueOf(radioMetadata) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, this.a, i);
        spu.E(parcel, 2, this.b, i);
        spu.m(parcel, iL);
    }
}
