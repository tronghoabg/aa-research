package A7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class N1 extends AbstractC2614a {
    public static final Parcelable.Creator<N1> CREATOR = new A6.j(8);

    /* renamed from: A, reason: collision with root package name */
    public final int f613A;

    /* renamed from: B, reason: collision with root package name */
    public final String f614B;

    /* renamed from: C, reason: collision with root package name */
    public final int f615C;

    /* renamed from: D, reason: collision with root package name */
    public final long f616D;

    /* renamed from: E, reason: collision with root package name */
    public final String f617E;

    /* renamed from: F, reason: collision with root package name */
    public final String f618F;

    /* renamed from: a, reason: collision with root package name */
    public final String f619a;

    /* renamed from: b, reason: collision with root package name */
    public final String f620b;

    /* renamed from: c, reason: collision with root package name */
    public final String f621c;

    /* renamed from: d, reason: collision with root package name */
    public final String f622d;

    /* renamed from: e, reason: collision with root package name */
    public final long f623e;

    /* renamed from: f, reason: collision with root package name */
    public final long f624f;

    /* renamed from: g, reason: collision with root package name */
    public final String f625g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f626h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f627i;

    /* renamed from: j, reason: collision with root package name */
    public final long f628j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final long f629l;

    /* renamed from: m, reason: collision with root package name */
    public final long f630m;

    /* renamed from: n, reason: collision with root package name */
    public final int f631n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f632o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f633p;

    /* renamed from: q, reason: collision with root package name */
    public final String f634q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f635r;

    /* renamed from: s, reason: collision with root package name */
    public final long f636s;

    /* renamed from: t, reason: collision with root package name */
    public final List f637t;

    /* renamed from: u, reason: collision with root package name */
    public final String f638u;

    /* renamed from: v, reason: collision with root package name */
    public final String f639v;

    /* renamed from: w, reason: collision with root package name */
    public final String f640w;

    /* renamed from: x, reason: collision with root package name */
    public final String f641x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f642y;

    /* renamed from: z, reason: collision with root package name */
    public final long f643z;

    public N1(String str, String str2, String str3, long j8, String str4, long j10, long j11, String str5, boolean z2, boolean z10, String str6, long j12, int i5, boolean z11, boolean z12, String str7, Boolean bool, long j13, List list, String str8, String str9, String str10, boolean z13, long j14, int i10, String str11, int i11, long j15, String str12, String str13) {
        AbstractC1732v.f(str);
        this.f619a = str;
        this.f620b = TextUtils.isEmpty(str2) ? null : str2;
        this.f621c = str3;
        this.f628j = j8;
        this.f622d = str4;
        this.f623e = j10;
        this.f624f = j11;
        this.f625g = str5;
        this.f626h = z2;
        this.f627i = z10;
        this.k = str6;
        this.f629l = 0L;
        this.f630m = j12;
        this.f631n = i5;
        this.f632o = z11;
        this.f633p = z12;
        this.f634q = str7;
        this.f635r = bool;
        this.f636s = j13;
        this.f637t = list;
        this.f638u = null;
        this.f639v = str8;
        this.f640w = str9;
        this.f641x = str10;
        this.f642y = z13;
        this.f643z = j14;
        this.f613A = i10;
        this.f614B = str11;
        this.f615C = i11;
        this.f616D = j15;
        this.f617E = str12;
        this.f618F = str13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.f619a, false);
        AbstractC1304a.a0(parcel, 3, this.f620b, false);
        AbstractC1304a.a0(parcel, 4, this.f621c, false);
        AbstractC1304a.a0(parcel, 5, this.f622d, false);
        AbstractC1304a.k0(parcel, 6, 8);
        parcel.writeLong(this.f623e);
        AbstractC1304a.k0(parcel, 7, 8);
        parcel.writeLong(this.f624f);
        AbstractC1304a.a0(parcel, 8, this.f625g, false);
        AbstractC1304a.k0(parcel, 9, 4);
        parcel.writeInt(this.f626h ? 1 : 0);
        AbstractC1304a.k0(parcel, 10, 4);
        parcel.writeInt(this.f627i ? 1 : 0);
        AbstractC1304a.k0(parcel, 11, 8);
        parcel.writeLong(this.f628j);
        AbstractC1304a.a0(parcel, 12, this.k, false);
        AbstractC1304a.k0(parcel, 13, 8);
        parcel.writeLong(this.f629l);
        AbstractC1304a.k0(parcel, 14, 8);
        parcel.writeLong(this.f630m);
        AbstractC1304a.k0(parcel, 15, 4);
        parcel.writeInt(this.f631n);
        AbstractC1304a.k0(parcel, 16, 4);
        parcel.writeInt(this.f632o ? 1 : 0);
        AbstractC1304a.k0(parcel, 18, 4);
        parcel.writeInt(this.f633p ? 1 : 0);
        AbstractC1304a.a0(parcel, 19, this.f634q, false);
        AbstractC1304a.R(parcel, 21, this.f635r);
        AbstractC1304a.k0(parcel, 22, 8);
        parcel.writeLong(this.f636s);
        AbstractC1304a.c0(parcel, 23, this.f637t);
        AbstractC1304a.a0(parcel, 24, this.f638u, false);
        AbstractC1304a.a0(parcel, 25, this.f639v, false);
        AbstractC1304a.a0(parcel, 26, this.f640w, false);
        AbstractC1304a.a0(parcel, 27, this.f641x, false);
        AbstractC1304a.k0(parcel, 28, 4);
        parcel.writeInt(this.f642y ? 1 : 0);
        AbstractC1304a.k0(parcel, 29, 8);
        parcel.writeLong(this.f643z);
        AbstractC1304a.k0(parcel, 30, 4);
        parcel.writeInt(this.f613A);
        AbstractC1304a.a0(parcel, 31, this.f614B, false);
        AbstractC1304a.k0(parcel, 32, 4);
        parcel.writeInt(this.f615C);
        AbstractC1304a.k0(parcel, 34, 8);
        parcel.writeLong(this.f616D);
        AbstractC1304a.a0(parcel, 35, this.f617E, false);
        AbstractC1304a.a0(parcel, 36, this.f618F, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public N1(String str, String str2, String str3, String str4, long j8, long j10, String str5, boolean z2, boolean z10, long j11, String str6, long j12, long j13, int i5, boolean z11, boolean z12, String str7, Boolean bool, long j14, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z13, long j15, int i10, String str12, int i11, long j16, String str13, String str14) {
        this.f619a = str;
        this.f620b = str2;
        this.f621c = str3;
        this.f628j = j11;
        this.f622d = str4;
        this.f623e = j8;
        this.f624f = j10;
        this.f625g = str5;
        this.f626h = z2;
        this.f627i = z10;
        this.k = str6;
        this.f629l = j12;
        this.f630m = j13;
        this.f631n = i5;
        this.f632o = z11;
        this.f633p = z12;
        this.f634q = str7;
        this.f635r = bool;
        this.f636s = j14;
        this.f637t = arrayList;
        this.f638u = str8;
        this.f639v = str9;
        this.f640w = str10;
        this.f641x = str11;
        this.f642y = z13;
        this.f643z = j15;
        this.f613A = i10;
        this.f614B = str12;
        this.f615C = i11;
        this.f616D = j16;
        this.f617E = str13;
        this.f618F = str14;
    }
}
