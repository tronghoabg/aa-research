package com.google.android.gms.l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<c> CREATOR = new com.google.android.gms.auth.a.b(5);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f5591a;

    public c(byte[] bArr) {
        this.f5591a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        byte[] bArr = this.f5591a;
        int iD = bb.d(parcel);
        bb.l(parcel, 2, bArr);
        bb.e(parcel, iD);
    }
}
