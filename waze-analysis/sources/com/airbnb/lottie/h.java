package com.airbnb.lottie;

import android.content.res.Resources;
import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f2421a;

    /* renamed from: b, reason: collision with root package name */
    private Map f2422b;

    /* renamed from: c, reason: collision with root package name */
    private Map f2423c;

    /* renamed from: d, reason: collision with root package name */
    private float f2424d;

    /* renamed from: e, reason: collision with root package name */
    private Map f2425e;

    /* renamed from: f, reason: collision with root package name */
    private List f2426f;

    /* renamed from: g, reason: collision with root package name */
    private SparseArrayCompat f2427g;

    /* renamed from: h, reason: collision with root package name */
    private LongSparseArray f2428h;

    /* renamed from: i, reason: collision with root package name */
    private List f2429i;

    /* renamed from: j, reason: collision with root package name */
    private Rect f2430j;

    /* renamed from: k, reason: collision with root package name */
    private float f2431k;

    /* renamed from: l, reason: collision with root package name */
    private float f2432l;
    private float m;
    private int n;

    public h() {
        new ae();
        this.f2421a = new HashSet();
        this.n = 0;
    }

    public final float a() {
        return (long) ((b() / this.m) * 1000.0f);
    }

    public final float b() {
        return this.f2432l - this.f2431k;
    }

    public final float c() {
        return this.f2432l;
    }

    public final float d(float f2) {
        float f3 = this.f2431k;
        float f4 = this.f2432l;
        int i2 = com.airbnb.lottie.g.f.f2413a;
        return f3 + (f2 * (f4 - f3));
    }

    public final float e() {
        return this.m;
    }

    public final float f() {
        return this.f2431k;
    }

    public final int g() {
        return this.n;
    }

    public final Rect h() {
        return this.f2430j;
    }

    public final SparseArrayCompat i() {
        return this.f2427g;
    }

    public final com.airbnb.lottie.d.h j(String str) {
        int size = this.f2426f.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.airbnb.lottie.d.h hVar = (com.airbnb.lottie.d.h) this.f2426f.get(i2);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public final com.airbnb.lottie.d.c.e k(long j2) {
        return (com.airbnb.lottie.d.c.e) this.f2428h.get(j2);
    }

    public final List l() {
        return this.f2429i;
    }

    public final List m(String str) {
        return (List) this.f2422b.get(str);
    }

    public final Map n() {
        return this.f2425e;
    }

    public final Map o() {
        int i2 = com.airbnb.lottie.g.k.f2415a;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        if (f2 != this.f2424d) {
            for (Map.Entry entry : this.f2423c.entrySet()) {
                this.f2423c.put((String) entry.getKey(), ((t) entry.getValue()).d(this.f2424d / f2));
            }
        }
        this.f2424d = f2;
        return this.f2423c;
    }

    public final void p(String str) {
        com.airbnb.lottie.g.c.a(str);
        this.f2421a.add(str);
    }

    public final void q(int i2) {
        this.n += i2;
    }

    public final void r(Rect rect, float f2, float f3, float f4, List list, LongSparseArray longSparseArray, Map map, Map map2, float f5, SparseArrayCompat sparseArrayCompat, Map map3, List list2) {
        this.f2430j = rect;
        this.f2431k = f2;
        this.f2432l = f3;
        this.m = f4;
        this.f2429i = list;
        this.f2428h = longSparseArray;
        this.f2422b = map;
        this.f2423c = map2;
        this.f2424d = f5;
        this.f2427g = sparseArrayCompat;
        this.f2425e = map3;
        this.f2426f = list2;
    }

    public final boolean s() {
        return !this.f2423c.isEmpty();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f2429i.iterator();
        while (it.hasNext()) {
            sb.append(((com.airbnb.lottie.d.c.e) it.next()).s("\t"));
        }
        return sb.toString();
    }
}
