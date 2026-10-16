package com.google.android.gms.car.diagnostics;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class CriticalError extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.diagnostics.CriticalError> CREATOR = new rih(13);
    public final int a;
    public final int b;

    public CriticalError(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static com.google.android.gms.car.diagnostics.CriticalError a(defpackage.zaj zajVar, defpackage.zak zakVar) {
        return new com.google.android.gms.car.diagnostics.CriticalError(zajVar.D, zakVar.az);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.car.diagnostics.CriticalError) {
            com.google.android.gms.car.diagnostics.CriticalError criticalError = (com.google.android.gms.car.diagnostics.CriticalError) obj;
            if (criticalError.a == this.a && criticalError.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.a);
        defpackage.sqs.v(parcel, 2, this.b);
        defpackage.sqs.q(parcel, iP);
    }
}
