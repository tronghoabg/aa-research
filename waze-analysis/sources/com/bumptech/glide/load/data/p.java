package com.bumptech.glide.load.data;

import com.bumptech.glide.load.c.a.an;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p implements g {

    /* renamed from: a, reason: collision with root package name */
    private final an f3486a;

    public p(InputStream inputStream, com.bumptech.glide.load.a.a.j jVar) {
        an anVar = new an(inputStream, jVar);
        this.f3486a = anVar;
        anVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.g
    public final void b() {
        this.f3486a.b();
    }

    @Override // com.bumptech.glide.load.data.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InputStream a() {
        an anVar = this.f3486a;
        anVar.reset();
        return anVar;
    }

    public final void d() {
        this.f3486a.a();
    }
}
