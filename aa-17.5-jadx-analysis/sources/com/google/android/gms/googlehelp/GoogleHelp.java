package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import defpackage.spu;
import defpackage.srq;
import defpackage.thg;
import java.util.List;

/* loaded from: classes2.dex */
public class GoogleHelp extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleHelp> CREATOR = new srq();
    public boolean A;
    public boolean B;
    public int C;
    String D;
    boolean E;
    String F;
    boolean G;
    ND4CSettings H;
    boolean I;
    List J;

    @Deprecated
    String K;
    public int L;
    public int M;
    public List N;
    String O;
    Intent P;
    List Q;
    public thg R;
    final int a;
    String b;
    Account c;
    Bundle d;
    String e;
    String f;
    Bitmap g;
    boolean h;
    boolean i;
    List j;

    @Deprecated
    Bundle k;

    @Deprecated
    Bitmap l;

    @Deprecated
    byte[] m;

    @Deprecated
    int n;

    @Deprecated
    int o;
    String p;
    public Uri q;
    List r;
    ThemeSettings s;
    List t;
    boolean u;
    public ErrorReport v;
    public TogglingData w;
    int x;
    PendingIntent y;
    public int z;

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, ThemeSettings themeSettings, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6, String str6, boolean z7, ND4CSettings nD4CSettings, boolean z8, List list4, String str7, int i8, int i9, List list5, String str8, Intent intent, List list6) {
        this.v = new ErrorReport();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("Help requires a non-empty appContext");
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
            ThemeSettings themeSettings2 = new ThemeSettings(3, 0);
            themeSettings2.a = i4;
            this.s = themeSettings2;
        } else {
            this.s = themeSettings == null ? new ThemeSettings(3, 0) : themeSettings;
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
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.F(parcel, 2, this.b);
        spu.E(parcel, 3, this.c, i);
        spu.u(parcel, 4, this.d);
        spu.n(parcel, 5, this.h);
        spu.n(parcel, 6, this.i);
        spu.H(parcel, 7, this.j);
        spu.u(parcel, 10, this.k);
        spu.E(parcel, 11, this.l, i);
        spu.F(parcel, 14, this.p);
        spu.E(parcel, 15, this.q, i);
        spu.J(parcel, 16, this.r);
        spu.r(parcel, 17, 0);
        spu.J(parcel, 18, this.t);
        spu.v(parcel, 19, this.m);
        spu.r(parcel, 20, this.n);
        spu.r(parcel, 21, this.o);
        spu.n(parcel, 22, this.u);
        spu.E(parcel, 23, this.v, i);
        spu.E(parcel, 25, this.s, i);
        spu.F(parcel, 28, this.e);
        spu.E(parcel, 31, this.w, i);
        spu.r(parcel, 32, this.x);
        spu.E(parcel, 33, this.y, i);
        spu.F(parcel, 34, this.f);
        spu.E(parcel, 35, this.g, i);
        spu.r(parcel, 36, this.z);
        spu.n(parcel, 37, this.A);
        spu.n(parcel, 38, this.B);
        spu.r(parcel, 39, this.C);
        spu.F(parcel, 40, this.D);
        spu.n(parcel, 41, this.E);
        spu.F(parcel, 42, this.F);
        spu.n(parcel, 43, this.G);
        spu.E(parcel, 44, this.H, i);
        spu.n(parcel, 45, this.I);
        spu.J(parcel, 46, this.J);
        spu.F(parcel, 47, this.K);
        spu.r(parcel, 48, this.L);
        spu.r(parcel, 49, this.M);
        spu.J(parcel, 50, this.N);
        spu.F(parcel, 51, this.O);
        spu.E(parcel, 52, this.P, i);
        spu.H(parcel, 53, this.Q);
        spu.m(parcel, iL);
    }
}
