package android.support.v4.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.view.OneShotPreDrawListener;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ax extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f144a;

    /* renamed from: b, reason: collision with root package name */
    private final View f145b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f146c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f147d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f148e;

    ax(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f148e = true;
        this.f144a = viewGroup;
        this.f145b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f148e = true;
        if (this.f146c) {
            return !this.f147d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f146c = true;
            OneShotPreDrawListener.add(this.f144a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f146c || !this.f148e) {
            this.f144a.endViewTransition(this.f145b);
            this.f147d = true;
        } else {
            this.f148e = false;
            this.f144a.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f148e = true;
        if (this.f146c) {
            return !this.f147d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f146c = true;
            OneShotPreDrawListener.add(this.f144a, this);
        }
        return true;
    }
}
