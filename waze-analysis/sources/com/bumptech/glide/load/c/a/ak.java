package com.bumptech.glide.load.c.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ak implements com.bumptech.glide.load.a.aw, com.bumptech.glide.load.a.ar {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f3308a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3309b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f3310c;

    public ak(Bitmap bitmap, com.bumptech.glide.load.a.a.c cVar, int i2) {
        this.f3308a = i2;
        com.bumptech.glide.g.p.e(bitmap, "Bitmap must not be null");
        this.f3309b = bitmap;
        com.bumptech.glide.g.p.e(cVar, "BitmapPool must not be null");
        this.f3310c = cVar;
    }

    public static com.bumptech.glide.load.a.aw f(Resources resources, com.bumptech.glide.load.a.aw awVar) {
        if (awVar == null) {
            return null;
        }
        return new ak(resources, awVar, 0);
    }

    public static ak g(Bitmap bitmap, com.bumptech.glide.load.a.a.c cVar) {
        if (bitmap == null) {
            return null;
        }
        return new ak(bitmap, cVar, 1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bumptech.glide.load.a.aw, java.lang.Object] */
    @Override // com.bumptech.glide.load.a.aw
    public final int a() {
        return this.f3308a != 0 ? com.bumptech.glide.g.r.a((Bitmap) this.f3309b) : this.f3310c.a();
    }

    @Override // com.bumptech.glide.load.a.aw
    public final Class b() {
        return this.f3308a != 0 ? Bitmap.class : BitmapDrawable.class;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bumptech.glide.load.a.aw, java.lang.Object] */
    @Override // com.bumptech.glide.load.a.aw
    public final /* synthetic */ Object c() {
        if (this.f3308a != 0) {
            return this.f3309b;
        }
        return new BitmapDrawable((Resources) this.f3309b, (Bitmap) this.f3310c.c());
    }

    @Override // com.bumptech.glide.load.a.ar
    public final void d() {
        if (this.f3308a != 0) {
            ((Bitmap) this.f3309b).prepareToDraw();
            return;
        }
        Object obj = this.f3310c;
        if (obj instanceof com.bumptech.glide.load.a.ar) {
            ((com.bumptech.glide.load.a.ar) obj).d();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bumptech.glide.load.a.a.c, com.bumptech.glide.load.a.aw, java.lang.Object] */
    @Override // com.bumptech.glide.load.a.aw
    public final void e() {
        int i2 = this.f3308a;
        ?? r1 = this.f3310c;
        if (i2 != 0) {
            r1.d((Bitmap) this.f3309b);
        } else {
            r1.e();
        }
    }

    private ak(Resources resources, com.bumptech.glide.load.a.aw awVar, int i2) {
        this.f3308a = i2;
        com.bumptech.glide.g.p.f(resources);
        this.f3309b = resources;
        com.bumptech.glide.g.p.f(awVar);
        this.f3310c = awVar;
    }
}
