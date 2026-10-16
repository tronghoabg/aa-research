package com.bumptech.glide.load.a;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ai {

    /* renamed from: a, reason: collision with root package name */
    final com.bumptech.glide.e.j f3005a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f3006b;

    ai(com.bumptech.glide.e.j jVar, Executor executor) {
        this.f3005a = jVar;
        this.f3006b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ai) {
            return this.f3005a.equals(((ai) obj).f3005a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3005a.hashCode();
    }
}
