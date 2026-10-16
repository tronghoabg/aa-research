package com.bumptech.glide.load.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f3104a;

    c(f fVar) {
        Objects.requireNonNull(fVar);
        this.f3104a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3104a.c();
    }
}
