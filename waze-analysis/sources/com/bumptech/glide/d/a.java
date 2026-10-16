package com.bumptech.glide.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    final com.bumptech.glide.load.b f2800a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f2801b;

    a(Class cls, com.bumptech.glide.load.b bVar) {
        this.f2801b = cls;
        this.f2800a = bVar;
    }

    final boolean a(Class cls) {
        return this.f2801b.isAssignableFrom(cls);
    }
}
