package com.google.firebase.crashlytics.a.c;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ak extends b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f9128a;

    ak(al alVar, Runnable runnable) {
        this.f9128a = runnable;
        Objects.requireNonNull(alVar);
    }

    @Override // com.google.firebase.crashlytics.a.c.b
    public final void a() {
        this.f9128a.run();
    }
}
