package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class be extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<be> CREATOR = new aa(3);

    /* renamed from: a, reason: collision with root package name */
    final int f5022a;

    /* renamed from: b, reason: collision with root package name */
    final IBinder f5023b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.d f5024c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5025d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5026e;

    be(int i2, IBinder iBinder, com.google.android.gms.common.d dVar, boolean z, boolean z2) {
        this.f5022a = i2;
        this.f5023b = iBinder;
        this.f5024c = dVar;
        this.f5025d = z;
        this.f5026e = z2;
    }

    public final com.google.android.gms.common.d a() {
        return this.f5024c;
    }

    public final ao b() {
        IBinder iBinder = this.f5023b;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof ao ? (ao) iInterfaceQueryLocalInterface : new ao(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be)) {
            return false;
        }
        be beVar = (be) obj;
        return this.f5024c.equals(beVar.f5024c) && Objects.equals(b(), beVar.b());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.g(parcel, 1, this.f5022a);
        bb.q(parcel, 2, this.f5023b);
        bb.t(parcel, 3, this.f5024c, i2);
        bb.f(parcel, 4, this.f5025d);
        bb.f(parcel, 5, this.f5026e);
        bb.e(parcel, iD);
    }
}
