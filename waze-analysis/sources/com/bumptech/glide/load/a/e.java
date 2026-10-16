package com.bumptech.glide.load.a;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    final com.bumptech.glide.load.o f3119a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f3120b;

    /* renamed from: c, reason: collision with root package name */
    aw f3121c;

    e(com.bumptech.glide.load.o oVar, ao aoVar, ReferenceQueue referenceQueue) {
        super(aoVar, referenceQueue);
        com.bumptech.glide.g.p.f(oVar);
        this.f3119a = oVar;
        this.f3121c = null;
        this.f3120b = aoVar.g();
    }

    final void a() {
        this.f3121c = null;
        clear();
    }
}
