package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<o> CREATOR = new com.google.android.gms.auth.api.signin.internal.j(7);

    /* renamed from: a, reason: collision with root package name */
    private final i f5541a;

    /* renamed from: b, reason: collision with root package name */
    private final List f5542b;

    public o(i iVar, List list) {
        h.g.b.x.f(iVar, "credential");
        this.f5541a = iVar;
        this.f5542b = list;
    }

    public final i a() {
        return this.f5541a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        int iD = bb.d(parcel);
        bb.t(parcel, 1, this.f5541a, i2);
        bb.y(parcel, 2, this.f5542b);
        bb.e(parcel, iD);
    }
}
