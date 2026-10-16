package androidx.fragment.app;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1416e extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public final C1417f f18393c;

    public C1416e(C1417f c1417f) {
        this.f18393c = c1417f;
    }

    @Override // androidx.fragment.app.z0
    public final void b(ViewGroup container) {
        AbstractC3340k.e(container, "container");
        C1417f c1417f = this.f18393c;
        A0 a02 = c1417f.f18473a;
        View view = a02.f18280c.mView;
        view.clearAnimation();
        container.endViewTransition(view);
        c1417f.f18473a.c(this);
        if (e0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + a02 + " has been cancelled.");
        }
    }

    @Override // androidx.fragment.app.z0
    public final void c(ViewGroup container) throws Resources.NotFoundException {
        AbstractC3340k.e(container, "container");
        C1417f c1417f = this.f18393c;
        boolean zA = c1417f.a();
        A0 a02 = c1417f.f18473a;
        if (zA) {
            a02.c(this);
            return;
        }
        Context context = container.getContext();
        View view = a02.f18280c.mView;
        AbstractC3340k.d(context, "context");
        K kB = c1417f.b(context);
        if (kB == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) kB.f18324a;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (a02.f18278a != 1) {
            view.startAnimation(animation);
            a02.c(this);
            return;
        }
        container.startViewTransition(view);
        L l10 = new L(animation, container, view);
        l10.setAnimationListener(new AnimationAnimationListenerC1415d(a02, container, view, this));
        view.startAnimation(l10);
        if (e0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + a02 + " has started.");
        }
    }
}
