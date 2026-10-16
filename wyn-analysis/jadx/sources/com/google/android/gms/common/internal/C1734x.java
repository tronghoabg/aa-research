package com.google.android.gms.common.internal;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;
import f7.AbstractC2614a;

/* renamed from: com.google.android.gms.common.internal.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1734x extends AbstractC2614a {
    public static final Parcelable.Creator<C1734x> CREATOR = new C1559a(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f26697a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26698b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26699c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26700d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26701e;

    public C1734x(int i5, int i10, int i11, boolean z2, boolean z10) {
        this.f26697a = i5;
        this.f26698b = z2;
        this.f26699c = z10;
        this.f26700d = i10;
        this.f26701e = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f26697a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f26698b ? 1 : 0);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f26699c ? 1 : 0);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f26700d);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f26701e);
        AbstractC1304a.m0(iL0, parcel);
    }
}
