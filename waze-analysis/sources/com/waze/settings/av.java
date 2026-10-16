package com.waze.settings;

import android.animation.ValueAnimator;
import com.waze.ifs.ui.SpringyNestedScrollView;
import com.waze.view.title.TitleBar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class av {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ float f36797a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ba f36798b;

    /* renamed from: c, reason: collision with root package name */
    private final float f36799c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36800d;

    /* renamed from: e, reason: collision with root package name */
    private ValueAnimator f36801e;

    av(float f2, ba baVar) {
        this.f36797a = f2;
        this.f36798b = baVar;
        this.f36799c = f2 * 35.0f;
    }

    public final void a() {
        ba baVar = this.f36798b;
        if (baVar.w || baVar.F == 0.0f) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(baVar.F, 0.0f).setDuration(200L);
        this.f36801e = duration;
        if (duration != null) {
            duration.addListener(new au(this, baVar));
        }
        ValueAnimator valueAnimator = this.f36801e;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new at(baVar, this, 0));
        }
        ValueAnimator valueAnimator2 = this.f36801e;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
        this.f36800d = true;
    }

    public final void b() {
        ba baVar = this.f36798b;
        if (baVar.w) {
            return;
        }
        float f2 = this.f36799c;
        float f3 = baVar.F / f2;
        if (f3 < 0.0f) {
            f3 *= -f3;
        }
        double dAtan = Math.atan(f3) * f2;
        float f4 = baVar.x;
        float f5 = this.f36797a;
        SpringyNestedScrollView springyNestedScrollView = baVar.f36851i;
        SpringyNestedScrollView springyNestedScrollView2 = null;
        if (springyNestedScrollView == null) {
            h.g.b.x.j("scroll");
            springyNestedScrollView = null;
        }
        float scrollY = (f4 + (f5 * 70.0f)) - springyNestedScrollView.getScrollY();
        float f6 = (float) (dAtan / 1.5707963267948966d);
        float fMax = Math.max(scrollY + f6, 0.0f);
        TitleBar titleBar = baVar.f36854l;
        if (titleBar == null) {
            h.g.b.x.j("hoverTitleBar");
            titleBar = null;
        }
        titleBar.setTranslationY(fMax);
        SpringyNestedScrollView springyNestedScrollView3 = baVar.f36851i;
        if (springyNestedScrollView3 == null) {
            h.g.b.x.j("scroll");
            springyNestedScrollView3 = null;
        }
        springyNestedScrollView3.setTranslationY(f6);
        if (baVar.F > f2 + f2) {
            SpringyNestedScrollView springyNestedScrollView4 = baVar.f36851i;
            if (springyNestedScrollView4 == null) {
                h.g.b.x.j("scroll");
                springyNestedScrollView4 = null;
            }
            springyNestedScrollView4.f24478a = false;
            baVar.U(0);
            SpringyNestedScrollView springyNestedScrollView5 = baVar.f36851i;
            if (springyNestedScrollView5 == null) {
                h.g.b.x.j("scroll");
            } else {
                springyNestedScrollView2 = springyNestedScrollView5;
            }
            springyNestedScrollView2.setEnabled(false);
        }
    }

    public final void c(int i2, int i3, int i4) {
        ValueAnimator valueAnimator;
        ba baVar = this.f36798b;
        if (baVar.w) {
            return;
        }
        if (!baVar.y && i4 == 0) {
            baVar.y = true;
            i4 = 0;
        }
        if (baVar.F != 0.0f && i2 < 0) {
            baVar.F -= i2;
            if (baVar.F > 0.0f) {
                baVar.F = 0.0f;
            }
            b();
            return;
        }
        if (i4 != 0) {
            if (i3 >= 0 || i2 + i3 >= this.f36797a * (-25.0f)) {
                return;
            }
            baVar.U(0);
            return;
        }
        if (this.f36800d && (valueAnimator = this.f36801e) != null) {
            valueAnimator.cancel();
            this.f36801e = null;
            this.f36800d = false;
        }
        baVar.F -= i3;
        if (baVar.F > 0.0f) {
            baVar.F -= i2;
            if (baVar.F < 0.0f) {
                baVar.F = 0.0f;
            }
        }
        b();
    }

    public final void d() {
        this.f36800d = false;
    }
}
