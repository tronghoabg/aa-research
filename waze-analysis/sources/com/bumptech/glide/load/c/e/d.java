package com.bumptech.glide.load.c.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    final Class f3448a;

    /* renamed from: b, reason: collision with root package name */
    final Class f3449b;

    /* renamed from: c, reason: collision with root package name */
    final c f3450c;

    d(Class cls, Class cls2, c cVar) {
        this.f3448a = cls;
        this.f3449b = cls2;
        this.f3450c = cVar;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.f3448a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f3449b);
    }
}
