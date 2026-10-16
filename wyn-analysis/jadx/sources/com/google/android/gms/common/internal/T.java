package com.google.android.gms.common.internal;

import a.AbstractC1304a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class T extends AbstractC2614a {
    public static final Parcelable.Creator<T> CREATOR = new C1559a(11);

    /* renamed from: a, reason: collision with root package name */
    public Bundle f26614a;

    /* renamed from: b, reason: collision with root package name */
    public d7.d[] f26615b;

    /* renamed from: c, reason: collision with root package name */
    public int f26616c;

    /* renamed from: d, reason: collision with root package name */
    public C1721j f26617d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.S(parcel, 1, this.f26614a, false);
        AbstractC1304a.d0(parcel, 2, this.f26615b, i5);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f26616c);
        AbstractC1304a.Z(parcel, 4, this.f26617d, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
