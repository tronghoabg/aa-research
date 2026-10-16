package com.google.android.gms.auth.a.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<e> CREATOR = new com.google.android.gms.a.b.b.b(12);

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f4420a;

    public e(Bundle bundle) {
        x.f(bundle, "responseBundle");
        this.f4420a = bundle;
    }

    public final Bundle a() {
        return this.f4420a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        int iD = bb.d(parcel);
        bb.k(parcel, 1, this.f4420a);
        bb.e(parcel, iD);
    }
}
