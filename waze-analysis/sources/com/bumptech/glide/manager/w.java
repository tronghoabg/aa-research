package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class w implements g {

    /* renamed from: a, reason: collision with root package name */
    private final Set f3553a = Collections.newSetFromMap(new WeakHashMap());

    public final List a() {
        return com.bumptech.glide.g.r.g(this.f3553a);
    }

    public final void b() {
        this.f3553a.clear();
    }

    public final void c(com.bumptech.glide.e.a.g gVar) {
        this.f3553a.add(gVar);
    }

    public final void d(com.bumptech.glide.e.a.g gVar) {
        this.f3553a.remove(gVar);
    }

    @Override // com.bumptech.glide.manager.g
    public final void g() {
        Iterator it = com.bumptech.glide.g.r.g(this.f3553a).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.e.a.g) it.next()).g();
        }
    }

    @Override // com.bumptech.glide.manager.g
    public final void h() {
        Iterator it = com.bumptech.glide.g.r.g(this.f3553a).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.e.a.g) it.next()).h();
        }
    }

    @Override // com.bumptech.glide.manager.g
    public final void i() {
        Iterator it = com.bumptech.glide.g.r.g(this.f3553a).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.e.a.g) it.next()).i();
        }
    }
}
