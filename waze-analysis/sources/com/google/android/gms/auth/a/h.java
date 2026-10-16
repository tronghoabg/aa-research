package com.google.android.gms.auth.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<h> CREATOR = new b(4);

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f4433a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4434b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4435c;

    h(byte[] bArr, boolean z, String str) {
        this.f4433a = bArr;
        this.f4434b = z;
        this.f4435c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        byte[] bArr = this.f4433a;
        int iD = bb.d(parcel);
        bb.l(parcel, 1, bArr);
        bb.f(parcel, 2, this.f4434b);
        bb.u(parcel, 3, this.f4435c);
        bb.e(parcel, iD);
    }
}
