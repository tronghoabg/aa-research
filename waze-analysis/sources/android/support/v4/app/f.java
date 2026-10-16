package android.support.v4.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class f implements Animation.AnimationListener {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f330e = 0;

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cz f331a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f332b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f333c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ g f334d;

    f(cz czVar, ViewGroup viewGroup, View view, g gVar) {
        this.f331a = czVar;
        this.f332b = viewGroup;
        this.f333c = view;
        this.f334d = gVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        h.g.b.x.f(animation, "animation");
        final ViewGroup viewGroup = this.f332b;
        final View view = this.f333c;
        final g gVar = this.f334d;
        viewGroup.post(new Runnable() { // from class: android.support.v4.app.e
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = f.f330e;
                viewGroup.endViewTransition(view);
                g gVar2 = gVar;
                gVar2.a().b().j(gVar2);
            }
        });
        if (bv.aM(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f331a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        h.g.b.x.f(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        h.g.b.x.f(animation, "animation");
        if (bv.aM(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f331a + " has reached onAnimationStart.");
        }
    }
}
