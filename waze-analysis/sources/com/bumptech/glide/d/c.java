package com.bumptech.glide.d;

import com.bumptech.glide.load.u;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    final Class f2805a;

    /* renamed from: b, reason: collision with root package name */
    final u f2806b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f2807c;

    public c(Class cls, Class cls2, u uVar) {
        this.f2807c = cls;
        this.f2805a = cls2;
        this.f2806b = uVar;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.f2807c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f2805a);
    }
}
