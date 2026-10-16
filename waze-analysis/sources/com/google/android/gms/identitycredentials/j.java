package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<j> CREATOR = new com.google.android.gms.auth.api.signin.internal.j(2);

    /* renamed from: a, reason: collision with root package name */
    private final List f5532a;

    public j(List list) {
        h.g.b.x.f(list, "credentialInformationList");
        this.f5532a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        List list = this.f5532a;
        int iD = bb.d(parcel);
        bb.y(parcel, 1, list);
        bb.e(parcel, iD);
    }
}
