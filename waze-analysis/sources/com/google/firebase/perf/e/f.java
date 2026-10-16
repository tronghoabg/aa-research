package com.google.firebase.perf.e;

import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f10396a;

    private f(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value for optional is empty.");
        }
        this.f10396a = obj;
    }

    public static f a() {
        return new f();
    }

    public static f b(Object obj) {
        return obj == null ? new f() : new f(obj);
    }

    public static f c(Object obj) {
        return new f(obj);
    }

    public final Object d() {
        Object obj = this.f10396a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean e() {
        return this.f10396a != null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.b.b.a.n, java.lang.Object] */
    public final com.b.b.a.b f(com.b.a.a.a.e eVar) {
        com.google.v.b.c.a(eVar);
        return this.f10396a.b("com.spotify.get_recommended_root_items", new com.b.b.d.d(eVar.f2530g), com.b.b.d.m.class);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.b.b.a.n, java.lang.Object] */
    public final com.b.b.a.b g(com.b.b.d.l lVar) {
        if (lVar.f2662e) {
            return this.f10396a.b("com.spotify.play_item", new com.b.b.d.f(lVar.f2658a), com.b.b.d.c.class);
        }
        throw new IllegalArgumentException("The ContentItem is not playable.");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.b.b.a.n, java.lang.Object] */
    public final com.b.b.a.b h(com.b.b.d.l lVar) {
        com.google.v.b.c.a(lVar);
        return this.f10396a.b("com.spotify.get_children_of_item", new com.b.b.d.b(lVar.f2658a, 11), com.b.b.d.m.class);
    }

    public f(com.b.b.a.n nVar) {
        this.f10396a = nVar;
    }

    private f() {
        this.f10396a = null;
    }
}
