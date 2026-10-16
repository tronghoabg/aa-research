package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.aa;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h extends com.google.android.gms.common.internal.a.a implements aa {
    public static final Parcelable.Creator<h> CREATOR = new j(17);

    /* renamed from: a, reason: collision with root package name */
    private final Status f5685a;

    /* renamed from: b, reason: collision with root package name */
    private final i f5686b;

    public h(Status status, i iVar) {
        this.f5685a = status;
        this.f5686b = iVar;
    }

    public final Status a() {
        return this.f5685a;
    }

    public final i b() {
        return this.f5686b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.t(parcel, 1, this.f5685a, i2);
        bb.t(parcel, 2, this.f5686b, i2);
        bb.e(parcel, iD);
    }
}
