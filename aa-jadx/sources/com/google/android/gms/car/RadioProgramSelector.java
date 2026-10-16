package com.google.android.gms.car;

/* JADX INFO: loaded from: classes2.dex */
public class RadioProgramSelector extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.RadioProgramSelector> CREATOR = new defpackage.qua(14);
    public final com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier a;
    public final java.util.List b;

    public static class RadioProgramIdentifier extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier> CREATOR = new defpackage.qua(12);
        public final int a;
        public final long b;

        public RadioProgramIdentifier(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier)) {
                return false;
            }
            com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier = (com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier) obj;
            return this.a == radioProgramIdentifier.a && this.b == radioProgramIdentifier.b;
        }

        public final int hashCode() {
            return j$.util.Objects.hash(java.lang.Integer.valueOf(this.a), java.lang.Long.valueOf(this.b));
        }

        public final java.lang.String toString() {
            return "RadioProgramIdentifier{type=" + this.a + " value=" + this.b + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            int iP = defpackage.sqs.p(parcel, 20293);
            defpackage.sqs.v(parcel, 1, this.a);
            defpackage.sqs.w(parcel, 2, this.b);
            defpackage.sqs.q(parcel, iP);
        }
    }

    public RadioProgramSelector(com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier, java.util.List list) {
        this.a = radioProgramIdentifier;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.car.RadioProgramSelector) {
            return j$.util.Objects.equals(this.a, ((com.google.android.gms.car.RadioProgramSelector) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        java.util.List list = this.b;
        return "RadioProgramSelector{primary=" + java.lang.String.valueOf(this.a) + " secondary=" + java.lang.String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 1, this.a, i);
        defpackage.sqs.N(parcel, 2, this.b);
        defpackage.sqs.q(parcel, iP);
    }
}
