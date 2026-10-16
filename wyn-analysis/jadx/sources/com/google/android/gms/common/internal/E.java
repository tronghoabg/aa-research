package com.google.android.gms.common.internal;

import a.AbstractC1304a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class E extends AbstractC2614a {
    public static final Parcelable.Creator<E> CREATOR = new C1559a(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f26587a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f26588b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26589c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f26590d;

    public E(int i5, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f26587a = i5;
        this.f26588b = account;
        this.f26589c = i10;
        this.f26590d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f26587a);
        AbstractC1304a.Z(parcel, 2, this.f26588b, i5, false);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f26589c);
        AbstractC1304a.Z(parcel, 4, this.f26590d, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
