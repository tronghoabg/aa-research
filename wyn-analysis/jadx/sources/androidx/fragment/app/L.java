package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import k1.ViewTreeObserverOnPreDrawListenerC3132t;

/* loaded from: classes.dex */
public final class L extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f18326a;

    /* renamed from: b, reason: collision with root package name */
    public final View f18327b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18328c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18329d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18330e;

    public L(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f18330e = true;
        this.f18326a = viewGroup;
        this.f18327b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j8, Transformation transformation) {
        this.f18330e = true;
        if (this.f18328c) {
            return !this.f18329d;
        }
        if (!super.getTransformation(j8, transformation)) {
            this.f18328c = true;
            ViewTreeObserverOnPreDrawListenerC3132t.a(this.f18326a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f18328c;
        ViewGroup viewGroup = this.f18326a;
        if (z2 || !this.f18330e) {
            viewGroup.endViewTransition(this.f18327b);
            this.f18329d = true;
        } else {
            this.f18330e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j8, Transformation transformation, float f10) {
        this.f18330e = true;
        if (this.f18328c) {
            return !this.f18329d;
        }
        if (!super.getTransformation(j8, transformation, f10)) {
            this.f18328c = true;
            ViewTreeObserverOnPreDrawListenerC3132t.a(this.f18326a, this);
        }
        return true;
    }
}
