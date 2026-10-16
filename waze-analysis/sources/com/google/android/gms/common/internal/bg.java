package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bg extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<bg> CREATOR = new com.google.android.gms.auth.api.identity.n(9);

    /* renamed from: a, reason: collision with root package name */
    private final int f5030a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5031b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5032c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5033d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5034e;

    public bg(int i2, boolean z, boolean z2, int i3, int i4) {
        this.f5030a = i2;
        this.f5031b = z;
        this.f5032c = z2;
        this.f5033d = i3;
        this.f5034e = i4;
    }

    public final int a() {
        return this.f5033d;
    }

    public final int b() {
        return this.f5034e;
    }

    public final int c() {
        return this.f5030a;
    }

    public final boolean d() {
        return this.f5031b;
    }

    public final boolean e() {
        return this.f5032c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.g(parcel, 1, this.f5030a);
        bb.f(parcel, 2, this.f5031b);
        bb.f(parcel, 3, this.f5032c);
        bb.g(parcel, 4, this.f5033d);
        bb.g(parcel, 5, this.f5034e);
        bb.e(parcel, iD);
    }
}
