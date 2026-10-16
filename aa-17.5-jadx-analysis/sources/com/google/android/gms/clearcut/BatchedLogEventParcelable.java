package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.sht;
import defpackage.spu;
import j$.util.DesugarCollections;
import java.util.List;

/* loaded from: classes2.dex */
public class BatchedLogEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BatchedLogEventParcelable> CREATOR = new sht(0);
    public final List a;
    public final BatchedLogErrorParcelable b;

    public BatchedLogEventParcelable(List list, BatchedLogErrorParcelable batchedLogErrorParcelable) {
        this.a = DesugarCollections.unmodifiableList(list);
        this.b = batchedLogErrorParcelable;
    }

    public final String toString() {
        BatchedLogErrorParcelable batchedLogErrorParcelable = this.b;
        return "BatchedLogEventParcelable[LogEvents: " + String.valueOf(this.a) + "]\nBatchedLogErrors: " + String.valueOf(batchedLogErrorParcelable) + "]\n";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iL = spu.l(parcel, 20293);
        spu.J(parcel, 1, list);
        spu.E(parcel, 2, this.b, i);
        spu.m(parcel, iL);
    }
}
