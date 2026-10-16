package com.waze.search.v2;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fr extends com.waze.design_components.a.c {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f36540b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f36541c;

    /* renamed from: d, reason: collision with root package name */
    private ViewPropertyAnimator f36542d;

    /* renamed from: e, reason: collision with root package name */
    private int f36543e;

    public /* synthetic */ fr(boolean z, Context context, View view, h.g.a.l lVar) {
        super(context, view, lVar);
        this.f36541c = z;
    }

    static final void l(fr frVar) {
        frVar.setVisibility(frVar.f36543e);
    }

    public final void j(float f2, Runnable runnable) {
        if (getVisibility() == 0 && this.f36543e == 0) {
            return;
        }
        this.f36543e = 0;
        setVisibility(0);
        setY(f2);
        if (runnable != null) {
            runnable.run();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f36542d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = animate().translationY(0.0f).setDuration(700L).setInterpolator(new PathInterpolator(0.2f, 0.7f, -0.01f, 1.0f));
        interpolator.start();
        this.f36542d = interpolator;
    }

    public final void k(float f2) {
        if (getVisibility() == 8 && this.f36543e == 8) {
            return;
        }
        this.f36543e = 8;
        ViewPropertyAnimator viewPropertyAnimator = this.f36542d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = animate().translationY(f2).setDuration(500L).setInterpolator(new PathInterpolator(0.9f, 0.01f, 0.99f, 0.75f)).withEndAction(new Runnable() { // from class: com.waze.search.v2.fp
            @Override // java.lang.Runnable
            public final void run() {
                fr.l(this.f36535a);
            }
        });
        viewPropertyAnimatorWithEndAction.start();
        this.f36542d = viewPropertyAnimatorWithEndAction;
    }

    public final boolean m() {
        return this.f36541c;
    }
}
