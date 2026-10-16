package com.google.android.gms.auth.aang;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorDetails extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.aang.ErrorDetails> CREATOR = new defpackage.qpf(2);
    public final boolean a;
    public final boolean b;

    public ErrorDetails(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        boolean z = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.r(parcel, 1, z);
        defpackage.sqs.r(parcel, 2, this.b);
        defpackage.sqs.q(parcel, iP);
    }
}
