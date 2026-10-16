package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.bb;
import com.google.firebase.remoteconfig.internal.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SignInConfiguration extends com.google.android.gms.common.internal.a.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new com.google.android.gms.a.b.b.b(7);

    /* renamed from: a, reason: collision with root package name */
    private final String f4607a;

    /* renamed from: b, reason: collision with root package name */
    private final GoogleSignInOptions f4608b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        av.k(str);
        this.f4607a = str;
        this.f4608b = googleSignInOptions;
    }

    public final GoogleSignInOptions a() {
        return this.f4608b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f4607a.equals(signInConfiguration.f4607a)) {
            GoogleSignInOptions googleSignInOptions = this.f4608b;
            if (googleSignInOptions == null) {
                if (signInConfiguration.f4608b == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.f4608b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        x xVar = new x(null);
        xVar.e(this.f4607a);
        xVar.e(this.f4608b);
        return xVar.c();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.u(parcel, 2, this.f4607a);
        bb.t(parcel, 5, this.f4608b, i2);
        bb.e(parcel, iD);
    }
}
