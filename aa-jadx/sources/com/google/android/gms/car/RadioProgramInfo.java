package com.google.android.gms.car;

/* JADX INFO: loaded from: classes2.dex */
public class RadioProgramInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.RadioProgramInfo> CREATOR = new defpackage.qua(13);
    public final com.google.android.gms.car.RadioProgramSelector a;
    public final com.google.android.gms.car.RadioMetadata b;

    public RadioProgramInfo(com.google.android.gms.car.RadioProgramSelector radioProgramSelector, com.google.android.gms.car.RadioMetadata radioMetadata) {
        this.a = radioProgramSelector;
        this.b = radioMetadata;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.car.RadioProgramInfo)) {
            return false;
        }
        com.google.android.gms.car.RadioProgramInfo radioProgramInfo = (com.google.android.gms.car.RadioProgramInfo) obj;
        return j$.util.Objects.equals(this.a, radioProgramInfo.a) && j$.util.Objects.equals(this.b, radioProgramInfo.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b);
    }

    public final java.lang.String toString() {
        com.google.android.gms.car.RadioMetadata radioMetadata = this.b;
        return "RadioProgramInfo{programSelector=" + java.lang.String.valueOf(this.a) + " metadata=" + java.lang.String.valueOf(radioMetadata) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 1, this.a, i);
        defpackage.sqs.I(parcel, 2, this.b, i);
        defpackage.sqs.q(parcel, iP);
    }
}
