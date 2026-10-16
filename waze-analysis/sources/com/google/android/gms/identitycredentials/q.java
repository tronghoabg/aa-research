package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class q extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<q> CREATOR = new com.google.android.gms.auth.api.signin.internal.j(8);

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f5543a;

    public q(Bundle bundle) {
        h.g.b.x.f(bundle, "responseBundle");
        this.f5543a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        Bundle bundle = this.f5543a;
        int iD = bb.d(parcel);
        bb.k(parcel, 1, bundle);
        bb.e(parcel, iD);
    }
}
