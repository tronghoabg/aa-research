package com.waze.jni;

import com.waze.native_managers.h;
import com.waze.native_managers.i;
import h.g.b.x;
import java.util.concurrent.Executor;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f24958a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f24959b;

    public c(i iVar, int i2) {
        this.f24958a = i2;
        x.f(iVar, "taskScheduler");
        this.f24959b = iVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.af] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.waze.native_managers.i, java.lang.Object] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.f24958a != 0) {
            if (runnable == null) {
                return;
            }
            this.f24959b.post(h.f30691a, runnable);
        } else {
            if (runnable == null) {
                return;
            }
            aj.z(this.f24959b, null, null, new b(runnable, null), 3);
        }
    }

    public c(af afVar, int i2) {
        this.f24958a = i2;
        x.f(afVar, "scope");
        this.f24959b = afVar;
    }
}
