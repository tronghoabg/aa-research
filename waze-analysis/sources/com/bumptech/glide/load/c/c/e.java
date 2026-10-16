package com.bumptech.glide.load.c.c;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.g.p;
import com.bumptech.glide.load.a.ar;
import com.bumptech.glide.load.a.aw;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class e implements aw, ar {

    /* renamed from: a, reason: collision with root package name */
    protected final Drawable f3394a;

    public e(Drawable drawable) {
        p.f(drawable);
        this.f3394a = drawable;
    }

    @Override // com.bumptech.glide.load.a.ar
    public void d() {
        Drawable drawable = this.f3394a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof com.bumptech.glide.load.c.d.e) {
            ((com.bumptech.glide.load.c.d.e) drawable).b().prepareToDraw();
        }
    }

    @Override // com.bumptech.glide.load.a.aw
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Drawable c() {
        Drawable drawable = this.f3394a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
