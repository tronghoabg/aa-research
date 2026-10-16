package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<h> CREATOR = new com.google.android.gms.auth.api.signin.e(19);

    /* renamed from: a, reason: collision with root package name */
    private final String f5528a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f5529b;

    public h(String str, Bundle bundle) {
        h.g.b.x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(bundle, "data");
        this.f5528a = str;
        this.f5529b = bundle;
    }

    public final Bundle a() {
        return this.f5529b;
    }

    public final String b() {
        return this.f5528a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        int iD = bb.d(parcel);
        bb.u(parcel, 1, this.f5528a);
        bb.k(parcel, 2, this.f5529b);
        bb.e(parcel, iD);
    }
}
