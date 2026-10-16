package com.google.android.gms.auth.api.signin.internal;

import Z6.c;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class SignInConfiguration extends AbstractC2614a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new c(29);

    /* renamed from: a, reason: collision with root package name */
    public final String f26411a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInOptions f26412b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        AbstractC1732v.f(str);
        this.f26411a = str;
        this.f26412b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f26411a.equals(signInConfiguration.f26411a)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f26412b;
            GoogleSignInOptions googleSignInOptions2 = this.f26412b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = 1 * 31;
        String str = this.f26411a;
        int iHashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.f26412b;
        return iHashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.f26411a, false);
        AbstractC1304a.Z(parcel, 5, this.f26412b, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
