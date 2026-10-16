package com.google.android.gms.common.internal;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;
import f7.AbstractC2614a;

/* renamed from: com.google.android.gms.common.internal.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1730t extends AbstractC2614a {
    public static final Parcelable.Creator<C1730t> CREATOR = new C1559a(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f26682a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26683b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26684c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26685d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26686e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26687f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26688g;

    /* renamed from: h, reason: collision with root package name */
    public final int f26689h;

    /* renamed from: i, reason: collision with root package name */
    public final int f26690i;

    public C1730t(int i5, int i10, int i11, long j8, long j10, String str, String str2, int i12, int i13) {
        this.f26682a = i5;
        this.f26683b = i10;
        this.f26684c = i11;
        this.f26685d = j8;
        this.f26686e = j10;
        this.f26687f = str;
        this.f26688g = str2;
        this.f26689h = i12;
        this.f26690i = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f26682a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f26683b);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f26684c);
        AbstractC1304a.k0(parcel, 4, 8);
        parcel.writeLong(this.f26685d);
        AbstractC1304a.k0(parcel, 5, 8);
        parcel.writeLong(this.f26686e);
        AbstractC1304a.a0(parcel, 6, this.f26687f, false);
        AbstractC1304a.a0(parcel, 7, this.f26688g, false);
        AbstractC1304a.k0(parcel, 8, 4);
        parcel.writeInt(this.f26689h);
        AbstractC1304a.k0(parcel, 9, 4);
        parcel.writeInt(this.f26690i);
        AbstractC1304a.m0(iL0, parcel);
    }
}
