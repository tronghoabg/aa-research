package android.support.v7.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cq extends ej implements eq {

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f1258k = {R.attr.state_pressed};

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f1259l = new int[0];
    private final Runnable D;
    private final ed E;

    /* renamed from: a, reason: collision with root package name */
    final StateListDrawable f1260a;

    /* renamed from: b, reason: collision with root package name */
    final Drawable f1261b;

    /* renamed from: c, reason: collision with root package name */
    int f1262c;

    /* renamed from: d, reason: collision with root package name */
    int f1263d;

    /* renamed from: e, reason: collision with root package name */
    float f1264e;

    /* renamed from: f, reason: collision with root package name */
    int f1265f;

    /* renamed from: g, reason: collision with root package name */
    int f1266g;

    /* renamed from: h, reason: collision with root package name */
    float f1267h;

    /* renamed from: i, reason: collision with root package name */
    final ValueAnimator f1268i;

    /* renamed from: j, reason: collision with root package name */
    int f1269j;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final StateListDrawable q;
    private final Drawable r;
    private final int s;
    private final int t;
    private RecyclerView w;
    private int u = 0;
    private int v = 0;
    private boolean x = false;
    private boolean y = false;
    private int z = 0;
    private int A = 0;
    private final int[] B = new int[2];
    private final int[] C = new int[2];

    cq(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1268i = valueAnimatorOfFloat;
        this.f1269j = 0;
        this.D = new cm(this);
        cn cnVar = new cn(this);
        this.E = cnVar;
        this.f1260a = stateListDrawable;
        this.f1261b = drawable;
        this.q = stateListDrawable2;
        this.r = drawable2;
        this.o = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.p = Math.max(i2, drawable.getIntrinsicWidth());
        this.s = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.t = Math.max(i2, drawable2.getIntrinsicWidth());
        this.m = i3;
        this.n = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new co(this));
        valueAnimatorOfFloat.addUpdateListener(new cp(this));
        RecyclerView recyclerView2 = this.w;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.af(this);
            this.w.ag(this);
            this.w.aG(cnVar);
            m();
        }
        this.w = recyclerView;
        if (recyclerView != null) {
            recyclerView.A(this);
            this.w.B(this);
            this.w.aF(cnVar);
        }
    }

    private final void m() {
        this.w.removeCallbacks(this.D);
    }

    private final void n(int i2) {
        m();
        this.w.postDelayed(this.D, i2);
    }

    private final boolean o() {
        return this.w.getLayoutDirection() == 1;
    }

    private static final int p(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    final void b() {
        this.w.invalidate();
    }

    final void c(int i2) {
        if (i2 == 2 && this.z != 2) {
            this.f1260a.setState(f1258k);
            m();
        }
        if (i2 == 0) {
            b();
        } else {
            d();
        }
        if (this.z == 2 && i2 != 2) {
            this.f1260a.setState(f1259l);
            n(1200);
        } else if (i2 == 1) {
            n(1500);
        }
        this.z = i2;
    }

    public final void d() {
        int i2 = this.f1269j;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                this.f1268i.cancel();
            }
        }
        this.f1269j = 1;
        ValueAnimator valueAnimator = this.f1268i;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    final void e(int i2, int i3) {
        int iComputeVerticalScrollRange = this.w.computeVerticalScrollRange();
        int i4 = this.v;
        this.x = iComputeVerticalScrollRange - i4 > 0 && i4 >= this.m;
        int iComputeHorizontalScrollRange = this.w.computeHorizontalScrollRange();
        int i5 = this.u;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= this.m;
        this.y = z;
        if (this.x) {
            float f2 = i4;
            this.f1263d = (int) ((f2 * (i3 + (f2 / 2.0f))) / iComputeVerticalScrollRange);
            this.f1262c = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        } else if (!z) {
            if (this.z != 0) {
                c(0);
                return;
            }
            return;
        }
        if (this.y) {
            float f3 = i5;
            this.f1266g = (int) ((f3 * (i2 + (f3 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f1265f = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = this.z;
        if (i6 == 0 || i6 == 1) {
            c(1);
        }
    }

    final boolean f(float f2, float f3) {
        if (f3 < this.v - this.s) {
            return false;
        }
        int i2 = this.f1266g;
        int i3 = this.f1265f / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i2 + i3));
    }

    final boolean g(float f2, float f3) {
        if (o()) {
            if (f2 > this.o) {
                return false;
            }
        } else if (f2 < this.u - this.o) {
            return false;
        }
        int i2 = this.f1263d;
        int i3 = this.f1262c / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i2 + i3));
    }

    @Override // android.support.v7.widget.eq
    public final boolean h(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.z;
        if (i2 != 1) {
            return i2 == 2;
        }
        boolean zG = g(motionEvent.getX(), motionEvent.getY());
        boolean zF = f(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (zG) {
            if (!zF) {
                this.A = 2;
                this.f1264e = (int) motionEvent.getY();
            }
            c(2);
            return true;
        }
        if (!zF) {
            return false;
        }
        this.A = 1;
        this.f1267h = (int) motionEvent.getX();
        c(2);
        return true;
    }

    @Override // android.support.v7.widget.eq
    public final void i(MotionEvent motionEvent) {
        if (this.z == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zG = g(motionEvent.getX(), motionEvent.getY());
            boolean zF = f(motionEvent.getX(), motionEvent.getY());
            if (zG) {
                if (!zF) {
                    this.A = 2;
                    this.f1264e = (int) motionEvent.getY();
                }
                c(2);
                return;
            }
            if (!zF) {
                return;
            }
            this.A = 1;
            this.f1267h = (int) motionEvent.getX();
            c(2);
            return;
        }
        if (motionEvent.getAction() == 1 && this.z == 2) {
            this.f1264e = 0.0f;
            this.f1267h = 0.0f;
            c(1);
            this.A = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.z == 2) {
            d();
            if (this.A == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.C;
                int i2 = this.n;
                iArr[0] = i2;
                int i3 = this.u - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.f1266g - fMax) >= 2.0f) {
                    int iP = p(this.f1267h, fMax, iArr, this.w.computeHorizontalScrollRange(), this.w.computeHorizontalScrollOffset(), this.u);
                    if (iP != 0) {
                        this.w.scrollBy(iP, 0);
                    }
                    this.f1267h = fMax;
                }
            }
            if (this.A == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.B;
                int i4 = this.n;
                iArr2[0] = i4;
                int i5 = this.v - i4;
                iArr2[1] = i5;
                float fMax2 = Math.max(i4, Math.min(i5, y));
                if (Math.abs(this.f1263d - fMax2) >= 2.0f) {
                    int iP2 = p(this.f1264e, fMax2, iArr2, this.w.computeVerticalScrollRange(), this.w.computeVerticalScrollOffset(), this.v);
                    if (iP2 != 0) {
                        this.w.scrollBy(0, iP2);
                    }
                    this.f1264e = fMax2;
                }
            }
        }
    }

    @Override // android.support.v7.widget.ej
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, fb fbVar) {
        if (this.u != this.w.getWidth() || this.v != this.w.getHeight()) {
            this.u = this.w.getWidth();
            this.v = this.w.getHeight();
            c(0);
            return;
        }
        if (this.f1269j != 0) {
            if (this.x) {
                int i2 = this.u;
                int i3 = this.o;
                int i4 = i2 - i3;
                int i5 = this.f1263d;
                int i6 = this.f1262c;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f1260a;
                stateListDrawable.setBounds(0, 0, i3, i6);
                Drawable drawable = this.f1261b;
                drawable.setBounds(0, 0, this.p, this.v);
                float f2 = i7;
                float f3 = -i7;
                if (o()) {
                    drawable.draw(canvas);
                    canvas.translate(i3, f2);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, f3);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, f2);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, f3);
                }
            }
            if (this.y) {
                int i8 = this.v;
                int i9 = this.s;
                int i10 = i8 - i9;
                int i11 = this.f1266g;
                int i12 = this.f1265f;
                StateListDrawable stateListDrawable2 = this.q;
                stateListDrawable2.setBounds(0, 0, i12, i9);
                Drawable drawable2 = this.r;
                drawable2.setBounds(0, 0, this.u, this.t);
                canvas.translate(0.0f, i10);
                drawable2.draw(canvas);
                canvas.translate(i11 - (i12 / 2), 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-r2, -i10);
            }
        }
    }

    @Override // android.support.v7.widget.eq
    public final void a(boolean z) {
    }
}
