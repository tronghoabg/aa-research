package com.vungle.ads.internal.task;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f33700a;

    public r(WeakReference runner) {
        AbstractC3340k.e(runner, "runner");
        this.f33700a = runner;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = (s) this.f33700a.get();
        if (sVar != null) {
            sVar.a();
        }
    }
}
