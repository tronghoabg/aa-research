package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<k> CREATOR = new j(0);

    /* renamed from: a, reason: collision with root package name */
    final int f4625a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4626b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f4627c;

    k(int i2, int i3, Bundle bundle) {
        this.f4625a = i2;
        this.f4626b = i3;
        this.f4627c = bundle;
    }

    public final int a() {
        return this.f4626b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.g(parcel, 1, this.f4625a);
        bb.g(parcel, 2, this.f4626b);
        bb.k(parcel, 3, this.f4627c);
        bb.e(parcel, iD);
    }
}
