package com.bumptech.glide.d;

import com.bumptech.glide.load.v;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    final v f2810a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f2811b;

    e(Class cls, v vVar) {
        this.f2811b = cls;
        this.f2810a = vVar;
    }

    final boolean a(Class cls) {
        return this.f2811b.isAssignableFrom(cls);
    }
}
