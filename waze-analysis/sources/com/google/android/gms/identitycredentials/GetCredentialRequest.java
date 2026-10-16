package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.bb;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class GetCredentialRequest extends com.google.android.gms.common.internal.a.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = new com.google.android.gms.auth.api.signin.internal.j(6);

    /* renamed from: a, reason: collision with root package name */
    private final List f5504a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f5505b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5506c;

    /* renamed from: d, reason: collision with root package name */
    private final ResultReceiver f5507d;

    public GetCredentialRequest(List list, Bundle bundle, String str, ResultReceiver resultReceiver) {
        h.g.b.x.f(list, "credentialOptions");
        h.g.b.x.f(bundle, "data");
        h.g.b.x.f(resultReceiver, "resultReceiver");
        this.f5504a = list;
        this.f5505b = bundle;
        this.f5506c = str;
        this.f5507d = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        List list = this.f5504a;
        int iD = bb.d(parcel);
        bb.y(parcel, 1, list);
        bb.k(parcel, 2, this.f5505b);
        bb.u(parcel, 3, this.f5506c);
        bb.t(parcel, 4, this.f5507d, i2);
        bb.e(parcel, iD);
    }
}
