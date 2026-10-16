package s6;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: A, reason: collision with root package name */
    public boolean f45282A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f45283B;

    /* renamed from: a, reason: collision with root package name */
    public final t f45285a;

    /* renamed from: b, reason: collision with root package name */
    public final View f45286b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f45287c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f45288d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f45289e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f45290f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f45291g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewGroup f45292h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewGroup f45293i;

    /* renamed from: j, reason: collision with root package name */
    public final View f45294j;
    public final View k;

    /* renamed from: l, reason: collision with root package name */
    public final AnimatorSet f45295l;

    /* renamed from: m, reason: collision with root package name */
    public final AnimatorSet f45296m;

    /* renamed from: n, reason: collision with root package name */
    public final AnimatorSet f45297n;

    /* renamed from: o, reason: collision with root package name */
    public final AnimatorSet f45298o;

    /* renamed from: p, reason: collision with root package name */
    public final AnimatorSet f45299p;

    /* renamed from: q, reason: collision with root package name */
    public final ValueAnimator f45300q;

    /* renamed from: r, reason: collision with root package name */
    public final ValueAnimator f45301r;

    /* renamed from: s, reason: collision with root package name */
    public final u f45302s;

    /* renamed from: t, reason: collision with root package name */
    public final u f45303t;

    /* renamed from: x, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.H f45307x;

    /* renamed from: u, reason: collision with root package name */
    public final u f45304u = new u(this, 4);

    /* renamed from: v, reason: collision with root package name */
    public final u f45305v = new u(this, 5);

    /* renamed from: w, reason: collision with root package name */
    public final u f45306w = new u(this, 6);

    /* renamed from: C, reason: collision with root package name */
    public boolean f45284C = true;

    /* renamed from: z, reason: collision with root package name */
    public int f45309z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f45308y = new ArrayList();

    public y(t tVar) throws Resources.NotFoundException {
        int i5 = 14;
        this.f45285a = tVar;
        final int i10 = 0;
        this.f45302s = new u(this, i10);
        final int i11 = 3;
        this.f45303t = new u(this, i11);
        final int i12 = 2;
        this.f45307x = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.H(this, i12);
        final int i13 = 1;
        this.f45286b = tVar.findViewById(R.id.exo_controls_background);
        this.f45287c = (ViewGroup) tVar.findViewById(R.id.exo_center_controls);
        this.f45289e = (ViewGroup) tVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) tVar.findViewById(R.id.exo_bottom_bar);
        this.f45288d = viewGroup;
        this.f45293i = (ViewGroup) tVar.findViewById(R.id.exo_time);
        View viewFindViewById = tVar.findViewById(R.id.exo_progress);
        this.f45294j = viewFindViewById;
        this.f45290f = (ViewGroup) tVar.findViewById(R.id.exo_basic_controls);
        this.f45291g = (ViewGroup) tVar.findViewById(R.id.exo_extra_controls);
        this.f45292h = (ViewGroup) tVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = tVar.findViewById(R.id.exo_overflow_show);
        this.k = viewFindViewById2;
        View viewFindViewById3 = tVar.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new Lb.h(this, i5));
            viewFindViewById3.setOnClickListener(new Lb.h(this, i5));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: s6.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f45276b;

            {
                this.f45276b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        y yVar = this.f45276b;
                        yVar.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = yVar.f45286b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = yVar.f45287c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = yVar.f45289e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        y yVar2 = this.f45276b;
                        yVar2.getClass();
                        yVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        y yVar3 = this.f45276b;
                        yVar3.getClass();
                        yVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        y yVar4 = this.f45276b;
                        yVar4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = yVar4.f45286b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = yVar4.f45287c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = yVar4.f45289e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new w(this, i10));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: s6.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f45276b;

            {
                this.f45276b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        y yVar = this.f45276b;
                        yVar.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = yVar.f45286b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = yVar.f45287c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = yVar.f45289e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        y yVar2 = this.f45276b;
                        yVar2.getClass();
                        yVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        y yVar3 = this.f45276b;
                        yVar3.getClass();
                        yVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        y yVar4 = this.f45276b;
                        yVar4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = yVar4.f45286b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = yVar4.f45287c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = yVar4.f45289e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new w(this, i13));
        Resources resources = tVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f45295l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new x(this, tVar, i10));
        animatorSet.play(valueAnimatorOfFloat).with(d(viewFindViewById, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dimension)).with(d(viewGroup, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f45296m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new x(this, tVar, i13));
        animatorSet2.play(d(viewFindViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f45297n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new x(this, tVar, i12));
        animatorSet3.play(valueAnimatorOfFloat).with(d(viewFindViewById, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dimension2)).with(d(viewGroup, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f45298o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new w(this, i12));
        animatorSet4.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).with(d(viewGroup, dimension, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f45299p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new w(this, 3));
        animatorSet5.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).with(d(viewGroup, dimension2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.f45300q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: s6.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f45276b;

            {
                this.f45276b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i13) {
                    case 0:
                        y yVar = this.f45276b;
                        yVar.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = yVar.f45286b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = yVar.f45287c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = yVar.f45289e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        y yVar2 = this.f45276b;
                        yVar2.getClass();
                        yVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        y yVar3 = this.f45276b;
                        yVar3.getClass();
                        yVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        y yVar4 = this.f45276b;
                        yVar4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = yVar4.f45286b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = yVar4.f45287c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = yVar4.f45289e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat3.addListener(new w(this, 4));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f45301r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: s6.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f45276b;

            {
                this.f45276b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        y yVar = this.f45276b;
                        yVar.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = yVar.f45286b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = yVar.f45287c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = yVar.f45289e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        y yVar2 = this.f45276b;
                        yVar2.getClass();
                        yVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        y yVar3 = this.f45276b;
                        yVar3.getClass();
                        yVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        y yVar4 = this.f45276b;
                        yVar4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = yVar4.f45286b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = yVar4.f45287c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = yVar4.f45289e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat4.addListener(new w(this, 5));
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator d(View view, float f10, float f11) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    public static boolean j(View view) {
        int id2 = view.getId();
        return id2 == R.id.exo_bottom_bar || id2 == R.id.exo_prev || id2 == R.id.exo_next || id2 == R.id.exo_rew || id2 == R.id.exo_rew_with_amount || id2 == R.id.exo_ffwd || id2 == R.id.exo_ffwd_with_amount;
    }

    public final void a(float f10) {
        ViewGroup viewGroup = this.f45292h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f10) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f45293i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup3 = this.f45290f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f10);
        }
    }

    public final boolean b(View view) {
        return view != null && this.f45308y.contains(view);
    }

    public final void e(Runnable runnable, long j8) {
        if (j8 >= 0) {
            this.f45285a.postDelayed(runnable, j8);
        }
    }

    public final void f() {
        u uVar = this.f45306w;
        t tVar = this.f45285a;
        tVar.removeCallbacks(uVar);
        tVar.removeCallbacks(this.f45303t);
        tVar.removeCallbacks(this.f45305v);
        tVar.removeCallbacks(this.f45304u);
    }

    public final void g() {
        if (this.f45309z == 3) {
            return;
        }
        f();
        int showTimeoutMs = this.f45285a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f45284C) {
                e(this.f45306w, showTimeoutMs);
            } else if (this.f45309z == 1) {
                e(this.f45304u, 2000L);
            } else {
                e(this.f45305v, showTimeoutMs);
            }
        }
    }

    public final void h(View view, boolean z2) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f45308y;
        if (!z2) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f45282A && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i5) {
        int i10 = this.f45309z;
        this.f45309z = i5;
        t tVar = this.f45285a;
        if (i5 == 2) {
            tVar.setVisibility(8);
        } else if (i10 == 2) {
            tVar.setVisibility(0);
        }
        if (i10 != i5) {
            Iterator it = tVar.f45232d.iterator();
            while (it.hasNext()) {
                s sVar = (s) it.next();
                tVar.getVisibility();
                ((z) sVar).f45312c.j();
            }
        }
    }

    public final void k() {
        if (!this.f45284C) {
            i(0);
            g();
            return;
        }
        int i5 = this.f45309z;
        if (i5 == 1) {
            this.f45298o.start();
        } else if (i5 == 2) {
            this.f45299p.start();
        } else if (i5 == 3) {
            this.f45283B = true;
        } else if (i5 == 4) {
            return;
        }
        g();
    }
}
