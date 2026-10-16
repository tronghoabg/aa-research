package com.bumptech.glide.load.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ af f2990a;

    /* renamed from: b, reason: collision with root package name */
    private final ak f2991b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.e.j f2992c;

    ae(af afVar, com.bumptech.glide.e.j jVar, ak akVar) {
        Objects.requireNonNull(afVar);
        this.f2990a = afVar;
        this.f2992c = jVar;
        this.f2991b = akVar;
    }

    public final void a() {
        synchronized (this.f2990a) {
            this.f2991b.f(this.f2992c);
        }
    }
}
