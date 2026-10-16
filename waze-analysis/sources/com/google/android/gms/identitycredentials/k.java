package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<k> CREATOR = new com.google.android.gms.auth.api.signin.internal.j(3);

    /* renamed from: a, reason: collision with root package name */
    private final String f5533a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f5534b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f5535c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5536d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5537e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5538f;

    public k(String str, Bundle bundle, Bundle bundle2, String str2, String str3, String str4) {
        h.g.b.x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(bundle, "credentialRetrievalData");
        h.g.b.x.f(bundle2, "candidateQueryData");
        h.g.b.x.f(str2, "requestMatcher");
        h.g.b.x.f(str3, "requestType");
        h.g.b.x.f(str4, "protocolType");
        this.f5533a = str;
        this.f5534b = bundle;
        this.f5535c = bundle2;
        this.f5536d = str2;
        this.f5537e = str3;
        this.f5538f = str4;
        boolean z = (h.n.o.G(str3) || h.n.o.G(str4)) ? false : true;
        boolean z2 = !h.n.o.G(str) && str3.length() == 0 && str4.length() == 0;
        if (z || z2) {
            return;
        }
        throw new IllegalArgumentException("Either type: " + str + ", or requestType: " + str3 + " and protocolType: " + str4 + " must be specified, but at least one contains an invalid blank value.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        String str = this.f5533a;
        int iD = bb.d(parcel);
        bb.u(parcel, 1, str);
        bb.k(parcel, 2, this.f5534b);
        bb.k(parcel, 3, this.f5535c);
        bb.u(parcel, 4, this.f5536d);
        bb.u(parcel, 5, this.f5537e);
        bb.u(parcel, 6, this.f5538f);
        bb.e(parcel, iD);
    }
}
