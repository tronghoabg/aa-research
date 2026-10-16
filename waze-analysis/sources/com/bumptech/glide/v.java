package com.bumptech.glide;

import androidx.core.util.Pools;
import com.bumptech.glide.load.a.at;
import com.bumptech.glide.load.a.aw;
import com.bumptech.glide.load.b.ae;
import com.bumptech.glide.load.b.ah;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final ah f3560a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.d.d f3561b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.d.f f3562c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.data.j f3563d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.c.e.e f3564e;

    /* renamed from: g, reason: collision with root package name */
    private final Pools.Pool f3566g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.d.f f3567h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.e.c f3568i;

    /* renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.d.d f3569j = new com.bumptech.glide.d.d(null);

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.d.b f3565f = new com.bumptech.glide.d.b();

    public v() {
        Pools.Pool poolB = com.bumptech.glide.g.a.h.b();
        this.f3566g = poolB;
        this.f3560a = new ah(poolB);
        this.f3567h = new com.bumptech.glide.d.f(null);
        this.f3561b = new com.bumptech.glide.d.d();
        this.f3562c = new com.bumptech.glide.d.f();
        this.f3563d = new com.bumptech.glide.load.data.j();
        this.f3564e = new com.bumptech.glide.load.c.e.e();
        this.f3568i = new com.airbnb.lottie.e.c();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f3561b.d(arrayList);
    }

    public final com.bumptech.glide.load.b a(Object obj) {
        com.bumptech.glide.load.b bVarC = this.f3567h.c(obj.getClass());
        if (bVarC != null) {
            return bVarC;
        }
        throw new u(obj.getClass());
    }

    public final com.bumptech.glide.load.v b(aw awVar) {
        com.bumptech.glide.load.v vVarA = this.f3562c.a(awVar.b());
        if (vVarA != null) {
            return vVarA;
        }
        throw new t(awVar.b());
    }

    public final com.bumptech.glide.load.data.g c(Object obj) {
        return this.f3563d.a(obj);
    }

    public final at d(Class cls, Class cls2, Class cls3) {
        Class cls4;
        Class cls5;
        Class cls6;
        Class cls7 = cls;
        com.bumptech.glide.d.b bVar = this.f3565f;
        at atVarA = bVar.a(cls7, cls2, cls3);
        at atVar = null;
        if (com.bumptech.glide.d.b.c(atVarA)) {
            return null;
        }
        if (atVarA != null) {
            return atVarA;
        }
        ArrayList arrayList = new ArrayList();
        com.bumptech.glide.d.d dVar = this.f3561b;
        for (Class cls8 : dVar.b(cls7, cls2)) {
            com.bumptech.glide.load.c.e.e eVar = this.f3564e;
            for (Class cls9 : eVar.b(cls8, cls3)) {
                arrayList.add(new com.bumptech.glide.load.a.s(cls, cls8, cls9, dVar.a(cls7, cls8), eVar.a(cls8, cls9), this.f3566g));
                cls7 = cls;
            }
            cls7 = cls;
        }
        if (arrayList.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            atVar = new at(cls4, cls5, cls6, arrayList, this.f3566g);
        }
        bVar.b(cls4, cls5, cls6, atVar);
        return atVar;
    }

    public final List e() {
        List listD = this.f3568i.d();
        if (listD.isEmpty()) {
            throw new r();
        }
        return listD;
    }

    public final List f(Object obj) {
        return this.f3560a.b(obj);
    }

    public final List g(Class cls, Class cls2, Class cls3) {
        com.bumptech.glide.d.d dVar = this.f3569j;
        List listE = dVar.e(cls, cls2, cls3);
        if (listE == null) {
            listE = new ArrayList();
            Iterator it = this.f3560a.a(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f3561b.b((Class) it.next(), cls2)) {
                    if (!this.f3564e.b(cls4, cls3).isEmpty() && !listE.contains(cls4)) {
                        listE.add(cls4);
                    }
                }
            }
            dVar.f(cls, cls2, cls3, DesugarCollections.unmodifiableList(listE));
        }
        return listE;
    }

    public final boolean h(aw awVar) {
        return this.f3562c.a(awVar.b()) != null;
    }

    public final void i(Class cls, com.bumptech.glide.load.b bVar) {
        this.f3567h.d(cls, bVar);
    }

    public final void j(Class cls, com.bumptech.glide.load.v vVar) {
        this.f3562c.b(cls, vVar);
    }

    public final void k(Class cls, Class cls2, com.bumptech.glide.load.u uVar) {
        m("legacy_append", cls, cls2, uVar);
    }

    public final void l(Class cls, Class cls2, ae aeVar) {
        this.f3560a.c(cls, cls2, aeVar);
    }

    public final void m(String str, Class cls, Class cls2, com.bumptech.glide.load.u uVar) {
        this.f3561b.c(str, uVar, cls, cls2);
    }

    public final void n(com.bumptech.glide.load.d dVar) {
        this.f3568i.e(dVar);
    }

    public final void o(com.bumptech.glide.load.data.f fVar) {
        this.f3563d.b(fVar);
    }

    public final void p(Class cls, Class cls2, com.bumptech.glide.load.c.e.c cVar) {
        this.f3564e.c(cls, cls2, cVar);
    }
}
