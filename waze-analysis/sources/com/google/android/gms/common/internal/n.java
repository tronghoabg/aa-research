package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<n> CREATOR = new com.google.android.gms.a.b.b.b(15);

    /* renamed from: a, reason: collision with root package name */
    private final int f5065a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5066b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5067c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5068d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5069e;

    public n(int i2, String str, long j2, int i3, boolean z) {
        this.f5065a = i2;
        this.f5066b = str;
        this.f5067c = j2;
        this.f5068d = i3;
        this.f5069e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f5065a;
        int iD = bb.d(parcel);
        bb.g(parcel, 1, i3);
        bb.u(parcel, 2, this.f5066b);
        bb.h(parcel, 3, this.f5067c);
        bb.g(parcel, 4, this.f5068d);
        bb.f(parcel, 5, this.f5069e);
        bb.e(parcel, iD);
    }
}
