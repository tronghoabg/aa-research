package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bd extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<bd> CREATOR = new aa(2);

    /* renamed from: a, reason: collision with root package name */
    final int f5018a;

    /* renamed from: b, reason: collision with root package name */
    private final Account f5019b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5020c;

    /* renamed from: d, reason: collision with root package name */
    private final GoogleSignInAccount f5021d;

    bd(int i2, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.f5018a = i2;
        this.f5019b = account;
        this.f5020c = i3;
        this.f5021d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f5018a;
        int iD = bb.d(parcel);
        bb.g(parcel, 1, i3);
        bb.t(parcel, 2, this.f5019b, i2);
        bb.g(parcel, 3, this.f5020c);
        bb.t(parcel, 4, this.f5021d, i2);
        bb.e(parcel, iD);
    }

    public bd(Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i2, googleSignInAccount);
    }
}
