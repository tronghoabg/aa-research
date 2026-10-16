package com.bumptech.glide.manager;

import androidx.lifecycle.Lifecycle;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Lifecycle f3530a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f3531b;

    h(j jVar, Lifecycle lifecycle) {
        this.f3530a = lifecycle;
        Objects.requireNonNull(jVar);
        this.f3531b = jVar;
    }

    @Override // com.bumptech.glide.manager.g
    public final void g() {
        this.f3531b.f3532a.remove(this.f3530a);
    }

    @Override // com.bumptech.glide.manager.g
    public final void h() {
    }

    @Override // com.bumptech.glide.manager.g
    public final void i() {
    }
}
