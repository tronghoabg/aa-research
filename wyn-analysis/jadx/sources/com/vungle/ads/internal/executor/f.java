package com.vungle.ads.internal.executor;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f32990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f32991b;

    public f(Runnable runnable, Runnable runnable2) {
        this.f32990a = runnable;
        this.f32991b = runnable2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object other) {
        AbstractC3340k.e(other, "other");
        Runnable runnable = this.f32990a;
        if (runnable instanceof com.vungle.ads.internal.task.j) {
            return ((com.vungle.ads.internal.task.j) runnable).compareTo(other);
        }
        return 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i5 = j.f32993b;
        Runnable runnable = this.f32990a;
        Runnable runnable2 = this.f32991b;
        try {
            runnable.run();
        } catch (OutOfMemoryError unused) {
            runnable2.run();
        }
    }
}
