package com.airbnb.lottie.d;

import androidx.collection.LruCache;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final g f2281a = new g();

    /* renamed from: b, reason: collision with root package name */
    private final LruCache f2282b = new LruCache(20);

    g() {
    }

    public static g b() {
        return f2281a;
    }

    public final com.airbnb.lottie.h a(String str) {
        return (com.airbnb.lottie.h) this.f2282b.get(str);
    }

    public final void c(String str, com.airbnb.lottie.h hVar) {
        this.f2282b.put(str, hVar);
    }
}
