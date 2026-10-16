package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class q extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<q> CREATOR = new com.google.android.gms.a.b.b.b(16);

    /* renamed from: a, reason: collision with root package name */
    private final int f5083a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5084b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5085c;

    public q(int i2, String str, int i3) {
        this.f5083a = i2;
        this.f5084b = str;
        this.f5085c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.g(parcel, 1, this.f5083a);
        bb.u(parcel, 2, this.f5084b);
        bb.g(parcel, 3, this.f5085c);
        bb.e(parcel, iD);
    }
}
