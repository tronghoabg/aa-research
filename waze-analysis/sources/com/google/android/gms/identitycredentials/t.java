package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class t extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<t> CREATOR = new com.google.android.gms.auth.api.signin.internal.j(11);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        bb.e(parcel, bb.d(parcel));
    }
}
