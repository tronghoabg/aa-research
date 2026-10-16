package s6;

import E5.J0;
import E5.w0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.applovin.shadow.okio.Segment;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import kd.RunnableC3307c;
import u6.AbstractC4256a;

/* renamed from: s6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4017d extends View implements F {

    /* renamed from: A, reason: collision with root package name */
    public int f45133A;

    /* renamed from: B, reason: collision with root package name */
    public long f45134B;

    /* renamed from: C, reason: collision with root package name */
    public int f45135C;

    /* renamed from: D, reason: collision with root package name */
    public Rect f45136D;

    /* renamed from: E, reason: collision with root package name */
    public final ValueAnimator f45137E;

    /* renamed from: F, reason: collision with root package name */
    public float f45138F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f45139G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f45140H;

    /* renamed from: I, reason: collision with root package name */
    public long f45141I;

    /* renamed from: J, reason: collision with root package name */
    public long f45142J;

    /* renamed from: K, reason: collision with root package name */
    public long f45143K;
    public long L;

    /* renamed from: M, reason: collision with root package name */
    public int f45144M;

    /* renamed from: N, reason: collision with root package name */
    public long[] f45145N;

    /* renamed from: O, reason: collision with root package name */
    public boolean[] f45146O;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f45147a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f45148b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f45149c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f45150d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f45151e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f45152f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f45153g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f45154h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f45155i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f45156j;
    public final Drawable k;

    /* renamed from: l, reason: collision with root package name */
    public final int f45157l;

    /* renamed from: m, reason: collision with root package name */
    public final int f45158m;

    /* renamed from: n, reason: collision with root package name */
    public final int f45159n;

    /* renamed from: o, reason: collision with root package name */
    public final int f45160o;

    /* renamed from: p, reason: collision with root package name */
    public final int f45161p;

    /* renamed from: q, reason: collision with root package name */
    public final int f45162q;

    /* renamed from: r, reason: collision with root package name */
    public final int f45163r;

    /* renamed from: s, reason: collision with root package name */
    public final int f45164s;

    /* renamed from: t, reason: collision with root package name */
    public final int f45165t;

    /* renamed from: u, reason: collision with root package name */
    public final StringBuilder f45166u;

    /* renamed from: v, reason: collision with root package name */
    public final Formatter f45167v;

    /* renamed from: w, reason: collision with root package name */
    public final RunnableC3307c f45168w;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArraySet f45169x;

    /* renamed from: y, reason: collision with root package name */
    public final Point f45170y;

    /* renamed from: z, reason: collision with root package name */
    public final float f45171z;

    public C4017d(Context context) {
        super(context, null, 0);
        this.f45147a = new Rect();
        this.f45148b = new Rect();
        this.f45149c = new Rect();
        this.f45150d = new Rect();
        Paint paint = new Paint();
        this.f45151e = paint;
        Paint paint2 = new Paint();
        this.f45152f = paint2;
        Paint paint3 = new Paint();
        this.f45153g = paint3;
        Paint paint4 = new Paint();
        this.f45154h = paint4;
        Paint paint5 = new Paint();
        this.f45155i = paint5;
        Paint paint6 = new Paint();
        this.f45156j = paint6;
        paint6.setAntiAlias(true);
        this.f45169x = new CopyOnWriteArraySet();
        this.f45170y = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f45171z = f10;
        this.f45165t = a(f10, -50);
        int iA = a(f10, 4);
        int iA2 = a(f10, 26);
        int iA3 = a(f10, 4);
        int iA4 = a(f10, 12);
        int iA5 = a(f10, 0);
        int iA6 = a(f10, 16);
        this.f45157l = iA;
        this.f45158m = iA2;
        this.f45159n = 0;
        this.f45160o = iA3;
        this.f45161p = iA4;
        this.f45162q = iA5;
        this.f45163r = iA6;
        paint.setColor(-1);
        paint6.setColor(-1);
        paint2.setColor(-855638017);
        paint3.setColor(872415231);
        paint4.setColor(-1291845888);
        paint5.setColor(872414976);
        this.k = null;
        StringBuilder sb2 = new StringBuilder();
        this.f45166u = sb2;
        this.f45167v = new Formatter(sb2, Locale.getDefault());
        this.f45168w = new RunnableC3307c(this, 12);
        this.f45164s = (Math.max(iA5, Math.max(iA4, iA6)) + 1) / 2;
        this.f45138F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f45137E = valueAnimator;
        valueAnimator.addUpdateListener(new f8.h(this, 1));
        this.f45142J = -9223372036854775807L;
        this.f45134B = -9223372036854775807L;
        this.f45133A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(float f10, int i5) {
        return (int) ((i5 * f10) + 0.5f);
    }

    private long getPositionIncrement() {
        long j8 = this.f45134B;
        if (j8 != -9223372036854775807L) {
            return j8;
        }
        long j10 = this.f45142J;
        if (j10 == -9223372036854775807L) {
            return 0L;
        }
        return j10 / this.f45133A;
    }

    private String getProgressText() {
        return u6.v.r(this.f45166u, this.f45167v, this.f45143K);
    }

    private long getScrubberPosition() {
        if (this.f45148b.width() <= 0 || this.f45142J == -9223372036854775807L) {
            return 0L;
        }
        return (this.f45150d.width() * this.f45142J) / r0.width();
    }

    public final boolean b(long j8) {
        long j10 = this.f45142J;
        if (j10 <= 0) {
            return false;
        }
        long j11 = this.f45140H ? this.f45141I : this.f45143K;
        long jI = u6.v.i(j11 + j8, 0L, j10);
        if (jI == j11) {
            return false;
        }
        if (this.f45140H) {
            f(jI);
        } else {
            c(jI);
        }
        e();
        return true;
    }

    public final void c(long j8) {
        this.f45141I = j8;
        this.f45140H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f45169x.iterator();
        while (it.hasNext()) {
            t tVar = ((ViewOnClickListenerC4023j) it.next()).f45185a;
            tVar.f45252n0 = true;
            TextView textView = tVar.f45207D;
            if (textView != null) {
                textView.setText(u6.v.r(tVar.f45209F, tVar.f45210G, j8));
            }
            tVar.f45226a.f();
        }
    }

    public final void d(boolean z2) {
        w0 w0Var;
        int iL0;
        removeCallbacks(this.f45168w);
        this.f45140H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f45169x.iterator();
        while (it.hasNext()) {
            ViewOnClickListenerC4023j viewOnClickListenerC4023j = (ViewOnClickListenerC4023j) it.next();
            long j8 = this.f45141I;
            t tVar = viewOnClickListenerC4023j.f45185a;
            tVar.f45252n0 = false;
            if (!z2 && (w0Var = tVar.f45241h0) != null) {
                E5.I i5 = (E5.I) w0Var;
                J0 j0O0 = i5.o0();
                if (tVar.f45250m0 && !j0O0.p()) {
                    int iO = j0O0.o();
                    iL0 = 0;
                    while (true) {
                        long jF = u6.v.F(j0O0.m(iL0, tVar.f45212I, 0L).f3121m);
                        if (j8 < jF) {
                            break;
                        }
                        if (iL0 == iO - 1) {
                            j8 = jF;
                            break;
                        } else {
                            j8 -= jF;
                            iL0++;
                        }
                    }
                } else {
                    iL0 = i5.l0();
                }
                i5.Q0();
                i5.E0(j8, iL0, false);
                tVar.n();
            }
            tVar.f45226a.g();
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        Rect rect = this.f45149c;
        Rect rect2 = this.f45148b;
        rect.set(rect2);
        Rect rect3 = this.f45150d;
        rect3.set(rect2);
        long j8 = this.f45140H ? this.f45141I : this.f45143K;
        if (this.f45142J > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.L) / this.f45142J)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j8) / this.f45142J)), rect2.right);
        } else {
            int i5 = rect2.left;
            rect.right = i5;
            rect3.right = i5;
        }
        invalidate(this.f45147a);
    }

    public final void f(long j8) {
        if (this.f45141I == j8) {
            return;
        }
        this.f45141I = j8;
        Iterator it = this.f45169x.iterator();
        while (it.hasNext()) {
            t tVar = ((ViewOnClickListenerC4023j) it.next()).f45185a;
            TextView textView = tVar.f45207D;
            if (textView != null) {
                textView.setText(u6.v.r(tVar.f45209F, tVar.f45210G, j8));
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f45148b.width() / this.f45171z);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j8 = this.f45142J;
        if (j8 == 0 || j8 == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j8 / iWidth;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        Rect rect = this.f45148b;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i5 = iCenterY + iHeight;
        long j8 = this.f45142J;
        Paint paint = this.f45153g;
        Rect rect2 = this.f45150d;
        if (j8 <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i5, paint);
        } else {
            Rect rect3 = this.f45149c;
            int i10 = rect3.left;
            int i11 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i11), rect2.right);
            int i12 = rect.right;
            if (iMax < i12) {
                canvas.drawRect(iMax, iCenterY, i12, i5, paint);
            }
            int iMax2 = Math.max(i10, rect2.right);
            if (i11 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i11, i5, this.f45152f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i5, this.f45151e);
            }
            if (this.f45144M != 0) {
                long[] jArr = this.f45145N;
                jArr.getClass();
                boolean[] zArr = this.f45146O;
                zArr.getClass();
                int i13 = this.f45160o;
                int i14 = i13 / 2;
                int i15 = 0;
                int i16 = 0;
                while (i16 < this.f45144M) {
                    int i17 = i16;
                    canvas.drawRect(Math.min(rect.width() - i13, Math.max(i15, ((int) ((rect.width() * u6.v.i(jArr[i16], 0L, this.f45142J)) / this.f45142J)) - i14)) + rect.left, iCenterY, r3 + i13, i5, zArr[i16] ? this.f45155i : this.f45154h);
                    i16 = i17 + 1;
                    i15 = i15;
                }
            }
            canvas2 = canvas;
        }
        if (this.f45142J > 0) {
            int iH = u6.v.h(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.k;
            if (drawable == null) {
                canvas2.drawCircle(iH, iCenterY2, (int) ((((this.f45140H || isFocused()) ? this.f45163r : isEnabled() ? this.f45161p : this.f45162q) * this.f45138F) / 2.0f), this.f45156j);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f45138F)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f45138F)) / 2;
                drawable.setBounds(iH - intrinsicWidth, iCenterY2 - intrinsicHeight, iH + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z2, int i5, Rect rect) {
        super.onFocusChanged(z2, i5, rect);
        if (!this.f45140H || z2) {
            return;
        }
        d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f45142J <= 0) {
            return;
        }
        if (u6.v.f46721a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(Segment.SIZE);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L2e
            kd.c r5 = r4.f45168w
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.f45140H
            if (r0 == 0) goto L2e
            r5 = 0
            r4.d(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.C4017d.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i13 = i11 - i5;
        int i14 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i13 - getPaddingRight();
        int i15 = this.f45139G ? 0 : this.f45164s;
        int i16 = this.f45159n;
        int i17 = this.f45157l;
        int i18 = this.f45158m;
        if (i16 == 1) {
            paddingBottom = (i14 - getPaddingBottom()) - i18;
            paddingBottom2 = ((i14 - getPaddingBottom()) - i17) - Math.max(i15 - (i17 / 2), 0);
        } else {
            paddingBottom = (i14 - i18) / 2;
            paddingBottom2 = (i14 - i17) / 2;
        }
        Rect rect2 = this.f45147a;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i18 + paddingBottom);
        this.f45148b.set(rect2.left + i15, paddingBottom2, rect2.right - i15, i17 + paddingBottom2);
        if (u6.v.f46721a >= 29 && ((rect = this.f45136D) == null || rect.width() != i13 || this.f45136D.height() != i14)) {
            Rect rect3 = new Rect(0, 0, i13, i14);
            this.f45136D = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int i11 = this.f45158m;
        if (mode == 0) {
            size = i11;
        } else if (mode != 1073741824) {
            size = Math.min(i11, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i5), size);
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i5) {
        Drawable drawable = this.k;
        if (drawable == null || u6.v.f46721a < 23 || !drawable.setLayoutDirection(i5)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La1
            long r2 = r9.f45142J
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La1
        L11:
            android.graphics.Point r0 = r9.f45170y
            float r2 = r10.getX()
            int r2 = (int) r2
            float r3 = r10.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.f45150d
            android.graphics.Rect r5 = r9.f45148b
            r6 = 1
            if (r3 == 0) goto L7d
            r7 = 3
            if (r3 == r6) goto L6e
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6e
            goto La1
        L38:
            boolean r10 = r9.f45140H
            if (r10 == 0) goto La1
            int r10 = r9.f45165t
            if (r0 >= r10) goto L52
            int r10 = r9.f45135C
            int r2 = r2 - r10
            int r2 = r2 / r7
            int r2 = r2 + r10
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = u6.v.h(r10, r0, r1)
            r4.right = r10
            goto L60
        L52:
            r9.f45135C = r2
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = u6.v.h(r10, r0, r1)
            r4.right = r10
        L60:
            long r0 = r9.getScrubberPosition()
            r9.f(r0)
            r9.e()
            r9.invalidate()
            return r6
        L6e:
            boolean r0 = r9.f45140H
            if (r0 == 0) goto La1
            int r10 = r10.getAction()
            if (r10 != r7) goto L79
            r1 = r6
        L79:
            r9.d(r1)
            return r6
        L7d:
            float r10 = (float) r2
            float r0 = (float) r0
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f45147a
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La1
            int r0 = r5.left
            int r1 = r5.right
            int r10 = u6.v.h(r10, r0, r1)
            r4.right = r10
            long r0 = r9.getScrubberPosition()
            r9.c(r0)
            r9.e()
            r9.invalidate()
            return r6
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.C4017d.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i5, Bundle bundle) {
        if (super.performAccessibilityAction(i5, bundle)) {
            return true;
        }
        if (this.f45142J <= 0) {
            return false;
        }
        if (i5 == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i5 != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i5) {
        this.f45154h.setColor(i5);
        invalidate(this.f45147a);
    }

    public void setBufferedColor(int i5) {
        this.f45152f.setColor(i5);
        invalidate(this.f45147a);
    }

    public void setBufferedPosition(long j8) {
        if (this.L == j8) {
            return;
        }
        this.L = j8;
        e();
    }

    public void setDuration(long j8) {
        if (this.f45142J == j8) {
            return;
        }
        this.f45142J = j8;
        if (this.f45140H && j8 == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!this.f45140H || z2) {
            return;
        }
        d(true);
    }

    public void setKeyCountIncrement(int i5) {
        AbstractC4256a.e(i5 > 0);
        this.f45133A = i5;
        this.f45134B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j8) {
        AbstractC4256a.e(j8 > 0);
        this.f45133A = -1;
        this.f45134B = j8;
    }

    public void setPlayedAdMarkerColor(int i5) {
        this.f45155i.setColor(i5);
        invalidate(this.f45147a);
    }

    public void setPlayedColor(int i5) {
        this.f45151e.setColor(i5);
        invalidate(this.f45147a);
    }

    public void setPosition(long j8) {
        if (this.f45143K == j8) {
            return;
        }
        this.f45143K = j8;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i5) {
        this.f45156j.setColor(i5);
        invalidate(this.f45147a);
    }

    public void setUnplayedColor(int i5) {
        this.f45153g.setColor(i5);
        invalidate(this.f45147a);
    }
}
