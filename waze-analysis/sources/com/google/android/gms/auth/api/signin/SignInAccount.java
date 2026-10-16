package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class SignInAccount extends com.google.android.gms.common.internal.a.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new e(2);

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    final String f4593a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    final String f4594b;

    /* renamed from: c, reason: collision with root package name */
    private final GoogleSignInAccount f4595c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f4595c = googleSignInAccount;
        av.l(str, "8.3 and 8.4 SDKs require non-null email");
        this.f4593a = str;
        av.l(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f4594b = str2;
    }

    public final GoogleSignInAccount a() {
        return this.f4595c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f4593a;
        int iD = bb.d(parcel);
        bb.u(parcel, 4, str);
        bb.t(parcel, 7, this.f4595c, i2);
        bb.u(parcel, 8, this.f4594b);
        bb.e(parcel, iD);
    }
}
