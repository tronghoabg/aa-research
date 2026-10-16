package com.bumptech.glide.load.c.a;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ap implements v {

    /* renamed from: a, reason: collision with root package name */
    private final an f3320a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.g.f f3321b;

    ap(an anVar, com.bumptech.glide.g.f fVar) {
        this.f3320a = anVar;
        this.f3321b = fVar;
    }

    @Override // com.bumptech.glide.load.c.a.v
    public final void a(com.bumptech.glide.load.a.a.c cVar, Bitmap bitmap) throws IOException {
        IOException iOExceptionB = this.f3321b.b();
        if (iOExceptionB != null) {
            if (bitmap == null) {
                throw iOExceptionB;
            }
            cVar.d(bitmap);
            throw iOExceptionB;
        }
    }

    @Override // com.bumptech.glide.load.c.a.v
    public final void b() {
        this.f3320a.a();
    }
}
