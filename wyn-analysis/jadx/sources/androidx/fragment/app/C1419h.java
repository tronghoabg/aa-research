package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1419h extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public final C1417f f18449c;

    /* renamed from: d, reason: collision with root package name */
    public AnimatorSet f18450d;

    public C1419h(C1417f c1417f) {
        this.f18449c = c1417f;
    }

    @Override // androidx.fragment.app.z0
    public final void b(ViewGroup container) {
        AbstractC3340k.e(container, "container");
        AnimatorSet animatorSet = this.f18450d;
        A0 a02 = this.f18449c.f18473a;
        if (animatorSet == null) {
            a02.c(this);
            return;
        }
        if (!a02.f18284g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1421j.f18459a.a(animatorSet);
        }
        if (e0.J(2)) {
            StringBuilder sb2 = new StringBuilder("Animator from operation ");
            sb2.append(a02);
            sb2.append(" has been canceled");
            sb2.append(a02.f18284g ? " with seeking." : ".");
            sb2.append(' ');
            Log.v("FragmentManager", sb2.toString());
        }
    }

    @Override // androidx.fragment.app.z0
    public final void c(ViewGroup container) {
        AbstractC3340k.e(container, "container");
        A0 a02 = this.f18449c.f18473a;
        AnimatorSet animatorSet = this.f18450d;
        if (animatorSet == null) {
            a02.c(this);
            return;
        }
        animatorSet.start();
        if (e0.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + a02 + " has started.");
        }
    }

    @Override // androidx.fragment.app.z0
    public final void d(androidx.activity.b backEvent, ViewGroup container) {
        AbstractC3340k.e(backEvent, "backEvent");
        AbstractC3340k.e(container, "container");
        A0 a02 = this.f18449c.f18473a;
        AnimatorSet animatorSet = this.f18450d;
        if (animatorSet == null) {
            a02.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !a02.f18280c.mTransitioning) {
            return;
        }
        if (e0.J(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + a02);
        }
        long jA = C1420i.f18458a.a(animatorSet);
        long j8 = (long) (backEvent.f17699c * jA);
        if (j8 == 0) {
            j8 = 1;
        }
        if (j8 == jA) {
            j8 = jA - 1;
        }
        if (e0.J(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j8 + " for Animator " + animatorSet + " on operation " + a02);
        }
        C1421j.f18459a.b(animatorSet, j8);
    }

    @Override // androidx.fragment.app.z0
    public final void e(ViewGroup container) throws Resources.NotFoundException {
        C1419h c1419h;
        AbstractC3340k.e(container, "container");
        C1417f c1417f = this.f18449c;
        if (c1417f.a()) {
            return;
        }
        Context context = container.getContext();
        AbstractC3340k.d(context, "context");
        K kB = c1417f.b(context);
        this.f18450d = kB != null ? (AnimatorSet) kB.f18325b : null;
        A0 a02 = c1417f.f18473a;
        F f10 = a02.f18280c;
        boolean z2 = a02.f18278a == 3;
        View view = f10.mView;
        container.startViewTransition(view);
        AnimatorSet animatorSet = this.f18450d;
        if (animatorSet != null) {
            c1419h = this;
            animatorSet.addListener(new C1418g(container, view, z2, a02, c1419h));
        } else {
            c1419h = this;
        }
        AnimatorSet animatorSet2 = c1419h.f18450d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
