package android.support.v4.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class j extends cv {

    /* renamed from: a, reason: collision with root package name */
    private final h f344a;

    /* renamed from: b, reason: collision with root package name */
    private AnimatorSet f345b;

    public j(h hVar) {
        h.g.b.x.f(hVar, "animatorInfo");
        this.f344a = hVar;
    }

    public final h a() {
        return this.f344a;
    }

    @Override // android.support.v4.app.cv
    public final void b(ViewGroup viewGroup) {
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        AnimatorSet animatorSet = this.f345b;
        h hVar = this.f344a;
        if (animatorSet == null) {
            hVar.b().j(this);
            return;
        }
        cz czVarB = hVar.b();
        if (czVarB.p()) {
            h.g.b.x.f(animatorSet, "animatorSet");
            animatorSet.reverse();
        } else {
            animatorSet.end();
        }
        if (bv.aM(2)) {
            Log.v("FragmentManager", "Animator from operation " + czVarB + " has been canceled" + (true != czVarB.p() ? "." : " with seeking.") + " ");
        }
    }

    @Override // android.support.v4.app.cv
    public final void c(ViewGroup viewGroup) {
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        h hVar = this.f344a;
        cz czVarB = hVar.b();
        AnimatorSet animatorSet = this.f345b;
        if (animatorSet == null) {
            hVar.b().j(this);
            return;
        }
        animatorSet.start();
        if (bv.aM(2)) {
            Log.v("FragmentManager", k.e(czVarB, "Animator from operation ", " has started."));
        }
    }

    @Override // android.support.v4.app.cv
    public final void d(BackEventCompat backEventCompat, ViewGroup viewGroup) {
        h.g.b.x.f(backEventCompat, "backEvent");
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        h hVar = this.f344a;
        cz czVarB = hVar.b();
        AnimatorSet animatorSet = this.f345b;
        if (animatorSet == null) {
            hVar.b().j(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !czVarB.c().mTransitioning) {
            return;
        }
        if (bv.aM(2)) {
            Objects.toString(czVarB);
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation ".concat(String.valueOf(czVarB)));
        }
        h.g.b.x.f(animatorSet, "animatorSet");
        long totalDuration = animatorSet.getTotalDuration();
        long progress = (long) (backEventCompat.getProgress() * totalDuration);
        if (progress == 0) {
            progress = 1;
        }
        if (progress == totalDuration) {
            progress = (-1) + totalDuration;
        }
        if (bv.aM(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + progress + " for Animator " + animatorSet + " on operation " + czVarB);
        }
        h.g.b.x.f(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(progress);
    }

    @Override // android.support.v4.app.cv
    public final void e(ViewGroup viewGroup) throws Resources.NotFoundException {
        j jVar;
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        h hVar = this.f344a;
        if (hVar.c()) {
            return;
        }
        Context context = viewGroup.getContext();
        h.g.b.x.c(context);
        aw awVarA = hVar.a(context);
        this.f345b = (AnimatorSet) (awVarA != null ? awVarA.f143b : null);
        cz czVarB = hVar.b();
        ar arVarC = czVarB.c();
        boolean z = czVarB.e() == cy.f305c;
        View view = arVarC.mView;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.f345b;
        if (animatorSet != null) {
            jVar = this;
            animatorSet.addListener(new i(viewGroup, view, z, czVarB, jVar));
        } else {
            jVar = this;
        }
        AnimatorSet animatorSet2 = jVar.f345b;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }

    @Override // android.support.v4.app.cv
    public final boolean f() {
        return true;
    }
}
