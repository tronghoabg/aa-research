package com.bumptech.glide.load.c.c;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.a.aw;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f extends e {
    static aw g(Drawable drawable) {
        if (drawable != null) {
            return new f(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.a.aw
    public final int a() {
        Drawable drawable = this.f3394a;
        return Math.max(1, drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight() * 4);
    }

    @Override // com.bumptech.glide.load.a.aw
    public final Class b() {
        return this.f3394a.getClass();
    }

    @Override // com.bumptech.glide.load.a.aw
    public final void e() {
    }
}
