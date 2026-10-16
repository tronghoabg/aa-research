package com.bumptech.glide.load.c.d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.g.p;
import com.bumptech.glide.load.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends Drawable implements Animatable, Animatable2Compat {

    /* renamed from: a, reason: collision with root package name */
    private final d f3407a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3408b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3409c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3410d;

    /* renamed from: f, reason: collision with root package name */
    private int f3412f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3414h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f3415i;

    /* renamed from: j, reason: collision with root package name */
    private Rect f3416j;

    /* renamed from: k, reason: collision with root package name */
    private List f3417k;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3411e = true;

    /* renamed from: g, reason: collision with root package name */
    private final int f3413g = -1;

    e(d dVar) {
        p.f(dVar);
        this.f3407a = dVar;
    }

    private final Paint g() {
        Paint paint = this.f3415i;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint(2);
        this.f3415i = paint2;
        return paint2;
    }

    private final Rect h() {
        Rect rect = this.f3416j;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = new Rect();
        this.f3416j = rect2;
        return rect2;
    }

    private final void i() {
        p.b(!this.f3410d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        k kVar = this.f3407a.f3406a;
        if (kVar.b() == 1) {
            invalidateSelf();
        } else {
            if (this.f3408b) {
                return;
            }
            this.f3408b = true;
            kVar.l(this);
            invalidateSelf();
        }
    }

    private final void j() {
        this.f3408b = false;
        this.f3407a.f3406a.m(this);
    }

    public final int a() {
        return this.f3407a.f3406a.d();
    }

    public final Bitmap b() {
        return this.f3407a.f3406a.g();
    }

    public final ByteBuffer c() {
        return this.f3407a.f3406a.h();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void clearAnimationCallbacks() {
        List list = this.f3417k;
        if (list != null) {
            list.clear();
        }
    }

    public final void d() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (this.f3407a.f3406a.a() == r0.b() - 1) {
            this.f3412f++;
        }
        if (this.f3413g == -1 || this.f3412f < 0) {
            return;
        }
        stop();
        List list = this.f3417k;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Animatable2Compat.AnimationCallback) this.f3417k.get(i2)).onAnimationEnd(this);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f3410d) {
            return;
        }
        if (this.f3414h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), h());
            this.f3414h = false;
        }
        canvas.drawBitmap(this.f3407a.f3406a.f(), (Rect) null, h(), g());
    }

    public final void e() {
        this.f3410d = true;
        this.f3407a.f3406a.i();
    }

    public final void f(w wVar, Bitmap bitmap) {
        this.f3407a.f3406a.k(wVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f3407a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f3407a.f3406a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f3407a.f3406a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f3408b;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3414h = true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.f3417k == null) {
            this.f3417k = new ArrayList();
        }
        this.f3417k.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        g().setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        g().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        p.b(!this.f3410d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f3411e = z;
        if (!z) {
            j();
        } else if (this.f3409c) {
            i();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f3409c = true;
        this.f3412f = 0;
        if (this.f3411e) {
            i();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f3409c = false;
        j();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        List list = this.f3417k;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }
}
