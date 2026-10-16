package com.bumptech.glide.load.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aj implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final List f3007a;

    aj(List list) {
        this.f3007a = list;
    }

    final int a() {
        return this.f3007a.size();
    }

    final aj b() {
        return new aj(new ArrayList(this.f3007a));
    }

    final void c(com.bumptech.glide.e.j jVar, Executor executor) {
        this.f3007a.add(new ai(jVar, executor));
    }

    final void d() {
        this.f3007a.clear();
    }

    final void e(com.bumptech.glide.e.j jVar) {
        this.f3007a.remove(new ai(jVar, com.bumptech.glide.g.h.a()));
    }

    final boolean f(com.bumptech.glide.e.j jVar) {
        return this.f3007a.contains(new ai(jVar, com.bumptech.glide.g.h.a()));
    }

    final boolean g() {
        return this.f3007a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<ai> iterator() {
        return this.f3007a.iterator();
    }
}
