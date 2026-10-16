package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<e> CREATOR = new com.google.android.gms.auth.api.signin.e(16);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5519a;

    public e(boolean z) {
        this.f5519a = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        boolean z = this.f5519a;
        int iD = bb.d(parcel);
        bb.f(parcel, 1, z);
        bb.e(parcel, iD);
    }
}
