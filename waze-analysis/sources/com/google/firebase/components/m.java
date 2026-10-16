package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f8952a;

    /* renamed from: b, reason: collision with root package name */
    private final List f8953b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f8954c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private h f8955d = h.f8943a;

    m(Executor executor) {
        this.f8952a = executor;
    }

    public final n a() {
        return new n(this.f8952a, this.f8953b, this.f8954c, this.f8955d);
    }

    public final void b(c cVar) {
        this.f8954c.add(cVar);
    }

    public final void c(ComponentRegistrar componentRegistrar) {
        this.f8953b.add(new l(componentRegistrar, 0));
    }

    public final void d(Collection collection) {
        this.f8953b.addAll(collection);
    }

    public final void e(h hVar) {
        this.f8955d = hVar;
    }
}
