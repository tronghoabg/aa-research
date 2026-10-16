package com.bumptech.glide.load.c.e;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.a.aw;
import com.bumptech.glide.load.c.a.ak;
import com.bumptech.glide.load.s;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.c f3445a;

    /* renamed from: b, reason: collision with root package name */
    private final c f3446b;

    /* renamed from: c, reason: collision with root package name */
    private final c f3447c;

    public b(com.bumptech.glide.load.a.a.c cVar, c cVar2, c cVar3) {
        this.f3445a = cVar;
        this.f3446b = cVar2;
        this.f3447c = cVar3;
    }

    @Override // com.bumptech.glide.load.c.e.c
    public final aw a(aw awVar, s sVar) {
        Drawable drawable = (Drawable) awVar.c();
        if (drawable instanceof BitmapDrawable) {
            return this.f3446b.a(ak.g(((BitmapDrawable) drawable).getBitmap(), this.f3445a), sVar);
        }
        if (drawable instanceof com.bumptech.glide.load.c.d.e) {
            return this.f3447c.a(awVar, sVar);
        }
        return null;
    }
}
