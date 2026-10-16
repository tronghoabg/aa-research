package com.bumptech.glide.load.b;

import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ai implements com.bumptech.glide.load.data.e, com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    private final List f3211a;

    /* renamed from: b, reason: collision with root package name */
    private final Pools.Pool f3212b;

    /* renamed from: c, reason: collision with root package name */
    private int f3213c;

    /* renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.p f3214d;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.load.data.d f3215e;

    /* renamed from: f, reason: collision with root package name */
    private List f3216f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3217g;

    ai(List list, Pools.Pool pool) {
        this.f3212b = pool;
        com.bumptech.glide.g.p.d(list);
        this.f3211a = list;
        this.f3213c = 0;
    }

    private final void h() {
        if (this.f3217g) {
            return;
        }
        if (this.f3213c < this.f3211a.size() - 1) {
            this.f3213c++;
            f(this.f3214d, this.f3215e);
        } else {
            com.bumptech.glide.g.p.f(this.f3216f);
            this.f3215e.e(new com.bumptech.glide.load.a.aq("Fetch failed", new ArrayList(this.f3216f)));
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return ((com.bumptech.glide.load.data.e) this.f3211a.get(0)).a();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b(Object obj) {
        if (obj != null) {
            this.f3215e.b(obj);
        } else {
            h();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void bk() {
        this.f3217g = true;
        Iterator it = this.f3211a.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).bk();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d() {
        List list = this.f3216f;
        if (list != null) {
            this.f3212b.release(list);
        }
        this.f3216f = null;
        Iterator it = this.f3211a.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).d();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(Exception exc) {
        List list = this.f3216f;
        com.bumptech.glide.g.p.f(list);
        list.add(exc);
        h();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.p pVar, com.bumptech.glide.load.data.d dVar) {
        this.f3214d = pVar;
        this.f3215e = dVar;
        this.f3216f = (List) this.f3212b.acquire();
        ((com.bumptech.glide.load.data.e) this.f3211a.get(this.f3213c)).f(pVar, this);
        if (this.f3217g) {
            bk();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int g() {
        return ((com.bumptech.glide.load.data.e) this.f3211a.get(0)).g();
    }
}
