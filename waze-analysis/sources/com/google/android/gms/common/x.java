package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class x extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<x> CREATOR = new w(2);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5168a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5169b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5170c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5171d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5172e;

    x(boolean z, String str, int i2, int i3, long j2) {
        this.f5168a = z;
        this.f5169b = str;
        this.f5170c = ad.a(i2) - 1;
        this.f5171d = ad.b(i3) - 1;
        this.f5172e = j2;
    }

    public final String a() {
        return this.f5169b;
    }

    public final boolean b() {
        return this.f5168a;
    }

    public final int c() {
        return ad.a(this.f5170c);
    }

    public final void d() {
        ad.b(this.f5171d);
    }

    public final void e() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.f(parcel, 1, this.f5168a);
        bb.u(parcel, 2, this.f5169b);
        bb.g(parcel, 3, this.f5170c);
        bb.g(parcel, 4, this.f5171d);
        bb.h(parcel, 5, this.f5172e);
        bb.e(parcel, iD);
    }
}
