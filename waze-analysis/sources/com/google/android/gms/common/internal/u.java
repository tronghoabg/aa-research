package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class u extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<u> CREATOR = new com.google.android.gms.a.b.b.b(18);

    /* renamed from: a, reason: collision with root package name */
    private final bg f5094a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5095b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5096c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f5097d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5098e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f5099f;

    public u(bg bgVar, boolean z, boolean z2, int[] iArr, int i2, int[] iArr2) {
        this.f5094a = bgVar;
        this.f5095b = z;
        this.f5096c = z2;
        this.f5097d = iArr;
        this.f5098e = i2;
        this.f5099f = iArr2;
    }

    public final int a() {
        return this.f5098e;
    }

    public final bg b() {
        return this.f5094a;
    }

    public final boolean c() {
        return this.f5095b;
    }

    public final boolean d() {
        return this.f5096c;
    }

    public final int[] e() {
        return this.f5097d;
    }

    public final int[] f() {
        return this.f5099f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.t(parcel, 1, this.f5094a, i2);
        bb.f(parcel, 2, this.f5095b);
        bb.f(parcel, 3, this.f5096c);
        bb.r(parcel, 4, this.f5097d);
        bb.g(parcel, 5, this.f5098e);
        bb.r(parcel, 6, this.f5099f);
        bb.e(parcel, iD);
    }
}
