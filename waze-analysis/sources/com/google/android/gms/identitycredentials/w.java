package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class w extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<w> CREATOR = new com.google.android.gms.auth.api.signin.internal.j(14);

    /* renamed from: a, reason: collision with root package name */
    private final String f5546a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5547b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f5548c;

    public w(String str, String str2, Bundle bundle) {
        h.g.b.x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(bundle, "requestData");
        this.f5546a = str;
        this.f5547b = str2;
        this.f5548c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        String str = this.f5546a;
        int iD = bb.d(parcel);
        bb.u(parcel, 1, str);
        bb.u(parcel, 2, this.f5547b);
        bb.k(parcel, 3, this.f5548c);
        bb.e(parcel, iD);
    }
}
