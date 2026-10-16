package n1;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.unity3d.services.UnityAdsConstants;
import g5.RunnableC2707d;
import q.C3838t0;

/* renamed from: n1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC3570d implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f40767r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final C3567a f40768a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f40769b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f40770c;

    /* renamed from: d, reason: collision with root package name */
    public RunnableC2707d f40771d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f40772e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f40773f;

    /* renamed from: g, reason: collision with root package name */
    public final int f40774g;

    /* renamed from: h, reason: collision with root package name */
    public final int f40775h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f40776i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f40777j;
    public final float[] k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f40778l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f40779m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f40780n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f40781o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f40782p;

    /* renamed from: q, reason: collision with root package name */
    public final C3838t0 f40783q;

    public ViewOnTouchListenerC3570d(C3838t0 c3838t0) {
        C3567a c3567a = new C3567a();
        c3567a.f40762e = Long.MIN_VALUE;
        c3567a.f40764g = -1L;
        c3567a.f40763f = 0L;
        this.f40768a = c3567a;
        this.f40769b = new AccelerateInterpolator();
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.f40772e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f40773f = fArr2;
        float[] fArr3 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.f40776i = fArr3;
        float[] fArr4 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.f40777j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.k = fArr5;
        this.f40770c = c3838t0;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f40774g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f40775h = f40767r;
        c3567a.f40758a = 500;
        c3567a.f40759b = 500;
        this.f40783q = c3838t0;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f40772e
            r0 = r0[r4]
            float[] r1 = r3.f40773f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f40769b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f40776i
            r0 = r0[r4]
            float[] r1 = r3.f40777j
            r1 = r1[r4]
            float[] r2 = r3.k
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.ViewOnTouchListenerC3570d.a(int, float, float, float):float");
    }

    public final float c(float f10, float f11) {
        if (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int i5 = this.f40774g;
            if (i5 == 0 || i5 == 1) {
                if (f10 < f11) {
                    if (f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.f40781o && i5 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i5 == 2 && f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return f10 / (-f11);
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void d() {
        int i5 = 0;
        if (this.f40779m) {
            this.f40781o = false;
            return;
        }
        C3567a c3567a = this.f40768a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i10 = (int) (jCurrentAnimationTimeMillis - c3567a.f40762e);
        int i11 = c3567a.f40759b;
        if (i10 > i11) {
            i5 = i11;
        } else if (i10 >= 0) {
            i5 = i10;
        }
        c3567a.f40766i = i5;
        c3567a.f40765h = c3567a.a(jCurrentAnimationTimeMillis);
        c3567a.f40764g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        C3838t0 c3838t0;
        int count;
        C3567a c3567a = this.f40768a;
        float f10 = c3567a.f40761d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(c3567a.f40760c);
        if (iAbs != 0 && (count = (c3838t0 = this.f40783q).getCount()) != 0) {
            int childCount = c3838t0.getChildCount();
            int firstVisiblePosition = c3838t0.getFirstVisiblePosition();
            int i5 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c3838t0.getChildAt(0).getTop() >= 0)) : !(i5 >= count && c3838t0.getChildAt(childCount - 1).getBottom() <= c3838t0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r1 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 3
            boolean r1 = r7.f40782p
            r2 = 0
            if (r1 != 0) goto L8
            goto L7c
        L8:
            int r1 = r9.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            r4 = 2
            if (r1 == r4) goto L1f
            if (r1 == r0) goto L17
            goto L7c
        L17:
            r7.d()
            return r2
        L1b:
            r7.f40780n = r3
            r7.f40778l = r2
        L1f:
            float r1 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.widget.ListView r5 = r7.f40770c
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r1 = r7.a(r2, r1, r4, r6)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r8 = r7.a(r3, r9, r8, r4)
            n1.a r9 = r7.f40768a
            r9.f40760c = r1
            r9.f40761d = r8
            boolean r8 = r7.f40781o
            if (r8 != 0) goto L7c
            boolean r8 = r7.e()
            if (r8 == 0) goto L7c
            g5.d r8 = r7.f40771d
            if (r8 != 0) goto L60
            g5.d r8 = new g5.d
            r8.<init>(r7, r0)
            r7.f40771d = r8
        L60:
            r7.f40781o = r3
            r7.f40779m = r3
            boolean r8 = r7.f40778l
            if (r8 != 0) goto L75
            int r8 = r7.f40775h
            if (r8 <= 0) goto L75
            g5.d r9 = r7.f40771d
            long r0 = (long) r8
            java.util.WeakHashMap r8 = k1.S.f38779a
            r5.postOnAnimationDelayed(r9, r0)
            goto L7a
        L75:
            g5.d r8 = r7.f40771d
            r8.run()
        L7a:
            r7.f40778l = r3
        L7c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.ViewOnTouchListenerC3570d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
