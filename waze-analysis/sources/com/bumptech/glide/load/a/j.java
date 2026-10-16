package com.bumptech.glide.load.a;

import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j implements com.bumptech.glide.load.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.b f3137a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3138b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.s f3139c;

    j(com.bumptech.glide.load.b bVar, Object obj, com.bumptech.glide.load.s sVar) {
        this.f3137a = bVar;
        this.f3138b = obj;
        this.f3139c = sVar;
    }

    @Override // com.bumptech.glide.load.a.b.a
    public final boolean a(File file) {
        return this.f3137a.a(this.f3138b, file, this.f3139c);
    }
}
