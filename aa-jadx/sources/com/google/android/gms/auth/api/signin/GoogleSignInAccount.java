package com.google.android.gms.auth.api.signin;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class GoogleSignInAccount extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> CREATOR = new defpackage.qpf(10);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final android.net.Uri e;
    public java.lang.String f;
    public final long g;
    public final java.lang.String h;
    final java.util.List i;
    public final java.lang.String j;
    public final java.lang.String k;
    private final java.util.Set l = new java.util.HashSet();

    public GoogleSignInAccount(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri, java.lang.String str5, long j, java.lang.String str6, java.util.List list, java.lang.String str7, java.lang.String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = j;
        this.h = str6;
        this.i = list;
        this.j = str7;
        this.k = str8;
    }

    public final java.util.Set a() {
        java.util.HashSet hashSet = new java.util.HashSet(this.i);
        hashSet.addAll(this.l);
        return hashSet;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.auth.api.signin.GoogleSignInAccount)) {
            return false;
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) obj;
        return googleSignInAccount.h.equals(this.h) && googleSignInAccount.a().equals(a());
    }

    public final int hashCode() {
        return ((this.h.hashCode() + 527) * 31) + a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.J(parcel, 2, str);
        defpackage.sqs.J(parcel, 3, this.b);
        defpackage.sqs.J(parcel, 4, this.c);
        defpackage.sqs.J(parcel, 5, this.d);
        defpackage.sqs.I(parcel, 6, this.e, i);
        defpackage.sqs.J(parcel, 7, this.f);
        defpackage.sqs.w(parcel, 8, this.g);
        defpackage.sqs.J(parcel, 9, this.h);
        defpackage.sqs.N(parcel, 10, this.i);
        defpackage.sqs.J(parcel, 11, this.j);
        defpackage.sqs.J(parcel, 12, this.k);
        defpackage.sqs.q(parcel, iP);
    }
}
