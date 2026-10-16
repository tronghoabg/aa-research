package com.bumptech.glide.load.data;

import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o implements f {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.j f3485a;

    public o(com.bumptech.glide.load.a.a.j jVar) {
        this.f3485a = jVar;
    }

    @Override // com.bumptech.glide.load.data.f
    public final /* bridge */ /* synthetic */ g a(Object obj) {
        return new p((InputStream) obj, this.f3485a);
    }

    @Override // com.bumptech.glide.load.data.f
    public final Class b() {
        return InputStream.class;
    }
}
