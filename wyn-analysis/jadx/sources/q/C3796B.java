package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import i.AbstractC2820a;

/* renamed from: q.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3796B extends C3845x {

    /* renamed from: e, reason: collision with root package name */
    public final C3795A f43612e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f43613f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f43614g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f43615h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f43616i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f43617j;

    public C3796B(C3795A c3795a) {
        super(c3795a);
        this.f43614g = null;
        this.f43615h = null;
        this.f43616i = false;
        this.f43617j = false;
        this.f43612e = c3795a;
    }

    @Override // q.C3845x
    public final void b(AttributeSet attributeSet, int i5) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C3795A c3795a = this.f43612e;
        Context context = c3795a.getContext();
        int[] iArr = AbstractC2820a.f36444g;
        md.J jS = md.J.s(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        k1.S.l(c3795a, c3795a.getContext(), iArr, attributeSet, (TypedArray) jS.f40581b, R.attr.seekBarStyle);
        Drawable drawableO = jS.o(0);
        if (drawableO != null) {
            c3795a.setThumb(drawableO);
        }
        Drawable drawableN = jS.n(1);
        Drawable drawable = this.f43613f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f43613f = drawableN;
        if (drawableN != null) {
            drawableN.setCallback(c3795a);
            drawableN.setLayoutDirection(c3795a.getLayoutDirection());
            if (drawableN.isStateful()) {
                drawableN.setState(c3795a.getDrawableState());
            }
            f();
        }
        c3795a.invalidate();
        TypedArray typedArray = (TypedArray) jS.f40581b;
        if (typedArray.hasValue(3)) {
            this.f43615h = AbstractC3827n0.c(typedArray.getInt(3, -1), this.f43615h);
            this.f43617j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f43614g = jS.m(2);
            this.f43616i = true;
        }
        jS.v();
        f();
    }

    public final void f() {
        Drawable drawable = this.f43613f;
        if (drawable != null) {
            if (this.f43616i || this.f43617j) {
                Drawable drawableMutate = drawable.mutate();
                this.f43613f = drawableMutate;
                if (this.f43616i) {
                    drawableMutate.setTintList(this.f43614g);
                }
                if (this.f43617j) {
                    this.f43613f.setTintMode(this.f43615h);
                }
                if (this.f43613f.isStateful()) {
                    this.f43613f.setState(this.f43612e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f43613f != null) {
            int max = this.f43612e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f43613f.getIntrinsicWidth();
                int intrinsicHeight = this.f43613f.getIntrinsicHeight();
                int i5 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i10 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f43613f.setBounds(-i5, -i10, i5, i10);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f43613f.draw(canvas);
                    canvas.translate(width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
