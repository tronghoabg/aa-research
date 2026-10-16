package defpackage;

import android.view.animation.Animation;
import com.google.android.apps.auto.sdk.ui.PagedListView;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class qgw implements Animation.AnimationListener {
    private static final yph e = yph.c("ADU.MenuAnimationContro");
    final Animation a;
    final Animation b;
    final Animation c;
    final Queue d = new LinkedList();
    private final PagedListView f;
    private Runnable g;
    private Animation h;

    public qgw(PagedListView pagedListView, Animation animation, Animation animation2, Animation animation3) {
        this.f = pagedListView;
        this.b = animation;
        this.a = animation2;
        this.c = animation3;
        animation2.setAnimationListener(this);
        animation.setAnimationListener(this);
        animation3.setAnimationListener(this);
    }

    private final void e(Animation animation) {
        yph yphVar = e;
        ((ype) yphVar.l().ai((char) 7220)).y("enqueueAnimation %s", animation);
        Queue queue = this.d;
        if (queue.contains(animation)) {
            ((ype) ((ype) ((ype) yphVar.h()).p(new IllegalArgumentException())).ai((char) 7221)).y("enqueuing an existing animation: %s", animation);
        } else {
            queue.add(animation);
            if (c()) {
                return;
            }
            f();
        }
    }

    private final void f() {
        Animation animation = (Animation) this.d.poll();
        if (animation == null) {
            this.h = null;
            return;
        }
        this.h = animation;
        PagedListView pagedListView = this.f;
        if (pagedListView.getVisibility() == 0) {
            pagedListView.startAnimation(animation);
        } else {
            onAnimationStart(animation);
            onAnimationEnd(animation);
        }
    }

    public final void a(Runnable runnable) {
        ((ype) e.l().ai((char) 7222)).u("enqueueBackAnimation");
        this.g = runnable;
        e(this.c);
    }

    public final void b(Runnable runnable) {
        ((ype) e.l().ai((char) 7224)).u("enqueueExitAnimation");
        this.g = runnable;
        e(this.a);
    }

    public final boolean c() {
        return this.h != null;
    }

    public final void d() {
        ((ype) e.l().ai((char) 7223)).u("enqueueEnterAnimation");
        e(this.b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Runnable runnable;
        ((ype) e.l().ai((char) 7225)).y("onAnimationEnd %s", animation);
        if ((animation == this.a || animation == this.c) && (runnable = this.g) != null) {
            runnable.run();
            this.g = null;
        }
        f();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        ((ype) e.l().ai((char) 7226)).y("onAnimationStart %s", animation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
