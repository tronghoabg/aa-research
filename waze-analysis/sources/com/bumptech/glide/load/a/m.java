package com.bumptech.glide.load.a;

import com.google.android.gms.common.api.internal.be;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private final List f3140a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f3141b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.m f3142c;

    /* renamed from: d, reason: collision with root package name */
    private Object f3143d;

    /* renamed from: e, reason: collision with root package name */
    private int f3144e;

    /* renamed from: f, reason: collision with root package name */
    private int f3145f;

    /* renamed from: g, reason: collision with root package name */
    private Class f3146g;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.load.s f3147h;

    /* renamed from: i, reason: collision with root package name */
    private Map f3148i;

    /* renamed from: j, reason: collision with root package name */
    private Class f3149j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3150k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f3151l;
    private com.bumptech.glide.load.o m;
    private com.bumptech.glide.p n;
    private y o;
    private boolean p;
    private boolean q;
    private ad r;

    m() {
    }

    final int a() {
        return this.f3145f;
    }

    final int b() {
        return this.f3144e;
    }

    final com.bumptech.glide.p c() {
        return this.n;
    }

    final com.bumptech.glide.load.b d(Object obj) {
        return this.f3142c.c().a(obj);
    }

    final com.bumptech.glide.load.o e() {
        return this.m;
    }

    final com.bumptech.glide.load.s f() {
        return this.f3147h;
    }

    final com.bumptech.glide.load.v g(aw awVar) {
        return this.f3142c.c().b(awVar);
    }

    final com.bumptech.glide.load.w h(Class cls) {
        com.bumptech.glide.load.w wVar = (com.bumptech.glide.load.w) this.f3148i.get(cls);
        if (wVar == null) {
            Iterator it = this.f3148i.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    wVar = (com.bumptech.glide.load.w) entry.getValue();
                    break;
                }
            }
        }
        if (wVar != null) {
            return wVar;
        }
        if (!this.f3148i.isEmpty() || !this.p) {
            return com.bumptech.glide.load.c.d.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + String.valueOf(cls) + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    final com.bumptech.glide.load.data.g i(Object obj) {
        return this.f3142c.c().c(obj);
    }

    final y j() {
        return this.o;
    }

    final at k(Class cls) {
        return this.f3142c.c().d(cls, this.f3146g, this.f3149j);
    }

    final com.bumptech.glide.load.a.b.b l() {
        return this.r.a();
    }

    final Class m() {
        return this.f3143d.getClass();
    }

    final Class n() {
        return this.f3149j;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    final List o() {
        if (!this.f3151l) {
            this.f3151l = true;
            List list = this.f3141b;
            list.clear();
            List listP = p();
            int size = listP.size();
            for (int i2 = 0; i2 < size; i2++) {
                be beVar = (be) listP.get(i2);
                Object obj = beVar.f4792c;
                if (!list.contains(obj)) {
                    list.add(obj);
                }
                int i3 = 0;
                while (true) {
                    ?? r7 = beVar.f4790a;
                    if (i3 < r7.size()) {
                        if (!list.contains(r7.get(i3))) {
                            list.add((com.bumptech.glide.load.o) r7.get(i3));
                        }
                        i3++;
                    }
                }
            }
        }
        return this.f3141b;
    }

    final List p() {
        if (!this.f3150k) {
            this.f3150k = true;
            List list = this.f3140a;
            list.clear();
            List listF = this.f3142c.c().f(this.f3143d);
            int size = listF.size();
            for (int i2 = 0; i2 < size; i2++) {
                be beVarB = ((com.bumptech.glide.load.b.ad) listF.get(i2)).b(this.f3143d, this.f3144e, this.f3145f, this.f3147h);
                if (beVarB != null) {
                    list.add(beVarB);
                }
            }
        }
        return this.f3140a;
    }

    final List q(File file) {
        return this.f3142c.c().f(file);
    }

    final List r() {
        return this.f3142c.c().g(this.f3143d.getClass(), this.f3146g, this.f3149j);
    }

    final void s() {
        this.f3142c = null;
        this.f3143d = null;
        this.m = null;
        this.f3146g = null;
        this.f3149j = null;
        this.f3147h = null;
        this.n = null;
        this.f3148i = null;
        this.o = null;
        this.f3140a.clear();
        this.f3150k = false;
        this.f3141b.clear();
        this.f3151l = false;
    }

    final boolean t(Class cls) {
        return k(cls) != null;
    }

    final boolean u(aw awVar) {
        return this.f3142c.c().h(awVar);
    }

    final boolean v() {
        return this.q;
    }

    final com.bumptech.glide.load.a.a.j w() {
        return this.f3142c.h();
    }

    final void x(com.bumptech.glide.m mVar, Object obj, com.bumptech.glide.load.o oVar, int i2, int i3, y yVar, Class cls, Class cls2, com.bumptech.glide.p pVar, com.bumptech.glide.load.s sVar, Map map, boolean z, boolean z2, ad adVar) {
        this.f3142c = mVar;
        this.f3143d = obj;
        this.m = oVar;
        this.f3144e = i2;
        this.f3145f = i3;
        this.o = yVar;
        this.f3146g = cls;
        this.r = adVar;
        this.f3149j = cls2;
        this.n = pVar;
        this.f3147h = sVar;
        this.f3148i = map;
        this.p = z;
        this.q = z2;
    }
}
