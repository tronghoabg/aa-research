package com.google.android.gms.car;

/* JADX INFO: loaded from: classes2.dex */
public class RadioConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.RadioConfiguration> CREATOR = new defpackage.qua(10);
    public final java.util.List a;

    public static class RadioBandGroup extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.car.RadioConfiguration.RadioBandGroup> CREATOR = new defpackage.qua(9);
        public final java.util.List a;
        public final boolean b;
        public final java.lang.String c;
        public final boolean d;

        public RadioBandGroup(java.util.List list, boolean z, java.lang.String str, boolean z2) {
            this.a = list;
            this.b = z;
            this.c = str;
            this.d = z2;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof com.google.android.gms.car.RadioConfiguration.RadioBandGroup) {
                com.google.android.gms.car.RadioConfiguration.RadioBandGroup radioBandGroup = (com.google.android.gms.car.RadioConfiguration.RadioBandGroup) obj;
                if (this.b == radioBandGroup.b && this.d == radioBandGroup.d && j$.util.Objects.equals(this.a, radioBandGroup.a) && j$.util.Objects.equals(this.c, radioBandGroup.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return j$.util.Objects.hash(this.a, java.lang.Boolean.valueOf(this.b), this.c, java.lang.Boolean.valueOf(this.d));
        }

        public final java.lang.String toString() {
            return "RadioBandGroup{bands=" + java.lang.String.valueOf(this.a) + ", hideEmptyGroup=" + this.b + ", bandScanAction=" + this.c + ", keepOriginalStationOrder=" + this.d + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            int iP = defpackage.sqs.p(parcel, 20293);
            defpackage.sqs.E(parcel, 1, this.a);
            defpackage.sqs.r(parcel, 2, this.b);
            defpackage.sqs.J(parcel, 3, this.c);
            defpackage.sqs.r(parcel, 4, this.d);
            defpackage.sqs.q(parcel, iP);
        }
    }

    public RadioConfiguration(java.util.List list) {
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.car.RadioConfiguration) {
            return j$.util.Objects.equals(this.a, ((com.google.android.gms.car.RadioConfiguration) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hashCode(this.a);
    }

    public final java.lang.String toString() {
        return "RadioConfiguration{bandConfigs=" + java.lang.String.valueOf(this.a) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.N(parcel, 1, this.a);
        defpackage.sqs.q(parcel, iP);
    }
}
