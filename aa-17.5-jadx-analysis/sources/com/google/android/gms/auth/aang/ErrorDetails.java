package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qoj;
import defpackage.spu;

/* loaded from: classes2.dex */
public final class ErrorDetails extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ErrorDetails> CREATOR = new qoj(2);
    public final boolean a;
    public final boolean b;

    public ErrorDetails(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iL = spu.l(parcel, 20293);
        spu.n(parcel, 1, z);
        spu.n(parcel, 2, this.b);
        spu.m(parcel, iL);
    }
}
