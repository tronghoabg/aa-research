package com.google.android.gms.common.internal;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;
import f7.AbstractC2614a;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1735y extends AbstractC2614a {
    public static final Parcelable.Creator<C1735y> CREATOR = new C1559a(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f26702a;

    /* renamed from: b, reason: collision with root package name */
    public List f26703b;

    public C1735y(int i5, List list) {
        this.f26702a = i5;
        this.f26703b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f26702a);
        AbstractC1304a.e0(parcel, 2, this.f26703b, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
