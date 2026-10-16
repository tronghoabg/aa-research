package com.google.android.gms.m.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import com.google.android.gms.common.internal.bd;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<f> CREATOR = new g(0);

    /* renamed from: a, reason: collision with root package name */
    final int f5702a;

    /* renamed from: b, reason: collision with root package name */
    final bd f5703b;

    f(int i2, bd bdVar) {
        this.f5702a = i2;
        this.f5703b = bdVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.g(parcel, 1, this.f5702a);
        bb.t(parcel, 2, this.f5703b, i2);
        bb.e(parcel, iD);
    }
}
