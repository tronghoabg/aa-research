package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1478p extends Q implements Z {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f18930C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f18931D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f18932A;

    /* renamed from: B, reason: collision with root package name */
    public final RunnableC1474l f18933B;

    /* renamed from: a, reason: collision with root package name */
    public final int f18934a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18935b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f18936c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f18937d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18938e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18939f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f18940g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f18941h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18942i;

    /* renamed from: j, reason: collision with root package name */
    public final int f18943j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f18944l;

    /* renamed from: m, reason: collision with root package name */
    public float f18945m;

    /* renamed from: n, reason: collision with root package name */
    public int f18946n;

    /* renamed from: o, reason: collision with root package name */
    public int f18947o;

    /* renamed from: p, reason: collision with root package name */
    public float f18948p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f18951s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f18958z;

    /* renamed from: q, reason: collision with root package name */
    public int f18949q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f18950r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18952t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f18953u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f18954v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f18955w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f18956x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f18957y = new int[2];

    public C1478p(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i5, int i10, int i11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.f18958z = valueAnimatorOfFloat;
        this.f18932A = 0;
        RunnableC1474l runnableC1474l = new RunnableC1474l(this, 0);
        this.f18933B = runnableC1474l;
        C1475m c1475m = new C1475m(this);
        this.f18936c = stateListDrawable;
        this.f18937d = drawable;
        this.f18940g = stateListDrawable2;
        this.f18941h = drawable2;
        this.f18938e = Math.max(i5, stateListDrawable.getIntrinsicWidth());
        this.f18939f = Math.max(i5, drawable.getIntrinsicWidth());
        this.f18942i = Math.max(i5, stateListDrawable2.getIntrinsicWidth());
        this.f18943j = Math.max(i5, drawable2.getIntrinsicWidth());
        this.f18934a = i10;
        this.f18935b = i11;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C1476n(this));
        valueAnimatorOfFloat.addUpdateListener(new C1477o(this));
        RecyclerView recyclerView2 = this.f18951s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f18951s.removeOnItemTouchListener(this);
            this.f18951s.removeOnScrollListener(c1475m);
            this.f18951s.removeCallbacks(runnableC1474l);
        }
        this.f18951s = recyclerView;
        recyclerView.addItemDecoration(this);
        this.f18951s.addOnItemTouchListener(this);
        this.f18951s.addOnScrollListener(c1475m);
    }

    public static int c(float f10, float f11, int[] iArr, int i5, int i10, int i11) {
        int i12 = iArr[1] - iArr[0];
        if (i12 != 0) {
            int i13 = i5 - i11;
            int i14 = (int) (((f11 - f10) / i12) * i13);
            int i15 = i10 + i14;
            if (i15 < i13 && i15 >= 0) {
                return i14;
            }
        }
        return 0;
    }

    public final boolean a(float f10, float f11) {
        if (f11 < this.f18950r - this.f18942i) {
            return false;
        }
        int i5 = this.f18947o;
        int i10 = this.f18946n;
        return f10 >= ((float) (i5 - (i10 / 2))) && f10 <= ((float) ((i10 / 2) + i5));
    }

    public final boolean b(float f10, float f11) {
        RecyclerView recyclerView = this.f18951s;
        WeakHashMap weakHashMap = k1.S.f38779a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i5 = this.f18938e;
        if (!z2 ? f10 >= this.f18949q - i5 : f10 <= i5) {
            int i10 = this.f18944l;
            int i11 = this.k / 2;
            if (f11 >= i10 - i11 && f11 <= i11 + i10) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i5) {
        RunnableC1474l runnableC1474l = this.f18933B;
        StateListDrawable stateListDrawable = this.f18936c;
        if (i5 == 2 && this.f18954v != 2) {
            stateListDrawable.setState(f18930C);
            this.f18951s.removeCallbacks(runnableC1474l);
        }
        if (i5 == 0) {
            this.f18951s.invalidate();
        } else {
            e();
        }
        if (this.f18954v == 2 && i5 != 2) {
            stateListDrawable.setState(f18931D);
            this.f18951s.removeCallbacks(runnableC1474l);
            this.f18951s.postDelayed(runnableC1474l, 1200);
        } else if (i5 == 1) {
            this.f18951s.removeCallbacks(runnableC1474l);
            this.f18951s.postDelayed(runnableC1474l, TTAdConstant.STYLE_SIZE_RADIO_3_2);
        }
        this.f18954v = i5;
    }

    public final void e() {
        int i5 = this.f18932A;
        ValueAnimator valueAnimator = this.f18958z;
        if (i5 != 0) {
            if (i5 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f18932A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, j0 j0Var) {
        int i5 = this.f18949q;
        RecyclerView recyclerView2 = this.f18951s;
        if (i5 != recyclerView2.getWidth() || this.f18950r != recyclerView2.getHeight()) {
            this.f18949q = recyclerView2.getWidth();
            this.f18950r = recyclerView2.getHeight();
            d(0);
            return;
        }
        if (this.f18932A != 0) {
            if (this.f18952t) {
                int i10 = this.f18949q;
                int i11 = this.f18938e;
                int i12 = i10 - i11;
                int i13 = this.f18944l;
                int i14 = this.k;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable = this.f18936c;
                stateListDrawable.setBounds(0, 0, i11, i14);
                int i16 = this.f18950r;
                int i17 = this.f18939f;
                Drawable drawable = this.f18937d;
                drawable.setBounds(0, 0, i17, i16);
                WeakHashMap weakHashMap = k1.S.f38779a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i11, i15);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i11, -i15);
                } else {
                    canvas.translate(i12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    drawable.draw(canvas);
                    canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i15);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i12, -i15);
                }
            }
            if (this.f18953u) {
                int i18 = this.f18950r;
                int i19 = this.f18942i;
                int i20 = i18 - i19;
                int i21 = this.f18947o;
                int i22 = this.f18946n;
                int i23 = i21 - (i22 / 2);
                StateListDrawable stateListDrawable2 = this.f18940g;
                stateListDrawable2.setBounds(0, 0, i22, i19);
                int i24 = this.f18949q;
                int i25 = this.f18943j;
                Drawable drawable2 = this.f18941h;
                drawable2.setBounds(0, 0, i24, i25);
                canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i20);
                drawable2.draw(canvas);
                canvas.translate(i23, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i23, -i20);
            }
        }
    }
}
