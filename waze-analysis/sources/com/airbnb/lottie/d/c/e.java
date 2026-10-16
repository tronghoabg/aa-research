package com.airbnb.lottie.d.c;

import com.airbnb.lottie.d.a.l;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final List f2245a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.h f2246b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2247c;

    /* renamed from: d, reason: collision with root package name */
    private final long f2248d;

    /* renamed from: e, reason: collision with root package name */
    private final long f2249e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2250f;

    /* renamed from: g, reason: collision with root package name */
    private final List f2251g;

    /* renamed from: h, reason: collision with root package name */
    private final l f2252h;

    /* renamed from: i, reason: collision with root package name */
    private final int f2253i;

    /* renamed from: j, reason: collision with root package name */
    private final int f2254j;

    /* renamed from: k, reason: collision with root package name */
    private final int f2255k;

    /* renamed from: l, reason: collision with root package name */
    private final float f2256l;
    private final float m;
    private final float n;
    private final float o;
    private final com.airbnb.lottie.d.a.j p;
    private final com.airbnb.lottie.d.a.k q;
    private final com.airbnb.lottie.d.a.b r;
    private final List s;
    private final boolean t;
    private final com.airbnb.lottie.d.b.a u;
    private final com.airbnb.lottie.f.i v;
    private final int w;
    private final int x;
    private final int y;

    public e(List list, com.airbnb.lottie.h hVar, String str, long j2, int i2, long j3, String str2, List list2, l lVar, int i3, int i4, int i5, float f2, float f3, float f4, float f5, com.airbnb.lottie.d.a.j jVar, com.airbnb.lottie.d.a.k kVar, List list3, int i6, com.airbnb.lottie.d.a.b bVar, boolean z, com.airbnb.lottie.d.b.a aVar, com.airbnb.lottie.f.i iVar, int i7) {
        this.f2245a = list;
        this.f2246b = hVar;
        this.f2247c = str;
        this.f2248d = j2;
        this.w = i2;
        this.f2249e = j3;
        this.f2250f = str2;
        this.f2251g = list2;
        this.f2252h = lVar;
        this.f2253i = i3;
        this.f2254j = i4;
        this.f2255k = i5;
        this.f2256l = f2;
        this.m = f3;
        this.n = f4;
        this.o = f5;
        this.p = jVar;
        this.q = kVar;
        this.s = list3;
        this.x = i6;
        this.r = bVar;
        this.t = z;
        this.u = aVar;
        this.v = iVar;
        this.y = i7;
    }

    final float a() {
        return this.o;
    }

    final float b() {
        return this.n;
    }

    final float c() {
        return this.m / this.f2246b.b();
    }

    final float d() {
        return this.f2256l;
    }

    final int e() {
        return this.f2255k;
    }

    final int f() {
        return this.f2254j;
    }

    final int g() {
        return this.f2253i;
    }

    public final long h() {
        return this.f2248d;
    }

    final long i() {
        return this.f2249e;
    }

    final com.airbnb.lottie.h j() {
        return this.f2246b;
    }

    final com.airbnb.lottie.d.a.b k() {
        return this.r;
    }

    final com.airbnb.lottie.d.a.j l() {
        return this.p;
    }

    final com.airbnb.lottie.d.a.k m() {
        return this.q;
    }

    final l n() {
        return this.f2252h;
    }

    public final com.airbnb.lottie.d.b.a o() {
        return this.u;
    }

    public final com.airbnb.lottie.f.i p() {
        return this.v;
    }

    public final String q() {
        return this.f2247c;
    }

    public final String r() {
        return this.f2250f;
    }

    public final String s(String str) {
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.f2247c);
        sb.append("\n");
        com.airbnb.lottie.h hVar = this.f2246b;
        e eVarK = hVar.k(this.f2249e);
        if (eVarK != null) {
            sb.append("\t\tParents: ");
            sb.append(eVarK.f2247c);
            for (e eVarK2 = hVar.k(eVarK.f2249e); eVarK2 != null; eVarK2 = hVar.k(eVarK2.f2249e)) {
                sb.append("->");
                sb.append(eVarK2.f2247c);
            }
            sb.append(str);
            sb.append("\n");
        }
        List list = this.f2251g;
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(list.size());
            sb.append("\n");
        }
        int i3 = this.f2253i;
        if (i3 != 0 && (i2 = this.f2254j) != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(this.f2255k)));
        }
        List list2 = this.f2245a;
        if (!list2.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : list2) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    final List t() {
        return this.s;
    }

    public final String toString() {
        return s("");
    }

    final List u() {
        return this.f2251g;
    }

    final List v() {
        return this.f2245a;
    }

    public final boolean w() {
        return this.t;
    }

    public final int x() {
        return this.y;
    }

    public final int y() {
        return this.w;
    }

    final int z() {
        return this.x;
    }
}
