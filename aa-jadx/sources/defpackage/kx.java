package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kx extends defpackage.ly implements defpackage.mf {
    private static final int[] r = {android.R.attr.state_pressed};
    private static final int[] s = new int[0];
    private final java.lang.Runnable D;
    private final defpackage.ca E;
    public final int a;
    public final android.graphics.drawable.StateListDrawable b;
    public final android.graphics.drawable.Drawable c;
    int d;
    int e;
    float f;
    int g;
    int h;
    float i;
    public android.support.v7.widget.RecyclerView l;
    final android.animation.ValueAnimator p;
    int q;
    private final int t;
    private final int u;
    private final int v;
    private final android.graphics.drawable.StateListDrawable w;
    private final android.graphics.drawable.Drawable x;
    private final int y;
    private final int z;
    public int j = 0;
    public int k = 0;
    public boolean m = false;
    public boolean n = false;
    public int o = 0;
    private int A = 0;
    private final int[] B = new int[2];
    private final int[] C = new int[2];

    public kx(android.support.v7.widget.RecyclerView recyclerView, android.graphics.drawable.StateListDrawable stateListDrawable, android.graphics.drawable.Drawable drawable, android.graphics.drawable.StateListDrawable stateListDrawable2, android.graphics.drawable.Drawable drawable2, int i, int i2, int i3) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.p = valueAnimatorOfFloat;
        this.q = 0;
        this.D = new defpackage.ku(this, 0);
        defpackage.kv kvVar = new defpackage.kv(this);
        this.E = kvVar;
        this.b = stateListDrawable;
        this.c = drawable;
        this.w = stateListDrawable2;
        this.x = drawable2;
        this.u = java.lang.Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.v = java.lang.Math.max(i, drawable.getIntrinsicWidth());
        this.y = java.lang.Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.z = java.lang.Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.t = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new defpackage.kw(this));
        valueAnimatorOfFloat.addUpdateListener(new defpackage.nv(this, 1));
        android.support.v7.widget.RecyclerView recyclerView2 = this.l;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.av(this);
            this.l.V(this);
            this.l.az(kvVar);
            B();
        }
        this.l = recyclerView;
        if (recyclerView != null) {
            recyclerView.aw(this);
            this.l.u(this);
            this.l.ay(kvVar);
        }
    }

    private final void B() {
        this.l.removeCallbacks(this.D);
    }

    private final void C(int i) {
        B();
        this.l.postDelayed(this.D, i);
    }

    private final boolean D() {
        return this.l.getLayoutDirection() == 1;
    }

    private static final int E(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    public final void d() {
        this.l.invalidate();
    }

    final void e(int i) {
        if (i == 2 && this.o != 2) {
            this.b.setState(r);
            B();
        }
        if (i == 0) {
            d();
        } else {
            f();
        }
        if (this.o == 2 && i != 2) {
            this.b.setState(s);
            C(1200);
        } else if (i == 1) {
            C(1500);
        }
        this.o = i;
    }

    public final void f() {
        int i = this.q;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.p.cancel();
            }
        }
        this.q = 1;
        android.animation.ValueAnimator valueAnimator = this.p;
        valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    final boolean g(float f, float f2) {
        if (f2 < this.k - this.y) {
            return false;
        }
        int i = this.h;
        int i2 = this.g / 2;
        return f >= ((float) (i - i2)) && f <= ((float) (i + i2));
    }

    final boolean h(float f, float f2) {
        if (D()) {
            if (f > this.u) {
                return false;
            }
        } else if (f < this.j - this.u) {
            return false;
        }
        int i = this.e;
        int i2 = this.d / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i + i2));
    }

    @Override // defpackage.ly
    public final void i(android.graphics.Canvas canvas, android.support.v7.widget.RecyclerView recyclerView) {
        if (this.j != this.l.getWidth() || this.k != this.l.getHeight()) {
            this.j = this.l.getWidth();
            this.k = this.l.getHeight();
            e(0);
            return;
        }
        if (this.q != 0) {
            if (this.m) {
                int i = this.j;
                int i2 = this.u;
                int i3 = i - i2;
                int i4 = this.e;
                int i5 = this.d;
                int i6 = i4 - (i5 / 2);
                android.graphics.drawable.StateListDrawable stateListDrawable = this.b;
                stateListDrawable.setBounds(0, 0, i2, i5);
                android.graphics.drawable.Drawable drawable = this.c;
                drawable.setBounds(0, 0, this.v, this.k);
                float f = i6;
                float f2 = -i6;
                if (D()) {
                    drawable.draw(canvas);
                    canvas.translate(i2, f);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i2, f2);
                } else {
                    canvas.translate(i3, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
                    drawable.draw(canvas);
                    canvas.translate(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i3, f2);
                }
            }
            if (this.n) {
                int i7 = this.k;
                int i8 = this.y;
                int i9 = i7 - i8;
                int i10 = this.h;
                int i11 = this.g;
                int i12 = i10 - (i11 / 2);
                android.graphics.drawable.StateListDrawable stateListDrawable2 = this.w;
                stateListDrawable2.setBounds(0, 0, i11, i8);
                android.graphics.drawable.Drawable drawable2 = this.x;
                drawable2.setBounds(0, 0, this.j, this.z);
                canvas.translate(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, i9);
                drawable2.draw(canvas);
                canvas.translate(i12, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i12, -i9);
            }
        }
    }

    @Override // defpackage.mf
    public final boolean j(android.view.MotionEvent motionEvent) {
        int i = this.o;
        if (i != 1) {
            return i == 2;
        }
        boolean zH = h(motionEvent.getX(), motionEvent.getY());
        boolean zG = g(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (zH) {
            if (!zG) {
                this.A = 2;
                this.f = (int) motionEvent.getY();
            }
            e(2);
            return true;
        }
        if (!zG) {
            return false;
        }
        this.A = 1;
        this.i = (int) motionEvent.getX();
        e(2);
        return true;
    }

    @Override // defpackage.mf
    public final void k(android.view.MotionEvent motionEvent) {
        if (this.o == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zH = h(motionEvent.getX(), motionEvent.getY());
            boolean zG = g(motionEvent.getX(), motionEvent.getY());
            if (zH) {
                if (!zG) {
                    this.A = 2;
                    this.f = (int) motionEvent.getY();
                }
                e(2);
                return;
            }
            if (!zG) {
                return;
            }
            this.A = 1;
            this.i = (int) motionEvent.getX();
            e(2);
            return;
        }
        if (motionEvent.getAction() == 1 && this.o == 2) {
            this.f = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            this.i = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            e(1);
            this.A = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.o == 2) {
            f();
            if (this.A == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.C;
                int i = this.t;
                iArr[0] = i;
                int i2 = this.j - i;
                iArr[1] = i2;
                float fMax = java.lang.Math.max(i, java.lang.Math.min(i2, x));
                if (java.lang.Math.abs(this.h - fMax) >= 2.0f) {
                    int iE = E(this.i, fMax, iArr, this.l.computeHorizontalScrollRange(), this.l.computeHorizontalScrollOffset(), this.j);
                    if (iE != 0) {
                        this.l.scrollBy(iE, 0);
                    }
                    this.i = fMax;
                }
            }
            if (this.A == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.B;
                int i3 = this.t;
                iArr2[0] = i3;
                int i4 = this.k - i3;
                iArr2[1] = i4;
                float fMax2 = java.lang.Math.max(i3, java.lang.Math.min(i4, y));
                if (java.lang.Math.abs(this.e - fMax2) >= 2.0f) {
                    int iE2 = E(this.f, fMax2, iArr2, this.l.computeVerticalScrollRange(), this.l.computeVerticalScrollOffset(), this.k);
                    if (iE2 != 0) {
                        this.l.scrollBy(0, iE2);
                    }
                    this.f = fMax2;
                }
            }
        }
    }

    @Override // defpackage.mf
    public final void c(boolean z) {
    }
}
