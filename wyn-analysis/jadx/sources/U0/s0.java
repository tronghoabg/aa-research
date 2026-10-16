package u0;

import ac.C1346a;
import ad.C1355I;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import d0.C2383b;
import d0.C2384c;
import e0.C2447J;
import e0.C2450b;
import e0.InterfaceC2442E;
import e0.InterfaceC2463o;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import t0.C4068p;
import t0.InterfaceC4042G;

/* loaded from: classes.dex */
public final class s0 extends View implements InterfaceC4042G {

    /* renamed from: m, reason: collision with root package name */
    public static final q0 f46359m = new q0();

    /* renamed from: n, reason: collision with root package name */
    public static Method f46360n;

    /* renamed from: o, reason: collision with root package name */
    public static Field f46361o;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f46362p;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f46363q;

    /* renamed from: a, reason: collision with root package name */
    public final C4188n f46364a;

    /* renamed from: b, reason: collision with root package name */
    public final S f46365b;

    /* renamed from: c, reason: collision with root package name */
    public t0.y f46366c;

    /* renamed from: d, reason: collision with root package name */
    public C4068p f46367d;

    /* renamed from: e, reason: collision with root package name */
    public final C4167c0 f46368e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46369f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f46370g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f46371h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f46372i;

    /* renamed from: j, reason: collision with root package name */
    public final C1346a f46373j;
    public final C4163a0 k;

    /* renamed from: l, reason: collision with root package name */
    public long f46374l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(C4188n c4188n, S container, t0.y yVar, C4068p invalidateParentLayer) {
        super(c4188n.getContext());
        AbstractC3340k.e(container, "container");
        AbstractC3340k.e(invalidateParentLayer, "invalidateParentLayer");
        this.f46364a = c4188n;
        this.f46365b = container;
        this.f46366c = yVar;
        this.f46367d = invalidateParentLayer;
        this.f46368e = new C4167c0(c4188n.getDensity());
        this.f46373j = new C1346a(4);
        this.k = new C4163a0(J.f46127l);
        this.f46374l = C2447J.f34353b;
        setWillNotDraw(false);
        setId(View.generateViewId());
        container.addView(this);
    }

