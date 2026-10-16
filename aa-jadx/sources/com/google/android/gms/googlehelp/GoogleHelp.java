package com.google.android.gms.googlehelp;

/* JADX INFO: loaded from: classes2.dex */
public class GoogleHelp extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.googlehelp.GoogleHelp> CREATOR = new defpackage.sso();
    public boolean A;
    public boolean B;
    public int C;
    java.lang.String D;
    boolean E;
    java.lang.String F;
    boolean G;
    com.google.android.gms.googlehelp.ND4CSettings H;
    boolean I;
    java.util.List J;

    @java.lang.Deprecated
    java.lang.String K;
    public int L;
    public int M;
    public java.util.List N;
    java.lang.String O;
    android.content.Intent P;
    java.util.List Q;
    public defpackage.tis R;
    final int a;
    java.lang.String b;
    android.accounts.Account c;
    android.os.Bundle d;
    java.lang.String e;
    java.lang.String f;
    android.graphics.Bitmap g;
    boolean h;
    boolean i;
    java.util.List j;

    @java.lang.Deprecated
    android.os.Bundle k;

    @java.lang.Deprecated
    android.graphics.Bitmap l;

    @java.lang.Deprecated
    byte[] m;

    @java.lang.Deprecated
    int n;

    @java.lang.Deprecated
    int o;
    java.lang.String p;
    public android.net.Uri q;
    java.util.List r;
    com.google.android.gms.feedback.ThemeSettings s;
    java.util.List t;
    boolean u;
    public com.google.android.gms.feedback.ErrorReport v;
    public com.google.android.gms.googlehelp.internal.common.TogglingData w;
    int x;
    android.app.PendingIntent y;
    public int z;

    public GoogleHelp(int i, java.lang.String str, android.accounts.Account account, android.os.Bundle bundle, java.lang.String str2, java.lang.String str3, android.graphics.Bitmap bitmap, boolean z, boolean z2, java.util.List list, android.os.Bundle bundle2, android.graphics.Bitmap bitmap2, byte[] bArr, int i2, int i3, java.lang.String str4, android.net.Uri uri, java.util.List list2, int i4, com.google.android.gms.feedback.ThemeSettings themeSettings, java.util.List list3, boolean z3, com.google.android.gms.feedback.ErrorReport errorReport, com.google.android.gms.googlehelp.internal.common.TogglingData togglingData, int i5, android.app.PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, java.lang.String str5, boolean z6, java.lang.String str6, boolean z7, com.google.android.gms.googlehelp.ND4CSettings nD4CSettings, boolean z8, java.util.List list4, java.lang.String str7, int i8, int i9, java.util.List list5, java.lang.String str8, android.content.Intent intent, java.util.List list6) {
        this.v = new com.google.android.gms.feedback.ErrorReport();
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalStateException("Help requires a non-empty appContext");
        }
        this.a = i;
        this.z = i6;
        this.A = z4;
        this.B = z5;
        this.C = i7;
        this.D = str5;
        this.b = str;
        this.c = account;
        this.d = bundle;
        this.e = str2;
        this.f = str3;
        this.g = bitmap;
        this.h = z;
        this.i = z2;
        this.E = z6;
        this.j = list;
        this.y = pendingIntent;
        this.k = bundle2;
        this.l = bitmap2;
        this.m = bArr;
        this.n = i2;
        this.o = i3;
        this.p = str4;
        this.q = uri;
        this.r = list2;
        if (i < 4) {
            com.google.android.gms.feedback.ThemeSettings themeSettings2 = new com.google.android.gms.feedback.ThemeSettings(3, 0);
            themeSettings2.a = i4;
            this.s = themeSettings2;
        } else {
            this.s = themeSettings == null ? new com.google.android.gms.feedback.ThemeSettings(3, 0) : themeSettings;
        }
        this.t = list3;
        this.u = z3;
        this.v = errorReport;
        if (errorReport != null) {
            errorReport.X = "GoogleHelp";
        }
        this.w = togglingData;
        this.x = i5;
        this.F = str6;
        this.G = z7;
        this.H = nD4CSettings;
        this.I = z8;
        this.J = list4;
        this.K = str7;
        this.L = i8;
        this.M = i9;
        this.N = list5;
        this.O = str8;
        this.P = intent;
        this.Q = list6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.a);
        defpackage.sqs.J(parcel, 2, this.b);
        defpackage.sqs.I(parcel, 3, this.c, i);
        defpackage.sqs.y(parcel, 4, this.d);
        defpackage.sqs.r(parcel, 5, this.h);
        defpackage.sqs.r(parcel, 6, this.i);
        defpackage.sqs.L(parcel, 7, this.j);
        defpackage.sqs.y(parcel, 10, this.k);
        defpackage.sqs.I(parcel, 11, this.l, i);
        defpackage.sqs.J(parcel, 14, this.p);
        defpackage.sqs.I(parcel, 15, this.q, i);
        defpackage.sqs.N(parcel, 16, this.r);
        defpackage.sqs.v(parcel, 17, 0);
        defpackage.sqs.N(parcel, 18, this.t);
        defpackage.sqs.z(parcel, 19, this.m);
        defpackage.sqs.v(parcel, 20, this.n);
        defpackage.sqs.v(parcel, 21, this.o);
        defpackage.sqs.r(parcel, 22, this.u);
        defpackage.sqs.I(parcel, 23, this.v, i);
        defpackage.sqs.I(parcel, 25, this.s, i);
        defpackage.sqs.J(parcel, 28, this.e);
        defpackage.sqs.I(parcel, 31, this.w, i);
        defpackage.sqs.v(parcel, 32, this.x);
        defpackage.sqs.I(parcel, 33, this.y, i);
        defpackage.sqs.J(parcel, 34, this.f);
        defpackage.sqs.I(parcel, 35, this.g, i);
        defpackage.sqs.v(parcel, 36, this.z);
        defpackage.sqs.r(parcel, 37, this.A);
        defpackage.sqs.r(parcel, 38, this.B);
        defpackage.sqs.v(parcel, 39, this.C);
        defpackage.sqs.J(parcel, 40, this.D);
        defpackage.sqs.r(parcel, 41, this.E);
        defpackage.sqs.J(parcel, 42, this.F);
        defpackage.sqs.r(parcel, 43, this.G);
        defpackage.sqs.I(parcel, 44, this.H, i);
        defpackage.sqs.r(parcel, 45, this.I);
        defpackage.sqs.N(parcel, 46, this.J);
        defpackage.sqs.J(parcel, 47, this.K);
        defpackage.sqs.v(parcel, 48, this.L);
        defpackage.sqs.v(parcel, 49, this.M);
        defpackage.sqs.N(parcel, 50, this.N);
        defpackage.sqs.J(parcel, 51, this.O);
        defpackage.sqs.I(parcel, 52, this.P, i);
        defpackage.sqs.L(parcel, 53, this.Q);
        defpackage.sqs.q(parcel, iP);
    }
}
