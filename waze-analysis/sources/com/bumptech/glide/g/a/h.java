package com.bumptech.glide.g.a;

import androidx.core.util.Pools;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final g f2888a = new a();

    public static Pools.Pool a(int i2, d dVar) {
        return new e(new Pools.SynchronizedPool(i2), dVar, f2888a);
    }

    public static Pools.Pool b() {
        return new e(new Pools.SynchronizedPool(20), new b(), new c());
    }
}
