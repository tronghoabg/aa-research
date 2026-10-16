package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class as extends ao {

    /* renamed from: a, reason: collision with root package name */
    private final SeekBar f1080a;

    /* renamed from: b, reason: collision with root package name */
    private Drawable f1081b;

    /* renamed from: c, reason: collision with root package name */
    private ColorStateList f1082c;

    /* renamed from: d, reason: collision with root package name */
    private PorterDuff.Mode f1083d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1084e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1085f;

    as(SeekBar seekBar) {
        super(seekBar);
        this.f1082c = null;
        this.f1083d = null;
        this.f1084e = false;
        this.f1085f = false;
        this.f1080a = seekBar;
    }

    private final void g() {
        Drawable drawable = this.f1081b;
        if (drawable != null) {
            if (this.f1084e || this.f1085f) {
                Drawable drawableMutate = drawable.mutate();
                this.f1081b = drawableMutate;
                if (this.f1084e) {
                    DrawableCompat.setTintList(drawableMutate, this.f1082c);
                }
                if (this.f1085f) {
                    DrawableCompat.setTintMode(this.f1081b, this.f1083d);
                }
                if (this.f1081b.isStateful()) {
                    this.f1081b.setState(this.f1080a.getDrawableState());
                }
            }
        }
    }

    @Override // android.support.v7.widget.ao
    final void c(AttributeSet attributeSet, int i2) {
        super.c(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f1080a;
        Context context = seekBar.getContext();
        int[] iArr = android.support.v7.a.a.f485g;
        gc gcVarN = gc.n(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        ViewCompat.saveAttributeDataForStyleable(seekBar, seekBar.getContext(), iArr, attributeSet, gcVarN.h(), R.attr.seekBarStyle, 0);
        Drawable drawableK = gcVarN.k(0);
        if (drawableK != null) {
            seekBar.setThumb(drawableK);
        }
        Drawable drawableJ = gcVarN.j(1);
        Drawable drawable = this.f1081b;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1081b = drawableJ;
        if (drawableJ != null) {
            drawableJ.setCallback(seekBar);
            DrawableCompat.setLayoutDirection(drawableJ, seekBar.getLayoutDirection());
            if (drawableJ.isStateful()) {
                drawableJ.setState(seekBar.getDrawableState());
            }
            g();
        }
        seekBar.invalidate();
        if (gcVarN.s(3)) {
            int iC = gcVarN.c(3, -1);
            PorterDuff.Mode mode = this.f1083d;
            Rect rect = cg.f1231a;
            this.f1083d = com.waze.c.c.e.h(iC, mode);
            this.f1085f = true;
        }
        if (gcVarN.s(2)) {
            this.f1082c = gcVarN.g(2);
            this.f1084e = true;
        }
        gcVarN.q();
        g();
    }

    final void d(Canvas canvas) {
        if (this.f1081b != null) {
            SeekBar seekBar = this.f1080a;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1081b.getIntrinsicWidth();
                int intrinsicHeight = this.f1081b.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth >> 1 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight >> 1 : 1;
                this.f1081b.setBounds(-i2, -i3, i2, i3);
                int width = (seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight();
                int iSave = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f1081b.draw(canvas);
                    canvas.translate(width / max, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    final void e() {
        Drawable drawable = this.f1081b;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = this.f1080a;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    final void f() {
        Drawable drawable = this.f1081b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
