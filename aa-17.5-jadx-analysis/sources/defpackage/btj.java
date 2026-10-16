package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;

/* loaded from: classes2.dex */
public final class btj extends View {
    public bty b;
    public Boolean c;
    public Runnable d;
    public afdr e;
    private Long g;
    private static final int[] f = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] a = new int[0];

    public final void a() {
        this.e = null;
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.d;
            runnable2.getClass();
            runnable2.run();
        } else {
            bty btyVar = this.b;
            if (btyVar != null) {
                btyVar.setState(a);
            }
        }
        bty btyVar2 = this.b;
        if (btyVar2 == null) {
            return;
        }
        btyVar2.setVisible(false, false);
        unscheduleDrawable(btyVar2);
    }

    public final void b(long j, int i, long j2, float f2) {
        bty btyVar = this.b;
        if (btyVar == null) {
            return;
        }
        if (btyVar.getRadius() != i) {
            btyVar.setRadius(i);
        }
        long jH = cjv.h(j2, afpt.c(f2, 1.0f));
        cjv cjvVar = btyVar.a;
        if (cjvVar == null || !a.j(cjvVar.a, jH)) {
            btyVar.a = new cjv(jH);
            btyVar.setColor(ColorStateList.valueOf(cjn.h(jH)));
        }
        Rect rect = new Rect(0, 0, afgi.k(Float.intBitsToFloat((int) (j >> 32))), afgi.k(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        btyVar.setBounds(rect);
    }

    public final void c(boolean z) {
        int[] iArr;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.g;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z) {
            iArr = f;
        } else {
            if (jLongValue < 5) {
                lh lhVar = new lh(this, 9, null);
                this.d = lhVar;
                postDelayed(lhVar, 50L);
                this.g = Long.valueOf(jCurrentAnimationTimeMillis);
            }
            iArr = a;
        }
        bty btyVar = this.b;
        if (btyVar != null) {
            btyVar.setState(iArr);
        }
        this.g = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            a();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        afdr afdrVar = this.e;
        if (afdrVar != null) {
            afdrVar.invoke();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
