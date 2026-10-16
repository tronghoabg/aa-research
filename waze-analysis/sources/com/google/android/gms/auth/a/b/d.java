package com.google.android.gms.auth.a.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<d> CREATOR = new com.google.android.gms.a.b.b.b(11);

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f4419a;

    public d(Bundle bundle) {
        x.f(bundle, "requestBundle");
        this.f4419a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        Bundle bundle = this.f4419a;
        int iD = bb.d(parcel);
        bb.k(parcel, 1, bundle);
        bb.e(parcel, iD);
    }
}
