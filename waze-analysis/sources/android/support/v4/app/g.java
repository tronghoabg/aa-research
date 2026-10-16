package android.support.v4.app;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class g extends cv {

    /* renamed from: a, reason: collision with root package name */
    private final h f335a;

    public g(h hVar) {
        h.g.b.x.f(hVar, "animationInfo");
        this.f335a = hVar;
    }

    public final h a() {
        return this.f335a;
    }

    @Override // android.support.v4.app.cv
    public final void b(ViewGroup viewGroup) {
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        h hVar = this.f335a;
        cz czVarB = hVar.b();
        View view = czVarB.c().mView;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        hVar.b().j(this);
        if (bv.aM(2)) {
            Log.v("FragmentManager", k.e(czVarB, "Animation from operation ", " has been cancelled."));
        }
    }

    @Override // android.support.v4.app.cv
    public final void c(ViewGroup viewGroup) throws Resources.NotFoundException {
        Object obj;
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        h hVar = this.f335a;
        if (hVar.c()) {
            hVar.b().j(this);
            return;
        }
        Context context = viewGroup.getContext();
        cz czVarB = hVar.b();
        View view = czVarB.c().mView;
        h.g.b.x.c(context);
        aw awVarA = hVar.a(context);
        if (awVarA == null || (obj = awVarA.f142a) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (czVarB.e() != cy.f303a) {
            view.startAnimation((Animation) obj);
            hVar.b().j(this);
            return;
        }
        viewGroup.startViewTransition(view);
        ax axVar = new ax((Animation) obj, viewGroup, view);
        axVar.setAnimationListener(new f(czVarB, viewGroup, view, this));
        view.startAnimation(axVar);
        if (bv.aM(2)) {
            Log.v("FragmentManager", k.e(czVarB, "Animation from operation ", " has started."));
        }
    }
}
