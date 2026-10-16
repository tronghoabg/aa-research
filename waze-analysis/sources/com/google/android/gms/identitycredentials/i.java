package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<i> CREATOR = new com.google.android.gms.auth.api.signin.e(20);

    /* renamed from: a, reason: collision with root package name */
    private final String f5530a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f5531b;

    public i(String str, Bundle bundle) {
        h.g.b.x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(bundle, "data");
        this.f5530a = str;
        this.f5531b = bundle;
    }

    public final Bundle a() {
        return this.f5531b;
    }

    public final String b() {
        return this.f5530a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        int iD = bb.d(parcel);
        bb.u(parcel, 1, this.f5530a);
        bb.k(parcel, 2, this.f5531b);
        bb.e(parcel, iD);
    }
}
