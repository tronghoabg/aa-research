package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class CredentialInformation extends com.google.android.gms.common.internal.a.a implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialInformation> CREATOR = new com.google.android.gms.auth.api.signin.internal.j(1);

    /* renamed from: a, reason: collision with root package name */
    private final String f5499a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5500b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5501c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5502d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5503e;

    public CredentialInformation(String str, int i2, int i3, int i4, int i5) {
        h.g.b.x.f(str, "packageName");
        this.f5499a = str;
        this.f5500b = i2;
        this.f5501c = i3;
        this.f5502d = i4;
        this.f5503e = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        String str = this.f5499a;
        int iD = bb.d(parcel);
        bb.u(parcel, 1, str);
        bb.g(parcel, 2, this.f5500b);
        bb.g(parcel, 3, this.f5501c);
        bb.g(parcel, 4, this.f5502d);
        bb.g(parcel, 5, this.f5503e);
        bb.e(parcel, iD);
    }
}
