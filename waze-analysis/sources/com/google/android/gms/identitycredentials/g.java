package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<g> CREATOR = new com.google.android.gms.auth.api.signin.e(18);

    /* renamed from: a, reason: collision with root package name */
    private final String f5522a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f5523b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f5524c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5525d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5526e;

    /* renamed from: f, reason: collision with root package name */
    private final ResultReceiver f5527f;

    public g(String str, Bundle bundle, Bundle bundle2, String str2, String str3, ResultReceiver resultReceiver) {
        h.g.b.x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(bundle, "credentialData");
        h.g.b.x.f(bundle2, "candidateQueryData");
        this.f5522a = str;
        this.f5523b = bundle;
        this.f5524c = bundle2;
        this.f5525d = str2;
        this.f5526e = str3;
        this.f5527f = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        String str = this.f5522a;
        int iD = bb.d(parcel);
        bb.u(parcel, 1, str);
        bb.k(parcel, 2, this.f5523b);
        bb.k(parcel, 3, this.f5524c);
        bb.u(parcel, 4, this.f5525d);
        bb.u(parcel, 5, this.f5526e);
        bb.t(parcel, 6, this.f5527f, i2);
        bb.e(parcel, iD);
    }
}
