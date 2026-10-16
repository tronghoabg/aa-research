package com.google.android.gms.auth.api.signin;

import a.AbstractC1304a;
import a7.C1338d;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public class SignInAccount extends AbstractC2614a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C1338d(2);

    /* renamed from: a, reason: collision with root package name */
    public final String f26408a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f26409b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26410c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f26409b = googleSignInAccount;
        AbstractC1732v.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f26408a = str;
        AbstractC1732v.g(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f26410c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 4, this.f26408a, false);
        AbstractC1304a.Z(parcel, 7, this.f26409b, i5, false);
        AbstractC1304a.a0(parcel, 8, this.f26410c, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
