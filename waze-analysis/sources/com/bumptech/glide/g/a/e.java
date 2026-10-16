package com.bumptech.glide.g.a;

import android.util.Log;
import androidx.core.util.Pools;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e<T> implements Pools.Pool<T> {

    /* renamed from: a, reason: collision with root package name */
    private final d f2885a;

    /* renamed from: b, reason: collision with root package name */
    private final g f2886b;

    /* renamed from: c, reason: collision with root package name */
    private final Pools.Pool f2887c;

    e(Pools.Pool pool, d dVar, g gVar) {
        this.f2887c = pool;
        this.f2885a = dVar;
        this.f2886b = gVar;
    }

    @Override // androidx.core.util.Pools.Pool
    public final T acquire() {
        f fVar = (T) this.f2887c.acquire();
        if (fVar == null) {
            fVar = (T) this.f2885a.a();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new ".concat(String.valueOf(String.valueOf(fVar.getClass()))));
            }
        }
        if (fVar instanceof f) {
            fVar.bl().b(false);
        }
        return (T) fVar;
    }

    @Override // androidx.core.util.Pools.Pool
    public final boolean release(T t) {
        if (t instanceof f) {
            ((f) t).bl().b(true);
        }
        this.f2886b.a(t);
        return this.f2887c.release(t);
    }
}
