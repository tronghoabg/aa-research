package com.vungle.ads.internal.executor;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class e extends com.vungle.ads.internal.task.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f32988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f32989b;

    public e(Runnable runnable, Runnable runnable2) {
        this.f32988a = runnable;
        this.f32989b = runnable2;
    }

    @Override // com.vungle.ads.internal.task.j
    public final int a() {
        return ((com.vungle.ads.internal.task.j) this.f32988a).a();
    }

    @Override // com.vungle.ads.internal.task.j, java.lang.Comparable
    public final int compareTo(Object other) {
        AbstractC3340k.e(other, "other");
        if (!(other instanceof com.vungle.ads.internal.task.j)) {
            return 0;
        }
        return AbstractC3340k.g(((com.vungle.ads.internal.task.j) other).a(), a());
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i5 = j.f32993b;
        Runnable runnable = this.f32988a;
        Runnable runnable2 = this.f32989b;
        try {
            runnable.run();
        } catch (OutOfMemoryError unused) {
            runnable2.run();
        }
    }
}
