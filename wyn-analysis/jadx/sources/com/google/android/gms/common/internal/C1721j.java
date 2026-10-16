package com.google.android.gms.common.internal;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;
import f7.AbstractC2614a;

/* renamed from: com.google.android.gms.common.internal.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1721j extends AbstractC2614a {
    public static final Parcelable.Creator<C1721j> CREATOR = new C1559a(12);

    /* renamed from: a, reason: collision with root package name */
    public final C1734x f26652a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26653b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26654c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f26655d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26656e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f26657f;

    public C1721j(C1734x c1734x, boolean z2, boolean z10, int[] iArr, int i5, int[] iArr2) {
        this.f26652a = c1734x;
        this.f26653b = z2;
        this.f26654c = z10;
        this.f26655d = iArr;
        this.f26656e = i5;
        this.f26657f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 1, this.f26652a, i5, false);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f26653b ? 1 : 0);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f26654c ? 1 : 0);
        AbstractC1304a.W(parcel, 4, this.f26655d, false);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f26656e);
        AbstractC1304a.W(parcel, 6, this.f26657f, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
