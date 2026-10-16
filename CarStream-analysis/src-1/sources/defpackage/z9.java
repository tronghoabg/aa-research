package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class z9 extends View {
    public y9 a;
    public x9 b;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public long g;

    public z9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = true;
    }

    public final void a(float f) {
        if (this.d) {
            return;
        }
        if (this.g != 0) {
            if (System.currentTimeMillis() - this.g < 1200) {
                return;
            } else {
                this.g = 0L;
            }
        }
        float fMax = Math.max(0.0f, Math.min(1.0f, f));
        if (fMax == this.f) {
            return;
        }
        this.f = fMax;
        invalidate();
    }

    public final void b(boolean z) {
        if (this.c != z) {
            this.c = z;
            if (!z) {
                if (this.d && getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                this.d = false;
            }
            invalidate();
        }
    }

    public final float c() {
        return this.d ? this.e : this.f;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a != null && this.c && getWidth() > 0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        if (this.d) {
                            this.e = Math.max(0.0f, Math.min(1.0f, motionEvent.getX() / getWidth()));
                            invalidate();
                            x9 x9Var = this.b;
                            if (x9Var != null) {
                                x9Var.b(c());
                            }
                        }
                        return this.d;
                    }
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
                if (this.d) {
                    this.d = false;
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    this.f = this.e;
                    if (motionEvent.getActionMasked() == 1) {
                        this.g = System.currentTimeMillis();
                        this.a.a(this.f);
                    }
                    invalidate();
                    x9 x9Var2 = this.b;
                    if (x9Var2 != null) {
                        x9Var2.b(c());
                        return true;
                    }
                }
            } else {
                this.d = true;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.e = Math.max(0.0f, Math.min(1.0f, motionEvent.getX() / getWidth()));
                invalidate();
                x9 x9Var3 = this.b;
                if (x9Var3 != null) {
                    x9Var3.b(c());
                }
            }
            return true;
        }
        return false;
    }
}
