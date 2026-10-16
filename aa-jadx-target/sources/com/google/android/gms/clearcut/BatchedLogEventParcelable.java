package com.google.android.gms.clearcut;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class BatchedLogEventParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.clearcut.BatchedLogEventParcelable> CREATOR = new defpackage.rcy(14);
    public final java.util.List a;
    public final com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable b;

    public BatchedLogEventParcelable(java.util.List list, com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable batchedLogErrorParcelable) {
        this.a = j$.util.DesugarCollections.unmodifiableList(list);
        this.b = batchedLogErrorParcelable;
    }

    public final java.lang.String toString() {
        com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable batchedLogErrorParcelable = this.b;
        return "BatchedLogEventParcelable[LogEvents: " + java.lang.String.valueOf(this.a) + "]\nBatchedLogErrors: " + java.lang.String.valueOf(batchedLogErrorParcelable) + "]\n";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.N(parcel, 1, list);
        defpackage.sqs.I(parcel, 2, this.b, i);
        defpackage.sqs.q(parcel, iP);
    }
}
