package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ej;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class s extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: d, reason: collision with root package name */
    private static final List f2484d = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f2485e = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new com.airbnb.lottie.g.d());
    private Rect A;
    private Rect B;
    private RectF C;
    private RectF D;
    private Matrix E;
    private Matrix F;
    private boolean G;
    private a H;
    private final ValueAnimator.AnimatorUpdateListener I;
    private final Semaphore J;
    private final Runnable K;
    private float L;
    private int M;

    /* renamed from: a, reason: collision with root package name */
    String f2486a;

    /* renamed from: b, reason: collision with root package name */
    com.bumptech.glide.load.a.b.o f2487b;

    /* renamed from: c, reason: collision with root package name */
    ej f2488c;

    /* renamed from: f, reason: collision with root package name */
    private h f2489f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.g.e f2490g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2491h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2492i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList f2493j;

    /* renamed from: k, reason: collision with root package name */
    private com.airbnb.lottie.c.b f2494k;

    /* renamed from: l, reason: collision with root package name */
    private String f2495l;
    private com.airbnb.lottie.c.a m;
    private boolean n;
    private boolean o;
    private com.airbnb.lottie.d.c.c p;
    private int q;
    private boolean r;
    private ag s;
    private boolean t;
    private final Matrix u;
    private Bitmap v;
    private Canvas w;
    private Rect x;
    private RectF y;
    private Paint z;

    public s() {
        com.airbnb.lottie.g.e eVar = new com.airbnb.lottie.g.e();
        this.f2490g = eVar;
        this.f2491h = true;
        this.f2492i = false;
        this.M = 1;
        this.f2493j = new ArrayList();
        this.o = true;
        this.q = 255;
        this.r = false;
        this.s = ag.f1938a;
        this.t = false;
        this.u = new Matrix();
        this.G = false;
        com.waze.design_components.button.timer.b bVar = new com.waze.design_components.button.timer.b(this, 1);
        this.I = bVar;
        this.J = new Semaphore(1);
        this.K = new android.support.v4.app.ae(this, 9);
        this.L = -3.4028235E38f;
        eVar.addUpdateListener(bVar);
    }

    public static /* synthetic */ void U(s sVar) {
        if (sVar.O()) {
            sVar.invalidateSelf();
            return;
        }
        com.airbnb.lottie.d.c.c cVar = sVar.p;
        if (cVar != null) {
            cVar.r(sVar.f2490g.h());
        }
    }

    private final com.airbnb.lottie.c.a X() {
        if (getCallback() == null) {
            return null;
        }
        if (this.m == null) {
            com.airbnb.lottie.c.a aVar = new com.airbnb.lottie.c.a(getCallback(), this.f2488c);
            this.m = aVar;
            String str = this.f2486a;
            if (str != null) {
                aVar.b(str);
            }
        }
        return this.m;
    }

    private final void Y() {
        h hVar = this.f2489f;
        if (hVar == null) {
            return;
        }
        int i2 = com.airbnb.lottie.f.t.f2377a;
        Rect rectH = hVar.h();
        com.airbnb.lottie.d.c.c cVar = new com.airbnb.lottie.d.c.c(this, new com.airbnb.lottie.d.c.e(Collections.EMPTY_LIST, hVar, "__container", -1L, 1, -1L, null, Collections.EMPTY_LIST, new com.airbnb.lottie.d.a.l(), 0, 0, 0, 0.0f, 0.0f, rectH.width(), rectH.height(), null, null, Collections.EMPTY_LIST, 1, null, false, null, null, 1), hVar.l(), hVar);
        this.p = cVar;
        cVar.w(this.o);
    }

    private final void Z() {
        h hVar = this.f2489f;
        if (hVar == null) {
            return;
        }
        ag agVar = this.s;
        int iG = hVar.g();
        int iOrdinal = agVar.ordinal();
        boolean z = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || iG > 4)) {
            z = true;
        }
        this.t = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aa(android.graphics.Canvas r9, com.airbnb.lottie.d.c.c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.s.aa(android.graphics.Canvas, com.airbnb.lottie.d.c.c):void");
    }

    private final boolean ab() {
        return this.f2491h || this.f2492i;
    }

    private final boolean ac() {
        h hVar = this.f2489f;
        if (hVar == null) {
            return false;
        }
        float f2 = this.L;
        float fH = this.f2490g.h();
        this.L = fH;
        return Math.abs(fH - f2) * hVar.a() >= 50.0f;
    }

    private static final void ad(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static /* synthetic */ void m(s sVar) {
        Semaphore semaphore;
        com.airbnb.lottie.d.c.c cVar = sVar.p;
        if (cVar == null) {
            return;
        }
        try {
            sVar.J.acquire();
            cVar.r(sVar.f2490g.h());
            semaphore = sVar.J;
        } catch (InterruptedException unused) {
            semaphore = sVar.J;
        } catch (Throwable th) {
            sVar.J.release();
            throw th;
        }
        semaphore.release();
    }

    public final void A(boolean z) {
        if (z != this.r) {
            this.r = z;
            invalidateSelf();
        }
    }

    public final void B(boolean z) {
        if (z != this.o) {
            this.o = z;
            com.airbnb.lottie.d.c.c cVar = this.p;
            if (cVar != null) {
                cVar.w(z);
            }
            invalidateSelf();
        }
    }

    public final void C(String str) {
        this.f2486a = str;
        com.airbnb.lottie.c.a aVarX = X();
        if (aVarX != null) {
            aVarX.b(str);
        }
    }

    public final void D(final int i2) {
        if (this.f2489f == null) {
            this.f2493j.add(new r() { // from class: com.airbnb.lottie.n
                @Override // com.airbnb.lottie.r
                public final void a() {
                    this.f2474a.D(i2);
                }
            });
        } else {
            this.f2490g.v(i2);
        }
    }

    public final void E(boolean z) {
        this.f2492i = z;
    }

    public final void F(String str) {
        this.f2495l = str;
    }

    public final void G(final float f2) {
        h hVar = this.f2489f;
        if (hVar == null) {
            this.f2493j.add(new r() { // from class: com.airbnb.lottie.q
                @Override // com.airbnb.lottie.r
                public final void a() {
                    this.f2482a.G(f2);
                }
            });
        } else {
            this.f2490g.v(hVar.d(f2));
        }
    }

    public final void H(ag agVar) {
        this.s = agVar;
        Z();
    }

    public final void I(int i2) {
        this.f2490g.setRepeatCount(i2);
    }

    public final void J(int i2) {
        this.f2490g.setRepeatMode(i2);
    }

    public final void K(float f2) {
        this.f2490g.x(f2);
    }

    public final void L(Boolean bool) {
        this.f2491h = bool.booleanValue();
    }

    public final void M(boolean z) {
        this.f2490g.y(z);
    }

    public final boolean N() {
        return this.n;
    }

    public final boolean O() {
        a aVarA = this.H;
        if (aVarA == null) {
            aVarA = b.a();
        }
        return aVarA == a.f1742b;
    }

    public final boolean P() {
        return this.r;
    }

    public final boolean Q() {
        com.airbnb.lottie.g.e eVar = this.f2490g;
        if (eVar == null) {
            return false;
        }
        return eVar.isRunning();
    }

    final boolean R() {
        if (isVisible()) {
            return this.f2490g.isRunning();
        }
        int i2 = this.M;
        return i2 == 2 || i2 == 3;
    }

    public final boolean S(h hVar) {
        if (this.f2489f == hVar) {
            return false;
        }
        this.G = true;
        r();
        this.f2489f = hVar;
        Y();
        com.airbnb.lottie.g.e eVar = this.f2490g;
        eVar.u(hVar);
        G(eVar.getAnimatedFraction());
        ArrayList arrayList = this.f2493j;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                rVar.a();
            }
            it.remove();
        }
        arrayList.clear();
        Z();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final boolean T() {
        return this.f2487b == null && this.f2489f.i().size() > 0;
    }

    public final com.bumptech.glide.load.a.b.o V() {
        return this.f2487b;
    }

    public final void W(ej ejVar) {
        this.f2488c = ejVar;
        com.airbnb.lottie.c.a aVar = this.m;
        if (aVar != null) {
            aVar.c(ejVar);
        }
    }

    public final float a() {
        return this.f2490g.i();
    }

    public final float b() {
        return this.f2490g.j();
    }

    public final float c() {
        return this.f2490g.h();
    }

    public final float d() {
        return this.f2490g.k();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        com.airbnb.lottie.d.c.c cVar = this.p;
        if (cVar == null) {
            return;
        }
        boolean zO = O();
        if (zO) {
            try {
                this.J.acquire();
            } catch (InterruptedException unused) {
                if (!zO) {
                    return;
                }
                this.J.release();
                if (cVar.v() == this.f2490g.h()) {
                    return;
                }
            } catch (Throwable th) {
                if (zO) {
                    this.J.release();
                    if (cVar.v() != this.f2490g.h()) {
                        f2485e.execute(this.K);
                    }
                }
                throw th;
            }
        }
        if (zO && ac()) {
            G(this.f2490g.h());
        }
        if (this.t) {
            aa(canvas, cVar);
        } else {
            com.airbnb.lottie.d.c.c cVar2 = this.p;
            h hVar = this.f2489f;
            if (cVar2 != null && hVar != null) {
                Matrix matrix = this.u;
                matrix.reset();
                if (!getBounds().isEmpty()) {
                    matrix.preScale(r5.width() / hVar.h().width(), r5.height() / hVar.h().height());
                    matrix.preTranslate(r5.left, r5.top);
                }
                cVar2.b(canvas, matrix, this.q);
            }
        }
        this.G = false;
        if (zO) {
            this.J.release();
            if (cVar.v() == this.f2490g.h()) {
                return;
            }
            f2485e.execute(this.K);
        }
    }

    public final int e() {
        return this.f2490g.getRepeatCount();
    }

    public final int f() {
        return this.f2490g.getRepeatMode();
    }

    public final Bitmap g(String str) {
        com.airbnb.lottie.c.b bVar = this.f2494k;
        if (bVar != null) {
            Drawable.Callback callback = getCallback();
            if (!bVar.b((callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null)) {
                this.f2494k = null;
            }
        }
        com.airbnb.lottie.c.b bVar2 = this.f2494k;
        if (bVar2 == null) {
            bVar2 = new com.airbnb.lottie.c.b(getCallback(), this.f2495l, this.f2489f.o());
            this.f2494k = bVar2;
        }
        if (bVar2 != null) {
            return bVar2.a(str);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        h hVar = this.f2489f;
        if (hVar == null) {
            return -1;
        }
        return hVar.h().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        h hVar = this.f2489f;
        if (hVar == null) {
            return -1;
        }
        return hVar.h().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final Typeface h(com.airbnb.lottie.d.c cVar) {
        com.airbnb.lottie.c.a aVarX = X();
        if (aVarX != null) {
            return aVarX.a(cVar);
        }
        return null;
    }

    public final h i() {
        return this.f2489f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.G) {
            return;
        }
        this.G = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return Q();
    }

    public final t j(String str) {
        h hVar = this.f2489f;
        if (hVar == null) {
            return null;
        }
        return (t) hVar.o().get(str);
    }

    public final ag k() {
        return this.t ? ag.f1940c : ag.f1939b;
    }

    public final String l() {
        return this.f2495l;
    }

    public final void n(Animator.AnimatorListener animatorListener) {
        this.f2490g.addListener(animatorListener);
    }

    public final void o(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f2490g.addUpdateListener(animatorUpdateListener);
    }

    public final void p(final com.airbnb.lottie.d.e eVar, final Object obj, final com.airbnb.lottie.h.c cVar) {
        com.airbnb.lottie.d.c.c cVar2 = this.p;
        if (cVar2 == null) {
            this.f2493j.add(new r() { // from class: com.airbnb.lottie.o
                @Override // com.airbnb.lottie.r
                public final void a() {
                    this.f2476a.p(eVar, obj, cVar);
                }
            });
            return;
        }
        if (eVar == com.airbnb.lottie.d.e.f2278a) {
            cVar2.a(obj, cVar);
        } else if (eVar.d() != null) {
            eVar.d().a(obj, cVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.p.e(eVar, 0, arrayList, new com.airbnb.lottie.d.e(new String[0]));
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((com.airbnb.lottie.d.e) arrayList.get(i2)).d().a(obj, cVar);
            }
            if (arrayList.isEmpty()) {
                return;
            }
        }
        invalidateSelf();
        if (obj == x.E) {
            G(c());
        }
    }

    public final void q() {
        this.f2493j.clear();
        this.f2490g.cancel();
        if (isVisible()) {
            return;
        }
        this.M = 1;
    }

    public final void r() {
        com.airbnb.lottie.g.e eVar = this.f2490g;
        if (eVar.isRunning()) {
            eVar.cancel();
            if (!isVisible()) {
                this.M = 1;
            }
        }
        this.f2489f = null;
        this.p = null;
        this.f2494k = null;
        this.L = -3.4028235E38f;
        eVar.l();
        invalidateSelf();
    }

    public final void s(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.d.c.c cVar = this.p;
        h hVar = this.f2489f;
        if (cVar == null || hVar == null) {
            return;
        }
        boolean zO = O();
        if (zO) {
            try {
                this.J.acquire();
                if (ac()) {
                    G(this.f2490g.h());
                }
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                if (zO) {
                    this.J.release();
                    if (cVar.v() != this.f2490g.h()) {
                        f2485e.execute(this.K);
                    }
                }
                throw th;
            }
        }
        if (this.t) {
            canvas.save();
            canvas.concat(matrix);
            aa(canvas, cVar);
            canvas.restore();
        } else {
            cVar.b(canvas, matrix, this.q);
        }
        this.G = false;
        if (zO) {
            this.J.release();
            if (cVar.v() != this.f2490g.h()) {
                f2485e.execute(this.K);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.q = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        com.airbnb.lottie.g.c.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i2 = this.M;
            if (i2 == 2) {
                v();
                return visible;
            }
            if (i2 == 3) {
                y();
                return visible;
            }
        } else {
            if (this.f2490g.isRunning()) {
                u();
                this.M = 3;
                return visible;
            }
            if (zIsVisible) {
                this.M = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        v();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f2493j.clear();
        this.f2490g.m();
        if (isVisible()) {
            return;
        }
        this.M = 1;
    }

    public final void t(boolean z) {
        if (this.n == z) {
            return;
        }
        this.n = z;
        if (this.f2489f != null) {
            Y();
        }
    }

    public final void u() {
        this.f2493j.clear();
        this.f2490g.n();
        if (isVisible()) {
            return;
        }
        this.M = 1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v() {
        if (this.p == null) {
            this.f2493j.add(new p(this, 0));
            return;
        }
        Z();
        if (ab() || e() == 0) {
            if (isVisible()) {
                this.f2490g.o();
                this.M = 1;
            } else {
                this.M = 2;
            }
        }
        if (ab()) {
            return;
        }
        Iterator it = f2484d.iterator();
        com.airbnb.lottie.d.h hVarJ = null;
        while (it.hasNext()) {
            hVarJ = this.f2489f.j((String) it.next());
            if (hVarJ != null) {
                break;
            }
        }
        if (hVarJ != null) {
            D((int) hVarJ.f2283a);
        } else {
            D((int) (d() < 0.0f ? b() : a()));
        }
        this.f2490g.m();
        if (isVisible()) {
            return;
        }
        this.M = 1;
    }

    public final void w() {
        this.f2490g.removeAllListeners();
    }

    public final void x() {
        com.airbnb.lottie.g.e eVar = this.f2490g;
        eVar.removeAllUpdateListeners();
        eVar.addUpdateListener(this.I);
    }

    public final void y() {
        if (this.p == null) {
            this.f2493j.add(new p(this, 1));
            return;
        }
        Z();
        if (ab() || e() == 0) {
            if (isVisible()) {
                this.f2490g.s();
                this.M = 1;
            } else {
                this.M = 3;
            }
        }
        if (ab()) {
            return;
        }
        D((int) (d() < 0.0f ? b() : a()));
        this.f2490g.m();
        if (isVisible()) {
            return;
        }
        this.M = 1;
    }

    public final void z(a aVar) {
        this.H = aVar;
    }
}
