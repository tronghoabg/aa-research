package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<d> CREATOR = new com.google.android.gms.auth.api.signin.e(15);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5518a;

    public d(boolean z) {
        this.f5518a = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        boolean z = this.f5518a;
        int iD = bb.d(parcel);
        bb.f(parcel, 1, z);
        bb.e(parcel, iD);
    }
}