    private final e0.x getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        C4167c0 c4167c0 = this.f46368e;
        if (!c4167c0.f46211i) {
            return null;
        }
        c4167c0.e();
        return c4167c0.f46209g;
    }

    private final void setInvalidated(boolean z2) {
        if (z2 != this.f46371h) {
            this.f46371h = z2;
            this.f46364a.l(this, z2);
        }
    }

    @Override // t0.InterfaceC4042G
    public final void a(InterfaceC2463o canvas) {
        AbstractC3340k.e(canvas, "canvas");
        boolean z2 = getElevation() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f46372i = z2;
        if (z2) {
            canvas.i();
        }
        this.f46365b.a(canvas, this, getDrawingTime());
        if (this.f46372i) {
            canvas.o();
        }
    }

    @Override // t0.InterfaceC4042G
    public final void b(float f10, float f11, float f12, float f13, float f14, long j8, InterfaceC2442E shape, boolean z2, long j10, long j11, L0.i layoutDirection, L0.b density) {
        C4068p c4068p;
        AbstractC3340k.e(shape, "shape");
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        AbstractC3340k.e(density, "density");
        this.f46374l = j8;
        setScaleX(f10);
        setScaleY(f11);
        setAlpha(f12);
        setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        setElevation(f13);
        setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        setRotationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        setRotationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        long j12 = this.f46374l;
        int i5 = C2447J.f34354c;
        setPivotX(Float.intBitsToFloat((int) (j12 >> 32)) * getWidth());
        setPivotY(Float.intBitsToFloat((int) (this.f46374l & 4294967295L)) * getHeight());
        setCameraDistancePx(f14);
        C1355I c1355i = e0.z.f34394a;
        this.f46369f = z2 && shape == c1355i;
        j();
        boolean z10 = getManualClipPath() != null;
        setClipToOutline(z2 && shape != c1355i);
        boolean zD = this.f46368e.d(shape, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, density);
        setOutlineProvider(this.f46368e.b() != null ? f46359m : null);
        boolean z11 = getManualClipPath() != null;
        if (z10 != z11 || (z11 && zD)) {
            invalidate();
        }
        if (!this.f46372i && getElevation() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (c4068p = this.f46367d) != null) {
            c4068p.invoke();
        }
        this.k.c();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            u0 u0Var = u0.f46377a;
            u0Var.a(this, e0.z.s(j10));
            u0Var.b(this, e0.z.s(j11));
        }
        if (i10 >= 31) {
            v0.f46379a.a(this, null);
        }
    }

    @Override // t0.InterfaceC4042G
    public final long c(long j8, boolean z2) {
        C4163a0 c4163a0 = this.k;
        if (!z2) {
            return e0.z.m(j8, c4163a0.b(this));
        }
        float[] fArrA = c4163a0.a(this);
        return fArrA != null ? e0.z.m(j8, fArrA) : C2384c.f33932c;
    }

    @Override // t0.InterfaceC4042G
    public final void d(long j8) {
        int i5 = (int) (j8 >> 32);
        int i10 = (int) (j8 & 4294967295L);
        if (i5 == getWidth() && i10 == getHeight()) {
            return;
        }
        long j10 = this.f46374l;
        int i11 = C2447J.f34354c;
        float f10 = i5;
        setPivotX(Float.intBitsToFloat((int) (j10 >> 32)) * f10);
        float f11 = i10;
        setPivotY(Float.intBitsToFloat((int) (4294967295L & this.f46374l)) * f11);
        long jI = com.moloco.sdk.internal.publisher.H.I(f10, f11);
        C4167c0 c4167c0 = this.f46368e;
        if (!d0.f.a(c4167c0.f46206d, jI)) {
            c4167c0.f46206d = jI;
            c4167c0.f46210h = true;
        }
        setOutlineProvider(c4167c0.b() != null ? f46359m : null);
        layout(getLeft(), getTop(), getLeft() + i5, getTop() + i10);
        j();
        this.k.c();
    }

    @Override // t0.InterfaceC4042G
    public final void destroy() {
        setInvalidated(false);
        C4188n c4188n = this.f46364a;
        c4188n.f46317u = true;
        this.f46366c = null;
        this.f46367d = null;
        c4188n.q(this);
        this.f46365b.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC3340k.e(canvas, "canvas");
        boolean z2 = false;
        setInvalidated(false);
        C1346a c1346a = this.f46373j;
        C2450b c2450b = (C2450b) c1346a.f17489b;
        Canvas canvas2 = c2450b.f34357a;
        c2450b.f34357a = canvas;
        e0.x manualClipPath = getManualClipPath();
        C2450b c2450b2 = (C2450b) c1346a.f17489b;
        if (manualClipPath != null || !canvas.isHardwareAccelerated()) {
            c2450b2.m();
            this.f46368e.a(c2450b2);
            z2 = true;
        }
        t0.y yVar = this.f46366c;
        if (yVar != null) {
            yVar.invoke(c2450b2);
        }
        if (z2) {
            c2450b2.restore();
        }
        c2450b2.getClass();
        AbstractC3340k.e(canvas2, "<set-?>");
        c2450b2.f34357a = canvas2;
    }

    @Override // t0.InterfaceC4042G
    public final boolean e(long j8) {
        float fB = C2384c.b(j8);
        float fC = C2384c.c(j8);
        if (this.f46369f) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= fB && fB < ((float) getWidth()) && UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= fC && fC < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f46368e.c(j8);
        }
        return true;
    }

    @Override // t0.InterfaceC4042G
    public final void f(C2383b c2383b, boolean z2) {
        C4163a0 c4163a0 = this.k;
        if (!z2) {
            e0.z.n(c4163a0.b(this), c2383b);
            return;
        }
        float[] fArrA = c4163a0.a(this);
        if (fArrA != null) {
            e0.z.n(fArrA, c2383b);
            return;
        }
        c2383b.f33927a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        c2383b.f33928b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        c2383b.f33929c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        c2383b.f33930d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // t0.InterfaceC4042G
    public final void g(long j8) {
        int i5 = L0.g.f6803c;
        int i10 = (int) (j8 >> 32);
        int left = getLeft();
        C4163a0 c4163a0 = this.k;
        if (i10 != left) {
            offsetLeftAndRight(i10 - getLeft());
            c4163a0.c();
        }
        int i11 = (int) (j8 & 4294967295L);
        if (i11 != getTop()) {
            offsetTopAndBottom(i11 - getTop());
            c4163a0.c();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @NotNull
    public final S getContainer() {
        return this.f46365b;
    }

    public long getLayerId() {
        return getId();
    }

    @NotNull
    public final C4188n getOwnerView() {
        return this.f46364a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return r0.a(this.f46364a);
        }
        return -1L;
    }

    @Override // t0.InterfaceC4042G
    public final void h() {
        if (!this.f46371h || f46363q) {
            return;
        }
        setInvalidated(false);
        Q.k(this);
    }

    @Override // t0.InterfaceC4042G
    public final void i(t0.y yVar, C4068p invalidateParentLayer) {
        AbstractC3340k.e(invalidateParentLayer, "invalidateParentLayer");
        this.f46365b.addView(this);
        this.f46369f = false;
        this.f46372i = false;
        this.f46374l = C2447J.f34353b;
        this.f46366c = yVar;
        this.f46367d = invalidateParentLayer;
    }

    @Override // android.view.View, t0.InterfaceC4042G
    public final void invalidate() {
        if (this.f46371h) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f46364a.invalidate();
    }

    public final void j() {
        Rect rect;
        if (this.f46369f) {
            Rect rect2 = this.f46370g;
            if (rect2 == null) {
                this.f46370g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                AbstractC3340k.b(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f46370g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
    }
}
