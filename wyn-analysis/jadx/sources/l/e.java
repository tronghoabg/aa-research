package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import g5.RunnableC2707d;

/* loaded from: classes.dex */
public final class e extends Drawable implements Drawable.Callback {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f39821t = 0;

    /* renamed from: a, reason: collision with root package name */
    public b f39822a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f39823b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f39824c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f39825d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f39827f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f39829h;

    /* renamed from: i, reason: collision with root package name */
    public RunnableC2707d f39830i;

    /* renamed from: j, reason: collision with root package name */
    public long f39831j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public f f39832l;

    /* renamed from: m, reason: collision with root package name */
    public b f39833m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f39834n;

    /* renamed from: o, reason: collision with root package name */
    public b f39835o;

    /* renamed from: p, reason: collision with root package name */
    public Ba.c f39836p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f39839s;

    /* renamed from: e, reason: collision with root package name */
    public int f39826e = 255;

    /* renamed from: g, reason: collision with root package name */
    public int f39828g = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f39837q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f39838r = -1;

    public e(b bVar, Resources resources) {
        i(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0272, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0279, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.e c(android.content.Context r24, android.content.res.Resources r25, android.content.res.XmlResourceParser r26, android.util.AttributeSet r27, android.content.res.Resources.Theme r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.e.c(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):l.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f39827f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f39824c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f39831j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f39826e
            r3.setAlpha(r9)
            r13.f39831j = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            l.b r10 = r13.f39822a
            int r10 = r10.f39815y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f39826e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f39831j = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f39825d
            if (r9 == 0) goto L61
            long r10 = r13.k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f39825d = r0
            r13.k = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            l.b r4 = r13.f39822a
            int r4 = r4.f39816z
            int r3 = r3 / r4
            int r4 = r13.f39826e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.k = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            g5.d r14 = r13.f39830i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.e.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        b bVar = this.f39822a;
        if (theme == null) {
            bVar.getClass();
            return;
        }
        bVar.c();
        int i5 = bVar.f39799h;
        Drawable[] drawableArr = bVar.f39798g;
        for (int i10 = 0; i10 < i5; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i10].applyTheme(theme);
                bVar.f39796e |= drawableArr[i10].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            bVar.f39793b = resources;
            int i11 = resources.getDisplayMetrics().densityDpi;
            if (i11 == 0) {
                i11 = 160;
            }
            int i12 = bVar.f39794c;
            bVar.f39794c = i11;
            if (i12 != i11) {
                bVar.f39803m = false;
                bVar.f39801j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f39822a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f39832l == null) {
            this.f39832l = new f();
        }
        f fVar = this.f39832l;
        fVar.f39841b = drawable.getCallback();
        drawable.setCallback(fVar);
        try {
            if (this.f39822a.f39815y <= 0 && this.f39827f) {
                drawable.setAlpha(this.f39826e);
            }
            b bVar = this.f39822a;
            if (bVar.f39784C) {
                drawable.setColorFilter(bVar.f39783B);
            } else {
                if (bVar.f39787F) {
                    drawable.setTintList(bVar.f39785D);
                }
                b bVar2 = this.f39822a;
                if (bVar2.f39788G) {
                    drawable.setTintMode(bVar2.f39786E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f39822a.f39813w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f39822a.f39782A);
            Rect rect = this.f39823b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            f fVar2 = this.f39832l;
            Drawable.Callback callback = (Drawable.Callback) fVar2.f39841b;
            fVar2.f39841b = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            f fVar3 = this.f39832l;
            Drawable.Callback callback2 = (Drawable.Callback) fVar3.f39841b;
            fVar3.f39841b = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f39824c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f39825d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z2;
        Drawable drawable = this.f39825d;
        boolean z10 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f39825d = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f39824c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f39827f) {
                this.f39824c.setAlpha(this.f39826e);
            }
        }
        if (this.k != 0) {
            this.k = 0L;
            z2 = true;
        }
        if (this.f39831j != 0) {
            this.f39831j = 0L;
        } else {
            z10 = z2;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.f39829h && super.mutate() == this) {
            b bVar = new b(this.f39835o, this, null);
            bVar.f39790I = bVar.f39790I.clone();
            bVar.f39791J = bVar.f39791J.clone();
            i(bVar);
            this.f39829h = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.f39834n) {
            f();
            b bVar = this.f39833m;
            bVar.f39790I = bVar.f39790I.clone();
            bVar.f39791J = bVar.f39791J.clone();
            this.f39834n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f39826e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f39822a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z2;
        b bVar = this.f39822a;
        if (!bVar.f39811u) {
            bVar.c();
            bVar.f39811u = true;
            int i5 = bVar.f39799h;
            Drawable[] drawableArr = bVar.f39798g;
            int i10 = 0;
            while (true) {
                if (i10 >= i5) {
                    bVar.f39812v = true;
                    z2 = true;
                    break;
                }
                if (drawableArr[i10].getConstantState() == null) {
                    bVar.f39812v = false;
                    z2 = false;
                    break;
                }
                i10++;
            }
        } else {
            z2 = bVar.f39812v;
        }
        if (!z2) {
            return null;
        }
        this.f39822a.f39795d = getChangingConfigurations();
        return this.f39822a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f39824c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f39823b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.f39822a;
        if (bVar.f39802l) {
            if (!bVar.f39803m) {
                bVar.b();
            }
            return bVar.f39805o;
        }
        Drawable drawable = this.f39824c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.f39822a;
        if (bVar.f39802l) {
            if (!bVar.f39803m) {
                bVar.b();
            }
            return bVar.f39804n;
        }
        Drawable drawable = this.f39824c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b bVar = this.f39822a;
        if (bVar.f39802l) {
            if (!bVar.f39803m) {
                bVar.b();
            }
            return bVar.f39807q;
        }
        Drawable drawable = this.f39824c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b bVar = this.f39822a;
        if (bVar.f39802l) {
            if (!bVar.f39803m) {
                bVar.b();
            }
            return bVar.f39806p;
        }
        Drawable drawable = this.f39824c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f39824c;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f39822a;
            if (bVar.f39808r) {
                return bVar.f39809s;
            }
            bVar.c();
            int i5 = bVar.f39799h;
            Drawable[] drawableArr = bVar.f39798g;
            opacity = i5 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i10 = 1; i10 < i5; i10++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i10].getOpacity());
            }
            bVar.f39809s = opacity;
            bVar.f39808r = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f39824c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b bVar = this.f39822a;
        boolean padding = false;
        Rect rect2 = null;
        if (!bVar.f39800i) {
            Rect rect3 = bVar.k;
            if (rect3 != null || bVar.f39801j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i5 = bVar.f39799h;
                Drawable[] drawableArr = bVar.f39798g;
                for (int i10 = 0; i10 < i5; i10++) {
                    if (drawableArr[i10].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i11 = rect4.left;
                        if (i11 > rect2.left) {
                            rect2.left = i11;
                        }
                        int i12 = rect4.top;
                        if (i12 > rect2.top) {
                            rect2.top = i12;
                        }
                        int i13 = rect4.right;
                        if (i13 > rect2.right) {
                            rect2.right = i13;
                        }
                        int i14 = rect4.bottom;
                        if (i14 > rect2.bottom) {
                            rect2.bottom = i14;
                        }
                    }
                }
                bVar.f39801j = true;
                bVar.k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f39824c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f39822a.f39782A && getLayoutDirection() == 1) {
            int i15 = rect.left;
            rect.left = rect.right;
            rect.right = i15;
        }
        return padding;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.f39828g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            l.b r0 = r9.f39822a
            int r0 = r0.f39816z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f39825d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f39824c
            if (r0 == 0) goto L29
            r9.f39825d = r0
            l.b r0 = r9.f39822a
            int r0 = r0.f39816z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.k = r0
            goto L35
        L29:
            r9.f39825d = r4
            r9.k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f39824c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            l.b r0 = r9.f39822a
            int r1 = r0.f39799h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f39824c = r0
            r9.f39828g = r10
            if (r0 == 0) goto L5a
            l.b r10 = r9.f39822a
            int r10 = r10.f39815y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f39831j = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f39824c = r4
            r10 = -1
            r9.f39828g = r10
        L5a:
            long r0 = r9.f39831j
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.k
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7a
        L67:
            g5.d r10 = r9.f39830i
            if (r10 != 0) goto L74
            g5.d r10 = new g5.d
            r1 = 2
            r10.<init>(r9, r1)
            r9.f39830i = r10
            goto L77
        L74:
            r9.unscheduleSelf(r10)
        L77:
            r9.a(r0)
        L7a:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.e.h(int):boolean");
    }

    public final void i(b bVar) {
        this.f39822a = bVar;
        int i5 = this.f39828g;
        if (i5 >= 0) {
            Drawable drawableD = bVar.d(i5);
            this.f39824c = drawableD;
            if (drawableD != null) {
                d(drawableD);
            }
        }
        this.f39825d = null;
        this.f39833m = bVar;
        this.f39835o = bVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f39822a;
        if (bVar != null) {
            bVar.f39808r = false;
            bVar.f39810t = false;
        }
        if (drawable != this.f39824c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f39822a.f39782A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z2, boolean z10) {
        boolean visible = super.setVisible(z2, z10);
        Drawable drawable = this.f39825d;
        if (drawable != null) {
            drawable.setVisible(z2, z10);
        }
        Drawable drawable2 = this.f39824c;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z10);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        Ba.c cVar = this.f39836p;
        if (cVar != null) {
            cVar.Q();
            this.f39836p = null;
            h(this.f39837q);
            this.f39837q = -1;
            this.f39838r = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f39839s) {
            g();
            b bVar = this.f39835o;
            bVar.f39790I = bVar.f39790I.clone();
            bVar.f39791J = bVar.f39791J.clone();
            this.f39839s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f39825d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f39824c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i5) {
        b bVar = this.f39822a;
        int i10 = this.f39828g;
        int i11 = bVar.f39799h;
        Drawable[] drawableArr = bVar.f39798g;
        boolean z2 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i5);
                if (i12 == i10) {
                    z2 = layoutDirection;
                }
            }
        }
        bVar.f39814x = i5;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i5) {
        Drawable drawable = this.f39825d;
        if (drawable != null) {
            return drawable.setLevel(i5);
        }
        Drawable drawable2 = this.f39824c;
        if (drawable2 != null) {
            return drawable2.setLevel(i5);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.e.onStateChange(int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        if (drawable != this.f39824c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j8);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        if (this.f39827f && this.f39826e == i5) {
            return;
        }
        this.f39827f = true;
        this.f39826e = i5;
        Drawable drawable = this.f39824c;
        if (drawable != null) {
            if (this.f39831j == 0) {
                drawable.setAlpha(i5);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        b bVar = this.f39822a;
        if (bVar.f39782A != z2) {
            bVar.f39782A = z2;
            Drawable drawable = this.f39824c;
            if (drawable != null) {
                drawable.setAutoMirrored(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f39822a;
        bVar.f39784C = true;
        if (bVar.f39783B != colorFilter) {
            bVar.f39783B = colorFilter;
            Drawable drawable = this.f39824c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        b bVar = this.f39822a;
        if (bVar.f39813w != z2) {
            bVar.f39813w = z2;
            Drawable drawable = this.f39824c;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f39824c;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i5, int i10, int i11, int i12) {
        Rect rect = this.f39823b;
        if (rect == null) {
            this.f39823b = new Rect(i5, i10, i11, i12);
        } else {
            rect.set(i5, i10, i11, i12);
        }
        Drawable drawable = this.f39824c;
        if (drawable != null) {
            drawable.setHotspotBounds(i5, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i5) {
        setTintList(ColorStateList.valueOf(i5));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f39822a;
        bVar.f39787F = true;
        if (bVar.f39785D != colorStateList) {
            bVar.f39785D = colorStateList;
            this.f39824c.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f39822a;
        bVar.f39788G = true;
        if (bVar.f39786E != mode) {
            bVar.f39786E = mode;
            this.f39824c.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z10) {
        boolean zJ = j(z2, z10);
        Ba.c cVar = this.f39836p;
        if (cVar != null && (zJ || z10)) {
            if (z2) {
                cVar.P();
                return zJ;
            }
            jumpToCurrentState();
        }
        return zJ;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f39824c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
