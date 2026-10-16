package com.bumptech.glide.a;

import j$.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f2704a;

    a(f fVar) {
        Objects.requireNonNull(fVar);
        this.f2704a = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        f fVar = this.f2704a;
        synchronized (fVar) {
            if (fVar.f2729k == null) {
                return null;
            }
            fVar.v();
            if (fVar.w()) {
                fVar.t();
                fVar.m = 0;
            }
            return null;
        }
    }
}
