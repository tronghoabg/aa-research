package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class ma extends ViewGroup.MarginLayoutParams {
    public mo c;
    public final Rect d;
    public boolean e;
    boolean f;

    public ma(int i, int i2) {
        super(i, i2);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public final int fP() {
        return this.c.c();
    }

    public final boolean fQ() {
        return this.c.y();
    }

    public final boolean fR() {
        return this.c.v();
    }

    public ma(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public ma(ma maVar) {
        super((ViewGroup.LayoutParams) maVar);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public ma(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public ma(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }
}
