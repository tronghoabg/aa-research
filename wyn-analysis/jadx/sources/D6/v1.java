package D6;

import a.AbstractC1304a;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import ff.AbstractC2641B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class v1 extends AbstractC2614a {
    public static final Parcelable.Creator<v1> CREATOR = new A6.j(26);

    /* renamed from: A, reason: collision with root package name */
    public final long f2501A;

    /* renamed from: B, reason: collision with root package name */
    public final int f2502B;

    /* renamed from: C, reason: collision with root package name */
    public final Bundle f2503C = new Bundle();

    /* renamed from: a, reason: collision with root package name */
    public final int f2504a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2505b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f2506c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2507d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2508e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2509f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2510g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2511h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2512i;

    /* renamed from: j, reason: collision with root package name */
    public final q1 f2513j;
    public final Location k;

    /* renamed from: l, reason: collision with root package name */
    public final String f2514l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f2515m;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f2516n;

    /* renamed from: o, reason: collision with root package name */
    public final List f2517o;

    /* renamed from: p, reason: collision with root package name */
    public final String f2518p;

    /* renamed from: q, reason: collision with root package name */
    public final String f2519q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2520r;

    /* renamed from: s, reason: collision with root package name */
    public final Q f2521s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2522t;

    /* renamed from: u, reason: collision with root package name */
    public final String f2523u;

    /* renamed from: v, reason: collision with root package name */
    public final List f2524v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2525w;

    /* renamed from: x, reason: collision with root package name */
    public final String f2526x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2527y;

    /* renamed from: z, reason: collision with root package name */
    public final long f2528z;

    public v1(int i5, long j8, Bundle bundle, int i10, List list, boolean z2, int i11, boolean z10, String str, q1 q1Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z11, Q q4, int i12, String str5, List list3, int i13, String str6, int i14, long j10, long j11, int i15) {
        this.f2504a = i5;
        this.f2505b = j8;
        this.f2506c = bundle == null ? new Bundle() : bundle;
        this.f2507d = i10;
        this.f2508e = list;
        this.f2509f = z2;
        this.f2510g = i11;
        this.f2511h = z10;
        this.f2512i = str;
        this.f2513j = q1Var;
        this.k = location;
        this.f2514l = str2;
        this.f2515m = bundle2 == null ? new Bundle() : bundle2;
        this.f2516n = bundle3;
        this.f2517o = list2;
        this.f2518p = str3;
        this.f2519q = str4;
        this.f2520r = z11;
        this.f2521s = q4;
        this.f2522t = i12;
        this.f2523u = str5;
        this.f2524v = list3 == null ? new ArrayList() : list3;
        this.f2525w = i13;
        this.f2526x = str6;
        this.f2527y = i14;
        this.f2528z = j10;
        this.f2501A = j11;
        this.f2502B = i15;
    }

    public final boolean V(v1 v1Var) {
        if (v1Var instanceof v1) {
            return this.f2504a == v1Var.f2504a && this.f2505b == v1Var.f2505b && AbstractC2641B.O(this.f2506c, v1Var.f2506c) && this.f2507d == v1Var.f2507d && AbstractC1732v.m(this.f2508e, v1Var.f2508e) && this.f2509f == v1Var.f2509f && this.f2510g == v1Var.f2510g && this.f2511h == v1Var.f2511h && AbstractC1732v.m(this.f2512i, v1Var.f2512i) && AbstractC1732v.m(this.f2513j, v1Var.f2513j) && AbstractC1732v.m(this.k, v1Var.k) && AbstractC1732v.m(this.f2514l, v1Var.f2514l) && AbstractC2641B.O(this.f2515m, v1Var.f2515m) && AbstractC2641B.O(this.f2516n, v1Var.f2516n) && AbstractC1732v.m(this.f2517o, v1Var.f2517o) && AbstractC1732v.m(this.f2518p, v1Var.f2518p) && AbstractC1732v.m(this.f2519q, v1Var.f2519q) && this.f2520r == v1Var.f2520r && this.f2522t == v1Var.f2522t && AbstractC1732v.m(this.f2523u, v1Var.f2523u) && AbstractC1732v.m(this.f2524v, v1Var.f2524v) && this.f2525w == v1Var.f2525w && AbstractC1732v.m(this.f2526x, v1Var.f2526x) && this.f2527y == v1Var.f2527y && this.f2502B == v1Var.f2502B;
        }
        return false;
    }

    public final boolean W() {
        Bundle bundle = this.f2506c;
        return bundle.getBoolean("is_sdk_preload", false) || bundle.getBoolean("zenith_v2", false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v1) {
            return V((v1) obj) && this.f2528z == ((v1) obj).f2528z;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2504a), Long.valueOf(this.f2505b), this.f2506c, Integer.valueOf(this.f2507d), this.f2508e, Boolean.valueOf(this.f2509f), Integer.valueOf(this.f2510g), Boolean.valueOf(this.f2511h), this.f2512i, this.f2513j, this.k, this.f2514l, this.f2515m, this.f2516n, this.f2517o, this.f2518p, this.f2519q, Boolean.valueOf(this.f2520r), Integer.valueOf(this.f2522t), this.f2523u, this.f2524v, Integer.valueOf(this.f2525w), this.f2526x, Integer.valueOf(this.f2527y), Long.valueOf(this.f2528z), Long.valueOf(this.f2501A), Integer.valueOf(this.f2502B)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f2504a);
        AbstractC1304a.k0(parcel, 2, 8);
        parcel.writeLong(this.f2505b);
        AbstractC1304a.S(parcel, 3, this.f2506c, false);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f2507d);
        AbstractC1304a.c0(parcel, 5, this.f2508e);
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeInt(this.f2509f ? 1 : 0);
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeInt(this.f2510g);
        AbstractC1304a.k0(parcel, 8, 4);
        parcel.writeInt(this.f2511h ? 1 : 0);
        AbstractC1304a.a0(parcel, 9, this.f2512i, false);
        AbstractC1304a.Z(parcel, 10, this.f2513j, i5, false);
        AbstractC1304a.Z(parcel, 11, this.k, i5, false);
        AbstractC1304a.a0(parcel, 12, this.f2514l, false);
        AbstractC1304a.S(parcel, 13, this.f2515m, false);
        AbstractC1304a.S(parcel, 14, this.f2516n, false);
        AbstractC1304a.c0(parcel, 15, this.f2517o);
        AbstractC1304a.a0(parcel, 16, this.f2518p, false);
        AbstractC1304a.a0(parcel, 17, this.f2519q, false);
        AbstractC1304a.k0(parcel, 18, 4);
        parcel.writeInt(this.f2520r ? 1 : 0);
        AbstractC1304a.Z(parcel, 19, this.f2521s, i5, false);
        AbstractC1304a.k0(parcel, 20, 4);
        parcel.writeInt(this.f2522t);
        AbstractC1304a.a0(parcel, 21, this.f2523u, false);
        AbstractC1304a.c0(parcel, 22, this.f2524v);
        AbstractC1304a.k0(parcel, 23, 4);
        parcel.writeInt(this.f2525w);
        AbstractC1304a.a0(parcel, 24, this.f2526x, false);
        AbstractC1304a.k0(parcel, 25, 4);
        parcel.writeInt(this.f2527y);
        AbstractC1304a.k0(parcel, 26, 8);
        parcel.writeLong(this.f2528z);
        AbstractC1304a.k0(parcel, 27, 8);
        parcel.writeLong(this.f2501A);
        AbstractC1304a.k0(parcel, 28, 4);
        parcel.writeInt(this.f2502B);
        AbstractC1304a.m0(iL0, parcel);
    }
}
