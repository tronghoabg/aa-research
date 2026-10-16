package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class az extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<az> CREATOR = new com.google.android.gms.a.b.b.b(20);

    /* renamed from: a, reason: collision with root package name */
    private final int f4999a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5000b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5001c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5002d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5003e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5004f;

    /* renamed from: g, reason: collision with root package name */
    private final String f5005g;

    /* renamed from: h, reason: collision with root package name */
    private final int f5006h;

    /* renamed from: i, reason: collision with root package name */
    private final int f5007i;

    public az(int i2, int i3, int i4, long j2, long j3, String str, String str2, int i5, int i6) {
        this.f4999a = i2;
        this.f5000b = i3;
        this.f5001c = i4;
        this.f5002d = j2;
        this.f5003e = j3;
        this.f5004f = str;
        this.f5005g = str2;
        this.f5006h = i5;
        this.f5007i = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f4999a;
        int iD = bb.d(parcel);
        bb.g(parcel, 1, i3);
        bb.g(parcel, 2, this.f5000b);
        bb.g(parcel, 3, this.f5001c);
        bb.h(parcel, 4, this.f5002d);
        bb.h(parcel, 5, this.f5003e);
        bb.u(parcel, 6, this.f5004f);
        bb.u(parcel, 7, this.f5005g);
        bb.g(parcel, 8, this.f5006h);
        bb.g(parcel, 9, this.f5007i);
        bb.e(parcel, iD);
    }
}
