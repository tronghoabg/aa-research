package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes2.dex */
final class jm extends ji {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public jm(SeekBar seekBar) {
        super(seekBar);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar;
    }

    private final void c() {
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.f || this.g) {
                Drawable drawableMutate = drawable.mutate();
                this.c = drawableMutate;
                if (this.f) {
                    drawableMutate.setTintList(this.d);
                }
                if (this.g) {
                    this.c.setTintMode(this.e);
                }
                if (this.c.isStateful()) {
                    this.c.setState(this.b.getDrawableState());
                }
            }
        }
    }

    @Override // defpackage.ji
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, i);
        SeekBar seekBar = this.b;
        Context context = seekBar.getContext();
        int[] iArr = fs.g;
        lah lahVarC = lah.C(context, attributeSet, iArr, i, 0);
        ebm.n(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) lahVarC.a, i, 0);
        Drawable drawableT = lahVarC.t(0);
        if (drawableT != null) {
            seekBar.setThumb(drawableT);
        }
        Drawable drawableS = lahVarC.s(1);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = drawableS;
        if (drawableS != null) {
            drawableS.setCallback(seekBar);
            drawableS.setLayoutDirection(seekBar.getLayoutDirection());
            if (drawableS.isStateful()) {
                drawableS.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (lahVarC.y(3)) {
            int iN = lahVarC.n(3, -1);
            PorterDuff.Mode mode = this.e;
            Rect rect = ko.a;
            this.e = a.R(iN, mode);
            this.g = true;
        }
        if (lahVarC.y(2)) {
            this.d = lahVarC.r(2);
            this.f = true;
        }
        lahVarC.w();
        c();
    }
}
