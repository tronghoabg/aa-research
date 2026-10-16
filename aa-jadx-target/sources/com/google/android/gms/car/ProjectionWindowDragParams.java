package com.google.android.gms.car;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ProjectionWindowDragParams extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.ProjectionWindowDragParams> CREATOR = new defpackage.rcy(1);
    public final int a;
    public final java.util.List b;
    public final android.os.IBinder c;
    public final java.util.List d;
    public final java.util.List e;

    public ProjectionWindowDragParams(int i, java.util.List list, android.os.IBinder iBinder, java.util.List list2, java.util.List list3) {
        this.a = i;
        this.b = list;
        this.c = iBinder;
        this.d = list2;
        this.e = list3;
    }

    public final defpackage.ygw a() {
        return defpackage.ygw.o(this.b);
    }

    public final defpackage.ygw b() {
        return defpackage.ygw.o(this.d);
    }

    public final defpackage.ygw c() {
        return defpackage.ygw.o(this.e);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.car.ProjectionWindowDragParams) {
            com.google.android.gms.car.ProjectionWindowDragParams projectionWindowDragParams = (com.google.android.gms.car.ProjectionWindowDragParams) obj;
            if (this.a == projectionWindowDragParams.a && j$.util.Objects.equals(this.b, projectionWindowDragParams.b) && j$.util.Objects.equals(this.c, projectionWindowDragParams.c) && j$.util.Objects.equals(this.d, projectionWindowDragParams.d) && j$.util.Objects.equals(this.e, projectionWindowDragParams.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), this.b, this.c, this.d, this.e});
    }

    public final java.lang.String toString() {
        java.util.List list = this.e;
        java.util.List list2 = this.d;
        android.os.IBinder iBinder = this.c;
        return "ProjectionWindowDragParams{dragType=" + this.a + ", dragStates=" + java.lang.String.valueOf(this.b) + ", windowDragCallbackBinder=" + java.lang.String.valueOf(iBinder) + ", flingRanges=" + java.lang.String.valueOf(list2) + ", skipRecomputingInsetsAtStepIndices=" + java.lang.String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.a);
        defpackage.sqs.E(parcel, 2, a());
        android.os.IBinder iBinder = this.c;
        if (iBinder != null) {
            int iP2 = defpackage.sqs.p(parcel, 3);
            parcel.writeStrongBinder(iBinder);
            defpackage.sqs.q(parcel, iP2);
        }
        defpackage.sqs.N(parcel, 4, b());
        defpackage.sqs.E(parcel, 5, c());
        defpackage.sqs.q(parcel, iP);
    }
}
