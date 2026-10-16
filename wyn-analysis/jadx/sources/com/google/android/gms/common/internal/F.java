package com.google.android.gms.common.internal;

import a.AbstractC1304a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class F extends AbstractC2614a {
    public static final Parcelable.Creator<F> CREATOR = new C1559a(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f26591a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f26592b;

    /* renamed from: c, reason: collision with root package name */
    public final d7.b f26593c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26594d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26595e;

    public F(int i5, IBinder iBinder, d7.b bVar, boolean z2, boolean z10) {
        this.f26591a = i5;
        this.f26592b = iBinder;
        this.f26593c = bVar;
        this.f26594d = z2;
        this.f26595e = z10;
    }

    public final boolean equals(Object obj) {
        Object z2;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        if (!this.f26593c.equals(f10.f26593c)) {
            return false;
        }
        Object z10 = null;
        IBinder iBinder = this.f26592b;
        if (iBinder == null) {
            z2 = null;
        } else {
            int i5 = AbstractBinderC1712a.f26639a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            z2 = iInterfaceQueryLocalInterface instanceof InterfaceC1726o ? (InterfaceC1726o) iInterfaceQueryLocalInterface : new Z(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        IBinder iBinder2 = f10.f26592b;
        if (iBinder2 != null) {
            int i10 = AbstractBinderC1712a.f26639a;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            z10 = iInterfaceQueryLocalInterface2 instanceof InterfaceC1726o ? (InterfaceC1726o) iInterfaceQueryLocalInterface2 : new Z(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        return AbstractC1732v.m(z2, z10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f26591a);
        AbstractC1304a.V(parcel, 2, this.f26592b);
        AbstractC1304a.Z(parcel, 3, this.f26593c, i5, false);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f26594d ? 1 : 0);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f26595e ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
